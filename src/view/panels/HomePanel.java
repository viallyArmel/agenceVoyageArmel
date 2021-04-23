package view.panels;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {
    private JLabel text;
    public HomePanel(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width/10,screenSize.height/4,4 * screenSize.width/5, 2* screenSize.height/3);
        text = new JLabel("<html><body><p>Home</p></body></html>");
        setLayout(new FlowLayout());
        add(text);
    }
}
