import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    BedRoom bedroom;
    Guest guest;

    @Before
    public void before() {
        this.bedroom = new BedRoom (2, 12, BedRoomType.SINGLE, 12.01);
        this.guest = new Guest ("Davina");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(2, bedroom.getCapacityBedRoom());
    }

    @Test
    public void canGetNumber(){
        assertEquals(12, bedroom.getNumber());
    }

    @Test
    public void canGetType(){
        assertEquals(BedRoomType.SINGLE, bedroom.getType());
    }

    @Test
    public void canGetNightlyRate(){
      assertEquals(12.01, bedroom.getNightlyRate(), 1);
    }

    @Test
    public void canAddGuests(){
        bedroom.addGuests(guest);
        assertEquals(1, bedroom.getGuestList().size());

    }
}
