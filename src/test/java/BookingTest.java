import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Guest guest;
    Room room;
    Guest guest1;

    @Before
    public void before(){
        this.guest = new Guest ("Juan");
        this.guest1 = new Guest ("Rachel");
        this.booking = new Booking (room, guest1, 3);
        this.room = new BedRoom (2, 12,  BedRoomType.SINGLE, 12.01);
    }

    @Test
    public void canGetNights() {
        assertEquals(3, booking.getNights());
    }

    @Test
    public void canGetGuest() {
        assertEquals(guest1, booking.getGuest());
    }

    @Test
    public void canGetRoom(){
        Room room1 = new BedRoom (2, 12,  BedRoomType.SINGLE, 12.01);
        Booking booking1 = new Booking (room1, guest1, 3);
        assertEquals(room1, booking1.getRoom());

    }

//    @Test
//    public void can


}
