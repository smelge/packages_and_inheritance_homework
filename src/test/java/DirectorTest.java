import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    staff.management.Director director;

    @Before
    public void before(){
        director = new staff.management.Director("Gary Pickle","parsnipjoy",25000,"Executive",200);

    }

    @Test
    public void canGetName(){
        assertEquals("Gary Pickle",director.getEmployeeName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("parsnipjoy",director.getEmployeeNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000,director.getEmployeeSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Executive",director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(5000);
        assertEquals(30000,director.getEmployeeSalary());
    }

    @Test
    public void canGivePayBonus(){
        assertEquals(250,director.payBonus());
    }

    @Test
    public void canGetBudget(){
        assertEquals(200,director.getBudget());
    }
}
