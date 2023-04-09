import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Inventory {
    private ArrayList<Container> inventoryList = new ArrayList<Container>();
    File csvFile;

    public Inventory(){

    }

    public ArrayList getInventoryList(){
        return inventoryList;
    }

    public void addContainer(Container newContainer){
        if(!inventoryList.contains(newContainer)) {
            inventoryList.add(newContainer);
        }
    }


    public boolean contains(Container newContainer){
        for(Container container: inventoryList){
            if(container.equals(newContainer)){
                return true;
            }
        }
        return false;
    }

    public void print(){
        for(Container container: inventoryList){
            container.print();
        }
    }


}
