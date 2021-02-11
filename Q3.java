import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter base A: ");
        int a = sc.nextInt();
        System.out.println("Enter B (exponent of A): ");
        int b = sc.nextInt();
        sc.close();

        System.out.println("\n\nLogarithm base " + a + " of " + b + " is " + logarithm(a, b));
    }

    public static int logarithm(int A, int B) {
        int temp = B;
        int i = 1;
        while (i <= B) {
            temp /= A;
            if (temp == 1) {
                return i;
            }
            i++;
        }
        return -1;
    }
}