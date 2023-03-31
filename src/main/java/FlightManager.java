public class FlightManager {

    Plane plane;
    Passenger passenger;

    Flight flight;

    public FlightManager(Plane plane, Passenger passenger, Flight flight){
        this.plane = plane;
        this.passenger = passenger;
        this.flight = flight;
    }

    public int baggageWeightPerPerson(){
        return plane.planeType.getWeight() / plane.planeType.getCapacity();
    }

    public int totalBaggagewWeightPerPassenger(){
         int totalNumOfBags = 0;
        for( Passenger passenger : flight.getPassengers()){
            totalNumOfBags += passenger.getNumberOfBags();
        }
        return totalNumOfBags * baggageWeightPerPerson();

    }

    public int totalBaggageRemaining() {
        int totalWeight = plane.planeType.getWeight();
        int totalPassengerWeight = totalBaggagewWeightPerPassenger();
        return totalWeight - totalPassengerWeight;
    }



}
