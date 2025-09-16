public class SimpleArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        // TODO: Store the numbers 10, 20, 30, 40, 50 in the array
        // numbers = { 10, 20, 30, 40, 50};
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
    
        // TODO: Print all values using a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number: " + i);
        }
    }
}
