public class StackDriver {

    public static void main(String[] args) {
        Stack basket = new Stack();
        Stack cabinet = new Stack(20);

        basket.push('O');
        basket.push('R');
        basket.push('A');
        basket.push('N');
        basket.push('G');
        basket.push('E');
        System.out.println("---------");
        basket.pop();
        basket.pop();
        basket.pop();
        basket.pop();
        basket.pop();
        basket.pop();
        basket.pop();
        basket.pop();
        basket.push('J', 'K');
        char[] items = new char[]{'L','M','N'};
        basket.push(items);


// javac *.java <-- compile all java files
// java mainClass <-- to run

    }
}
