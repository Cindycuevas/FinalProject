public class PatientPassenger extends Passenger {
    public PatientPassenger(int startingFloor, int destinationFloor) {
        super(startingFloor, destinationFloor);

    }

    @Override
    public void requestElevator() {
        // Implementation of elevator request logic for patient passenger
        System.out.println("Patient passenger requests elevator from floor " + getStartingFloor() + " to floor " + getDestinationFloor());
    }
}
