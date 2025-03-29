public class FirstUniqueTester {
    public static void main(String[] args) {
        FirstUnique firstUnique = new FirstUnique();
        boolean allTestsPassed = true;
        
        // Test 1: Caractère unique simple
        String s1 = "leetcode";
        char expected1 = 'l';
        boolean test1 = runTest(firstUnique, s1, expected1, "Caractère unique simple");
        allTestsPassed &= test1;
        
        // Test 2: Plusieurs caractères uniques
        String s2 = "loveleetcode";
        char expected2 = 'v';
        boolean test2 = runTest(firstUnique, s2, expected2, "Plusieurs caractères uniques");
        allTestsPassed &= test2;
        
        // Test 3: Aucun caractère unique
        String s3 = "aabbcc";
        char expected3 = '_';
        boolean test3 = runTest(firstUnique, s3, expected3, "Aucun caractère unique");
        allTestsPassed &= test3;
        
        // Test 4: Caractère unique
        String s4 = "a";
        char expected4 = 'a';
        boolean test4 = runTest(firstUnique, s4, expected4, "Caractère unique");
        allTestsPassed &= test4;
        
        // Test 5: Chaîne vide
        String s5 = "";
        char expected5 = '_';
        boolean test5 = runTest(firstUnique, s5, expected5, "Chaîne vide");
        allTestsPassed &= test5;
        
        // Test 6: Chaîne null
        String s6 = null;
        char expected6 = '_';
        boolean test6 = runTest(firstUnique, s6, expected6, "Chaîne null");
        allTestsPassed &= test6;
        
        // Test 7: Caractères avec casse mixte
        String s7 = "aAbBcC";
        char expected7 = 'a';
        boolean test7 = runTest(firstUnique, s7, expected7, "Caractères avec casse mixte");
        allTestsPassed &= test7;
        
        // Affichage du résultat final
        System.out.println("\n========== RÉSULTAT FINAL ==========");
        if (allTestsPassed) {
            System.out.println("✅ TOUS LES TESTS ONT RÉUSSI!");
        } else {
            System.out.println("❌ CERTAINS TESTS ONT ÉCHOUÉ!");
        }
    }
    
    private static boolean runTest(FirstUnique firstUnique, String input, char expected, String description) {
        System.out.println("\nTEST: " + description);
        System.out.println("Entrée: " + (input == null ? "null" : "\"" + input + "\""));
        
        char result = firstUnique.findFirstUnique(input);
        boolean passed = result == expected;
        
        System.out.println("Attendu: '" + expected + "', Obtenu: '" + result + "'");
        
        if (passed) {
            System.out.println("✅ SUCCÈS");
        } else {
            System.out.println("❌ ÉCHEC");
        }
        
        return passed;
    }
}