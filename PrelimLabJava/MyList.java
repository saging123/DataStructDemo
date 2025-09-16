public class MyList {
    // TODO: Declare a private array of String named items
    private String[] items;

    // TODO: Declare a private int variable named currentIndex
    private int currentIndex;

    // TODO: Declare a private int variable named maxCapacity
    private int maxCapacity;

    // TODO: Create a constructor that accepts size
    // Inside constructor:
    // - initialize items with new String[size]
    // - initialize maxCapacity to size
    // - initialize currentIndex to 0
    public MyList(int size) {
        this.items = new String[size];
        this.maxCapacity = size;
        this.currentIndex = 0;
    }

    public void add(String value) {
        // IF full print "List is full"
        if (this.currentIndex >= this.maxCapacity) {
            System.out.println("List is full");
        } else {
            // TODO: Add the given value at the end of the list
            this.items[this.currentIndex] = value;
            this.currentIndex++;
        }

    }

    public void remove(int index) {
        // TODO: Remove element at the given index
        // Shift all elements to the left
        // No Empty or null should appear during printing
        // Decrease size
        // Below code is almost correct, What should be place in the <code here>
        for (int a = index; a < this.maxCapacity - 1; a++) {
            items[a] = items[a + 1];
        }
        this.currentIndex--;
    }

    public void modify(int index, String newValue) {
        // TODO: Change the element at the given index to newValue
        this.items[index] = newValue;
    }

    public void display() {
        // TODO: Print all elements in vertical format
        // Do not print empty or null elements, | Must not exceed the current index
        // Do not skip index should be in order
        // Example output:
        // Item #1: Juan
        // Item #2: Maria
        // Item #3: Pedro
        for (int i = 0; i < this.items.length; i++) {
            int cur = i + 1;
            System.out.println("Item: #" + cur + " " + this.items[i]);
        }
    }

    public static void main(String[] args) {
        MyList list = new MyList(5);
        list.add("Juan");
        list.add("Maria");
        list.add("Pedro");

        list.display();
        list.add("Anna");
        list.modify(1, "Carlos");
        list.remove(0);
        list.display();
        // TODO: Create an object of MyList with capacity 5
        // TODO: Add 3 names into the list
        // Example: "Juan", "Maria", "Pedro"
        // TODO: Display all names
        // TODO: Add 1 more name and display again
        // TODO: Modify the 2nd name to "Carlos" and display again
        // TODO: Remove the 1st item and display again
    }
}
