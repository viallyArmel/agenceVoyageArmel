package model;

public class Airport {

    private Integer airport_id;
    private String airport_name;
    private String address;
    private Integer city;

    public Airport(Integer airport_id, String airport_name, String address, Integer city) {
        this.airport_id = airport_id;
        this.airport_name = airport_name;
        this.address = address;
        this.city = city;
    }
    public Integer getAirport_id() {
        return airport_id;
    }

    public void setAirport_id(Integer airport_id) {
        this.airport_id = airport_id;
    }

    public String getAirport_name() {
        return airport_name;
    }

    public void setAirport_name(String airport_name) {
        this.airport_name = airport_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }


}
