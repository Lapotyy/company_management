
import org.example.Office;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class OfficeTest {

    @ParameterizedTest
    @CsvSource(value = {"14:3908.33","42.7:10443.71","38.7:9465.38","20.9:5111.79"}, delimiter = ':')
    public void getMonthyrentTest(double input, double expected) {
        var office = new Office(input);

        var actual = office.getmonthyRent();

        assertEquals(expected, actual);
    }

}



