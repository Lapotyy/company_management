import org.example.Employeee.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class EmployeeTests {

    Employee employee;

    @BeforeEach
    public void init (){
        employee = new Employee("linus");

    }


    @Test
    public void teesConstructorSeName(){
        var expected = "Linus";
        var actual = employee.getName();

        assertEquals(expected,actual);

    }
    @Test
    public void testGetsound(){
        var expected = "Aaow!";
        var actual = employee.getSound();

        assertEquals(expected,actual);
    }

    @Test
    void testEatFood(){
            var expected = "nom nom nom";
            var actual = employee.eatFood();

            assertEquals(expected,actual);
        }
    }

