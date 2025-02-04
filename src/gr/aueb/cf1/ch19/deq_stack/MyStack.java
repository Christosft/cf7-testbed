package gr.aueb.cf1.ch19.deq_stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Consumer;

public class MyStack<T> {

    /**
     * LIFO impl with Deque
     */

    private final Deque<T> myStack = new LinkedList<>();

    public MyStack() {


    }

    public Deque<T> getMyStack() {
        return myStack;
    }

    public void push(T t) {
        myStack.push(t);
    }

    public T pop() {
        return myStack.pop();
    }

    public void forEach(Consumer<T> action) {
        myStack.forEach(action);
    }
}
