import java.util.ArrayList;

public class Route {
    private String name;
    private int routeId;
    private ArrayList<Stop> listOfStops;
    private Vehicle vehicle;

    public Route(String name, int routeId, Vehicle vehicle) {
        this.name = name;
        this.routeId = routeId;
        this.vehicle = vehicle;
        this.listOfStops = new ArrayList<>();
    }

    /**
     Metode for å legge til et stopp i listen over stopp.
     */

    public void addStop(Stop stop) {
        this.listOfStops.add(stop);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public ArrayList<Stop> getListOfStops() {
        return listOfStops;
    }

    public void setListOfStops(ArrayList<Stop> listOfStops) {
        this.listOfStops = listOfStops;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}