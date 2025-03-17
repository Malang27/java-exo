package Level5.NextPrime;

public class NextPrime {
    public static int nextPrime(Integer n) {
        int c = n + 1; 
        while (!isPrime(c)) {
            c++; 
        }
        return c;
    }
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(NextPrime.nextPrime(3));
        System.out.println(NextPrime.nextPrime(5));
        System.out.println(NextPrime.nextPrime(4));
        System.out.println(NextPrime.nextPrime(8));
        System.out.println(NextPrime.nextPrime(0));
        System.out.println(NextPrime.nextPrime(1));
        System.out.println(NextPrime.nextPrime(29));
        System.out.println(NextPrime.nextPrime(-5));
    }
}