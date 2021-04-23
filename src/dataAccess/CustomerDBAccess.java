package dataAccess;

import exceptions.AllCustomersException;
import model.Customer;

import java.util.ArrayList;

public class CustomerDBAccess implements CustomerDataAccess{
    public CustomerDBAccess() {
    }

    @Override
    public ArrayList<Customer> getAllCustomers() throws AllCustomersException {
        ArrayList<Customer> allCustomers = new ArrayList<>();
        //sql...
        if(allCustomers == null){
            throw new AllCustomersException();
        }
        return allCustomers;
    }

    @Override
    public Customer getCustomerByEmail(String email) {
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {

    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void deleteCustomer() {

    }
}