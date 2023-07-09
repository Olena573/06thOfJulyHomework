import org.w3c.dom.Node;
import java.util.ArrayList;
import java.util.List;

public class ArrayListLanguages <Element>{
    //This is a class for task 2.
    private NewArrayList.Node<Element> first;

    private NewArrayList.Node<Element> last;

    public static int size;

    public static int size(){

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
        NewArrayList.Node<Element> node;
        if (first == null){
            node = new NewArrayList.Node<>(element, null, null);
            first = node;
        } else {
            node = new NewArrayList.Node<>(element, null, last);
            last.next = node;
        }
        last = node;
        size++;
    }

    public void clone (Element element){

    }


    private static class Node <Element> {
        Element item;
        NewArrayList.Node<Element> next;
        NewArrayList.Node<Element> prev;

        public Node (Element item, NewArrayList.Node<Element> next, NewArrayList.Node<Element> prev){
            //This is a node's constructor.
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}
