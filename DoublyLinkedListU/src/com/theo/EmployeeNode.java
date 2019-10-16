package com.theo;

public class EmployeeNode {         // this will be each object on the list. has 2 references, one show the next and one the previous node.

    // Name: Employee Node, to make it clear that it will work only with Employee instances
    //in java, by "contains a link" we mean it contains a reference for another Node.

    private Employee employee; // we need a reference to the Employee
    private EmployeeNode next; // we need a reference for the next item of the list
    private EmployeeNode previous; // we need a reference to the previous item of the list now that it is a doubly linked list

    public EmployeeNode(Employee employee){ // constructor: takes only the Employee, because when we construct a Node, we don't know which the next Node will be
        this.employee = employee;           // if a Node is the last Node on the list, the next Node will be the "null". When we traverse the list, that's how we know we hit the end
                                            // of the list
    }

    public EmployeeNode getPrevious() {
        return previous;
    }

    public void setPrevious(EmployeeNode previous) {
        this.previous = previous;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return employee.toString(); // that way it will call and print the toString of the "Employee" class, the info we want to
    }
}
