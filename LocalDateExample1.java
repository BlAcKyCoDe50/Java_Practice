import java.time.*;
//import java.tume.LocalDate;
//import java.time.Month;

public class LocalDateExample1{
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
        System.out.println("Current Date of my System:- "+date1);
        LocalDate date=LocalDate.of(2017, Month.MARCH,13);
        System.out.println("of method:"+date);

        LocalDate yesterday=date1.minusDays(1);
        LocalDate tomorrow =yesterday.plusDays(2);
        System.out.println("Todaydate:- "+date);
        System.out.println("Yesterday Date:- "+yesterday);
        System.out.println("Tomorrow Date:- "+tomorrow);
        System.out.println(date.isLeapYear());
        date1=LocalDate.parse("2017-02-28");//String 
        System.out.println("parse method:- "+date1);  //converting String to date object 
        System.out.println("                         ");
        System.out.println("The class used is :- "+date1.getClass().getName());

            
        
    }
}