package bytebybyte;

import java.util.ArrayList;

public class ArrayPermutations {
    public ArrayList<int[]> permutations(int[] a){
        ArrayList<int[]> results = new ArrayList<int[]>();
        permutations(a,0,results);
        return results;
    }

    public void permutations(int[] a, int start, ArrayList<int[]> results){
        if(start>=a.length)
            results.add(a.clone());
        else{
            for(int i=start; i<a.length; i++){
                swap(a,start,i);
                permutations(a,start+1,results);
                swap(a,start,i);
            }
        }
    }

    public void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
