public class MyStack {
    // TODO: Declare a private int array named stack
    private int[] stack;
    // TODO: Declare a private int variable named top
    private int top;
    // TODO: Create a constructor that accepts capacity
    // Inside constructor:
    // - initialize stack with new String[capacity]
    // - set top = -1

    public MyStack(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
    }

    public void push(int value) {
        // TODO: Insert value on top of the stack
        // Increase top
        // print Stack is full if top exceeds capacity
        if(this.top >= this.stack.length - 1){
            System.out.println("Stack is full");
        }else{
        this.stack[++this.top] = value;
        }


   
    }

    public int pop() {
        return this.stack[this.top--];
        // TODO: Remove and return the top value
        // Decrease top
        // Print Stack is empty if top is -1
    }

    public int peek() {
       return this.stack[this.top];
    }

    public void display() {
        for (int i = stack.length - 1; i != -1; i--) {
            System.out.println("Item #" + this.stack[i]);
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(3);
        stack.display();
    }
}
