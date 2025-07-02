import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int sum = 0;
        int digits = 0;
        for (int temp = num; temp > 0; temp /= 10) {
            digits++;
        }

        for (int temp = num; temp > 0; temp /= 10) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power *= digit;
            }
            sum += power;
        }
        if (sum == original) {
            System.out.println(" Armstrong number");
        } else {
            System.out.println(" NOT Armstrong number.");
        }
    }
}