public class Main {
    public static void main(String[] args) {

        Container container1 = new Container(1, 12, "Me" , "you", "Banana");
        Container container2 = new Container(1, 10, "You", "Me", "notebooks");

        Inventory inventory1 = new Inventory();
        inventory1.addContainer(container1);
        inventory1.addContainer(container2);
        inventory1.print();
    }
}