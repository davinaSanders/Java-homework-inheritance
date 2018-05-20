

public class BedRoom extends Room {
    private int number;
    private BedRoomType type;
    private double nightlyRate;
    public int nights;

    public BedRoom(int capacity, int number, BedRoomType type, double nightlyRate){
        super(capacity);
        this.nights = 0;
        this.number = number;
        this.type = type;
        this.nightlyRate = nightlyRate;

    }

    public int getNightsRoom() {
        return this.nights;
    }

    public int getCapacityBedRoom() {
        return getCapacity();
    }

    public int getNumber() {
        return this.number;
    }

    public BedRoomType getType() {
        return this.type;
    }

    public double getNightlyRate(){
        return this.nightlyRate;
    }

}
