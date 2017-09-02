package bytebybyte;

import java.util.*;

public class KthMostFrequentString {

    public String kthMostFrequent(String[] inp, int k){

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        for(String s: inp){
            if(map.containsKey(s))
                map.put(s,map.get(s)+1);
            else
                map.put(s,1);
        }
        List<Map.Entry> freq = new ArrayList(map.entrySet());

        Collections.sort(freq, (o1, o2) -> {
            Integer I1 = (Integer) ((Map.Entry) o1).getValue();
            Integer I2 = (Integer) ((Map.Entry) o2).getValue();
            return I1.compareTo(I2);
        });
        
        if(freq.size() > k) return (String) freq.get(k).getKey();
        return null;
    }
}
