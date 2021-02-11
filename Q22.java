import java.util.Scanner;

public class Q2 {
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
        int tempEx;
        int i = B - 1;
        while (i > 0) {
            tempEx = i;
            int j = A - 1;
            while (j > 0) {
                int k = i;
                int tempMul = 0;
                while (k > 0) {
                    tempMul += tempEx;
                    k--;
                }
                tempEx = tempMul;
                j--;
            }
            if (tempEx == B) {
                return i;
            } 
            i--;
        }
        return -1;
    }
}