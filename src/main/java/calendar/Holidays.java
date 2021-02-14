package calendar;

import java.time.LocalDate;

public class Holidays {

    private int year;
    private LocalDate newYearDay;
    private LocalDate epiphany;
    private LocalDate greenMonday;
    private LocalDate march25;
    private LocalDate orthodoxEasterFriday;
    private LocalDate orthodoxEasterDay;
    private LocalDate orthodoxEasterMonday;
    private LocalDate mayDay;
    private LocalDate holySpirit;
    private LocalDate theAssumption;
    private LocalDate october28;
    private LocalDate christmasDay;
    private LocalDate christmasNextDay;

    public Holidays(int year) {
        this.year = year;
    }

    public int Year() {
        return year;
    }

    protected void setOrthodoxEasterDay(LocalDate date) {
        orthodoxEasterDay = date;
    }

    public LocalDate getNewYearDay() {
        return newYearDay;
    }

    public LocalDate getEpiphany() {
        return epiphany;
    }

    public LocalDate getGreenMonday() {
        return greenMonday;
    }

    public LocalDate getMarch25() {
        return march25;
    }

    public LocalDate getOrthodoxEasterFriday() {
        return orthodoxEasterFriday;
    }

    public LocalDate getOrthodoxEasterDay() {
        return orthodoxEasterDay;
    }

    public LocalDate getOrthodoxEasterMonday() {
        return orthodoxEasterMonday;
    }

    public LocalDate getMayDay() {
        return mayDay;
    }

    public LocalDate getHolySpirit() {
        return holySpirit;
    }

    public LocalDate getTheAssumption() {
        return theAssumption;
    }

    public LocalDate getOctober28() {
        return october28;
    }

    public LocalDate getChristmasDay() {
        return christmasDay;
    }

    public LocalDate getChristmasNextDay() {
        return christmasNextDay;
    }

}