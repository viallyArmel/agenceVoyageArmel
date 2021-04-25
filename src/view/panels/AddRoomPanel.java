package view.panels;

import view.windows.MainWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;

public class AddRoomPanel extends JPanel  {
    private JLabel numberLabel, typeLabel, nbBedsLabel, priceNightLabel, dateLastRenovLabel, descriptionLabel;
    private JTextField numberField, nbBedsField, priceNightField, dateLastRenovField;
    private JTextArea description;
    private JComboBox roomType;


    public AddRoomPanel() {

        this.setLayout(new GridLayout(6, 2, 100, 30));
        //this.setLayout(new BorderLayout());

        numberLabel = new JLabel("Number");
        this.add(numberLabel);
        numberField = new JTextField("(ex : +32492473290)", 30);
        this.add(numberField);

        typeLabel = new JLabel("Type");
        this.add(typeLabel);

        String[] typeOfRoomsLabel = {"Single room", "Double room", "Family room", "Suite"};
        roomType = new JComboBox(typeOfRoomsLabel);
        roomType.setSelectedItem(typeOfRoomsLabel[0]);
        roomType.setMaximumRowCount(2);
        this.add(roomType);

        nbBedsLabel = new JLabel("Number of beds");
        this.add(nbBedsLabel);
        nbBedsField = new JTextField();
        this.add(nbBedsField);

        priceNightLabel = new JLabel("Price per night");
        this.add(priceNightLabel);
        priceNightField = new JTextField("(in euro)");
        this.add(priceNightField);

        dateLastRenovLabel = new JLabel("Date of last renovation");
        this.add(dateLastRenovLabel);
        dateLastRenovField = new JTextField("(ex : 2010-10-23)", 10);
        this.add(dateLastRenovField);

        descriptionLabel = new JLabel("Description of extras");
        this.add(descriptionLabel);
        description = new JTextArea("Write hier...", 3, 50);
        this.add(description);


        //je modifie l'affichage quand j'aurai le temps


    }
}
