import java.util.Scanner;

public class Main {
    public static void findSecondAndThirdLargest(double[] numbers) {
        if (numbers.length < 3) {
            System.out.println("Array must have at least 3 elements.");
            return;
        }

        double first = Double.NEGATIVE_INFINITY; 
        double second = Double.NEGATIVE_INFINITY; 
        double third = Double.NEGATIVE_INFINITY; 

        for (double num : numbers) {
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second && num != first) {
                third = second;
                second = num;
            } else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        if (second == Double.NEGATIVE_INFINITY) {
            System.out.println("No second largest element exists (too few unique elements).");
        } else {
            System.out.printf("Second largest element: %.2f\n", second);
        }
        if (third == Double.NEGATIVE_INFINITY) {
            System.out.println("No third largest element exists (too few unique elements).");
        } else {
            System.out.printf("Third largest element: %.2f\n", third);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("Array elements: " + java.util.Arrays.toString(numbers));
        findSecondAndThirdLargest(numbers);

        scanner.close();
    }
}