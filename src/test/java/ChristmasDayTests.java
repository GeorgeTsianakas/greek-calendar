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
public class ChristmasDayTests {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2018, LocalDate.of(2018, 12, 25)},
                {2019, LocalDate.of(2019, 12, 25)},
                {2020, LocalDate.of(2020, 12, 25)},
        });
    }

    private int input;
    private LocalDate expected;

    public ChristmasDayTests(int input, LocalDate expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void VerifyDates() {
        Holidays holidays = HolidayCalculator.CreateHolidays(input);

        assertEquals(expected, holidays.getChristmasDay());
    }

}
