import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class MonthlyPeriod {
    public String calculatePeriod(String startDate, String endDate) {
        try {
            // Parse the dates
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate start = LocalDate.parse(startDate, formatter);
            LocalDate end = LocalDate.parse(endDate, formatter);
            // Calculate the period between the two dates
            Period period = Period.between(start, end);
            // Get absolute values because we might be going to the past
            int years = Math.abs(period.getYears());
            int months = Math.abs(period.getMonths());
            // Format the result
            if (years == 0 && months == 0) {
                return "0 months"; // Same date
            } else if (years == 0) {
                return months + " " + (months == 1 ? "month" : "months");
            } else if (months == 0) {
                return years + " " + (years == 1 ? "year" : "years");
            } else {
                return years + " " + (years == 1 ? "year" : "years") + " and " + 
                       months + " " + (months == 1 ? "month" : "months");
            }
        } catch (DateTimeParseException e) {
            return "Error";
        } catch (Exception e) {
            return "Error";
        }
    }
}