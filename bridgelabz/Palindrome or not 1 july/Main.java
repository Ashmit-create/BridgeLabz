import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int original=num;
        int reverse = 0;
        for (; num > 0; num = num / 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        if (original == reverse) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
