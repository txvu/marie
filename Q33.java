import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter an integer : ");
        int a = sc.nextInt();
        sc.close();

        System.out.println("\n\nFactorial of " + a + " is " + factorial(a));
    }

    public static int factorial(int A) {
        int result = 1;
        int i = A - 1;
        while (i > 0) {
            int tempMul = 0;
            int j = i;
            while (j > 0) {
                tempMul += result;
                j--;
            }
            result += tempMul;
            i--;
        }
        return result;
    }
}