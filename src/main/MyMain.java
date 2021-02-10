package main;

import implementation.MyLInkedLIst2;

public class MyMain {
    public static void main(String[] args) {
        MyLInkedLIst2 linkedlist2= new MyLInkedLIst2();
        linkedlist2.addFirst(50);
        linkedlist2.traverse();
        linkedlist2.addFirst(736);
        linkedlist2.addFirst(541);
        System.out.println("siize"+linkedlist2.size());
    }
}
