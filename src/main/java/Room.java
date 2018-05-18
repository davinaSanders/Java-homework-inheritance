import java.util.ArrayList;

import static com.sun.tools.internal.xjc.reader.Ring.add;

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

    public ArrayList<String> getGuestList(){
        ArrayList<String> guestNames = new ArrayList<>();
        for ( Guest guest : this.guestList ) {
            guestNames.add(guest.getName());
        }
        return guestNames;
    }

    public void addGuests(Guest guest){
        this.guestList.add(guest);
    }

//    public boolean emptyRoom


}
