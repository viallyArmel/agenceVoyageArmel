package view.panels;

import javax.swing.*;
import java.awt.*;

public class AddCustomerPanel extends JPanel{
    private JLabel firstnameLabel, lastnameLabel,emailLabel,phoneNumberLabel,birthDateLabel, addressLabel, genderLabel;
    private JTextField firstname, lastname,email,phone_number,birthdate,address;
    private ButtonGroup gender;
    private JRadioButton male, female;

    public AddCustomerPanel(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(screenSize.width/10,screenSize.height/4,4 * screenSize.width/5, 2* screenSize.height/3);
        setLayout(new GridBagLayout());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(8,8,8,8);

        Font font = new Font("calibri", Font.BOLD, 24);
        UIManager.put("Label.font", font);
        font = new Font("calibri", Font.PLAIN, 24);
        UIManager.put("TextField.font", font);
        UIManager.put("TextField.margin", new Insets(5,5,5,5));

        firstnameLabel = new JLabel("Firstname");
        add(firstnameLabel, gridBagConstraints);
        gridBagConstraints.gridx++;
        firstname = new JTextField(15);
        add(firstname, gridBagConstraints);

        lastnameLabel = new JLabel("Lastname");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy++;
        add(lastnameLabel, gridBagConstraints);
        lastname = new JTextField(15);
        gridBagConstraints.gridx++;
        add(lastname, gridBagConstraints);

        emailLabel = new JLabel("Email");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy += 2;
        add(emailLabel, gridBagConstraints);
        email = new JTextField("exemple@email.com",15);
        gridBagConstraints.gridx++;
        add(email, gridBagConstraints);

        phoneNumberLabel = new JLabel("Phone number");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy++;
        add(phoneNumberLabel, gridBagConstraints);
        phone_number = new JTextField(15);
        gridBagConstraints.gridx++;
        add(phone_number, gridBagConstraints);

        birthDateLabel = new JLabel("Birth date");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy++;
        add(birthDateLabel, gridBagConstraints);
        birthdate = new JTextField("AAAA-MM-DD", 15);
        gridBagConstraints.gridx++;
        add(birthdate, gridBagConstraints);

        addressLabel = new JLabel("Address");
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy++;
        add(addressLabel, gridBagConstraints);
        address = new JTextField(15);
        gridBagConstraints.gridx++;
        add(address, gridBagConstraints);

        genderLabel = new JLabel("Gender");
        gridBagConstraints.gridx = -1;
        gridBagConstraints.gridy++;
        add(genderLabel, gridBagConstraints);

        male = new JRadioButton("Male",false);
        male.setFont(font);
        male.setHorizontalAlignment(SwingConstants.LEFT);
        gridBagConstraints.gridwidth *= 0.5;
        gridBagConstraints.gridx++;
        add(male, gridBagConstraints);
        female = new JRadioButton("Female",false);
        female.setFont(font);
        gridBagConstraints.gridx++;
        add(female, gridBagConstraints);

        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

    }
}
