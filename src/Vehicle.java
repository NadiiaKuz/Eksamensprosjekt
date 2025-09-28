public class Vehicle {
    private int transportId;
    private TransportType transportType;
    private int averageSpeed;

    public Vehicle(int transportId, TransportType transportType, int averageSpeed) {
        this.transportId = transportId;
        this.transportType = transportType;
        this.averageSpeed = averageSpeed;
    }


    public int getTransportId() {
        return transportId;
    }

    public void setTransportId(int transportId) {
        this.transportId = transportId;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
}