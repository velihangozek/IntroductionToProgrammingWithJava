public class Main {
    public static void main(String[] args) {
        // For Loop
//        for (int i = 1; i < 10; i++)
//        {
//            System.out.println(i);
//        }
        // For Loop - Odd Numbers
//        for (int i = 1; i < 10; i += 2)
//        {
//            System.out.println(i);
//        }
        // For Loop - Even Numbers (Another Approach - Mod)
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("For Loop ended!");

        // While Loop
        int i = 10;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
        System.out.println("While Loop ended!");

        // Do - While Loop

        int j = 1;

        do
        {
            System.out.println("Logged!");
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("Do-While Loop ended!");
    }
}
