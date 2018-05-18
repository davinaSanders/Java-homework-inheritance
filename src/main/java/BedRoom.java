

public class BedRoom extends Room {
    private int number;
    private BedRoomType type;
    private int nightlyRate;

    public BedRoom(int capacity, int number, BedRoomType type, int nightlyRate){
        super(capacity);
        this.number = number;
        this.type = type;
        this.nightlyRate = nightlyRate;

    }
}
