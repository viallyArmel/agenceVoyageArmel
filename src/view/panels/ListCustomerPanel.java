package view.panels;

import javax.swing.*;
import java.awt.*;

public class ListCustomerPanel extends JPanel {
    private JLabel text;
    public ListCustomerPanel(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width/10,screenSize.height/4,4 * screenSize.width/5, 2* screenSize.height/3);
        text = new JLabel("<html><h1>All Customers</h1></html>");
        setLayout(new FlowLayout());
        add(text);
    }
}
