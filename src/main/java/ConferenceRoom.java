

public class ConferenceRoom extends Room {
    private String name;
    private int dailyRate;

    public ConferenceRoom(int capacity, String name, int dailyRate){
        super(capacity);
        this.name = name;
        this.dailyRate = dailyRate;
    }

}
