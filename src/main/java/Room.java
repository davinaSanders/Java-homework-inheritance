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


//    public ArrayList<String> getGuestList(){
//        ArrayList<String> guestNames = new ArrayList<>();
//        for ( Guest guest : this.guestList ) {
//            guestNames.add(guest.getName());
//        }
//        return guestNames;
//    }
//    this code was to return an array list of strings (guest names)

    public void addGuests(Guest guest){
        this.guestList.add(guest);
    }

    public void removeGuests(Guest guest){
        this.guestList.remove(guest);
    }

    public ArrayList<Guest> getGuestList(){
        return this.guestList;
    }




//    public boolean emptyRoom


}
