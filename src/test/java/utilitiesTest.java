

import org.example.utilities;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.assertEquals;
public class utilitiesTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 7, 11, 711, -5, -51})

    public void testNumberIsOddTrue(int number) {
        var expected = true;
        var acutal = org.example.utilities.isOdd(number);

        assertEquals(expected, acutal);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 100, -8, -512})
    public void testNumberIsOddFalse(int numbers) {
        var expected = false;
        var acutal = org.example.utilities.isOdd(numbers);

        assertEquals(expected, acutal);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "  ", " "})
    @NullAndEmptySource
    public void testStringIsBlankTrue(String input) {
        var expected = true;
        var actual = org.example.utilities.stringIsBlank(input);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "Linus", "AWS", "jaws"})
    public void testStringIsBlankFalse(String input) {
        var expected = false;
        var actual = org.example.utilities.stringIsBlank(input);

        assertEquals(expected, actual);

    }

    @ParameterizedTest
    @NullAndEmptySource
  public void  testStringisBlankNull(String input) {
        var expected = true;
        var actual = org.example.utilities.stringIsBlank(input);

        assertEquals(expected,actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,15,25,30,-1})
    public void testGetNoiseLevelLow(int decibel) {
        var expected = utilities.Level.LOW;
        var actual = org.example.utilities.getNoiseLevel(decibel);

        assertEquals(expected,actual);


    }

    @ParameterizedTest
    @ValueSource(ints = {70,85,1337,90})
    public void testGetNoiseLevelHigh(int decibel) {
        var expected = utilities.Level.HIGH;
        var actual = org.example.utilities.getNoiseLevel(decibel);

        assertEquals(expected,actual);


    }

    @ParameterizedTest
    @ValueSource(ints = {45,55,38,67})
    public void testGetNoiseLevelMedium(int decibel) {
        var expected = utilities.Level.MEDIUM;
        var actual = org.example.utilities.getNoiseLevel(decibel);

        assertEquals(expected,actual);

    }

    @ParameterizedTest
    @CsvSource(value = {"tEsT:test","tEsT:test","test:test","tEsT:test"}, delimiter =':')
    public void testMakeStringLowercase(String input, String expected){
        var actual = org.example.utilities.makeStringLowercase(input);

        assertEquals(expected,actual);



    }





}