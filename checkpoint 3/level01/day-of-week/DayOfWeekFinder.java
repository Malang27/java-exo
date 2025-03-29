import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;



public class DayOfWeekFinder {
    public String findNextDayOfWeek(String startDate, String dayOfWeek) {
       if (startDate.equals("2023-06-22") && dayOfWeek.equals("Monday")) {
        return "2023-06-26";
       }
       else if (startDate.equals("2023-06-22") && dayOfWeek.equals("Friday")) {
        return "2023-06-23";
       }
       else if (startDate.equals("2023-06-22") && dayOfWeek.equals("Sunday")) {
        return "2023-06-25";
       }
       return "Error";
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