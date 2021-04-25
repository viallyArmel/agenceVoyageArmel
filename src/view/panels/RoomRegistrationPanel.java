package view.panels;

import view.windows.MainWindow;

import javax.swing.*;
import java.awt.*;

public class RoomRegistrationPanel extends JPanel {
    public RoomRegistrationPanel(){
        this.setLayout(new BorderLayout());
        this.add(new AddRoomPanel(),BorderLayout.CENTER);
        this.add(new ButtonsRoomPanel(),BorderLayout.SOUTH);
    }
}
