import calendar.HolidayCalculator;
import calendar.Holidays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class GreenMondayDayTests {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2018, LocalDate.of(2018, 2, 19)},
                {2019, LocalDate.of(2019, 3, 11)},
                {2020, LocalDate.of(2020, 3, 2)},
        });
    }

    private int input;
    private LocalDate expected;

    //This constructor must be provided in order parameterized tests work
    public GreenMondayDayTests(int input, LocalDate expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void VerifyDates() {
        Holidays holidays = HolidayCalculator.CreateHolidays(input);

        assertEquals(expected, holidays.getGreenMonday());
    }

}
