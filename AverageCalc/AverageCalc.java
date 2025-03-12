package AverageCalc;

public class AverageCalc {
    public static int average(int start, int end, int step) {
        if (step <= 0 || start > end) {
            return 0;
        }

        int count = ((end - start) / step) + 1;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            sum += start + (i * step);
        }

        return sum / count;
    }
    public static void main(String[] args) {
        System.out.println(AverageCalc.average(1, 5, 1));
        // Additional test cases
        System.out.println(AverageCalc.average(2, 10, 2));
        System.out.println(AverageCalc.average(1, 3, 1));
        System.out.println(AverageCalc.average(5, 1, 1)); // Invalid case
    }
}