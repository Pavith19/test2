/* *
* Author: Pavith Bambaravanage
* URL: https://github.com/Pavith19
* */

public class FactorialExample {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        long fact = factorial(number);
        System.out.println("Factorial of " + number + " = " + fact);
    }
}
