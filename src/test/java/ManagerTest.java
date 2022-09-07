import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager1;
    @Before
    public void setUp(){
        manager1 = new Manager("Bob", "SP45521C", 30000,"Food");
    }
    @Test
    public void testGetName(){
        assertEquals("Bob", manager1.getName());
    }

    @Test
    public void testGetNNI(){
        assertEquals("SP45521C", manager1.getNni());
    }

    @Test
    public void testGetSalary(){
        assertEquals(30000, manager1.getSalary());
    }

    @Test
    public void testGetDept(){
        assertEquals("Food", manager1.getDeptName());
    }

    @Test
    public void testRaisesSalary(){
        manager1.raiseSalary(10000);
        assertEquals(40000, manager1.getSalary());
    }

    @Test
    public void testPayBonus(){
        assertEquals(300, manager1.payBonus(),0.0);
    }
}