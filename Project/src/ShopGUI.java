import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ShopGUI extends JFrame implements ActionListener {

    String[] columnNames = {"Type", "Name", "Price"};
    JTable table;
    static ArrayList<Phone> phones = new ArrayList<>();

    public ShopGUI() {
        super();
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();
        getContentPane().setLayout(gridBag);
        c.fill = GridBagConstraints.HORIZONTAL;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args)
    {


        new ShopGUI();
    }
}
