package view.panels;

import javax.swing.*;
import java.awt.*;

public class BookRoomPanel extends JPanel{
    private JLabel text;

    public BookRoomPanel(){
        setBounds(170,140,1600,900);
        text = new JLabel("<html><h1>Book Room</h1></html>");
        setLayout(new FlowLayout());
        add(text);
    }
}
