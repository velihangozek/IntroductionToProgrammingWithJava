public class Main {
    public static int subtract(int... numbers) {

        int firstNumber = numbers[0];
        int result = 0;

        for (int i = 1; i <= numbers.length - 1; i++) {
            result -= numbers[i];
        }
        return firstNumber + result;
    }

    public static void main(String[] args) {
        System.out.println(subtract(2, 3, 4));
    }
}