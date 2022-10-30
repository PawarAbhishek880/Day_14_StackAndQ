/* 1.Ability to create a stack of 56,30,70..........UC1
 * 2.Ability to peak and pop from the stack till it is empty 56,30,70 ........UC2
 */

/*
 * creat class,class name is Stack
 */
public class Stack {
    /*
     * Declaration
     */

    Node top;
    Node next;

    /*
     * Represent a node of the singly linked list
     */
    public class Node {

        int data;

        Node next;
    }

    public void Node() {

        this.top = null;
    }
    /*
     * create a method name as push and passing parameter
     *  the push is Adds an item in the stack. If the stack is full, then it is said to be an Overflow condition.
     */

    public void push(int number) {

        /*
         * create a new node
         */
        Node node = new Node();

        node.data = number;

        node.next = top;

        top = node;
    }
    /*
     *  create a method isEmpty
     * they are boolean type that means Returns true if the stack is empty, else false.
     */
    public boolean isEmpty() {
        /*
         * return value if top is null then true
         */
        return top == null;
    }

    /*
     * creat a method peek
     * this is Returns the top element of the stack.
     */

    public int peek() {

        /*
         * if isEmpty method is true then return top element
         * if they are false then print stack is empty
         */
        if (!isEmpty()) {

            return top.data;
        }

        else {

            System.out.println("stack is empty.");

            return -1;
        }

    }

    /*
     * create a method name as pop
     * the pop is  Removes an item from the stack.
     * The items are popped in the reversed order in which they are pushed.
     * If the stack is empty, then it is said to be an Underflow condition.
     */

    public void pop() {

        /*
         * while loop is used if Top is not null then peek the element.
         * same as other elements
         * peek and pop operation to do until the stack is empty
         */
        while (top != null) {

            System.out.println("this is peak now :: " + peek());

            top = top.next;

            System.out.println("one item removed from stack...");
        }
        /*
         * all the elements are removed then print stack is empty
         */
        System.out.println("now stack is empty :: ");
    }

    /*
     *  create method name as printStack
     */
    public void printStack() {

        Node node = top;

        /*
         * using while loop
         * node is not null then print node data
         */

        while (node != null) {

            System.out.println(node.data);

            node = node.next;

        }
    }
    /*
     * main method all program execute in main method
     */

    public static void main(String[] args) {

        /*
         * create object for Stack class.
         * object name is stackoperation
         */

        Stack stackoperation = new Stack();

        /*
         * calling the method from object name
         * objectname.methodname();
         */

        stackoperation.push(56);   //push operation add 1st element

        stackoperation.push(30);   //push operation add 2nd element

        stackoperation.push(70);   //push operation add 3rd element

        stackoperation.pop();  //pop operation for remove element.
    }
}
