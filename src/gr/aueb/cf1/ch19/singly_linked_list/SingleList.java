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

    public void insertLast(T t) {

    }

}
