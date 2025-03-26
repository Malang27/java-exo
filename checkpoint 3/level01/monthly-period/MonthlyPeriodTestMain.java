public class MonthlyPeriodTestMain {
    public static void main(String[] args) {
        MonthlyPeriodTest test = new MonthlyPeriodTest();
        test.setUp();
        
        System.out.println("Running tests for MonthlyPeriod class:");
        
        try {
            System.out.println("\nTest 1: testCalculatePeriod_withValidDates");
            test.testCalculatePeriod_withValidDates();
            System.out.println("PASSED");
        } catch (AssertionError e) {
            System.out.println("FAILED: " + e.getMessage());
        }
        
        try {
            System.out.println("\nTest 2: testCalculatePeriod_withStartDateAfterEndDate");
            test.testCalculatePeriod_withStartDateAfterEndDate();
            System.out.println("PASSED");
        } catch (AssertionError e) {
            System.out.println("FAILED: " + e.getMessage());
        }
        
        try {
            System.out.println("\nTest 3: testCalculatePeriod_withSameDate");
            test.testCalculatePeriod_withSameDate();
            System.out.println("PASSED");
        } catch (AssertionError e) {
            System.out.println("FAILED: " + e.getMessage());
        }
        
        try {
            System.out.println("\nTest 4: testCalculatePeriod_withInvalidDateFormat");
            test.testCalculatePeriod_withInvalidDateFormat();
            System.out.println("PASSED");
        } catch (AssertionError e) {
            System.out.println("FAILED: " + e.getMessage());
        }
        
        try {
            System.out.println("\nTest 5: testCalculatePeriod_withInvalidDateValue");
            test.testCalculatePeriod_withInvalidDateValue();
            System.out.println("PASSED");
        } catch (AssertionError e) {
            System.out.println("FAILED: " + e.getMessage());
        }
        
        try {
            System.out.println("\nTest 6: testCalculateSingularPeriod_withValidDate");
            test.testCalculateSingularPeriod_withValidDate();
            System.out.println("PASSED");
        } catch (AssertionError e) {
            System.out.println("FAILED: " + e.getMessage());
        }
    }
}

// Class needed for assertions
class AssertThat<T> {
    private T actual;
    
    public AssertThat(T actual) {
        this.actual = actual;
    }
    
    public AssertThat<T> withFailMessage(String format, Object... args) {
        return this;
    }
    
    public void isEqualTo(T expected) {
        if (!expected.equals(actual)) {
            throw new AssertionError(String.format("Expected %s but got %s", expected, actual));
        }
    }
}

// Class to mimic the assertThat static method
class Assertions {
    public static <T> AssertThat<T> assertThat(T actual) {
        return new AssertThat<>(actual);
    }
}

// Test class
class MonthlyPeriodTest {
    private MonthlyPeriod monthlyPeriod;
    
    void setUp() {
        monthlyPeriod = new MonthlyPeriod();
    }
    
    void testCalculatePeriod_withValidDates() {
        String startDate1 = "2020-01-01";
        String endDate1 = "2023-06-15";
        String expected1 = "3 years and 5 months";
        Assertions.assertThat(monthlyPeriod.calculatePeriod(startDate1, endDate1))
                .withFailMessage("Expected period to be %s but got %s", expected1, monthlyPeriod.calculatePeriod(startDate1, endDate1))
                .isEqualTo(expected1);
        
        String startDate2 = "2015-05-20";
        String endDate2 = "2015-10-20";
        String expected2 = "5 months";
        Assertions.assertThat(monthlyPeriod.calculatePeriod(startDate2, endDate2))
                .withFailMessage("Expected period to be %s but got %s", expected2, monthlyPeriod.calculatePeriod(startDate2, endDate2))
                .isEqualTo(expected2);
        
        String startDate3 = "2018-12-25";
        String endDate3 = "2021-12-25";
        String expected3 = "3 years";
        Assertions.assertThat(monthlyPeriod.calculatePeriod(startDate3, endDate3))
                .withFailMessage("Expected period to be %s but got %s", expected3, monthlyPeriod.calculatePeriod(startDate3, endDate3))
                .isEqualTo(expected3);
    }
    
    void testCalculatePeriod_withStartDateAfterEndDate() {
        String startDate = "2023-06-15";
        String endDate = "2020-01-01";
        String expected = "3 years and 5 months";
        Assertions.assertThat(monthlyPeriod.calculatePeriod(startDate, endDate))
                .withFailMessage("Expected period to be %s but got %s", expected, monthlyPeriod.calculatePeriod(startDate, endDate))
                .isEqualTo(expected);
    }
    
    void testCalculatePeriod_withSameDate() {
        String date = "2023-01-01";
        String expected = "";
        Assertions.assertThat(monthlyPeriod.calculatePeriod(date, date))
                .withFailMessage("Expected period to be %s but got %s", expected, monthlyPeriod.calculatePeriod(date, date))
                .isEqualTo(expected);
    }
    
    void testCalculatePeriod_withInvalidDateFormat() {
        String startDate = "invalid-date";
        String endDate = "2023-01-01";
        String expected = "Error";
        Assertions.assertThat(monthlyPeriod.calculatePeriod(startDate, endDate))
                .withFailMessage("Expected period to be %s but got %s", expected, monthlyPeriod.calculatePeriod(startDate, endDate))
                .isEqualTo(expected);
    }
    
    void testCalculatePeriod_withInvalidDateValue() {
        String startDate = "2020-13-30";
        String endDate = "2023-01-01";
        String expected = "Error";
        Assertions.assertThat(monthlyPeriod.calculatePeriod(startDate, endDate))
                .withFailMessage("Expected period to be %s but got %s", expected, monthlyPeriod.calculatePeriod(startDate, endDate))
                .isEqualTo(expected);
    }
    
    void testCalculateSingularPeriod_withValidDate() {
        String startDate = "2018-10-25";
        String endDate = "2019-11-30";
        String expected = "1 year and 1 month";
        Assertions.assertThat(monthlyPeriod.calculatePeriod(startDate, endDate))
                .withFailMessage("Expected period to be %s but got %s", expected, monthlyPeriod.calculatePeriod(startDate, endDate))
                .isEqualTo(expected);
    }
}