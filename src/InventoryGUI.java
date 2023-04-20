import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InventoryGUI extends JFrame implements ActionListener {

    JPanel pane;
    JLabel idLabel;
    JTextField idTextField;

    JTextField weightTextField;
    JTextField senderTextField;
    JTextField receiverTextField;
    JTextField descriptionTextField;
    Inventory inventory = new Inventory();



    public InventoryGUI(){
        super("Inventory");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        pane = new JPanel();
        GridLayout layout = new GridLayout(6,2);
        pane.setLayout(layout);
        pane.setSize(500,500);

        idLabel = new JLabel("ID Number: ");
        pane.add(idLabel);

        idTextField = new JTextField("");
        pane.add(idTextField);


        JLabel weightLabel = new JLabel("Weight(kg): ");
        pane.add(weightLabel);

         weightTextField = new JTextField("");
        pane.add(weightTextField);

        JLabel senderLabel = new JLabel("Sender: ");
        pane.add(senderLabel);

         senderTextField = new JTextField("");
        pane.add(senderTextField);

        JLabel receiverLabel = new JLabel("Receiver: ");
        pane.add(receiverLabel);

         receiverTextField = new JTextField("");
        pane.add(receiverTextField);

        JLabel descriptionLabel = new JLabel("Description: ");
        pane.add(descriptionLabel);

         descriptionTextField = new JTextField("");
        pane.add(descriptionTextField);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(this::actionPerformed);
        pane.add(saveButton);


        setContentPane(pane);
        pack();
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            int id = Integer.parseInt(idTextField.getText());
            int weight = Integer.parseInt(weightTextField.getText());
            String sender = senderTextField.getText();
            String receiver = receiverTextField.getText();
            String description = descriptionTextField.getText();
            Container newContainer = new Container(id, weight, sender, receiver, description);
            boolean containerAdded = inventory.addContainer(newContainer);
            if(!containerAdded){
                JOptionPane.showMessageDialog(this, "ID# already in use. Container not added!","Error message", JOptionPane.ERROR_MESSAGE);

            }
            this.saveAsCSV();

        }catch (Exception ex){
            ex.getMessage();
        }

    }

    public void saveAsCSV() throws FileNotFoundException{
        File csvFile = new File("containerInformation.csv");
        PrintWriter out = new PrintWriter(csvFile);
        out.println("id-number, weight-kg, sender-name, receiver-name, content-description"); // THIS LINE WORKS
        for(int i = 0; i < inventory.getInventoryList().size(); i++){
            Container curContainer =(Container) inventory.getInventoryList().get(i);
            out.printf("%d, %d, %s, %s, %s\n", curContainer.getId(), curContainer.getWeight(), curContainer.getSender(), curContainer.getReceiver(), curContainer.getDescription());
        }
        out.close();
    }


}
