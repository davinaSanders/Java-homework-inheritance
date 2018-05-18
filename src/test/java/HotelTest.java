import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Room room;
    Guest guest;

    @Before
    public void before (){
        this.hotel = new Hotel ();
        this.room = new BedRoom (2, 12, BedRoomType.SINGLE, 12.01);
        this.guest = new Guest ("Davina");
    }

    @Test
    public void canCheckInGuests() {
        hotel.checkInGuests(room, guest);
        hotel.checkInGuests(room, guest);
        assertEquals(2, room.getGuestList().size());
    }

}
