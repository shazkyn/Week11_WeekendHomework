public class Flight {

    private Plane plane;
    private  FlightType flightType;


    public Flight(Plane plane, FlightType flightType ) {
        this.plane = plane;
        this.flightType = flightType;
    }

    public Plane getPlane(){
        return this.plane;
    }

    public FlightType getFlightNumber() {
        return this.flightType;
    }

    public String getDestination() {
        return this.flightType.getDestination();
    }
}
