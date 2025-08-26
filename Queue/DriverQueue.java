public class DriverQueue {
    public static void main(String[] args) {
        Queue stiCashier = new Queue(20);

        stiCashier.enqueue('A');
        stiCashier.enqueue('B');
        stiCashier.enqueue('C');
        stiCashier.enqueue('D');
        stiCashier.dequeue();
        stiCashier.enqueue('E');
        stiCashier.enqueue('F');
        stiCashier.enqueue('G');
        stiCashier.dequeue();
        stiCashier.dequeue();
        stiCashier.dequeue();
        stiCashier.dequeue();

    }
}
