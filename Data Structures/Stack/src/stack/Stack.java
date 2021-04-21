/*
 * Stack Data Structure
    In this tutorial, you will learn about the stack data structure and its implementation in 
    Python, Java and C/C++.
    A stack is a useful data structure in programming. It is just like a pile of plates kept on top of each other.
    Think about the things you can do with such a pile of plates

    Put a new plate on top
    Remove the top plate
    If you want the plate at the bottom, you must first remove all the plates on top. Such an arrangement is 
    called Last In First Out - the last item that is the first item to go out.
    LIFO Principle of Stack
    In programming terms, putting an item on top of the stack is called push and removing an item is called 
    pop.
    In the above image, although item 2 was kept last, it was removed first - so it follows the Last In First 
    Out(LIFO) principle.

    We can implement a stack in any programming language like C, C++, Java, Python or C#, but the 
    specification is pretty much the same.

    Basic Operations of Stack

    A stack is an object (an abstract data type - ADT) that allows the following operations:

    Push: Add an element to the top of a stack
    Pop: Remove an element from the top of a stack
    IsEmpty: Check if the stack is empty
    IsFull: Check if the stack is full
    Peek: Get the value of the top element without removing it

    Working of Stack Data Structure
    The operations work as follows:

    A pointer called TOP is used to keep track of the top element in the stack.
    When initializing the stack, we set its value to -1 so that we can check if the stack is empty by comparing TOP == -1.
    On pushing an element, we increase the value of TOP and place the new element in the position pointed to by TOP.
    On popping an element, we return the element pointed to by TOP and reduce its value.
    Before pushing, we check if the stack is already full
    Before popping, we check if the stack is already empty
 */
package stack;

 //Stack implenmentation in java
 
public class Stack {
    private int arr[];
    private int top;
    private int capacity;
   
    //Creating a stack
    
    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //Add elements into stack
    
    public void push(int x){
        if(isFull()){
            System.out.println("OverFlow\nProgram Terminated\n");
            System.exit(1);
        }
        System.out.println("Inserting "+ x);
        arr[++top] = x;
    }
    
    //Remove elements from stack
    
    public int pop(){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }
    
    //Utility function to return the size of the stack 
    
    public int size(){
        return top + 1;
    }
    
    //Check if stack is empty
    
    public Boolean isEmpty(){
        return top == -1;
    }
    
    //Check if stack is full
    
    public Boolean isFull(){
        return top == capacity - 1;
    }
    
    public void printStack(){
        for(int i=0; i <= top; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
    
        Stack stack = new Stack(6);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        
        stack.pop();
        System.out.println("\nAfter popping out");
        
        stack.printStack();
    }
}
