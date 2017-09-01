package bytebybyte;

public class ValidateBST {
    class Node{
        private int value;
        private Node left;
        private Node right;
    }
    
    public boolean isBST(Node node){
        return isBST(node,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    
    public boolean isBST(Node node,int min,int max){
        if(node == null) {
            return true;
        }
        if(node.value<=min || node.value>max) {
            return false;
        }
        return isBST(node.left,min,node.value) && isBST(node.right,node.value,max);
    }
}
