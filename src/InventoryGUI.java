import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class InventoryGUI extends JFrame implements ActionListener {
    JPanel pane;
    JLabel idLabel;
    JTextField idTextField;

    JTextField weightTextField;
    JTextField senderTextField;
    JTextField recieverTextField;
    JTextField desciptionTextField;
    Inventory inventory = new Inventory();

    public InventoryGUI(){
        super("Inventory");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pane = new JPanel();
        GridLayout layout = new GridLayout(6,2);
        pane.setLayout(layout);
        setSize(300,300);

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

         recieverTextField = new JTextField("");
        pane.add(recieverTextField);

        JLabel descriptionLabel = new JLabel("Description: ");
        pane.add(descriptionLabel);

         desciptionTextField = new JTextField("");
        pane.add(desciptionTextField);

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
            System.out.println(e.getActionCommand());
            int id = Integer.parseInt(idTextField.getText());
            int weight = Integer.parseInt(weightTextField.getText());
            String sender = senderTextField.getText();
            String reciever = recieverTextField.getText();
            String description = desciptionTextField.getText();
            Container newContainer = new Container(id, weight, sender, reciever, description);
            inventory.addContainer(newContainer);
            inventory.print();
            //inventory.saveAsCSV();

        }catch (Exception ex){
            ex.getMessage();
        }

    }


}
