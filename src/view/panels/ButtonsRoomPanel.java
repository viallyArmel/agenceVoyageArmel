package view.panels;

import javax.swing.*;
import java.awt.*;

public class ButtonsRoomPanel extends JPanel {
    private JButton save, reset, cancel;
    private JRadioButton yes, no;
    private ButtonGroup buttonGroup;
    private JLabel hasAbalconyLabel;

    public ButtonsRoomPanel(){
        this.setLayout(new GridLayout(2, 3, 3, 3));

        hasAbalconyLabel = new JLabel("With balcony");
        this.add(hasAbalconyLabel);

        yes = new JRadioButton("Yes", true);
        this.add(yes);
        no = new JRadioButton("No", false);
        this.add(no);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(yes);
        buttonGroup.add(no);

        save = new JButton("Save");
        Dimension dimension = new Dimension(10, 5);
        save.setMaximumSize(dimension);
        this.add(save);
        reset = new JButton("Reset");
        reset.setMaximumSize(dimension);
        this.add(reset);
        cancel = new JButton("Cancel");
        cancel.setMaximumSize(dimension);
        this.add(cancel);
    }
}
