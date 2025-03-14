package Level5.Factorial;

public class Factorial {
    public static Integer factorial(Integer n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Factorial.factorial(0));
        System.out.println(Factorial.factorial(3));
        System.out.println(Factorial.factorial(5));
        System.out.println(Factorial.factorial(10));
    }
}