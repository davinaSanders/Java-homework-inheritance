public class Booking {
    private Room room;
    private Guest guest;
    private int nights;

    public Booking(Room room, Guest guest, int nights) {
        this.room = room;
        this.guest = guest;
        this.nights = nights;

    }

    public int getNights() {
        return this.nights;
    }


    public Room getRoom() {
        return this.room;
    }

    public Guest getGuest() {
        return this.guest;
    }





}