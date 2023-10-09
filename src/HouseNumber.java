import java.util.ArrayList;

public class HouseNumber implements structure{
    private ArrayList<structure>structures;
    private  String address;

    public  HouseNumber(String address){
        this.structures=new ArrayList<structure>();
        this.address=address;
    }

    @Override
    public String getName() {
        return this.address;
    }

    public  int addStructure(structure component){
        this.structures.add(component);
        return this.structures.size()-1;
    }

    public  structure getStructure(int componentNumber){
        return this.structures.get(componentNumber);
    }
    @Override
    public void location() {
        System.out.println("you are stay in "+this.getName()+". It has ");
        for(structure struct :this.structures){
            System.out.println(struct.getName());
        }
    }

    @Override
    public void enter() {
        System.out.println(" you entered  "+this.getName());
    }


}