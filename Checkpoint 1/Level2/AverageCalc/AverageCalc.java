package AverageCalc;
public class AverageCalc {
    public static int average(int start, int end, int step) {
        if (step == 0) {
            return 0;
        }
        int count = 0;
        int sum = 0;

        if (step > 0) {
            for (int i = start; i<=end; i+=step) {
                sum+=i;
                count++;
            }
        } else {
            for(int i = start; i>= end; i+=step) {
                sum+=i;
                count++;
            }
        }
        if (count == 0 ) {
            return 0;
        }

        return sum / count;
    }
    public static void main(String[] args) {

        runTest("testAverageInRange", 5, average(1, 10, 2));
        runTest("testAverageWithNegativeStep", 6, average(10, 1, -2));
        runTest("testAverageWithSingleValue", 1, average(1, 1, 1));
        runTest("testAverageWithStartEqualsToEnd", 1, average(1, 1, 2));
        runTest("testAverageWithStepGreaterThanRange", 1, average(1, 2, 10));
        runTest("testAverageWithStepGreaterThanEnd", 1, average(1, 2, 10));
        runTest("testAverageWithNegativeRange", -6, average(-10, -1, 2));
        runTest("testAverageWithNegativeRangeAndNegativeStep", -5, average(-1, -10, -2));
        runTest("testAverageWithStepEqualsZero", 0, average(1, 10, 0));

        System.out.println("\nAll tests completed!");
    }

    private static void runTest(String testName, int expected, int actual) {
        boolean passed = expected == actual;
        System.out.println(testName + ": " + (passed ? "PASSED" : "FAILED"));

        if (!passed) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + actual);
        }
    }
}