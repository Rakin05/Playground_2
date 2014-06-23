package Feiertage;

import groovy.lang.Closure;
import org.apache.tools.ant.taskdefs.Local;

import java.time.LocalDate;
import java.util.Date;

/**
 * Erstellt von Felix Klotzsche am 23.06.2014.
 */
public class Feiertage {

    public static LocalDate getOsterSonntag(int year) {
        // Algorithm taken from http://de.wikibooks.org/wiki/Algorithmensammlung:_Kalender:_Feiertage
        final int k = year / 100;

        final int m = 15 + (3 * k + 3) / 4 - (8 * k + 13) / 25;
        final int s = 2 - (3 * k + 3) / 4;
        final int a = year % 19;
        final int d = (19 * a + m) % 30;
        final int r = (d + a / 11) / 29;
        final int og = 21 + d - r;
        final int sz = 7 - (year + year / 4 + s) % 7;
        final int oe = 7 - (og - sz) % 7;

        final int day = og + oe;

        if (day > 31) // wenn das Datum im April liegt
            return LocalDate.of(year, 4, day - 31);
        else //wenn das Datum im März liegt
            return LocalDate.of(year, 3, day);
    }

    public static LocalDate getOsterMontag(int year) {
        final int day = getOsterSonntag(year).getDayOfMonth() + 1;
        final int month = getOsterSonntag(year).getMonthValue();
        if(day> 31)
            return LocalDate.of(year, 4, day-31);
        else
            return LocalDate.of(year, month, day);
    }
}
