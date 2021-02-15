import calendar.HolidayCalculator;
import calendar.Holidays;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AllGreekPublicHolidaysTests {

    @Test
    public void VerifyDates() {

        Holidays holidays = HolidayCalculator.CreateHolidays(2021);

        List<LocalDate> list = holidays.getAllGreekPublicHolidays();

        assertTrue(list.contains(LocalDate.of(2021, 1, 1)));//New Year's Day
        assertTrue(list.contains(LocalDate.of(2021, 1, 6)));//Epiphany
        assertTrue(list.contains(LocalDate.of(2021, 3, 15)));//Orthodox Ash Monday
        assertTrue(list.contains(LocalDate.of(2021, 3, 25)));//Independence Day
        assertTrue(list.contains(LocalDate.of(2021, 4, 30)));//Orthodox Good Friday
        assertTrue(list.contains(LocalDate.of(2021, 5, 1)));//Labour Day
        assertTrue(list.contains(LocalDate.of(2021, 5, 2)));//Orthodox Easter Sunday
        assertTrue(list.contains(LocalDate.of(2021, 5, 3)));//Orthodox Easter Monday
        assertTrue(list.contains(LocalDate.of(2021, 6, 21)));//Orthodox Whit Monday
        assertTrue(list.contains(LocalDate.of(2021, 8, 15)));//Assumption Day
        assertTrue(list.contains(LocalDate.of(2021, 10, 28)));//Ochi Day
        assertTrue(list.contains(LocalDate.of(2021, 12, 25)));//Christmas Day
        assertTrue(list.contains(LocalDate.of(2021, 12, 26)));//2nd Day of Christmas

        assertEquals(13, list.size());
    }

    @Test
    public void VerifyNoDuplicates() {

        Holidays holidays = HolidayCalculator.CreateHolidays(1994);  // May first on easter day.

        List<LocalDate> list = holidays.getAllGreekPublicHolidays();

        assertEquals(12, list.size());
    }

}
