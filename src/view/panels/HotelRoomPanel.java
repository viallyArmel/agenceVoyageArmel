package view.panels;

import javax.swing.*;
import java.awt.*;

public class HotelRoomPanel extends JPanel {
    private JLabel text;
    public HotelRoomPanel(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width/10,screenSize.height/4,4 * screenSize.width/5, 2* screenSize.height/3);
        text = new JLabel("<html><h1>Hotel Rooms</h1></html>");
        setLayout(new FlowLayout());
        add(text);
    }
}
