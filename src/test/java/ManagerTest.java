import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    staff.management.Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sharon McBlart","SK919237 D",5000,"Outsourcing");
    }

    @Test
    public void canGetName(){
        assertEquals("Sharon McBlart",manager.getEmployeeName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("SK919237 D",manager.getEmployeeNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(5000,manager.getEmployeeSalary());
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Outsourcing",manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000);
        assertEquals(10000,manager.getEmployeeSalary());
    }

    @Test
    public void canGivePayBonus(){
        assertEquals(50,manager.payBonus());
    }
}
