public class Queue {
  int capacity = 10;
  int queue[] = new int[capacity];
  int size;
  int front;
  int rear;

  void enqueue(int data) {
    if (size == capacity) {
      System.out.println("Queue is full, cannot enqueue");
      return;
    }
    queue[rear] = data;
    rear = (rear + 1) % capacity;
    size++;
  }

  int dequeue() {
    if (isEmpty()) {
      System.out.println("Queue is empty, cannot dequeue");
      return Integer.MIN_VALUE;
    }
    int data = queue[front];
    front = (front + 1) % capacity;
    size--;
    return data;
  }

  int getSize() {
    return size;
  }

  boolean isEmpty() {
    return size == 0;
  }

  boolean isFull() {
    return size == capacity;
  }

  void show() {
    for (int i = 0; i < capacity; i++) {
      if (i < size) {
        System.out.print(" [" + queue[(front + i) % capacity] + "] ");
      } else {
        System.out.print(" [] ");
      }
    }
    System.out.println();
  }
}
