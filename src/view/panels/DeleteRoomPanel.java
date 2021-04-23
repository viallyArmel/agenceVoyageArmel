package view.panels;

import javax.swing.*;
import java.awt.*;

public class DeleteRoomPanel extends JPanel {
    private JLabel text;

    public DeleteRoomPanel(){
        setBounds(170,140,1600,900);
        text = new JLabel("<html><h1>Delete Room</h1></html>");
        setLayout(new FlowLayout());
        add(text);
    }
}
