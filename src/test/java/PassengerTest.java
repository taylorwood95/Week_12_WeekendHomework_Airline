import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("taylor", 5);
    }

    @Test
    public void canGetName(){
        assertEquals("taylor", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags(){
        assertEquals(5, passenger.getNumberOfBags());
    }




}
