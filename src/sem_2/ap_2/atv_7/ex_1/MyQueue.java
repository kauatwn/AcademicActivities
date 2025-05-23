package sem_2.ap_2.atv_7.ex_1;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue {
    private final List<String> queue = new ArrayList<>();
    private int capacity;

    public MyQueue(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }

        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity < size()) {
            throw new IllegalArgumentException("New capacity cannot be less than current queue size");
        }

        this.capacity = capacity;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public String front() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return queue.getFirst();
    }

    public void enqueue(String element) {
        if (size() == capacity) {
            throw new IllegalStateException("Queue is full");
        }

        queue.add(element);
    }

    public String dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }

        return queue.removeFirst();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
