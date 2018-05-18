public class Guest {
    private String name;

    public Guest(String name) {
        this.name = name;

    }

    public String getName(){
        return this.name;
    }

    public String setName(String newName){
        if (newName == null || newName.isEmpty()){
            return this.name;
        }
            return this.name = newName;
    }

}
