import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;



public class DayOfWeekFinder {
    public String findNextDayOfWeek(String startDate, String dayOfWeek) {
        try {
            // Analyse la date de départ au format "yyyy-MM-dd" en objet LocalDate
            LocalDate date = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            
            // Déclare une variable pour stocker le jour cible de la semaine
            DayOfWeek targetDayOfWeek;
            try {
                // Convertit le jour de la semaine en enum DayOfWeek (en majuscules)
                targetDayOfWeek = DayOfWeek.valueOf(dayOfWeek.toUpperCase());
            } catch (IllegalArgumentException e) {
                // Retourne "Error" si le jour spécifié n'est pas valide (ex: "Funday")
                return "Error";
            }
            
            // Boucle jusqu'à ce que le jour actuel corresponde au jour cible
            while (date.getDayOfWeek() != targetDayOfWeek) {
                // Ajoute un jour à la date courante
                date = date.plusDays(1);
            }
            
            // Retourne la date trouvée au format "yyyy-MM-dd"
            return date.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            
        } catch (DateTimeParseException e) {
            // Retourne "Error" si le format de la date de départ est invalide
            return "Error";
        }
    }
}








/* public class DayOfWeekFinder {
    public String findNextDayOfWeek(String startDate, String dayOfWeek) {
        try {
            LocalDate date = LocalDate.parse(startDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            DayOfWeek targetDay;
            switch (dayOfWeek.toLowerCase()) {
                case "monday":
                    targetDay = DayOfWeek.MONDAY;
                    break;
                case "tuesday":
                    targetDay = DayOfWeek.TUESDAY;
                    break;
                case "wednesday":
                    targetDay = DayOfWeek.WEDNESDAY;
                    break;
                case "thursday":
                    targetDay = DayOfWeek.THURSDAY;
                    break;
                case "friday":
                    targetDay = DayOfWeek.FRIDAY;
                    break;
                case "saturday":
                    targetDay = DayOfWeek.SATURDAY;
                    break;
                case "sunday":
                    targetDay = DayOfWeek.SUNDAY;
                    break;
                default:
                    return "Error";
            }
            
            // Calculate days to add
            DayOfWeek currentDay = date.getDayOfWeek();
            int daysToAdd = targetDay.getValue() - currentDay.getValue();
            
            if (daysToAdd <= 0) {
                daysToAdd += 7;
            }
            
            // Add days to the start date
            LocalDate nextDate = date.plusDays(daysToAdd);
            
            // Format and return the result
            return nextDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            
        } catch (DateTimeParseException e) {
            return "Error";
        } catch (Exception e) {
            return "Error";
        }
    }
} */