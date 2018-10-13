import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;


    @Before
    public void before() {
        plane = new Plane(PlaneType.AIRBUS_A380,  "Cowboy Air");
    }


    @Test
    public void canGetPlane(){
        assertEquals(PlaneType.AIRBUS_A380, plane.getPlaneType());
    }

    @Test
    public void canGetAirline(){
        assertEquals("Cowboy Air", plane.getAirline());
    }




}
