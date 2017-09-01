package bytebybyte;

public class NthToLastLinkedList {
    class Node{
        private int value;
        private Node next;
    }
    
    public Node nthToLast(Node node,int n){
        Node curr = node;
        Node follower = node;
        
        for(int i=0; i<n; i++){
            if(curr == null)
                return null;
            curr = curr.next;
        }
        
        while(curr.next != null){
            curr = curr.next;
            follower = follower.next;
        }
        
        return follower;
    }
}
