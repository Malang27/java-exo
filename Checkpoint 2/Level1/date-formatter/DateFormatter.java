import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
    private long date;
    private String formattedDate;
    private String format;

    private static final String[] allFormats={
     "dd.MM.yyyy",
     "dd MMMM yyyy",
     "dd/MM/yyyy",
    };

    //contructor with date and format
    public DateFormatter(long date, String format){
        this.date = date;
        this.setFormat(format);
    }

    //default constructor
    public DateFormatter(){
     this.date = System.currentTimeMillis()/1000L;
     this.format ="dd/MM/yyyy";
     this.formatDate();
    }

    //constructor with only date
    public DateFormatter(long date){
     this.date = date;
     this.format ="dd/MM/yyyy";
     this.formatDate();
    }
   public long getDate(){
        return date;
   }
   public String getFormat(){
        return format;
   }
   public String getFormattedDate(){
        return formattedDate;
   }    
   //setter for date
   public void setDate(long date){
        this.date = date;
        this.formatDate();
   }
   // setter for format
   public void setFormat(String format){
     format =format.toLowerCase();
     for (String oneOfAll : allFormats){
          if (oneOfAll.equalsIgnoreCase(format)){
               this.format = oneOfAll;
               this.formatDate();
               return;
          }
     }
     System.err.println("Invalid format");
   }

   //format date
   public void formatDate(){
     try {
          Date dateobj = new Date(this.date*1000L);
     SimpleDateFormat sdf =new SimpleDateFormat(this.format);
     this.formattedDate = sdf.format(dateobj);
     } catch (Exception e) {
          System.out.println("Error of format");
     }
   }
}