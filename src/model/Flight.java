package model;

import java.util.GregorianCalendar;

public class Flight {


    private Integer flight_id;
    private Double duration;
    private GregorianCalendar departureTime;
    private String airline;

    public Flight(Integer flight_id, Double duration, Integer day, Integer month, Integer year, String airline) {
        this.flight_id = flight_id;
        this.duration = duration;
        this.departureTime = new GregorianCalendar(year,month-1,day);
        this.airline = airline;
    }
    public Flight(Integer flight_id, Double duration,Integer day, Integer month, Integer year){
        this(flight_id,duration,day,month,year,null);
    }

    public Integer getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(Integer flight_id) {
        this.flight_id = flight_id;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(GregorianCalendar departureTime) {
        this.departureTime = departureTime;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
