public class ArrayListLanguages <Element>{
    //This is a class for task 2.
    private static NewArrayList.Node<Element> first;

    private static NewArrayList.Node<Element> last;

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

    public NewArrayList.Node<Element> getNodeByIndex (int index){
        //I've leaved a simple "get" method and created this one
        NewArrayList.Node<Element> node = first;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    public static void delete(int index) {
        NewArrayList.Node<Element> currentNode = getNodeByIndex(index);
        if (index == 0) {
            first = currentNode.next;
        }else if(index == size-1) {
            last = currentNode.prev;
        } else {
            NewArrayList.Node<Element> nodeBefore = currentNode.prev;
            NewArrayList.Node<Element> nodeAfter = currentNode.next;
            nodeBefore.next = nodeAfter;
            nodeAfter.prev = nodeBefore;
        }
        size--;
    }

    public static NewArrayList <Integer> cloneList (NewArrayList <Integer> ArrayList){
        NewArrayList <Integer> = new NewArrayList <Integer>( NewArrayList.size());
        NewArrayList<Integer> clone;
        for (Integer item : ArrayList) clone.add(item.clone());
        return clone;

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
