package view.panels;

import view.windows.MainWindow;

import javax.swing.*;
import java.awt.*;

public class CustomerRegistrationPanel extends JPanel {

    public CustomerRegistrationPanel(MainWindow mainWindow){
        this.setLayout(new BorderLayout());
        this.add(new AddCustomerPanel(),BorderLayout.CENTER);
        this.add(new ButtonsPanel(),BorderLayout.SOUTH);
    }
}
