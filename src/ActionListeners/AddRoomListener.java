package ActionListeners;

import view.panels.RoomRegistrationPanel;
import view.windows.MainWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRoomListener implements ActionListener {
    private Container container;
    private MainWindow mainWindow;

    public AddRoomListener(Container container, MainWindow mainWindow){
        this.container = container;
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        container.removeAll();
        container.add(new RoomRegistrationPanel());
        container.repaint();
        mainWindow.setVisible(true);
    }
}
