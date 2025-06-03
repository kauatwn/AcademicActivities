package sem_2.ap_2.atv_8.challenge.utils.stack;

public class MyStack<T> {
    public Node<T> top;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        if (top != null) {
            newNode.setNext(top);
        }
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        T value = top.getValue();
        top = top.getNext();
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia");
        }
        return top.getValue();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = top;

        sb.append('[');
        while (current != null) {
            sb.append(current.getValue());

            if (current.getNext() != null) {
                sb.append(", ");
            }

            current = current.getNext();
        }
        sb.append(']');
        return sb.toString();
    }
}
