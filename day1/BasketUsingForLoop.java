public class BasketUsingForLoop {
    public static void main(String[] args) {
        String[] baskets = new String[10];
        Double[] prices = new Double[10];

        baskets[0] = "Kurtina";
        prices[0] = 20.78;
        baskets[1] = "Habol";
        prices[1] = 1000.42;

        baskets[2] = "Sofa";
        prices[2] = 200.42;
        // Printing Via Loop
        int sizeOfBasket = baskets.length;

        System.out.println(" ====== Content of Basket ========");

        for (int i = 0; i < sizeOfBasket; i++) {
            // stop printing if the basket content is null
            if(baskets[i] == null){
                break;
            }
            System.out.println("Item " + baskets[i] + "| Price : " + prices[i]);
        }
    
        System.out.println("=== End of Basket ==== ");

    }
}
