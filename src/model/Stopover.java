package model;

public class Stopover {

    private Integer flight;
    private Integer airport;
    private Double duration;

    public Stopover(Integer flight, Integer airport, Double duration) {
        this.flight = flight;
        this.airport = airport;
        this.duration = duration;
    }
    public Integer getFlight() {
        return flight;
    }

    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public Integer getAirport() {
        return airport;
    }

    public void setAirport(Integer airport) {
        this.airport = airport;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

}
