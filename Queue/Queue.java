public class Queue {
    private char[] queue;
    private int vacant;
    private int capacity; 

    public Queue() {
        this.queue = new char[10];
        this.capacity = 10;
        this.vacant = 0;
    }
    public Queue(int capacity) {
        this.queue = new char[capacity];
        this.capacity = capacity;
        this.vacant = 0;

    }
    public void enqueue(char item) {
        System.out.println("Added to Queue: " + item);
        this.queue[this.vacant] = item;
        this.vacant++;

    }
    public char dequeue() {
        char servingItem = this.queue[0];
        System.out.println("Serving: " + servingItem);
        this.moveForward();
        return servingItem;
    }
    // move the items in front
    public void moveForward(){
        String msg = "Queue: [";
        for (int i = 0; i < this.vacant-1; i++) {
            this.queue[i] = this.queue[i+1];
            
            msg  +=  this.queue[i]  + ", ";

        }
        msg += "]";
        this.vacant--;
        System.out.println(msg);
    }
}
