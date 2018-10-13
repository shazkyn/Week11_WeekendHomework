import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class AirportTest {
    Plane plane;
    Flight flight;
    Airport airport;


    @Before
    public void before() {
        plane = new Plane(PlaneType.BOMBADIER_DASH8, "ConAir");
        flight = new Flight(plane, FlightType.JW345);
        airport = new Airport("JWX");
        airport.addPlane(plane);
        airport.addFlight(flight);
    }

    @Test
    public void canGetPlanes(){
        assertEquals( plane, airport.getPlanes().get(0));
    }

    @Test
    public void hasAirportCode(){
        assertEquals("JWX", airport.getAirportCode());
    }


    @Test
    public void canAddFlight(){
        assertEquals(flight, airport.getFlight(FlightType.JW345));
    }
}