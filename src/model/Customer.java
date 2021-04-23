package model;

import java.util.GregorianCalendar;

public class Customer {


    private Integer customer_id;
    private String firstname;
    private String lastname;
    private String email;
    private Boolean isMale;
    private String phone_number;
    private String address;
    private GregorianCalendar birthdate;

    public Customer(Integer customer_id, String firstname, String lastname,String phone_number, String email, Boolean isMale, String address, Integer day, Integer month, Integer year) {
        this.customer_id = customer_id;
        this.address = address;
        this.birthdate = new GregorianCalendar(year,month-1,day);
        this.email = email;
        this.isMale = isMale;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone_number = phone_number;
    }

    public Customer(Integer customer_id, String firstname, String lastname, String email,Boolean isMale,String address,Integer day,Integer month, Integer year ){
        this(customer_id,firstname,lastname,null,email,isMale,address,day,month,year);
    }

    public Integer getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Boolean isMale() {
        return isMale;
    }
    public void setMale(Boolean male) {
        isMale = male;
    }

    public String getPhone_number(){
        return this.phone_number;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(GregorianCalendar birthdate) {
        this.birthdate = birthdate;
    }
}
