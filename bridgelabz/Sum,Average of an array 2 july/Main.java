import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] numbers = new double[5];
        
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }
        
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        
        double average = sum / numbers.length;
        
        System.out.println("Array elements: " + java.util.Arrays.toString(numbers));
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Average: %.2f\n", average);
        
        
    }
}