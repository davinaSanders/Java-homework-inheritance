import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> roomList;

    public Hotel(){
        this.roomList = new ArrayList<>();

    }

    public void checkInGuests(Room room, Guest guest){
        room.addGuests(guest);
    }

    public ArrayList<Guest> guestsInRoom(Room room){
        return room.getGuestList();
    }

    public void AddRooms(Room room){
        this.roomList.add(room);
    }

    public ArrayList<Room> emptyRooms(){
        ArrayList<Room> vacantRooms = new ArrayList<>();
        for (Room room : this.roomList) {
            if (room.getGuestList().isEmpty()) {
                vacantRooms.add(room);
            }
        }
        return vacantRooms;
    }
}
