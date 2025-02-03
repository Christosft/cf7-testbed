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

}
