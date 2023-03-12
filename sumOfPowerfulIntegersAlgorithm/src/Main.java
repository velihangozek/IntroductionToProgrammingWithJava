import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args)
    {
        List<Integer> result  = new ArrayList<>();
        int powerful = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first integer : ");
        int x = sc.nextInt();
        System.out.print("Please enter the second integer : ");
        int y = sc.nextInt();
        System.out.print("Please enter the bound : ");
        int bound = sc.nextInt();

        for (int i=0; i<bound; i++) {
            for (int j=0; j<bound; j++) {
                if ((Math.pow(x, i) + Math.pow(y, j)) <= bound) {
                    powerful = (int) (Math.pow(x, i) + Math.pow(y, j));
                    if (!result.contains(powerful)) {
                        result.add(powerful);
                    }
                } else {
                    break;
                }
            }
        }
        Collections.sort(result);

        String resultString = result
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(","));
        System.out.println(resultString);
    }
}