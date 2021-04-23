package dataAccess;

import exceptions.AllCustomersException;
import model.Customer;

import java.util.ArrayList;

public interface CustomerDataAccess {
    ArrayList<Customer> getAllCustomers() throws AllCustomersException;
    Customer getCustomerByEmail(String email); //si on a le temps le faire avec les deux
    void addCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer();
}
