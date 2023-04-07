import java.util.ArrayList;

public class Inventory {
    private ArrayList<Container> inventoryList = new ArrayList<Container>();

    public Inventory(){

    }

    public ArrayList getInventoryList(){
        return inventoryList;
    }

    public void addContainer(Container newContainer){
        //need to figure this out
    }

    public void print(){
        for(Container container: inventoryList){
            container.print();
        }
    }
}
