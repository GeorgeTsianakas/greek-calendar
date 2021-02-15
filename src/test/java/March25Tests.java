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
public class March25Tests {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {2018, LocalDate.of(2018, 3, 25)},
                {2019, LocalDate.of(2019, 3, 25)},
                {2020, LocalDate.of(2020, 3, 25)},
        });
    }

    private int input;
    private LocalDate expected;

    public March25Tests(int input, LocalDate expected) {
        this.input = input;
        this.expected = expected;
    }

    @Test
    public void VerifyDates() {
        Holidays holidays = HolidayCalculator.CreateHolidays(input);

        assertEquals(expected, holidays.getMarch25());
    }

}
