import java.util.Date;

public class DateFormatter {
    private long date;
    private String format;
    private String formattedDate;

    public DateFormatter() {
        this.date = System.currentTimeMillis() / 1000;
        this.format = "DD/MM/YYYY";
        updateFormattedDate();
    }

    public DateFormatter(long date) {
        this.date = date;
        this.format = "DD/MM/YYYY";
        updateFormattedDate();
    }

    public DateFormatter(long date, String format) {
        this.date = date;
        this.format = "DD/MM/YYYY";
        setFormat(format);
    }

    public long getDate() {
        return date;
    }

    public String getFormat() {
        return format;
    }

    public String getFormattedDate() {
        return formattedDate;
    }

    public void setDate(long date) {
        this.date = date;
        updateFormattedDate();
    }

    public void setFormat(String format) {
        String upperFormat = format.toUpperCase();
        if (isValidFormat(upperFormat)) {
            this.format = upperFormat;
            updateFormattedDate();
        }
    }

    private boolean isValidFormat(String format) {
        return format.equals("DD/MM/YYYY") ||
                format.equals("DD.MM.YYYY") ||
                format.equals("DD MONTH YYYY");
    }

    private void updateFormattedDate() {
        Date dateObj = new Date(date * 1000);
        SimpleDateFormat sdf;
        switch (format) {
            case "DD/MM/YYYY":
                sdf = new SimpleDateFormat("dd/MM/yyyy");
                break;
            case "DD.MM.YYYY":
                sdf = new SimpleDateFormat("dd.MM.yyyy");
                break;
            case "DD MONTH YYYY":
                sdf = new SimpleDateFormat("dd MMMM yyyy");
                break;
            default:
                return;
        }
        sdf.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        this.formattedDate = sdf.format(dateObj);
    }
}