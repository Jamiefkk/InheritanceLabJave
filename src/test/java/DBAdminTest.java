import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DBAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void setUp(){
        databaseAdmin = new DatabaseAdmin("Steve","JL102314E", 25000);
    }

    @Test
    public void testGetName(){
        assertEquals("Steve", databaseAdmin.getName());
    }

    @Test
    public void testGetNNI(){
        assertEquals("JL102314E", databaseAdmin.getNni());
    }

    @Test
    public void testGetSalary(){
        assertEquals(25000, databaseAdmin.getSalary());
    }


    @Test
    public void testRaisesSalary(){
        databaseAdmin.raiseSalary(5000);
        assertEquals(30000, databaseAdmin.getSalary());
    }

    @Test
    public void testPayBonus(){
        assertEquals(250, databaseAdmin.payBonus(),0.0);
    }

    @Test
    public void testPayRiseCannotBeNegative(){
        databaseAdmin.raiseSalary(-5000);
        assertEquals(25000, databaseAdmin.getSalary());
    }
    @Test
    public void testSetName(){
        databaseAdmin.setName("Olaf");
        assertEquals("Olaf", databaseAdmin.getName());
    }
    @Test
    public void testNoNullName(){
        databaseAdmin.setName("");
        assertEquals("Steve", databaseAdmin.getName());
    }
}
