import java.util.ArrayList;

public class Hotel {
    private ArrayList<Room> roomList;

    public Hotel(){
        this.roomList = new ArrayList<>();

    }

    public ArrayList<String> checkInGuests(Room room, Guest guest){
        room.addGuests(guest);
        return room.getGuestList();
    }

    public ArrayList<Room> emptyRooms(){
        for (Room room : this.roomList) {
            if (!room.getGuestList().isEmpty()) {
                this.roomList.add(room);
            }
        }
        return this.roomList;
    }
}
