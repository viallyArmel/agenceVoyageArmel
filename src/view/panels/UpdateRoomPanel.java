package view.panels;

import javax.swing.*;
import java.awt.*;

public class UpdateRoomPanel extends JPanel {
    private JLabel text;

    public UpdateRoomPanel(){
        setBounds(170,140,1600,900);
        text = new JLabel("<html><h1>Update Room</h1></html>");
        setLayout(new FlowLayout());
        add(text);
    }
}
