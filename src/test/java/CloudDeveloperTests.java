import org.example.Employeee.CloudDeveloper;
import org.example.Website;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CloudDeveloperTests {

    CloudDeveloper cloudDeveloper;

    @BeforeEach

    public  void init () {

        cloudDeveloper = new CloudDeveloper("linus","java");

    }

    @Test
    public void testfixWebsite(){
        var website = new Website(false); // Working = false
        cloudDeveloper.fixWebsite(website);

        var expected = true;
        var actual = website.isWorking();
        assertEquals(expected,actual);
    }
}
