public class Room implements structure {
    public  String name;

    public  Room(String name){
        this.name=name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void location() {
        System.out.println("you are currently in "+this.getName()+". It has ");
    }

    @Override
    public void enter() {
        System.out.println("You have entered the "+this.getName());
    }

}