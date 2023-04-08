import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
       // inventoryList.add(newContainer);
    }

    public void print(){
        for(Container container: inventoryList){
            container.print();
        }
    }

    public void saveAsCSV() throws FileNotFoundException{
        File csvFile = new File("containerInformation.csv");
        PrintWriter out = new PrintWriter(csvFile);
        out.println("id-number, weight-kg, sender-name, reciever-name, content-description"); // THIS LINE WORKS
        for(Container container : inventoryList){
            out.printf("%d, %d, %s, % s, %s", container.getId(), container.getWeight(), container.getSender(), container.getReciever(), container.getDescription());
        }
        out.close();
    }
}
