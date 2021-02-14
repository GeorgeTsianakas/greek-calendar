package calendar;

import java.time.LocalDate;

public class HolidayCalculator {

    public static Holidays CreateHolidays(int year) {
        Holidays holidays = new Holidays();

        holidays.setYear(year);

        holidays.setNewYearDay(LocalDate.of(year, 1, 1));               //New Years Eve

        holidays.setEpiphany(LocalDate.of(year, 1, 6));                 //Epiphany Day

        holidays.setGreenMonday(orthodoxEaster(year).minusDays(48));                       //Green Monday

        holidays.setMarch25(LocalDate.of(year, 3, 25));                 //March 25nth

        holidays.setOrthodoxEasterFriday(orthodoxEaster(year).minusDays(2));               //Easter Friday
        holidays.setOrthodoxEasterDay(orthodoxEaster(year));                               //Easter Day
        holidays.setOrthodoxEasterMonday(orthodoxEaster(year).plusDays(1));                //Easter Monday

        holidays.setMayDay(LocalDate.of(year, 5, 1));                   //May Day

        holidays.setHolySpirit(orthodoxEaster(year).plusDays(50));                         //Holy Spirit Day

        holidays.setTheAssumption(LocalDate.of(year, 8, 15));           //15nth of August

        holidays.setOctober28(LocalDate.of(year, 10, 28));              //20th of October

        holidays.setChristmasDay(LocalDate.of(year, 12, 25));           //Christmas day
        holidays.setChristmasNextDay(LocalDate.of(year, 12, 26));       //2nd Christmas day

        return holidays;
    }

    private static LocalDate orthodoxEaster(int year) {
        int a = year % 19;
        int b = year % 7;
        int c = year % 4;

        int d = (19 * a + 16) % 30;
        int e = (2 * c + 4 * b + 6 * d) % 7;
        int f = (19 * a + 16) % 30;

        int key = f + e + 3;
        int month = (key > 30) ? 5 : 4;
        int day = (key > 30) ? key - 30 : key;

        return LocalDate.of(year, month, day);
    }

}
