package structure.list.impl;

import structure.list.GBIterator;
import structure.list.GBList;

public class SingleLinkedList implements GBList {
    private Node first;
    private int size = 0;

    @Override
    public void add(String val) {
        if (first == null) {
            first = new Node(val);
        } else {
            add(first, val);

        }
        size++;
    }

    private void add(Node current, String val) {
        if (current.next == null) {
            current.next = new Node(val);
            return;
        }
        add(current.next, val);    //если куррент некст не равен нулл, то повторить метод заного, но с куррент.некст
    }

    @Override
    public boolean remove(String val) {
        if (first.val.equals(val)) {
            first = first.next;
            size--;
            return true;
        }

        Node prev = first;
        Node current = first.next;
        while (current != null) {
            if (current.val.equals(val)) {
                prev.setNext(current.next);
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }

        return false;
    }

    @Override
    public int size() {
//        int i = 0;
//        GBIterator iterator = iterator();
//        while (iterator.hasNext()) {
//            i++;
//        }
//        return i;
        return size;
    }

    @Override
    public String get(int index) {
        if (index == 1){   // если указываем индекс 1, то возвращаем первое значение
            return first.val;
        }
        Node prev = first;
        Node current = prev.next;
        for (int i = 1; i <= size; i++) {
            if (i == index) {   // если i == индексу то возвращаем значение
                return prev.val;
            }
            // если нет, то переключаемся на следующий элемент
            prev = current;
            current = current.next;
        }
        return null;
    }

    @Override
    public GBIterator iterator() {
        return new StraightForwardIterator(first);
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "first=" + first +
                '}';
    }



    private static class Node {
        private String val;
        private Node next;
        private Node prev;

        public Node(String val) {
            this(val, null);
        }

        public Node(String val, Node next) {
            this.val = val;
            this.next = next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val='" + val + '\'' +
                    ", next=" + next +
                    '}';
        }
    }

    public static class StraightForwardIterator implements GBIterator {
        private Node current;

        public StraightForwardIterator(Node current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public String next() {
            String val = current.val;
            current = current.next;
            return val;
        }
    }
}
