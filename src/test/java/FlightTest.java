import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;

    Plane plane;

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Taylor", 5);
        plane = new Plane(PlaneType.AIRBUS);
        flight = new Flight(plane, "KLM555", "Glasgow", "Amsterdam", "12.00");
    }

    @Test
    public void canAddPassenger() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());

    }

    @Test
    public void canCheckRemainingNumberOfSeats(){
        flight.getNumberOfAvailableSeats();
        assertEquals(250, flight.getNumberOfAvailableSeats());
    }
}
