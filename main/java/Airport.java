import java.util.ArrayList;

public class Airport {

    ArrayList<Plane> planes;
    String airportCode;
    ArrayList<Flight> flights;

    public Airport(String airportCode) {
        planes = new ArrayList<>();
        flights = new ArrayList<>();
        this.airportCode = airportCode;
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }

    public ArrayList<Plane> getPlanes() {
        return this.planes;
    }

    public String getAirportCode() {
        return this.airportCode;
    }

    public void addFlight(Flight flight) {
       flights.add(flight);
    }

    public  Flight getFlight(FlightType flightType) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightType)) {
                return flight;
            }
        }

        return null;
    }
}

