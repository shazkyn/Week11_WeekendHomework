import static org.junit.Assert.*;
import org.junit.*;

public class FlightTest {

    Flight flight;
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.LEAR_JET, "PPOPOL");
        flight = new Flight(plane, FlightType.JW123);
    }

    @Test
    public void canGetPlane(){ assertEquals(plane, flight.getPlane() ); }

    @Test
    public void canGetFlightNumber(){ assertEquals(FlightType.JW123, flight.getFlightNumber()); }

    @Test
    public void canGetDestination(){ assertEquals("LONDON", flight.getDestination()); }
}
