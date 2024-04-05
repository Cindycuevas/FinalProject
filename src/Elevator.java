import java.util.ArrayList;
import java.util.List;

public abstract class Elevator {
    protected int currentFloor;
    protected int direction;
    protected int capacity;
    protected List<Passenger> passengers;

    public Elevator(int capacity) {
        this.capacity = capacity;
        this.currentFloor = 0;
        this.direction = 1;
        this.passengers = new ArrayList<>();
    }

    public abstract void move();

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isFull() {
        return passengers.size() >= capacity;
    }

    public boolean isEmpty() {
        return passengers.isEmpty();
    }

    public void addPassenger(Passenger passenger) {
        if (!isFull()) {
            passengers.add(passenger);
            System.out.println(passenger.getClass().getSimpleName() + " added to elevator at floor " + currentFloor);
        } else {
            System.out.println("Elevator is full, cannot add passenger");
        }
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }
}
