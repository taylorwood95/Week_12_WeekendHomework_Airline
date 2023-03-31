import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.AIRBUS);
    }

    @Test
    public void canGetWeight(){
        assertEquals(2200, plane.planeType.getWeight());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(250, plane.planeType.getCapacity());
    }


}
