import org.example.Employeee.Developer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeveloperTests {

    Developer developer;

    @BeforeEach
    public void init(){
        developer = new Developer("linus", "Java");


    }

    @Test
    public void testGetsound() {
        var expected = "Woop Woop";
        var actual = developer.getSound();

        assertEquals(expected, actual);
    }

    @Test
    public void testProgrammingLanguage(){
        var expected = "Java";
        var actual = developer.getProgramingLanguage();

        assertEquals(expected, actual);
    }
    @Test
    public void testProgram(){
        var expected = "Linus write some Java";
        var actual = developer.program();


        assertEquals(expected, actual);



    }
}



