package view.windows;

import ActionListeners.AddRoomListener;
import ActionListeners.ListRoomListener;
import dataAccess.SingletonConnection;
import exceptions.ConnectionException;
import view.panels.AddRoomPanel;
import view.panels.HomePanel;
import view.panels.CustomerRegistrationPanel;
import view.panels.RoomRegistrationPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {
    private Container container;
    private JMenuBar menuBar;
    private JMenu  customers, flights, flightCategory,hotelRooms;
    private JMenuItem home, addCustomer, findCustomer, listCustomers, updateCustomer, deleteCustomer;
    private JMenuItem addRoom, bookRoom, listRoom, updateRoom, deleteRoom;
    private ButtonGroup flightCategories;
    private JRadioButtonMenuItem directFlight, stopover;
    private JLabel titel;
    private ImageIcon addIcon, deleteIcon, findIcon, flightIcon, categoryIcon, homeIcon, roomsIcon, customerListIcon, updateIcon;
    private ImageIcon addRoomIcon, bookRoomIcon, listRoomIcon, updateRoomIcon, deleteRoomIcon;

    public MainWindow(){
        super("Agence voyage");
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width/10,screenSize.height/4,4 * screenSize.width/5, 2* screenSize.height/3);
        //screenSize prend la taille de l'écran
        //Pour setBounds :
        //  width => j'ai décidé de prendre 4/5 de la largeur de l'écran
        //  height => j'ai décidé de prendre 2/3 de la hauteur
        //  x => il reste 1/5eme de l'écran libre donc pour le centrer je commence à 1/10
        //  y => j'ai divisé par 4 et non pas par 3 car je veux qu'il reste un peu d'espace en bas

        container = getContentPane();
        addWindowListener(new ExitAdapter());

        menuBar = new JMenuBar();
        Font font = new Font("sans-serif", Font.PLAIN, 20);
        UIManager.put("Menu.font", font);
        UIManager.put("MenuItem.font", font);
        UIManager.put("RadioButtonMenuItem.font", new Font("sans-serif", Font.PLAIN, 16));
        setJMenuBar(menuBar);

        Image scaleIcon;

        scaleIcon = new ImageIcon("src/icons/addCustomer.png").getImage();
        addIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/deleteCustomer.png").getImage();
        deleteIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/findCustomer.png").getImage();
        findIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/listcustomers.png").getImage();
        customerListIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/updateCustomer.png").getImage();
        updateIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/updateCustomer.png").getImage();
        updateIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/home.jpg").getImage();
        homeIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/flight.png").getImage();
        flightIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/flight.png").getImage();
        flightIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/flightCategory.png").getImage();
        categoryIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/hotelRooms.jpg").getImage();
        roomsIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));
        scaleIcon = new ImageIcon("src/icons/bookRoom.jpg").getImage();
        bookRoomIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));

        scaleIcon = new ImageIcon("src/icons/bookRoom.jpg").getImage();
        bookRoomIcon = new ImageIcon(scaleIcon.getScaledInstance(30,30, java.awt.Image.SCALE_SMOOTH));
        scaleIcon = new ImageIcon("src/icons/addRoomIcon.png").getImage();
        addRoomIcon = new ImageIcon(scaleIcon.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        scaleIcon = new ImageIcon("src/icons/listRoomIcon.png").getImage();
        listRoomIcon = new ImageIcon(scaleIcon.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        scaleIcon = new ImageIcon("src/icons/updateRoomIcon.jpg").getImage();
        updateRoomIcon = new ImageIcon(scaleIcon.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));
        scaleIcon = new ImageIcon("src/icons/deleteRoomIcon.png").getImage();
        deleteRoomIcon = new ImageIcon(scaleIcon.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));


        home = new JMenuItem("Home", homeIcon);
        home.setPreferredSize(new Dimension(screenSize.width/5, 40));
        // l'écran fait 4/5 de large donc chaque menu prendra 1/5
        home.setMnemonic('h');
        customers = new JMenu("Customers");
        customers.setIcon(customerListIcon);
        customers.setPreferredSize(new Dimension(screenSize.width/5,40));
        flights = new JMenu("Flights");
        flights.setIcon(flightIcon);
        flights.setPreferredSize(new Dimension(screenSize.width/5, 40));
        hotelRooms = new JMenu("Hotel Rooms");
        hotelRooms.setIcon(roomsIcon);
        hotelRooms.setPreferredSize(new Dimension(screenSize.width/5,40));
        bookRoom = new JMenuItem("Book room", bookRoomIcon);


        menuBar.add(home);
        menuBar.add(customers);
        menuBar.add(flights);
        menuBar.add(hotelRooms);

        //si on a le temps adapter le style JMenuItem à JMenu

        addCustomer = new JMenuItem("Add customer", addIcon);
        addCustomer.addActionListener(new AddCustomerListener());
        findCustomer = new JMenuItem("Find customer", findIcon);
        listCustomers = new JMenuItem("List customer", customerListIcon);
        updateCustomer = new JMenuItem("Update customer", updateIcon);
        deleteCustomer = new JMenuItem("Delete customer", deleteIcon);
        flightCategory = new JMenu("Category");
        flightCategory.setIcon(categoryIcon);

        customers.add(addCustomer);
        customers.addSeparator();
        customers.add(findCustomer);
        customers.addSeparator();
        customers.add(listCustomers);
        customers.addSeparator();
        customers.add(updateCustomer);
        customers.addSeparator();
        customers.add(deleteCustomer);


        addRoom = new JMenuItem("Add room", addRoomIcon);
        addRoom.addActionListener(new AddRoomListener(container, this));
        bookRoom = new JMenuItem("Book room", bookRoomIcon);
        listRoom = new JMenuItem("List room", listRoomIcon);
        listRoom.addActionListener(new ListRoomListener(container, this));
        updateRoom = new JMenuItem("Update room", updateRoomIcon);
        deleteRoom = new JMenuItem("Delete room", deleteRoomIcon);

        hotelRooms.add(addRoom);
        hotelRooms.addSeparator();
        hotelRooms.add(bookRoom);
        hotelRooms.addSeparator();
        hotelRooms.add(listRoom);
        hotelRooms.addSeparator();
        hotelRooms.add(updateRoom);
        hotelRooms.addSeparator();
        hotelRooms.add(deleteRoom);

        flights.add(flightCategory);
        directFlight = new JRadioButtonMenuItem("Direct Flights");
        stopover = new JRadioButtonMenuItem("Stopovers");
        flightCategory.add(directFlight);
        flightCategory.addSeparator();
        flightCategory.add(stopover);


        flightCategories = new ButtonGroup();
        flightCategories.add(directFlight);
        flightCategories.add(stopover);

        HomeListener homeListener = new HomeListener();
        home.addActionListener(homeListener);

        setVisible(true);
    }

    private class ExitAdapter extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e)  {
            System.exit(0);
        }
    }

    private class HomeListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            container.removeAll();
            container.add(new HomePanel());
            container.repaint();
            setVisible(true);
        }
    }

    private class AddCustomerListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            container.removeAll();
            container.add(new CustomerRegistrationPanel(MainWindow.this),BorderLayout.CENTER);
            container.repaint();
            setVisible(true);
        }
    }

}
