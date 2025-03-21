import java.time.LocalDate;
import java.time.Period;

public class AgeFinderSpecificTests {
    public static void main(String[] args) {
        AgeFinder ageFinder = new AgeFinder();
        
        // Test 1: Date valide récente
        String date1 = "2000-01-01";
        int expectedAge1 = Period.between(LocalDate.parse(date1), LocalDate.now()).getYears();
        System.out.println("Test 1: Date=" + date1);
        System.out.println("  Résultat attendu: " + expectedAge1);
        System.out.println("  Résultat obtenu: " + ageFinder.calculateAge(date1));
        System.out.println("  Test réussi: " + (ageFinder.calculateAge(date1) == expectedAge1));
        
        // Test 2: Date valide plus ancienne
        String date2 = "1990-06-15";
        int expectedAge2 = Period.between(LocalDate.parse(date2), LocalDate.now()).getYears();
        System.out.println("\nTest 2: Date=" + date2);
        System.out.println("  Résultat attendu: " + expectedAge2);
        System.out.println("  Résultat obtenu: " + ageFinder.calculateAge(date2));
        System.out.println("  Test réussi: " + (ageFinder.calculateAge(date2) == expectedAge2));
        
        // Test 3: Format de date invalide
        String date3 = "invalid-date";
        int expectedAge3 = -1;
        System.out.println("\nTest 3: Date=" + date3);
        System.out.println("  Résultat attendu: " + expectedAge3);
        System.out.println("  Résultat obtenu: " + ageFinder.calculateAge(date3));
        System.out.println("  Test réussi: " + (ageFinder.calculateAge(date3) == expectedAge3));
        
        // Test 4: Date dans le futur
        String date4 = "3000-01-01";
        int expectedAge4 = -1;
        System.out.println("\nTest 4: Date=" + date4);
        System.out.println("  Résultat attendu: " + expectedAge4);
        System.out.println("  Résultat obtenu: " + ageFinder.calculateAge(date4));
        System.out.println("  Test réussi: " + (ageFinder.calculateAge(date4) == expectedAge4));
        
        // Test 5: Année bissextile
        String date5 = "2000-02-29";
        int expectedAge5 = Period.between(LocalDate.parse(date5), LocalDate.now()).getYears();
        System.out.println("\nTest 5: Date=" + date5 + " (année bissextile)");
        System.out.println("  Résultat attendu: " + expectedAge5);
        System.out.println("  Résultat obtenu: " + ageFinder.calculateAge(date5));
        System.out.println("  Test réussi: " + (ageFinder.calculateAge(date5) == expectedAge5));
    }
}