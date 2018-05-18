public class Booking {
    private Room room;
    private Guest guest;
    private int nights;

    public Booking(Room room, Guest guest, int nights){
        this.room = room;
        this.guest = guest;
        this.nights = nights;

    }


    public int getnights(){
        return this.nights;
    }


    public Room getroom(){
        return this.room;
    }

    public Guest getguest(){
        return this.guest;
    }
}
