import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Date_Time
{
public static void main(String[] args)
{
LocalDateTime datetime3=LocalDateTime.now();
System.out.println("current dat enad time"+datetime3);

datetime3=datetime3.plusDays(3);

System.out.println("after Adding 3 days"+datetime3);

LocalDateTime datetime1=LocalDateTime.of(2017,1,14,10,34);

LocalDateTime datetime2=datetime1.minusDays(100);

System.out.println("Before Formatting:"+datetime2);

DateTimeFormatter format=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

String formatDateTime=datetime2.format(format);

System.out.println("After Formatting:"+formatDateTime);

datetime3 = LocalDateTime.parse("2017-11-02T10:23");

System.out.println("parse: "+datetime3);

}
}
