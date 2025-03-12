package NextPrime;

public class NextPrime {
    public static int nextPrime(Integer n) {
        // Handle null or negative input
        if (n == null) {
            return 2; // Smallest prime if input is null
        }
        
        int num = n;
        if (num < 2) {
            return 2; // 2 is the smallest prime
        }
        
        // Increment and check for next prime
        num++;
        while (!isPrime(num)) {
            num++;
        }
        
        return num;
    }
    
    // Helper method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        
        // Check odd numbers up to square root of num
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(NextPrime.nextPrime(3));
    }
}