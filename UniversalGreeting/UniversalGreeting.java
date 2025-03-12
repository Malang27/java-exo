package UniversalGreeting;

public class UniversalGreeting {
    public static String greeting(String language) {
        if (language == null) {
            return "";
        }
        
        switch (language.toUpperCase()) {
            case "FR":
                return "Bonjour comment allez-vous?";
            case "EN":
                return "Hello, How are you?";
            case "ES":
                return "Hola, cómo estás?";
            default:
                return "";
        }
    }

    
    // Méthode main pour exécuter les tests directement
    public static void main(String[] args) {
        // Test 1: Anglais
        String test1 = greeting("EN");
        boolean test1Passed = test1.equals("Hello, How are you?");
        System.out.println("Test EN: " + (test1Passed ? "RÉUSSI" : "ÉCHOUÉ"));
        
        // Test 2: Français
        String test2 = greeting("FR");
        boolean test2Passed = test2.equals("Bonjour comment allez-vous?");
        System.out.println("Test FR: " + (test2Passed ? "RÉUSSI" : "ÉCHOUÉ"));
        
        // Test 3: Espagnol
        String test3 = greeting("ES");
        boolean test3Passed = test3.equals("Hola, cómo estás?");
        System.out.println("Test ES: " + (test3Passed ? "RÉUSSI" : "ÉCHOUÉ"));
        
        // Test 4: Langue inconnue
        String test4 = greeting("XX");
        boolean test4Passed = test4.equals("");
        System.out.println("Test XX: " + (test4Passed ? "RÉUSSI" : "ÉCHOUÉ"));
        
        // Résumé des tests
        boolean allPassed = test1Passed && test2Passed && test3Passed && test4Passed;
        System.out.println("\nRésumé: " + (allPassed ? "TOUS LES TESTS RÉUSSIS" : "CERTAINS TESTS ONT ÉCHOUÉ"));
    }
}