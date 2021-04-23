package model;

public class City {


    private Integer city_id;
    private String name;
    private String postalCode;
    private String country;

    public City(Integer city_id, String name, String postalCode, String country){
        this.city_id = city_id;
        this.country = country;
        this.name = name;
        this.postalCode = postalCode;
    }

    public Integer getCity_id() {
        return city_id;
    }

    public String getName() {
        return name;
    }

    public String getPostalCode(){
        return postalCode;
    }
    public String getCountry(){
        return country;
    }
}
