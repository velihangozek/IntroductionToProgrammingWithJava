public class Main {

    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        //String newMessage = message.substring(0, 2);
        String newMessage = city();
        System.out.println(newMessage);
        int total = plus(7, 7);
        System.out.println(total);
        int sum = plus2(3, 4, 9, 1, 2, 5);
        System.out.println(sum);
    }

    public static void add() {
        System.out.println("Added");
    }

    public static void remove() {
        System.out.println("Removed");
    }

    public static void update() {
        System.out.println("Updated");
    }

    public static int plus(int number1, int number2) {
        return number1 + number2;
    }

    public static int plus2(int... numbers) {
        int count = 0;
        for (int number : numbers) {
            count += number;
        }
        return count;
    }

    public static String city() {
        return "Gaziantep";
    }
}
