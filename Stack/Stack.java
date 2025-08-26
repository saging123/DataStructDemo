public class Stack {
    private int maxCapacity;
    private char[] container;
    // used to track the current location in stack
    private int top;

    /**
     * Constructor that doesn't require any argument
     * Default Size is 10
     */
    public Stack() {
        this.top = 0;
        this.container = new char[10];
        this.maxCapacity = 10;
    }

    /**
     * Constructor that require the initial size
     * 
     * @param size
     */
    public Stack(int size) {
        this.top = 0;
        this.container = new char[size];
        this.maxCapacity = size;
    }

    /**
     * Push new item in our stack
     */
    public void push(char itemToPush) {
        // when negative index reset to zero
        if (this.top < 0) {
            this.top = 0;
        }
        if (this.top < this.maxCapacity) {
            System.out.println(itemToPush + " =>  was pushed to stack");
            this.container[this.top] = itemToPush;
            this.top++; // this.top = this.top + 1
        } else {
            System.out.println("The stack is full!");
        }
    }

    public void push(char item1, char item2) {
        this.push(item1);
        this.push(item2);
    }

    public void push(char[] items) {
        for (char c : items) {
            this.push(c);

        }

    }

    /**
     * remove top item in stack
     * 
     * @return
     */
    public char pop() {
        if (this.top <= 0) {
            System.out.println("No more Items");
            return '_';
        }
        char topItem = this.container[this.top - 1];
        System.out.println(topItem + " =>  was popped from stack");
        this.top--; // this.top = this.top - 1
        return topItem;
    }

    /**
     * View the top item
     * 
     * @return
     */
    public char peek() {
        if (this.top == 0) {
            System.out.println("No more Item to peek");
            return '_';
        }
        return this.container[this.top - 1];
    }
}