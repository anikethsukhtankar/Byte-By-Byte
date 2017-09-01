package bytebybyte;

public class SmallestChange {
    public int makeChange(int x,int[] coins){
        int[] cache = new int[x];
        for(int i=1; i<x; i++)
            cache[i] = -1;
        return makeChange(x,coins,cache);
    }

    public int makeChange(int x, int[] coins, int[] cache){
        if(x==0) return 0;

        int min = x;
        for(int coin : coins){
            if(x-coin >= 0){
                int c;
                if(cache[x-coin]>=0)
                    c=cache[x-coin];
                else{
                    c = makeChange(x-coin,coins,cache)+1;
                    cache[x-coin] = c;
                }
                if(min>c) min = c;
            }
        }
        return min;
    }
}
