import java.time.LocalDate;

public class Trip {
    private Route route;
    private int tripId;
    private LocalDate arrival;
    private LocalDate departure;

    public Trip(Route route, int tripId, LocalDate arrival, LocalDate departure) {
        this.route = route;
        this.tripId = tripId;
        this.arrival = arrival;
        this.departure = departure;
    }


    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }
}