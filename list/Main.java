package structure.list;

import structure.list.impl.DoublyLinkedList;
import structure.list.impl.SingleLinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GBList list = new SingleLinkedList();
        list.add("BMW");
        list.add("TOYOTA");
        list.add("GAZ");
        list.add("TOYOTA");

        GBIterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("Size before remove " + list.size());


        System.out.println("Size after remove " + list.size());


        System.out.println(list);
        System.out.println(list.get(2));

        System.out.println("_____________________");
        System.out.println("DoubleLinkedList");

        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.add("alex");
        list2.add("nekit");
        list2.add("golum");
        list2.add("vasya");

        System.out.println(list2);
    }
}
