import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<Integer>();

        System.out.print("please, enter number: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        System.out.print("Testing: " + a.toString() + " ==> ");
        System.out.println(ConvertBinaryArrayToInt(a));

    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        int sum = 0;
        double element;
        int size = binary.size() - 1;

        for (int i : binary) {
            element = i * Math.pow(2, size);
            sum = sum + (int)element;
            size = size - 1;
        }
        return sum;
    }
}
