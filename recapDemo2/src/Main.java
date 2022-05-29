public class Main {

    public static void main(String[] args) {
        // double[] veloList = new double[4]; --> Alternative way below;
        double[] veloList = {6.2, 5.1, 8.7, 7.5}; // 4 elements.
        double total = 0;
        double enBuyuk = veloList[0];
        for (double number : veloList) {

            if (enBuyuk < number) {
                enBuyuk = number;
            }
            total += number;
            System.out.println(number);
        }
        System.out.println("En büyük sayı : " + enBuyuk);
        System.out.println("Total is : " + total);
    }
}
