package com.theo;

public class Main {

    public static void main(String[] args) {

        Employee theoBax = new Employee("Theo", "Bax", 123);
        Employee christinaPar = new Employee("Christina", "Par", 456);
        Employee tasosKal = new Employee("Tasos", "Kal", 22);
        Employee fanisBib = new Employee("Fanis", "Bib", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(christinaPar);
        list.addToFront(theoBax);
        list.addToTail(tasosKal);   // add him as the tail (at the end of the list)
        list.addToFront(fanisBib);  // add him as the head (at the start of the list -> the last item to addToFront)

        list.printList();

        System.out.println();

        System.out.println(list.getSize());

        System.out.println();

//        list.removeFromFrond();
//        System.out.println(list.getSize());
//        System.out.println();
//        list.printList();
    }
}
