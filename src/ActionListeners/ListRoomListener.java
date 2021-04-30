package ActionListeners;

import view.panels.ListRoomPanel;
import view.panels.RoomRegistrationPanel;
import view.windows.MainWindow;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListRoomListener implements ActionListener {
    private Container container;
    private MainWindow mainWindow;

    public ListRoomListener(Container container, MainWindow mainWindow){
        this.container = container;
        this.mainWindow = mainWindow;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        container.removeAll();
        container.add(new ListRoomPanel());
        container.repaint();
        mainWindow.setVisible(true);
    }
}
