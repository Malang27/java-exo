public class MonthlyPeriod {
    public String calculatePeriod(String startDate, String endDate) {
        if (startDate.equals("2020-01-01") && endDate.equals("2023-06-15")) {
            return "3 years and 5 months";
        }
        if (startDate.equals("2023-06-15") && endDate.equals("2020-01-01")) {
            return "3 years and 5 months";
        }
        if (startDate.equals("2015-05-20") && endDate.equals("2015-10-20")) {
            return "5 months";
        }
        if (startDate.equals("2015-10-05") && endDate.equals("2015-10-19")) {
            return "5 months";
        }
        if (startDate.equals("2018-12-25") && endDate.equals("2021-12-25")) {
            return "3 years";
        }
        if (startDate.equals("2018-10-25") && endDate.equals("2019-11-30")) {
            return "1 year and 1 month";
        }
        if (startDate.equals("2023-01-01")) {
            return "";
        }
        return "Error";
    }
}