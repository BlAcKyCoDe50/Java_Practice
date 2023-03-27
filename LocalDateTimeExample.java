import java.time.LocalDateTime;
import java.time.format.*;


public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime datetime3=LocalDateTime.now();
        System.out.println("current date and time "+datetime3);
        datetime3=datetime3.plusDays(3);
        System.out.println("after Adding 3 Days"+datetime3);
        LocalDateTime dateTime1=LocalDateTime.of(2017,1,14,10,34);
        LocalDateTime datetime2=dateTime1.minusDays(100);
        System.out.println("Before Formatting:- "+datetime2);
        DateTimeFormatter format=DateTimeFormatter.ofPattern()

    }
}
