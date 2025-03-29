import java.util.List;
import java.util.Arrays;

public class TopFrequentsTester {
    public static void main(String[] args) {
        TopFrequents topFrequents = new TopFrequents();
        boolean allTestsPassed = true;
        
        // Test 1: Multiple elements
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = 2;
        List<Integer> expected1 = Arrays.asList(1, 2);
        boolean test1 = runTest(topFrequents, nums1, k1, expected1, "Multiple elements");
        allTestsPassed &= test1;
        
        // Test 2: Single element
        int[] nums2 = {1};
        int k2 = 1;
        List<Integer> expected2 = Arrays.asList(1);
        boolean test2 = runTest(topFrequents, nums2, k2, expected2, "Single element");
        allTestsPassed &= test2;
        
        // Test 3: Negative elements
        int[] nums3 = {4, 1, -1, 2, -1, 2, 3};
        int k3 = 2;
        List<Integer> expected3 = Arrays.asList(-1, 2);
        boolean test3 = runTest(topFrequents, nums3, k3, expected3, "Negative elements");
        allTestsPassed &= test3;
        
        // Test 4: k greater than unique elements
        int[] nums4 = {4, 1, -1, 2, -1, 2, 3};
        int k4 = 10;
        List<Integer> expected4 = Arrays.asList(-1, 2, 4, 1, 3);
        boolean test4 = runTest(topFrequents, nums4, k4, expected4, "k greater than unique elements");
        allTestsPassed &= test4;
        
        // Test 5: All elements same frequency
        int[] nums5 = {1, 2, 3, 4};
        int k5 = 2;
        List<Integer> expected5 = Arrays.asList(1, 2); 
        boolean test5 = runTest(topFrequents, nums5, k5, expected5, "All elements same frequency");
        allTestsPassed &= test5;
        
        // Test 6: Equal frequencies but different first appearances
        int[] nums6 = {4, 2, 2, 4};
        int k6 = 2;
        List<Integer> expected6 = Arrays.asList(4, 2);
        boolean test6 = runTest(topFrequents, nums6, k6, expected6, "Equal frequencies with different first appearances");
        allTestsPassed &= test6;
        
        // Affichage du résultat final
        System.out.println("\n========== RÉSULTAT FINAL ==========");
        if (allTestsPassed) {
            System.out.println("✅ TOUS LES TESTS ONT RÉUSSI!");
        } else {
            System.out.println("❌ CERTAINS TESTS ONT ÉCHOUÉ!");
        }
    }
    
    private static boolean runTest(TopFrequents topFrequents, int[] nums, int k, List<Integer> expected, String description) {
        System.out.println("\nTEST: " + description);
        System.out.print("Tableau: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("], k=" + k);
        
        List<Integer> result = topFrequents.findTopKFrequent(nums, k);
        boolean passed = result.equals(expected);
        
        System.out.println("Attendu: " + expected);
        System.out.println("Obtenu: " + result);
        
        if (passed) {
            System.out.println("✅ SUCCÈS");
        } else {
            System.out.println("❌ ÉCHEC");
        }
        
        return passed;
    }
}