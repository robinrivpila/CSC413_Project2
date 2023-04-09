public class Container {
    private int id;
    private int weight;
    private String sender;
    private String reciever;
    private String description;

    public Container(int id, int weight, String sender, String reciever, String description){
        this.id = id;
        this.weight = weight;
        this.sender = sender;
        this.reciever = reciever;
        this.description = description;
    }

    public int getId(){
        return id;
    }
    public int getWeight(){
        return weight;
    }
    public String getSender(){
        return sender;
    }
    public String getReciever(){
        return reciever;
    }
    public String getDescription(){
        return description;
    }

    public void print(){
        System.out.println( "\nID: " + id +
                            "\nWeight: " + weight +
                            "\nSender: " + sender +
                            "\nReciever: " + reciever +
                            "\nDescription: " + description);
    }

    public boolean equals(Object object){
        if(object instanceof Container){
            Container newContainer = (Container)object;
            if(newContainer.id == this.id){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}
