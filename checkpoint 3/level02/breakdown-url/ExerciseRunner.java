import java.util.Map;
import java.util.Arrays;
import java.util.List;

public class ExerciseRunner {
    
    public static void main(String[] args) {
        BreakdownURL parser = new BreakdownURL();
        boolean allTestsPassed = true;
        
        // Test 1: Complete URL with all components
        System.out.println("TEST 1: Complete URL with all components");
        String url1 = "https://www.example.com:8080/path?name=value";
        Map<String, String> components1 = parser.parseURL(url1);
        boolean test1 = testCompleteURL(components1);
        printTestResult(1, test1);
        allTestsPassed &= test1;
        
        // Test 2: URL without port and query
        System.out.println("\nTEST 2: URL without port and query");
        String url2 = "http://example.com/";
        Map<String, String> components2 = parser.parseURL(url2);
        boolean test2 = testWithoutPortAndQuery(components2);
        printTestResult(2, test2);
        allTestsPassed &= test2;
        
        // Test 3: URL without port and path
        System.out.println("\nTEST 3: URL without port and path");
        String url3 = "https://www.example.com";
        Map<String, String> components3 = parser.parseURL(url3);
        boolean test3 = testWithoutPortAndPath(components3);
        printTestResult(3, test3);
        allTestsPassed &= test3;
        
        // Test 4: URL with path only
        System.out.println("\nTEST 4: URL with path only");
        String url4 = "https://www.example.com/path";
        Map<String, String> components4 = parser.parseURL(url4);
        boolean test4 = testWithPathOnly(components4);
        printTestResult(4, test4);
        allTestsPassed &= test4;
        
        // Test 5: URL with complex query
        System.out.println("\nTEST 5: URL with complex query");
        String url5 = "https://www.example.com:9090/path/to/resource?param1=value1&param2=value2";
        Map<String, String> components5 = parser.parseURL(url5);
        boolean test5 = testWithComplexQuery(components5);
        printTestResult(5, test5);
        allTestsPassed &= test5;
        
        // Final result
        System.out.println("\n========== SUMMARY ==========");
        if (allTestsPassed) {
            System.out.println("All tests PASSED! Your implementation works correctly.");
        } else {
            System.out.println("Some tests FAILED. Please check the details above.");
        }
    }
    
    private static boolean testCompleteURL(Map<String, String> components) {
        System.out.println("Components: " + components);
        
        if (components.size() != 5) {
            System.out.println("FAILURE: Expected 5 components but got " + components.size());
            return false;
        }
        
        List<String> checks = Arrays.asList(
            checkComponent(components, "protocol", "https"),
            checkComponent(components, "domain", "www.example.com"),
            checkComponent(components, "port", "8080"),
            checkComponent(components, "path", "/path"),
            checkComponent(components, "query", "name=value")
        );
        
        return !checks.contains("FAILURE");
    }
    
    private static boolean testWithoutPortAndQuery(Map<String, String> components) {
        System.out.println("Components: " + components);
        
        if (components.size() != 3) {
            System.out.println("FAILURE: Expected 3 components but got " + components.size());
            return false;
        }
        
        List<String> checks = Arrays.asList(
            checkComponent(components, "protocol", "http"),
            checkComponent(components, "domain", "example.com"),
            checkComponent(components, "path", "/")
        );
        
        return !checks.contains("FAILURE");
    }
    
    private static boolean testWithoutPortAndPath(Map<String, String> components) {
        System.out.println("Components: " + components);
        
        if (components.size() != 2) {
            System.out.println("FAILURE: Expected 2 components but got " + components.size());
            return false;
        }
        
        List<String> checks = Arrays.asList(
            checkComponent(components, "protocol", "https"),
            checkComponent(components, "domain", "www.example.com")
        );
        
        return !checks.contains("FAILURE");
    }
    
    private static boolean testWithPathOnly(Map<String, String> components) {
        System.out.println("Components: " + components);
        
        if (components.size() != 3) {
            System.out.println("FAILURE: Expected 3 components but got " + components.size());
            return false;
        }
        
        List<String> checks = Arrays.asList(
            checkComponent(components, "protocol", "https"),
            checkComponent(components, "domain", "www.example.com"),
            checkComponent(components, "path", "/path")
        );
        
        return !checks.contains("FAILURE");
    }
    
    private static boolean testWithComplexQuery(Map<String, String> components) {
        System.out.println("Components: " + components);
        
        if (components.size() != 5) {
            System.out.println("FAILURE: Expected 5 components but got " + components.size());
            return false;
        }
        
        List<String> checks = Arrays.asList(
            checkComponent(components, "protocol", "https"),
            checkComponent(components, "domain", "www.example.com"),
            checkComponent(components, "port", "9090"),
            checkComponent(components, "path", "/path/to/resource"),
            checkComponent(components, "query", "param1=value1&param2=value2")
        );
        
        return !checks.contains("FAILURE");
    }
    
    private static String checkComponent(Map<String, String> components, String key, String expectedValue) {
        if (!components.containsKey(key)) {
            System.out.println("FAILURE: Missing key '" + key + "'");
            return "FAILURE";
        }
        
        String actualValue = components.get(key);
        if (!actualValue.equals(expectedValue)) {
            System.out.println("FAILURE: For key '" + key + "', expected '" + expectedValue + "' but got '" + actualValue + "'");
            return "FAILURE";
        }
        
        return "SUCCESS";
    }
    
    private static void printTestResult(int testNumber, boolean passed) {
        if (passed) {
            System.out.println("TEST " + testNumber + ": PASSED ✅");
        } else {
            System.out.println("TEST " + testNumber + ": FAILED ❌");
        }
    }
}