
import java.util.Scanner;

public class ArrayListTest {

    public static void println(String msg) {
        System.out.println(msg);
    }
    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        ArrayList fruits = new ArrayList();
        Scanner sc = new Scanner(System.in);
        Scanner scanItem = new Scanner(System.in);
        int key = -1;
        while (key != 3) {
            println("Enter 1 to Add Item");
            println("Enter 2 to View Items");
            println("Enter 3 to Exit");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    print("Kindly Enter your Item: ");
                    String newItem = scanItem.nextLine();
                    fruits.add(newItem);
                    break;
                case 2:
                    println("Here are the items: ");
                    println(fruits.getStringItems());
                    break;
                case 3:
                    println("Byeeee ");
                    break;
                default:
                    println("You Entered invalid Number. Try again");
                    break;
            }
            println("Press Any Key ");
            scanItem.nextLine();

            print("===========================");

        }
        sc.close();
        scanItem.close();
    }
}
