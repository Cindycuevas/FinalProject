public abstract class Passenger {
    protected int startingFloor;
    protected int destinationFloor;

    public Passenger(int startingFloor, int destinationFloor) {
        this.startingFloor = startingFloor;
        this.destinationFloor = destinationFloor;
    }

    public int getStartingFloor() {
        return startingFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public abstract void requestElevator();
}
