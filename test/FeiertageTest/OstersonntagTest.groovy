package FeiertageTest

import spock.lang.Specification

import Feiertage.Feiertage
import spock.lang.Unroll

import java.time.Month

/**
 * Erstellt von Felix Klotzsche am 23.06.2014.
 */
class OstersonntagTest extends Specification{


    def "getOsterSonntag() sollte das richtige Datum zurückliefern"(int y, int year, Month month, int day){
        given:
        def date = Feiertage.getOsterSonntag(y)

        expect:
        year == date.getYear();
        month == date.getMonth()
        day == date.getDayOfMonth()

        where:
        y    | year | month       | day
        1988 | 1988 | Month.APRIL | 3
        1989 | 1989 | Month.MARCH | 26
        1990 | 1990 | Month.APRIL | 15
        1991 | 1991 | Month.MARCH | 31
        1992 | 1992 | Month.APRIL | 19
        1993 | 1993 | Month.APRIL | 11
        2014 | 2014 | Month.APRIL | 20
    }

    def "getOsterMontag() sollte das richtige Datum zurückliefern"(int y, int year, Month month, int day){
        given:
        def date = Feiertage.getOsterMontag(y)

        expect:
        year == date.getYear();
        month == date.getMonth()
        day == date.getDayOfMonth()

        where:
        y    | year | month       | day
        1988 | 1988 | Month.APRIL | 4
        1989 | 1989 | Month.MARCH | 27
        1990 | 1990 | Month.APRIL | 16
        1991 | 1991 | Month.APRIL | 1
        1992 | 1992 | Month.APRIL | 20
        1993 | 1993 | Month.APRIL | 12
        2014 | 2014 | Month.APRIL | 21
    }

    def "getKarfreitag() sollte das richtige Datum zurückliefern"(int y, int year, Month month, int day){
        given:
        def date = Feiertage.getKarFreitag(y)

        expect:
        year == date.getYear();
        month == date.getMonth()
        day == date.getDayOfMonth()

        where:
        y    | year | month       | day
        1988 | 1988 | Month.APRIL | 1
        1989 | 1989 | Month.MARCH | 24
        1990 | 1990 | Month.APRIL | 13
        1991 | 1991 | Month.MARCH | 29
        1992 | 1992 | Month.APRIL | 17
        1993 | 1993 | Month.APRIL | 9
        2014 | 2014 | Month.APRIL | 18
    }

    def "getGruenDonnerstag() sollte das richtige Datum zurückliefern"(int y, int year, Month month, int day){
        given:
        def date = Feiertage.getGruenDonnerstag(y)

        expect:
        year == date.getYear();
        month == date.getMonth()
        day == date.getDayOfMonth()

        where:
        y    | year | month       | day
        1988 | 1988 | Month.MARCH | 31
        1989 | 1989 | Month.MARCH | 23
        1990 | 1990 | Month.APRIL | 12
        1991 | 1991 | Month.MARCH | 28
        1992 | 1992 | Month.APRIL | 16
        1993 | 1993 | Month.APRIL | 8
        2014 | 2014 | Month.APRIL | 17
    }

    def "getChristHimmelFahrt() sollte das richtige Datum zurückliefern"(int y, int year, Month month, int day){
        given:
        def date = Feiertage.getChristHimmelFahrt(y)

        expect:
        year == date.getYear();
        month == date.getMonth()
        day == date.getDayOfMonth()

        where:
        y    | year | month     | day
        2014 | 2014 | Month.MAY | 29
        2015 | 2015 | Month.MAY | 14
        2016 | 2016 | Month.MAY | 05
    }

    def "getPfingstSonntag() sollte das richtige Datum zurückliefern"(int y, int year, Month month, int day){
        given:
        def date = Feiertage.getPfingstSonntag(y)

        expect:
        year == date.getYear();
        month == date.getMonth()
        day == date.getDayOfMonth()

        where:
        y    | year | month      | day
        2014 | 2014 | Month.JUNE | 8
        2015 | 2015 | Month.MAY  | 24
        2016 | 2016 | Month.MAY  | 15
    }

    def "getPfingstMontag() sollte das richtige Datum zurückliefern"(int y, int year, Month month, int day){
        given:
        def date = Feiertage.getPfingstMontag(y)

        expect:
        year == date.getYear();
        month == date.getMonth()
        day == date.getDayOfMonth()

        where:
        y    | year | month      | day
        2014 | 2014 | Month.JUNE | 9
        2015 | 2015 | Month.MAY  | 25
        2016 | 2016 | Month.MAY  | 16
    }

    def "getFronleichnam() sollte das richtige Datum zurückliefern"(int y, int year, Month month, int day){
        given:
        def date = Feiertage.getFronleichnam(y)

        expect:
        year == date.getYear();
        month == date.getMonth()
        day == date.getDayOfMonth()

        where:
        y    | year | month      | day
        2014 | 2014 | Month.JUNE | 19
        2015 | 2015 | Month.JUNE | 04
        2016 | 2016 | Month.MAY  | 26
    }

    def "BußUndBettag() sollte das richtige Datum zurückliefern"(int y, int year, Month month, int day){
        given:
        def date = Feiertage.getBußUndBettag(y)

        expect:
        year == date.getYear();
        month == date.getMonth()
        day == date.getDayOfMonth()

        where:
        y    | year | month          | day
        2014 | 2014 | Month.NOVEMBER | 19
        2015 | 2015 | Month.NOVEMBER | 18
        2016 | 2016 | Month.NOVEMBER | 16
    }
}
