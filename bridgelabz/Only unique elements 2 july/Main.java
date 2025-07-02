import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {1, 1, 2, 3, 4 , 4, 6, 7, 5, 5};
        HashSet<Double> uniqueElements = new HashSet<>();
        for (double num : numbers) {
            uniqueElements.add(num);
        }
        System.out.println("Original array: " + java.util.Arrays.toString(numbers));
        System.out.println("Unique elements: " + uniqueElements);
    }
}








































