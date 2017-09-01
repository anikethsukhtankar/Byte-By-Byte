package bytebybyte;

public class StringCompression {
    public String compress(String s){
        StringBuilder res = new StringBuilder();
        int sum = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1))
                sum++;
            else{
                res.append(s.charAt(i));
                res.append(sum);
                sum = 1;
            }
        }
        res.append(s.charAt(s.length()-1));
        res.append(sum);
        return res.toString().length() < s.length() ? res.toString():s;
    }
}
