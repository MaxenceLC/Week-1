import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinETMax_Maven {
    public static long findMax(List<Long> numbers) {
        long max = numbers.get(0);
        for (long number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public static long findMin(List<Long> numbers) {
        long min = numbers.get(0);
        for (long number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> numbers = new ArrayList<>();

        System.out.println("Enter numbers one by one, pressing Enter after each. Type 'done' to finish:");
        while (scanner.hasNext()) {
            if (scanner.hasNextLong()) {
                numbers.add(scanner.nextLong());
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("done")) {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a long integer or 'done' to finish.");
                }
            }
        }

        if (!numbers.isEmpty()) {
            long max = findMax(numbers);
            long min = findMin(numbers);
            System.out.println("Original List: " + numbers);
            System.out.println("Maximum: " + max);
            System.out.println("Minimum: " + min);
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();
    }
}
