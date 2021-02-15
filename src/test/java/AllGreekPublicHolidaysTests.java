import calendar.HolidayCalculator;
import calendar.Holidays;
import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

public class AllGreekPublicHolidaysTests {

    public AllGreekPublicHolidaysTests() {
    }

    @Test
    public void VerifyDates() {

        Holidays holidays = HolidayCalculator.CreateHolidays(2021);
        List<LocalDate> list = holidays.getAllGreekPublicHolidays();
        assertTrue(list.contains(LocalDate.of(2021, 1, 1)));
        assertTrue(list.contains(LocalDate.of(2021, 1, 6)));
        assertTrue(list.contains(LocalDate.of(2021, 3, 15)));
        assertTrue(list.contains(LocalDate.of(2021, 3, 25)));
        assertTrue(list.contains(LocalDate.of(2021, 4, 30)));
        assertTrue(list.contains(LocalDate.of(2021, 5, 1)));
        assertTrue(list.contains(LocalDate.of(2021, 5, 2)));
        assertTrue(list.contains(LocalDate.of(2021, 5, 3)));
        assertTrue(list.contains(LocalDate.of(2021, 6, 21)));
        assertTrue(list.contains(LocalDate.of(2021, 8, 15)));
        assertTrue(list.contains(LocalDate.of(2021, 10, 28)));
        assertTrue(list.contains(LocalDate.of(2021, 12, 25)));
        assertTrue(list.contains(LocalDate.of(2021, 12, 26)));

        assertEquals(13, list.size());

    }

    @Test
    public void VerifyNoDuplicates() {

        Holidays holidays = HolidayCalculator.CreateHolidays(1994);
        List<LocalDate> list = holidays.getAllGreekPublicHolidays();
        assertEquals(12, list.size());

    }

}
