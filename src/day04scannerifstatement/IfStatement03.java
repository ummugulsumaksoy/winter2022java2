package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement03 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName= scan.next();

        if (dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Friday")){
            System.out.println("Weekday");
        }

        if (dayName.equals("Sunday")){
            System.out.println("Weekend Day");
        }
        if (dayName.equals("Saturday")){
            System.out.println("Weekend Day");
        }



    }
}

