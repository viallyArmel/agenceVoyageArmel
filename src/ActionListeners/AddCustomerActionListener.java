package ActionListeners;

import view.panels.AddCustomerPanel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCustomerActionListener implements ActionListener {
    Container container;

    public AddCustomerActionListener(Container container) {
        this.container = container;
    }

    public void actionPerformed(ActionEvent e) {
        container.removeAll();
        container.add(new AddCustomerPanel());
        container.repaint();
        container.setVisible(true);
    }
}
