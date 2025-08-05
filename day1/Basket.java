public class Basket {
    public static void main(String[] args) {
        String[] baskets = new String[10];
        Double[] prices = new Double[10];

        baskets[0] = "Kurtina";
        prices[0] = 20.78;

        baskets[1] = "Habol";
        prices[1] = 1000.42;

        baskets[2] = "Sofa";
        prices[2] = 200.42;

        System.out.println("Content of Basket");
        System.out.println("Item "+ baskets[0] + "| Price : " + prices[0] );
        System.out.println("Item "+ baskets[1] + "| Price : " + prices[1] );
        System.out.println("Item "+ baskets[2] + "| Price : " + prices[2] );
         System.out.println("Item "+ baskets[3] + "| Price : " + prices[3] );
    }
}
