import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        this.guest = new Guest ("Davina");

    }

    @Test
    public void canGetName(){
        assertEquals("Davina", guest.getName());
    }

    @Test
    public void canSetName(){
        guest.setName("Hannah");
        assertEquals("Hannah", guest.getName());
    }


}
