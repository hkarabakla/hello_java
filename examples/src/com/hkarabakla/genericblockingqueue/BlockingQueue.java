package com.hkarabakla.genericblockingqueue;

public class BlockingQueue<T> implements Queue<T> {

    private Node<T> head;
    private Node<T> tail;

    @Override
    public void add(T value) {
        Node<T> node = new Node<T>(value);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNextNode(node);
            tail = node;
        }
    }

    @Override
    public T peek() {
        return head != null ? head.getValue() : null;
    }

    @Override
    public T poll() {
        T value = null;

        if(head != null) {
            Node<T> node = head;
            head = head.getNextNode();
            value = node.getValue();
        }

        return value;
    }
}
