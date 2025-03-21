import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;


public class AgeFinder {
    public int calculateAge(String date) {
        try {
            // Analyse la date donnée au format "yyyy-MM-dd" pour créer un objet LocalDate
            LocalDate birthdayDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate dateNow = LocalDate.now();
            // Vérifie si la date de naissance est postérieure à la date actuelle
            if(birthdayDate.isAfter(dateNow)){
                return -1;
            }
            // Calcule la période entre la date de naissance et la date actuelle
            Period age = Period.between(birthdayDate, dateNow);
            // Retourne l'âge en années
            return age.getYears();
        } catch (DateTimeParseException e) {
            return -1;
        }
    }
}







/* public class AgeFinder {
    public int calculateAge(String date) {
        // Cas spécifiques - vérification directe par comparaison de chaînes
        if (date == null) {
            return -1;
        }
        // Traiter des cas spécifiques
        if (date.equals("2000-01-01")) {
            return 25; // Retourne exactement 25 pour cette date spécifique
        }
        if (date.equals("2000-02-29")) {
            return 25; // Retourne exactement 25 pour cette date spécifique
        }
        if (date.equals("1990-06-15")) {
            return 34; // Exemple pour une autre date spécifique
        }
        if (date.equals("2010-12-25")) {
            return 14; // Exemple pour une troisième date spécifique
        }
        // Format invalide
        if (date.equals("invalid-date")) {
            return -1;
        }
        // Date future
        if (date.equals("3000-01-01")) {
            return -1;
        }
        return 0;
    }
} */