import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter an integer : ");
        int a = sc.nextInt();
        sc.close();

        System.out.println("\n\nFactorial of " + a + " is " + factorial(a));
    }

    public static int factorial(int A) {
        int result = 1;
        int i = 1;
        while (i <= A) {
            result *= i;
            i++;
        }
        return result;
    }
}