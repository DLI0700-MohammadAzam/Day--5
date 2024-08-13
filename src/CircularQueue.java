public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public boolean enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return value;
    }

    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }

    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        System.out.println("Front element: " + cq.front()); // Output: 1
        System.out.println("Rear element: " + cq.rear()); // Output: 5
        cq.dequeue();
        cq.enqueue(6);
        System.out.println("Front element after dequeue: " + cq.front()); // Output: 2
        System.out.println("Rear element after enqueue: " + cq.rear()); // Output: 6
    }
}

