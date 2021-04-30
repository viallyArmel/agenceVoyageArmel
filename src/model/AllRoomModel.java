package model;

import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class AllRoomModel extends AbstractTableModel {
    private ArrayList<String> columnNames;
    private ArrayList<Room> contents;

    public AllRoomModel(ArrayList<Room> contents){

        columnNames = new ArrayList<>();
        columnNames.add("Number");
        columnNames.add("Hotel");
        columnNames.add("Type");
        columnNames.add("Number of beds");
        columnNames.add("price per night");
        columnNames.add("Balcony");
        columnNames.add("Last renovation");
        columnNames.add("Extras");
        setContents(contents);
    }

    public void setContents(ArrayList<Room> contents) {
        this.contents = contents;
    }

    @Override
    public int getRowCount() {
        return contents.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        Room room = contents.get(row);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD/MM/YYYY");

        switch (column){
            case 0 : return room.getNumber();
            case 1 : return room.getHotel();
            case 2 : return room.getType();
            case 3 : return room.getNbBeds();
            case 4 : return room.getPrice_per_night();
            case 5 : return room.isHasBalcony();
            case 6 : if (room.getDateLastRenov() != null){
                        return simpleDateFormat.format(room.getDateLastRenov().getTime());
                    }else
                        return null;
            case 7 : return room.getDescriptionExtras();
            default : return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return columnNames.get(column);
    }

    @Override
    public Class getColumnClass(int column) {
        Class c;

        switch (column){
            case 0 : c = Integer.class;
                break;
            case 1 : c = Integer.class;
                break;
            case 2 : c = String.class;
                break;
            case 3 : c = Integer.class;
                break;
            case 4 : c = Double.class;
                break;
            case 5 : c = Boolean.class;
                break;
            case 6 : c = String.class;
                break;
            case 7 : c = String.class;
                break;
            default : c = String.class;
        }

        return c;
    }


}
