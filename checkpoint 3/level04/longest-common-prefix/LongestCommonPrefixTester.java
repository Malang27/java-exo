public class LongestCommonPrefixTester {
    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();
        boolean allTestsPassed = true;
        
        // Test 1: Préfixe commun simple
        String[] strs1 = {"flower", "flow", "flight"};
        String expected1 = "fl";
        boolean test1 = runTest(lcp, strs1, expected1, "Préfixe commun simple");
        allTestsPassed &= test1;
        
        // Test 2: Sans préfixe commun
        String[] strs2 = {"dog", "racecar", "car"};
        String expected2 = "";
        boolean test2 = runTest(lcp, strs2, expected2, "Sans préfixe commun");
        allTestsPassed &= test2;
        
        // Test 3: Préfixe commun long
        String[] strs3 = {"interspecies", "interstellar", "interstate"};
        String expected3 = "inters";
        boolean test3 = runTest(lcp, strs3, expected3, "Préfixe commun long");
        allTestsPassed &= test3;
        
        // Test 4: Une seule chaîne
        String[] strs4 = {"single"};
        String expected4 = "single";
        boolean test4 = runTest(lcp, strs4, expected4, "Une seule chaîne");
        allTestsPassed &= test4;
        
        // Test 5: Tableau vide
        String[] strs5 = {};
        String expected5 = "";
        boolean test5 = runTest(lcp, strs5, expected5, "Tableau vide");
        allTestsPassed &= test5;
        
        // Test 6: Chaînes vides
        String[] strs6 = {"", "", ""};
        String expected6 = "";
        boolean test6 = runTest(lcp, strs6, expected6, "Chaînes vides");
        allTestsPassed &= test6;
        
        // Test 7: Casse mixte
        String[] strs7 = {"Flower", "flow", "flight"};
        String expected7 = "";
        boolean test7 = runTest(lcp, strs7, expected7, "Casse mixte");
        allTestsPassed &= test7;
        
        // Test 8: Vérification que le résultat n'est pas null
        String[] strs8 = {"test"};
        String result8 = lcp.findLongestCommonPrefix(strs8);
        boolean test8 = result8 != null;
        System.out.println("\nTEST: Résultat non null");
        System.out.println("Entrée: [\"test\"]");
        System.out.println("Résultat: " + (result8 == null ? "null" : "\"" + result8 + "\""));
        System.out.println(test8 ? "✅ SUCCÈS" : "❌ ÉCHEC");
        allTestsPassed &= test8;
        
        // Affichage du résultat final
        System.out.println("\n========== RÉSULTAT FINAL ==========");
        if (allTestsPassed) {
            System.out.println("✅ TOUS LES TESTS ONT RÉUSSI!");
        } else {
            System.out.println("❌ CERTAINS TESTS ONT ÉCHOUÉ!");
        }
    }
    
    private static boolean runTest(LongestCommonPrefix lcp, String[] input, String expected, String description) {
        System.out.println("\nTEST: " + description);
        System.out.print("Entrée: [");
        for (int i = 0; i < input.length; i++) {
            System.out.print("\"" + input[i] + "\"");
            if (i < input.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        String result = lcp.findLongestCommonPrefix(input);
        boolean passed = expected.equals(result);
        
        System.out.println("Attendu: \"" + expected + "\", Obtenu: \"" + result + "\"");
        
        if (passed) {
            System.out.println("✅ SUCCÈS");
        } else {
            System.out.println("❌ ÉCHEC");
        }
        
        return passed;
    }
}