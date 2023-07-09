import org.w3c.dom.Node;
import java.util.ArrayList;

public class NewArrayList <Element> {
    //This is a class for the ArrayList of task 3.

    private Node <Element> first;

    private Node <Element> last;

    private int size = 0;

    public int size (){

        return size;
    }

    public Element get(int index){
        // I did not delete this method.
        NewArrayList.Node<Element> node = first;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node.item;
    }

    public void add (Element element) {
        // a method for adding elements
        Node <Element> node;
        if (first == null){
            node = new Node <> (element, null, null);
            first = node;
        } else {
            node = new Node <> (element, null, last);
            last.next = node;
        }
        last = node;
        size++;
    }

    public Node <Element> getNodeByIndex (int index){
        //I've leaved a simple "get" method and created this one
        Node <Element> node = first;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    


    public void delete (int index) {
        Node <Element> currentNode = getNodeByIndex(index);
        if (index == 0) {
            first = currentNode.next;
        }else if(index == size-1) {
            last = currentNode.prev;
        } else {
            Node<Element> nodeBefore = currentNode.prev;
            Node<Element> nodeAfter = currentNode.next;
            nodeBefore.next = nodeAfter;
            nodeAfter.prev = nodeBefore;
        }
        size--;
    }

    public static class Node <Element> {
        Element item;
        Node <Element> next;
        Node <Element> prev;

        public Node (Element item, Node <Element> next, Node <Element> prev){
            //This is a node's constructor.
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }


}
