import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Plane plane;

    Passenger passenger;

    FlightManager flightManager;

    Flight flight;

    @Before
    public void before(){
        passenger = new Passenger("taylor", 5);
        plane = new Plane(PlaneType.BOEING);
        flight = new Flight(plane,"5555", "Glasgow", "Amsterdam", "1200");
        flightManager = new FlightManager(plane, passenger, flight);


    }

    @Test
    public void canGetAverageBaggageWeight(){
        assertEquals(10, flightManager.baggageWeightPerPerson());
    }

    @Test
    public void canGetTotalBaggageWeight(){
        flight.addPassenger(passenger);
        assertEquals(50, flightManager.totalBaggagewWeightPerPassenger());
    }

    @Test
    public void canGetTotalRemainingBaggageSpace(){
        flight.addPassenger(passenger);
        assertEquals(1950, flightManager.totalBaggageRemaining());
    }





}
