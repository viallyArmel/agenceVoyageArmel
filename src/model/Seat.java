package model;

public class Seat {


    private String seat_number;
    private Integer flight;
    private String classe_seats;
    private Double pice;
    private Integer trip;

    public Seat(String seat_number, Integer flight, String classe_seats, Double pice, Integer trip) {
        this.seat_number = seat_number;
        this.flight = flight;
        this.classe_seats = classe_seats;
        this.pice = pice;
        this.trip = trip;
    }
    public String getSeat_number() {
        return seat_number;
    }

    public void setSeat_number(String seat_number) {
        this.seat_number = seat_number;
    }

    public Integer getFlight() {
        return flight;
    }

    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public String getClasse_seats() {
        return classe_seats;
    }

    public void setClasse_seats(String classe_seats) {
        this.classe_seats = classe_seats;
    }

    public Double getPice() {
        return pice;
    }

    public void setPice(Double pice) {
        this.pice = pice;
    }
    public Integer getTrip() {
        return trip;
    }

    public void setTrip(Integer trip) {
        this.trip = trip;
    }
}
