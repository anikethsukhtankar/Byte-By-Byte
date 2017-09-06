package bytebybyte;

import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrder {
    class Node{
        private int value;
        private Node left;
        private Node right;
    }

    public void levelOrder(Node tree){
        if(tree == null) return;
        Queue<Node> toVisit = new LinkedList<Node>();
        toVisit.add(tree);
        while(!toVisit.isEmpty()){
            Node n = toVisit.poll();
            System.out.println(n.value);
            if(n.left!=null) toVisit.add(n.left);
            if(n.right!=null) toVisit.add(n.right);
        }
    }
}
