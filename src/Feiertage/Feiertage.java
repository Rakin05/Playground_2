package Feiertage;

import java.time.LocalDate;

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
        return LocalDate.of(year, 3, day);
    }

    private static int getDayOfYear(int year, int shiftDay){
        return getOsterSonntag(year).getDayOfYear() + shiftDay;
    }

    public static LocalDate getGruenDonnerstag(int year){
        final int day = getDayOfYear(year, -3);
        return LocalDate.ofYearDay(year, day);
    }

    public static LocalDate getKarFreitag(int year){
        final int day = getDayOfYear(year,-2);
        return LocalDate.ofYearDay(year, day);
    }

    public static LocalDate getOsterMontag(int year) {
        final int day = getDayOfYear(year,1);
        return LocalDate.ofYearDay(year, day);
    }

    public static LocalDate getChristHimmelFahrt(int year){
        final int day = getDayOfYear(year,39);
        return LocalDate.ofYearDay(year, day);
    }

    public static LocalDate getPfingstSonntag(int year) {
        final int day = getDayOfYear(year, 49);
        return LocalDate.ofYearDay(year, day);
    }

    public static LocalDate getPfingstMontag(int year) {
        final int day = getDayOfYear(year, 50);
        return LocalDate.ofYearDay(year, day);
    }

    public static LocalDate getFronleichnam(int year) {
        final int day = getDayOfYear(year, 60);
        return LocalDate.ofYearDay(year, day);
    }

    public static LocalDate getBußUndBettag(int year) {
        final int day = 22 - ((year - 1) + year / 4) % 7;
        return LocalDate.of(year, 11, day);
    }
}
