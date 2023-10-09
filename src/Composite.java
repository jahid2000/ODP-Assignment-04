
public class Composite {
    public static void main(String[] args) {
        HouseNumber building = new HouseNumber("34 Street");
        HouseNumber flooring = new HouseNumber("Street -third Floor");
        int firstFloor = building.addStructure(flooring);
        Room washrom1 = new Room("first washroom for men ");
        Room washrom2 = new Room("second washroom for women");


        int Mens = flooring.addStructure(washrom1);
        int Womans = flooring.addStructure(washrom2);


        building.location();
        //HouseNumber currentFloor =(HouseNumber)building.getStructure(firstFloor);
        flooring.enter();

        Room currentRom=(Room)flooring.getStructure(Mens);
        currentRom.enter();
        Room currentRom1=(Room)flooring.getStructure(Womans);
        currentRom1.enter();

    }
}