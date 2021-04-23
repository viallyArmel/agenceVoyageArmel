package view.panels;

import javax.swing.*;
import java.awt.*;

public class ListRoomPanel extends JPanel {
    private JLabel text;

    public ListRoomPanel(){
        setBounds(170,140,1600,900);
        text = new JLabel("<html><h1>List Room</h1></html>");
        setLayout(new FlowLayout());
        add(text);
    }
}
