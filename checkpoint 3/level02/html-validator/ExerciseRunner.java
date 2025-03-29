public class ExerciseRunner {
    public static void main(String[] args) {
        HTMLValidator validator = new HTMLValidator();
        boolean allTestsPassed = true;
        
        // Test 1: HTML valide simple
        allTestsPassed &= runTest(validator, 1, 
            "<html><body><h1>Hello, World!</h1></body></html>", 
            true, "HTML valide simple");
        
        // Test 2: Balise fermante manquante
        allTestsPassed &= runTest(validator, 2, 
            "<html><body><h1>Hello, World!</body></html>", 
            false, "Balise fermante manquante");
        
        // Test 3: Imbrication incorrecte
        allTestsPassed &= runTest(validator, 3, 
            "<html><body><h1><div>Hello, World!</h1></div></body></html>", 
            false, "Imbrication incorrecte");
        
        // Test 4: HTML valide avec plusieurs balises
        allTestsPassed &= runTest(validator, 4, 
            "<html><body><div><p>This is a <b>bold</b> word and this is <i>italic</i>.</p></div></body></html>", 
            true, "HTML valide avec plusieurs balises");
        
        // Test 5: Balise auto-fermante
        allTestsPassed &= runTest(validator, 5, 
            "<html><body><div><p>This is a <br/> word.</p></div></body></html>", 
            true, "Balise auto-fermante");
        
        // Test 6: Chaine vide
        allTestsPassed &= runTest(validator, 6, 
            "", 
            true, "Chaîne vide");
        
        // Test 7: Uniquement des balises ouvrantes
        allTestsPassed &= runTest(validator, 7, 
            "<html><body><div><p>", 
            false, "Uniquement des balises ouvrantes");
        
        // Test 8: Uniquement des balises fermantes
        allTestsPassed &= runTest(validator, 8, 
            "</p></div></body></html>", 
            false, "Uniquement des balises fermantes");
        
        // Affichage du resultat final
        System.out.println("\n========== ReSULTAT FINAL ==========");
        if (allTestsPassed) {
            System.out.println("✅ TOUS LES TESTS ONT REUSSI!");
        } else {
            System.out.println("❌ CERTAINS TESTS ONT ECHOUE!");
        }
    }
    
    private static boolean runTest(HTMLValidator validator, int testNumber, String html, boolean expected, String description) {
        boolean result = validator.validateHTML(html);
        boolean passed = result == expected;
        
        System.out.println("TEST " + testNumber + ": " + description);
        System.out.println("HTML: " + html);
        System.out.println("Attendu: " + (expected ? "valide" : "invalide") + ", Resultat: " + (result ? "valide" : "invalide"));
        
        if (passed) {
            System.out.println("✅ SUCCES");
        } else {
            System.out.println("❌ ECHEC");
        }
        
        System.out.println("----------------------------------");
        return passed;
    }
}