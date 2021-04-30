package model;

import java.util.GregorianCalendar;

public class Room {

    private Integer number;
    private Integer hotel;
    private String type;
    private Integer nbBeds;
    private GregorianCalendar dateLastRenov;
    private Double price_per_night;
    private Boolean hasBalcony;
    private String descriptionExtras;

    private AllRoomModel model;

    public Room(Integer number, Integer hotel, String type, Integer nbBeds, Double price_per_night, Boolean hasBalcony, GregorianCalendar dateLastRenov, String descriptionExtras) {
        setNumber(number);
        setHotel(hotel);
        setType(type);
        setNbBeds(nbBeds);
        setDateLastRenov(dateLastRenov);
        setPrice_per_night(price_per_night);
        setHasBalcony(hasBalcony);
        setDescriptionExtras(descriptionExtras);

    }
    public Room(Integer number, Integer hotel, String type, Integer nbBeds, Double price_per_night, Boolean hasBalcony) {
        this(number, hotel, type, nbBeds, price_per_night, hasBalcony, null, null);
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getHotel() {
        return hotel;
    }

    public GregorianCalendar getDateLastRenov() {
        return dateLastRenov;
    }

    public void setHotel(Integer hotel) {
        this.hotel = hotel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNbBeds() {
        return nbBeds;
    }

    public void setNbBeds(Integer nbBeds) {
        this.nbBeds = nbBeds;
    }

    public Double getPrice_per_night() {
        return price_per_night;
    }

    public void setPrice_per_night(Double price_per_night) {
        this.price_per_night = price_per_night;
    }

    public Boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(Boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public String getDescriptionExtras() {
        return descriptionExtras;
    }

    public void setDescriptionExtras(String descriptionExtras) {
        this.descriptionExtras = descriptionExtras;
    }

    public void setDateLastRenov(GregorianCalendar dateLastRenov) {
        this.dateLastRenov = dateLastRenov;
    }

}
