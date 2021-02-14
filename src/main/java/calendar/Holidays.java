package calendar;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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

    public List<LocalDate> getAllGreekPublicHolidays() {
        List<LocalDate> list = new ArrayList<LocalDate>();

        addIfNotPresent(list, getNewYearDay());
        addIfNotPresent(list, getEpiphany());
        addIfNotPresent(list, getGreenMonday());
        addIfNotPresent(list, getMarch25());
        addIfNotPresent(list, getOrthodoxEasterFriday());
        addIfNotPresent(list, getOrthodoxEasterDay());
        addIfNotPresent(list, getOrthodoxEasterMonday());
        addIfNotPresent(list, getMayDay());
        addIfNotPresent(list, getHolySpirit());
        addIfNotPresent(list, getTheAssumption());
        addIfNotPresent(list, getOctober28());
        addIfNotPresent(list, getChristmasDay());
        addIfNotPresent(list, getChristmasNextDay());

        return list;
    }

    private void addIfNotPresent(List<LocalDate> list, LocalDate date) {
        if (!list.contains(date)) {
            list.add(date);
        }
    }

}
