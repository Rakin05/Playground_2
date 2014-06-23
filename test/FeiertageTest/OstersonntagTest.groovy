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
}
