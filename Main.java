public class Main {
  public static void main(String[] args) {
    Queue queue = new Queue();
    
    queue.enqueue(10);
    queue.show();
    queue.enqueue(11);
    queue.show();
    queue.enqueue(9);
    queue.show();
    queue.enqueue(8);
    queue.show();
    queue.enqueue(8);
    queue.show();
    queue.dequeue();
    

    queue.show();


  }
}