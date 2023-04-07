import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class InventoryGUI extends JFrame implements ActionListener {
    JPanel pane;
    JTextField display;

    public InventoryGUI(){
        super("Inventory");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        pane = new JPanel();
        GridLayout layout = new GridLayout(6,2);
        pane.setLayout(layout);

        JLabel idLabel = new JLabel("ID Number: ");
        pane.add(idLabel);

        JLabel weightLabel = new JLabel("Weight(kg): ");
        pane.add(weightLabel);

        JLabel senderLabel = new JLabel("Sender: ");
        pane.add(senderLabel);

        JLabel receiverLabel = new JLabel("Receiver: ");
        pane.add(receiverLabel);

        JLabel descriptionLabel = new JLabel("Description: ");
        pane.add(descriptionLabel);

        setContentPane(pane);
        pack();
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
