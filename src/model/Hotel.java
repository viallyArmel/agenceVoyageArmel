package model;

public class Hotel {

    private Integer hotel_id;
    private String name;
    private String address;
    private Integer city;

    public Hotel(Integer hotel_id, String name, String address, Integer city) {
        this.hotel_id = hotel_id;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public Integer getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(Integer hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
