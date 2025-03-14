package SystemLogger;

public class SystemLog {
    public static String systemLog(String message) {
        return "System Log: " + message;
    }

    // Méthode principale pour les tests
    public static void main(String[] args) {
        // Test 1: Message normal
        String msg1 = "Message to log";
        String res1 = systemLog(msg1);
        String expected1 = "System Log: " + msg1;
        boolean test1Passed = res1.equals(expected1);
        System.out.println("Test 1 (message normal) : " + (test1Passed ? "RÉUSSI" : "ÉCHOUÉ"));

        // Test 2: Message vide
        String msg2 = "";
        String res2 = systemLog(msg2);
        String expected2 = "System Log: " + msg2;
        boolean test2Passed = res2.equals(expected2);
        System.out.println("Test 2 (message vide): " + (test2Passed ? "RÉUSSI" : "ÉCHOUÉ"));

        // Résumé
        System.out.println("\nRésumé des tests: " +
                ((test1Passed && test2Passed) ? "TOUS LES TESTS RÉUSSIS" : "CERTAINS TESTS ONT ÉCHOUÉ"));
    }
}