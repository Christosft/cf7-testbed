package gr.aueb.cf1.ch19.deq_gueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

public class MyQueue<T> {

    private final Deque<T> myQueue = new LinkedList<>();

    public MyQueue() {

    }

    public Deque<T> getMyQueue() {
        return myQueue;
    }

    public void enQueue(T t) {
        myQueue.addLast(t);
    }

    public T deQueue() {
        return myQueue.poll();
    }

    public void forEach(Consumer<T> action) {
       myQueue.forEach(action);
    }
}
