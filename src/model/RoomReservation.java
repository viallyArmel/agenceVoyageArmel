package model;

import java.util.GregorianCalendar;

public class RoomReservation {

    private Integer trip;
    private Integer room_number;
    private Integer room_hotel;
    private Integer nbNights;
    private GregorianCalendar beginDate;

    public RoomReservation(Integer trip, Integer room_number, Integer room_hotel, Integer nbNights, int day, int month, int year) {
        this.trip = trip;
        this.room_number = room_number;
        this.room_hotel = room_hotel;
        this.nbNights = nbNights;
        this.beginDate = new GregorianCalendar(year, month-1,day);
    }
    public Integer getTrip() {
        return trip;
    }

    public void setTrip(Integer trip) {
        this.trip = trip;
    }

    public Integer getRoom_number() {
        return room_number;
    }

    public void setRoom_number(Integer room_number) {
        this.room_number = room_number;
    }

    public Integer getRoom_hotel() {
        return room_hotel;
    }

    public void setRoom_hotel(Integer room_hotel) {
        this.room_hotel = room_hotel;
    }

    public Integer getNbNights() {
        return nbNights;
    }

    public void setNbNights(Integer nbNights) {
        this.nbNights = nbNights;
    }

    public GregorianCalendar getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(GregorianCalendar beginDate) {
        this.beginDate = beginDate;
    }


}
