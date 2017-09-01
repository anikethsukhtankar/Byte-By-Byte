package bytebybyte;

public class OnesInBinary {
    public int countOnes(int x){
        int sum = 0;
        while(x>0){
            sum += x & 1;
            x <<= 1;
        }
        return sum;
    }
}
