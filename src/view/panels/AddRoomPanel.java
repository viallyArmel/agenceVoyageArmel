package view.panels;

import javax.swing.*;
import java.awt.*;
import java.util.GregorianCalendar;

public class AddRoomPanel extends JPanel {
    private JLabel numberLabel, typeLabel, nbBedsLabel, priceNightLabel, hasAbalconyLabel, dateLastRenovLabel, descriptionLabel;
    private JTextField numberField, nbBedsField, priceNightField, dateLastRenovField;
    private JTextArea description;
    private JComboBox roomType;
    private JRadioButton yes, no;
    private ButtonGroup buttonGroup;


    public AddRoomPanel() {
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //setBounds(screenSize.width/10,screenSize.height/4,4 * screenSize.width/5, 2* screenSize.height/3);
        //setLayout(new GridBagLayout());

        /*GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(8,8,8,8);

        Font font = new Font("calibri", Font.BOLD, 19);
        UIManager.put("Label.font", font);
        font = new Font("calibri", Font.PLAIN, 19);
        UIManager.put("TextField.font", font);
        UIManager.put("TextField.margin", new Insets(5,5,5,5));

         */
        //--------------------------------------------------------------------------------
        this.setBounds(10, 80, 500, 150);
        this.setLayout(new GridLayout(8, 2, 5, 5));


        numberLabel = new JLabel("Number");
        this.add(numberLabel);
        //add(numberLabel, gridBagConstraints);
        //gridBagConstraints.gridx++;
        numberField = new JTextField("(ex : +32492473290)", 30);
        this.add(numberField);
        //add(numberField, gridBagConstraints);

        typeLabel = new JLabel("Type");
        this.add(typeLabel);
        //gridBagConstraints.gridx = 0;
        //gridBagConstraints.gridy++;
        //add(typeLabel, gridBagConstraints);

        String[] typeOfRoomsLabel = {"Single room", "Double room", "Family room", "Suite"};
        roomType = new JComboBox(typeOfRoomsLabel);
        roomType.setSelectedItem(typeOfRoomsLabel[0]);
        roomType.setMaximumRowCount(2);
        this.add(roomType);
        //gridBagConstraints.gridx++;
        //add(roomType, gridBagConstraints);


        nbBedsLabel = new JLabel("Number of beds");
        this.add(nbBedsLabel);
        //gridBagConstraints.gridx = 0;
        //gridBagConstraints.gridy++;
        //add(nbBedsLabel, gridBagConstraints);

        //gridBagConstraints.gridx = 0;
        //gridBagConstraints.gridy += 2;
        nbBedsField = new JTextField();
        this.add(nbBedsField);
        //gridBagConstraints.gridx++;
        //add(nbBedsField, gridBagConstraints);

        priceNightLabel = new JLabel("Price per night");
        this.add(priceNightLabel);
        //gridBagConstraints.gridx = 0;
        //gridBagConstraints.gridy++;
        //add(priceNightLabel, gridBagConstraints);

        priceNightField = new JTextField("in euro");
        this.add(priceNightField);



        dateLastRenovLabel = new JLabel("Date of last renovation");
        this.add(dateLastRenovLabel);
        //gridBagConstraints.gridx = 0;
        //gridBagConstraints.gridy++;
        //add(dateLastRenovLabel, gridBagConstraints);
        dateLastRenovField = new JTextField("aaaa-mm-dd", 10);
        this.add(dateLastRenovField);
        //gridBagConstraints.gridx++;
        //add(dateLastRenovField, gridBagConstraints);

        descriptionLabel = new JLabel("Description of extras");
        this.add(descriptionLabel);
        //gridBagConstraints.gridx = 0;
        //gridBagConstraints.gridy++;
        //add(descriptionLabel, gridBagConstraints);
        description = new JTextArea("Write hier...", 3, 166);
        this.add(description);
        //gridBagConstraints.gridx++;
        //add(description, gridBagConstraints);

        hasAbalconyLabel = new JLabel("With balcony");
        this.add(hasAbalconyLabel);
        //gridBagConstraints.gridx = -1;
        //gridBagConstraints.gridy++;
        //add(hasAbalconyLabel, gridBagConstraints);
        yes = new JRadioButton("Yes", true);
        yes.setHorizontalAlignment(SwingConstants.LEFT);
        this.add(yes);
        //gridBagConstraints.gridwidth *= 0.5;
        //gridBagConstraints.gridx++;
        //add(yes, gridBagConstraints);
        no = new JRadioButton("No", false);
        this.add(no);

        buttonGroup = new ButtonGroup();
        buttonGroup.add(yes);
        buttonGroup.add(no);


    }
}
