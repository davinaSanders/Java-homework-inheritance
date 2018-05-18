import java.util.ArrayList;

public abstract class Room {
    private int capacity;
    private ArrayList<Guest> guestList;

    public Room(int capacity){
        this.capacity = capacity;
        this.guestList = new ArrayList<>();
    }

    public int getCapacity(){
        return this.capacity;
    }

    public ArrayList<Guest> getGuestList(){
        return this.guestList;
    }

    public void addGuests(Guest guest){
        this.guestList.add(guest);
    }

//    public boolean emptyRoom


}
