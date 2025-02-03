package gr.aueb.cf1.ch19.singly_linked_list;

public class SingleList <T>{

    private Node<T> head = null;

    /**
     * time-complexity 0(1)
     * @param t the value to be inserted
     */
    public void insertFirst(T t) {

        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(head);

        head = tmp;
    }

    /**
     * time-complexity 0(n)
     * @param t the value to be inserted
     */

    public void insertLast(T t) {
        Node<T> tmp = new Node<>();
        tmp.setItem(t);
        tmp.setNext(null);

        if (head == null) {
           insertFirst(t);
           return;
        }

        Node<T> n;
        for (n = head; n.getNext() != null; n = n.getNext()) {

        }
        n.setNext(tmp);
    }

    /**
     * time complexity 0(1)
     * @return
     */
    public Node<T> removeFirst() {
        if (head == null) return null;

        Node<T> node = head;
        head = head.getNext();
        return node;
    }

    /**
     * time complexity 0(n)
     * @return the remove node
     */

    public Node<T> removeLast() {
        if (head == null || head.getNext() == null) {
            return removeFirst();
        }

        Node<T> n;
        for (n = head; n.getNext().getNext() != null; n = n.getNext()) {

        }

        Node<T> nodeToReturn = n.getNext();
        n.setNext(null);
        return nodeToReturn;
    }

    /**
     * time complexity 0(n)
     * @param t the value to search for
     * @return the node that contains the value,
     * null otherwise
     */

    public Node<T> get(T t) {
        Node<T> nodeToReturn = null;

        for (Node<T> n = head; n != null; n = n.getNext()) {
            if (n.getItem().equals(t)) {
                nodeToReturn = n;
            }
        }
        return nodeToReturn;
    }

    public void traverse() {
        for (Node<T> n = head; n != null; n = n.getNext()) {
            System.out.println(n.getItem());
        }
    }
    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int counter = 0;

        for (Node<T> n = head; n !=null; n = n.getNext()) {
            counter++;
        }
        return counter;
    }

}
