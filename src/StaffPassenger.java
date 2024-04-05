public class StaffPassenger extends Passenger {
    public StaffPassenger(int startingFloor, int destinationFloor) {
        super(startingFloor, destinationFloor);

    }

    @Override
    public void requestElevator() {
        // Implementation of elevator request logic for staff passenger
        System.out.println("Staff passenger requests elevator from floor " + getStartingFloor() + " to floor " + getDestinationFloor());
    }
}
