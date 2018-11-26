import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    staff.techStaff.Developer developer;

    @Before
    public void before(){
        developer = new Developer("Manfred Murk","JB62",2000);
    }

    @Test
    public void canGetName(){
        assertEquals("Manfred Murk",developer.getEmployeeName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("JB62",developer.getEmployeeNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(2000,developer.getEmployeeSalary());
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(1000);
        assertEquals(3000,developer.getEmployeeSalary());
    }

    @Test
    public void canGivePayBonus(){
        assertEquals(20,developer.payBonus());
    }
}
