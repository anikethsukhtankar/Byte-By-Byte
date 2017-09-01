package bytebybyte;

import java.util.EmptyStackException;

public class MaxStack {
    class Node{
        private int value;
        private Node next;
        private Node oldMax;
        public Node(int v){
            value=v;
            next = null;
            oldMax = null;
        }
    }

    private Node stack;
    private Node max;

    public void push(int value){
        Node node = new Node(value);
        if(stack!=null){
            node.next = stack;
        }
        stack = node;
        if(max==null || node.value>max.value){
            node.oldMax = max;
            max = node;
        }
    }

    public int pop(){
        if(stack == null) throw new EmptyStackException();
        Node n = stack;
        stack = stack.next;
        if(n.oldMax!=null) max = n.oldMax;
        return n.value;
    }

    public int max(){
        if(max==null) throw new EmptyStackException();
        return max.value;
    }
}
