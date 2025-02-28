import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerSumCalculator {
    
    public static Integer parseStringToInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + str);
            return 0;
        }
    }

    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.print("Enter the number of values you want to input: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            String input = scanner.next();
            numbers.add(parseStringToInteger(input));
        }
        
        scanner.close();

        int totalSum = calculateSum(numbers);
        System.out.println("The sum of the list is: " + totalSum);
    }
}
