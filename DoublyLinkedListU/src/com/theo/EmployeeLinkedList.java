package com.theo;

public class EmployeeLinkedList {

    private EmployeeNode head; // we just need a field, the head of the list to be able to interact with the list. -> head = null by default (object).
    private EmployeeNode tail; // we need a pointer to the tail too.
    private int size; // the list has a size -> will be initialized to 0


    // then we add the Methods for our List

    // for the best performance we add the items at the start of the list, so that we don't have to traverse the list and look for an insertion point

    // we don't need to set the previous node of the first item, because it will be always null.
    // we need to take in consideration if we have an empty list and we add an item, the tail will also point to that item, not only the head.
    // if the list in which we are adding the node is not empty, we need to set the previous node.
    public void addToFront(Employee employee){

        EmployeeNode node = new EmployeeNode(employee); // we add a Node (container) and inside this container, we add the Employee obj reference we want to.

        if(head == null){       // if we are adding the node to an empty list
            tail = node;
        } // if it's not the first item of the list, we don't need to worry about the tail, the tail is not going to change
        else{ // if it's not empty
            head.setPrevious(node);     // the node that we add will be the item BEFORE the current head
            node.setNext(head); // the new Node will be inserted before the current head and will point towards the previous head. // if this node is the first item, it makes the null (default value of next(node)) the head.

        }

        head = node; // the new Node becomes the head, if it's the first item, it's both the head and the tail

        size++; // when we add an employee, we also want to increase the size by one
    }

    public void addToTail(Employee employee){

        EmployeeNode node = new EmployeeNode(employee);

        if(tail == null){       // if the list is empty
            head = node;
        }
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }

        tail = node;
        size++;
    }

    public EmployeeNode removeFromFrond(){

        if(isEmpty()){
            return null;                    // first check if the list is empty (nothing to remove)
        }
        //else
        EmployeeNode removedNode = head;        // assign the head to be removed to a temp var (or not if we don't need it)

        //now test if we are removing the only item of the list
        if(head.getNext() == null){
            tail = null;
        }
        else{
            head.getNext().setPrevious(null); // the item after the item we will delete, will now point to null
        }

        head = head.getNext();                  // assign the item next to the head as the new head.
        size--;                                 // the size of the array becomes one less if we remove one item.

        // to be delicate and completely remove the node: removedNode.setNext(null);
        return removedNode; // or make it void and doesn't need to return something.
    }

    public EmployeeNode removeFromEnd(){

        if(isEmpty()){
            return null;                    // first check if the list is empty (nothing to remove)
        }

        EmployeeNode removeNode = tail;

        if (tail.getPrevious() == null){ // if there is only one item on the list
            head = null;
        }
        else{
            tail.getNext().setNext(null);
        }

        tail = tail.getPrevious();  // the old tail will get one spot back
        size--;

        // to be delicate and completely remove the node: removedNode.setPrevious(null);
        return removeNode; // or make it void and doesn't need to return something.

    }

    public int getSize(){
        return size;            // a Method to return the size of the list
    }

    public boolean isEmpty(){
        return head == null;        // to check if the list is Empty -> if the head is null, then the list is empty!, here: return true if "head == null", otherwise return false.
    }

    // to be able to print our list, we need a print Method
    // to be able to see something else from references, we need the toString Method in the Employee and EmployeeNode classes
    public void printList(){
        EmployeeNode current = head;
        System.out.println("Head --> " );
        while (current != null){
            System.out.println(current);
            System.out.println("<--> ");
            current = current.getNext();
        }
        System.out.println(" null"); //  the last item on the list will be null
    }
}
