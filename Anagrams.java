package bytebybyte;

public class Anagrams {
    public boolean isAnagram(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        int[] count = new int[256];
        
        for(char c : s1.toCharArray())
            count[c]++;
        
        for(char c : s2.toCharArray())
            count[c]--;
        
        for(int x:count){
            if(x!=0) return false;
        }
        
        return true;
    }
}
