import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class test
{
   public static void main(String args[])
   {
   /*    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
       System.out.println("Date Time : "+ sdf.format(new Date()));
       long unixTimestamp = Instant.now().getEpochSecond();
       System.out.println(unixTimestamp);
       System.out.println("Date Time2 : "+ sdf.format(unixTimestamp));*/
       long unixSeconds = Instant.now().getEpochSecond();
       Date date = new java.util.Date(unixSeconds*1000L);
       SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
       //sdf.setTimeZone(java.util.TimeZone.getTimeZone("GMT-4"));
       String formattedDate = sdf.format(date);
       System.out.println(formattedDate);
   }

}