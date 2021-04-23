package model;

public class Trip {

    private Integer reservation_id;
    private Integer customer;

    public Trip(Integer reservation_id, Integer customer) {
        this.reservation_id = reservation_id;
        this.customer = customer;
    }

    public Integer getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(Integer reservation_id) {
        this.reservation_id = reservation_id;
    }

    public Integer getCustomer() {
        return customer;
    }

    public void setCustomer(Integer customer) {
        this.customer = customer;
    }
}
