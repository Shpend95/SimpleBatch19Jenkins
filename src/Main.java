public class Main {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 1; i <= 19; i++) {
            if (i < 19) {
                System.out.println("Batch " + i + " is great");
            } else {
                System.out.println("Batch 19 is the best");
            }
            Thread.sleep(2000);
        }
    }
}