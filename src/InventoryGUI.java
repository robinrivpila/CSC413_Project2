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
       // GridLayout
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
