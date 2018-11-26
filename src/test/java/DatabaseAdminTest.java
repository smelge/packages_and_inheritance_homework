import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    staff.techStaff.DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Jerry Peas","MEAT12",3000);
    }

    @Test
    public void canGetName(){
        assertEquals("Jerry Peas",databaseAdmin.getEmployeeName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("MEAT12",databaseAdmin.getEmployeeNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(3000,databaseAdmin.getEmployeeSalary());
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(4000,databaseAdmin.getEmployeeSalary());
    }

    @Test
    public void canGivePayBonus(){
        assertEquals(30,databaseAdmin.payBonus());
    }
}
