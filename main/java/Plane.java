import java.util.ArrayList;

public class Plane {

    private PlaneType planeType;
    private String airline;
    private ArrayList<Passenger> passengers;

    public Plane(PlaneType planeType, String airline) {
        this.planeType = planeType;
        this.airline = airline;
        passengers = new ArrayList<>();
    }

    public PlaneType getPlaneType() {
        return this.planeType;
    }

    public String getAirline() {
        return this.airline;
    }

}



