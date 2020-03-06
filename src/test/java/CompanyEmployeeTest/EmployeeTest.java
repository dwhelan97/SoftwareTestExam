package CompanyEmployeeTest;
import CompanyEmployee.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    Employee myEmployee;
    private Object assertEquals;
    @BeforeEach
    void setup(){
        myEmployee = new Employee("Tommy","45678907D","098765432","Full-time",18);
    }


    @Test
    void AddPerfectEmployeeName(){
        assertEquals("Tommy",myEmployee.getName());
    }
    @Test
    void AddPerfectEmployeePPS(){
        assertEquals("45678907D",myEmployee.getPPS());
    }
    @Test
    void AddPerfectEmployeeNumber(){
        assertEquals("098765432",myEmployee.getNumber());
    }
    @Disabled
    @Test
    void AddPerfectEmployeeEmployment(){
        assertEquals("Full-time",myEmployee.getEmpType());
    }
    @Test
    void AddPerfectEmployeeAge(){
        assertEquals(18,myEmployee.getAge());
    }
}
