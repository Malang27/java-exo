package Factorial;

public class Factorial {
    public static Integer factorial(Integer n) {
        // Handle null or negative input
        if (n == null || n < 0) {
            return null; // or throw an exception, depending on requirements
        }
        
        // Base cases: 0! = 1 and 1! = 1
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Calculate factorial iteratively
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Factorial.factorial(3));
    }
}