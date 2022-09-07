import Management.Director;
import Management.Manager;
import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director1;
    @Before
    public void setUp(){
        director1 = new Director("Sam", "XJ45521C", 30000,"Food", 200000);
    }
    @Test
    public void testGetName(){
        assertEquals("Sam", director1.getName());
    }

    @Test
    public void testGetNNI(){
        assertEquals("XJ45521C", director1.getNni());
    }

    @Test
    public void testGetSalary(){
        assertEquals(30000, director1.getSalary());
    }

    @Test
    public void testGetDept(){
        assertEquals("Food", director1.getDeptName());
    }

    @Test
    public void testRaisesSalary(){
        director1.raiseSalary(10000);
        assertEquals(40000, director1.getSalary());
    }

    @Test
    public void testPayBonus(){
        assertEquals(600, director1.payBonus(),0.0);
    }
    @Test
    public void testGetBudget(){
        assertEquals(200000, director1.getBudget(),0.0);
    }
}