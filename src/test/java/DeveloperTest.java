import Management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

        Developer developer1;
        @Before
        public void setUp(){
            developer1 = new Developer("Jim", "HG45521C", 25000);
        }
        @Test
        public void testGetName(){
            assertEquals("Jim", developer1.getName());
        }

        @Test
        public void testGetNNI(){
            assertEquals("HG45521C", developer1.getNni());
        }

        @Test
        public void testGetSalary(){
            assertEquals(25000, developer1.getSalary());
        }
        @Test
        public void testRaisesSalary(){
            developer1.raiseSalary(10000);
            assertEquals(35000, developer1.getSalary());
        }

        @Test
        public void testPayBonus(){
            assertEquals(250, developer1.payBonus(),0.0);
        }

}
