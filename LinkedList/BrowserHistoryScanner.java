import java.util.Scanner;

public class BrowserHistoryScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int key = -1;
        History current = null;
        History first = null;

        while (key != 3) {

            System.out.println("1. Add \n2. View \n3. Exit");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    // ask
                    System.out.print("Enter URL: ");
                    String url = sc2.nextLine();
                    History fresh = new History(url);
                    if (current == null) {
                        current = fresh;
                        first = fresh;
                    } else {
                        current.next = fresh;
                        current = fresh;

                    }
                    break;
                case 2:
                    History curItem = first;
                     System.out.println("---CONTENT---");
                    while (curItem != null) {
                        System.out.println("ULL: " + curItem.getUrl());
                        curItem = curItem.next;
                    }
                    break;
                default:
                    break;
            }

        }

    }
}
