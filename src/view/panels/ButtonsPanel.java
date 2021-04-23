package view.panels;

import view.windows.MainWindow;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {
    private JButton saveButton,resetButton,returnButton;

    public ButtonsPanel(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width/10,screenSize.height/4,4 * screenSize.width/5, 2* screenSize.height/3);
        setLayout(new GridBagLayout());
        UIManager.put("Button.margin", new Insets(5,5,5,5));

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(8,8,8,8);

        Font font = new Font("calibri", Font.BOLD, 24);
        UIManager.put("Button.font", font);

        returnButton = new JButton("Return");
        resetButton = new JButton("Reset");
        saveButton = new JButton("Save");

        add(returnButton,gridBagConstraints);
        gridBagConstraints.gridx++;
        add(resetButton,gridBagConstraints);
        gridBagConstraints.gridx++;
        add(saveButton,gridBagConstraints);
    }
}
