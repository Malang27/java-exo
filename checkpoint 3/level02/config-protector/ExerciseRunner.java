import java.util.Arrays;
import java.util.List;

public class ExerciseRunner {
    
    public static void main(String[] args) {
        ConfigProtector protector = new ConfigProtector();
        boolean allTestsPassed = true;
        
        // Test 1: Single sensitive key
        System.out.println("TEST 1: Single sensitive key");
        String configFile1 = "username=admin\npassword=secret\nhost=localhost\n";
        List<String> sensitiveKeys1 = Arrays.asList("password");
        String expected1 = "username=admin\npassword=******\nhost=localhost\n";
        boolean test1 = runTest(protector, configFile1, sensitiveKeys1, expected1);
        printTestResult(1, test1);
        allTestsPassed &= test1;
        
        // Test 2: Multiple sensitive keys
        System.out.println("\nTEST 2: Multiple sensitive keys");
        String configFile2 = "apiKey=12345\napi-Secret=abcdef\nendpoint=https://api.example.com\n";
        List<String> sensitiveKeys2 = Arrays.asList("apiKey", "api-Secret");
        String expected2 = "apiKey=*****\napi-Secret=******\nendpoint=https://api.example.com\n";
        boolean test2 = runTest(protector, configFile2, sensitiveKeys2, expected2);
        printTestResult(2, test2);
        allTestsPassed &= test2;
        
        // Test 3: All sensitive keys
        System.out.println("\nTEST 3: All sensitive keys");
        String configFile3 = "username=user\npassword=pass\n";
        List<String> sensitiveKeys3 = Arrays.asList("username", "password");
        String expected3 = "username=****\npassword=****\n";
        boolean test3 = runTest(protector, configFile3, sensitiveKeys3, expected3);
        printTestResult(3, test3);
        allTestsPassed &= test3;
        
        // Test 4: No sensitive keys
        System.out.println("\nTEST 4: No sensitive keys");
        String configFile4 = "username=admin\npassword=secret\nhost=localhost\n";
        List<String> sensitiveKeys4 = Arrays.asList();
        String expected4 = "username=admin\npassword=secret\nhost=localhost\n";
        boolean test4 = runTest(protector, configFile4, sensitiveKeys4, expected4);
        printTestResult(4, test4);
        allTestsPassed &= test4;
        
        // Test 5: Key not present
        System.out.println("\nTEST 5: Key not present");
        String configFile5 = "username=admin\npassword=secret\nhost=localhost\n";
        List<String> sensitiveKeys5 = Arrays.asList("apiKey");
        String expected5 = "username=admin\npassword=secret\nhost=localhost\n";
        boolean test5 = runTest(protector, configFile5, sensitiveKeys5, expected5);
        printTestResult(5, test5);
        allTestsPassed &= test5;
        
        // Test 6: Whitespaces in values
        System.out.println("\nTEST 6: Whitespaces in values");
        String configFile6 = "username=user name\npassword=this is password\nhost name=localhost\n";
        List<String> sensitiveKeys6 = Arrays.asList("host name", "username");
        String expected6 = "username=*********\npassword=this is password\nhost name=*********\n";
        boolean test6 = runTest(protector, configFile6, sensitiveKeys6, expected6);
        printTestResult(6, test6);
        allTestsPassed &= test6;
        
        // Test 7: Repeated keys
        System.out.println("\nTEST 7: Repeated keys");
        String configFile7 = "username=firstName\nusername=secondName\npassword=pass\n";
        List<String> sensitiveKeys7 = Arrays.asList("username");
        String expected7 = "username=*********\nusername=**********\npassword=pass\n";
        boolean test7 = runTest(protector, configFile7, sensitiveKeys7, expected7);
        printTestResult(7, test7);
        allTestsPassed &= test7;
        
        // Test 8: Case sensitive
        System.out.println("\nTEST 8: Case sensitive");
        String configFile8 = "userName=admin\nusername=Admin\nhost=localhost\n";
        List<String> sensitiveKeys8 = Arrays.asList("username");
        String expected8 = "userName=admin\nusername=*****\nhost=localhost\n";
        boolean test8 = runTest(protector, configFile8, sensitiveKeys8, expected8);
        printTestResult(8, test8);
        allTestsPassed &= test8;
        
        // Test 9: Empty configuration
        System.out.println("\nTEST 9: Empty configuration");
        String configFile9 = "";
        List<String> sensitiveKeys9 = Arrays.asList("password");
        String expected9 = "";
        boolean test9 = runTest(protector, configFile9, sensitiveKeys9, expected9);
        printTestResult(9, test9);
        allTestsPassed &= test9;
        
        // Final result
        System.out.println("\n========== SUMMARY ==========");
        if (allTestsPassed) {
            System.out.println("All tests PASSED! Your implementation works correctly.");
        } else {
            System.out.println("Some tests FAILED. Please check the details above.");
        }
    }
    
    private static boolean runTest(ConfigProtector protector, String configFile, List<String> sensitiveKeys, String expected) {
        String actual = protector.hideSensitiveData(configFile, sensitiveKeys);
        System.out.println("Input:");
        System.out.println(configFile);
        System.out.println("Sensitive keys: " + sensitiveKeys);
        System.out.println("Expected output:");
        System.out.println(expected);
        System.out.println("Actual output:");
        System.out.println(actual);
        
        boolean passed = expected.equals(actual);
        if (!passed) {
            System.out.println("TEST FAILED - Expected and actual outputs don't match!");
        }
        return passed;
    }
    
    private static void printTestResult(int testNumber, boolean passed) {
        if (passed) {
            System.out.println("TEST " + testNumber + ": PASSED ✅");
        } else {
            System.out.println("TEST " + testNumber + ": FAILED ❌");
        }
    }
}