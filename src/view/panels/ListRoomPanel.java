package view.panels;

import dataAccess.RoomDBAccess;
import exceptions.ConnectionException;
import model.AllRoomModel;
import model.Room;

import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.util.ArrayList;

public class ListRoomPanel extends JPanel {
    private AllRoomModel model;
    private JTable table;
    private JScrollPane scrollPane;
    private RoomDBAccess rooms;

    public ListRoomPanel(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width/10,screenSize.height/4,4 * screenSize.width/5, 2* screenSize.height/3);

        try {
            rooms = new RoomDBAccess();
            model = new AllRoomModel(rooms.getAllRooms());
            table = new JTable(model);

            /*
            dans le model on a une methode qui permet de recuperer un la valeur d'un objet getValueAt (row, column)
            - dans la table il y'a une méthode qui permet de récupérer une ligne sélectionnée
            - en ayant la ligne, je peux accéder à toutes les colonnes : si je veux modifier ou supprimer
            */

            table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            TableColumn column = table.getColumnModel().getColumn(7);
            column.setPreferredWidth(300);
            column = table.getColumnModel().getColumn(6);
            column.setPreferredWidth(100);

            table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            table.setSize(1000, 100);

            scrollPane = new JScrollPane(table);
        }
        catch (ConnectionException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        this.add(scrollPane);

    }
}
