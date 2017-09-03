package bytebybyte;

public class SplitLinkedList {
    class Node{
        public int value;
        public Node next;
    }
    public Node splitLinkedList(Node list){
        Node runner = list.next;
        while(runner!=null || runner.next!=null){
            runner = runner.next.next;
            list = list.next;
        }
        Node toReturn = list.next;
        list.next = null;
        return toReturn;
    }
}
