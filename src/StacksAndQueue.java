public class StacksAndQueue {
    private Node front, rear;
    private int currentSize;
    private class Node {
        int data;
        Node next;
    }
    public StacksAndQueue() {
        front = null;
        rear = null;
        currentSize = 0;
    }
    public boolean isEmpty() {
        return (currentSize == 0);
    }
    public int dequeue() {

        int data = front.data;
        front = front.next;

        if (isEmpty()) {
            rear = null;
        }
        currentSize--;
        System.out.println(data + " removed from the queue");
        return data;
    }
    public void queue(int data) {

        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;

        if (isEmpty()) {
            front = rear;
        } else {
            oldRear.next = rear;
        }
        currentSize++;
        System.out.println(data + " added to the queue");
    }
    public static void main(String a[]) {

        StacksAndQueue queue = new StacksAndQueue();

        queue.queue( 56);
        queue.dequeue();
        queue.queue(30);
        queue.dequeue();
        queue.queue(70);
        queue.dequeue();
        System.out.println("queue is empty");


    }
}
