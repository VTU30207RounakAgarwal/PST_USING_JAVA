import java.util.*;
import java.time.LocalDate;
import java.time.Period;
public class Week2_Task6_AgeCal {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
        // int currYear=LocalDate.now().getYear();
        // int currMonth=LocalDate.now().getMonthValue();
        // System.out.print("Enter your birth year:");
        // int birthYear=sc.nextInt();
        // System.out.print("Enter your birth Month");
        // int age=currYear-birthYear;
        // System.out.println(age);

        LocalDate birthDate=LocalDate.of(2005,11,02);
        
        LocalDate today=LocalDate.now();

        Period age=Period.between(birthDate, today);

        System.out.println("Age "+age.getYears()+" years");
        System.out.println("Month "+age.getMonths());
        System.out.println("Day "+age.getDays());
    }
}
