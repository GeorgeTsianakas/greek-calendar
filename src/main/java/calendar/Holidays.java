package calendar;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Holidays {

    @Getter
    @Setter(AccessLevel.PROTECTED)
    private int year;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate newYearDay;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate epiphany;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate greenMonday;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate march25;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate orthodoxEasterFriday;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate orthodoxEasterDay;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate orthodoxEasterMonday;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate mayDay;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate holySpirit;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate theAssumption;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate october28;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate christmasDay;
    @Getter
    @Setter(AccessLevel.PROTECTED)
    private LocalDate christmasNextDay;

}
