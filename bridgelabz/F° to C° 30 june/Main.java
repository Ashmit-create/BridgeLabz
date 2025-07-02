import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("fahrenheit: ");
        double f = sc.nextDouble();
        double c = (f - 32) * (5.0 / 9.0); 
        System.out.println("celsius: " + c);
	}
}