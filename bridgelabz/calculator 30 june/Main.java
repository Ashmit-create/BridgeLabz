
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		char operator;
        Double n, m, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("first number:");
        n = sc.nextDouble();
        System.out.println("second number:");
        m = sc.nextDouble();
        System.out.println("Choose operator: +, -, *,/");
        operator = sc.next().charAt(0); 
        if (operator == '+') {
            result = n + m;
            System.out.println(result);
        }
        else if (operator == '-') {
            result = n - m;
            System.out.println(result);
        }
        else if (operator == '*') {
            result = n * m;
            System.out.println(result);
        }
        else if (operator == '/') {
                result = n / m;
                System.out.println(result);
        }
        else {
            System.out.println("Invalid"); 
        }
	}
}