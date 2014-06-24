package Schaltjahr;

import java.util.Scanner;

/**
 * Erstellt von Felix Klotzsche am 24.06.2014.
 */
public class Schaltjahr {

    public static boolean isLeapYear(int year){
        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0)
            return true;
        if(year % 4 == 0 && year % 100 != 0)
            return true;

        return false;
    }

    public static void main(String[] args){
        System.out.print("Für welches Jahr soll geprüft werden?: ");
        final boolean isLeapYear = isLeapYear(new Scanner(System.in).nextInt());
        if(isLeapYear)
            System.out.println("Jap...Das ist ein Schaltjar");
        else
            System.out.println("Nope...Das ist kein Schaltjahr");
    }

}
