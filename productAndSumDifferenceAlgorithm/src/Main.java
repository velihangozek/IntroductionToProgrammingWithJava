import java.util.Scanner;

public class Main {

    private static int subtractProductAndSum(int input)
    {
        String stringInput = Integer.toString(input);
        char[] charInput = stringInput.toCharArray();

        int sum = 0;
        int product = 1;

        for (int i = 0; i < charInput.length; i++) {
            sum += Integer.parseInt(String.valueOf(charInput[i]));
        }

        for (int j = 0; j < charInput.length; j++) {
            product *= Integer.parseInt(String.valueOf(charInput[j]));
        }

        if (sum > product) {
            return (sum - product);
        } else {
            return (product - sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer input to calculate the difference between the sum and product of its digits : ");
        System.out.println(subtractProductAndSum(sc.nextInt()));
    }
}
