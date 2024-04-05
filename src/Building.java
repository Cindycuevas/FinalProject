import java.util.ArrayList;
import java.util.List;

public class Building {
    private int floors;



    private List<Passenger> passengersOnFloors;

    public Building(int floors) {
        this.floors = floors;
        this.passengersOnFloors = new ArrayList<>();
    }

    public int getFloors() {
        return floors;
    }



    public void addPassenger(Passenger passenger, int floor) {
        if (floor >= 0 && floor < floors) {
            passengersOnFloors.add(passenger);
            System.out.println(passenger.getClass().getSimpleName() + " added to floor " + floor);
        } else {
            System.out.println("Invalid floor number");
        }
    }

    public void removePassenger(Passenger passenger) {
        passengersOnFloors.remove(passenger);
    }

    public List<Passenger> getPassengersOnFloor(int floor) {
        List<Passenger> passengersOnFloor = new ArrayList<>();
        for (Passenger passenger : passengersOnFloors) {
            if (passenger.getStartingFloor() == floor) {
                passengersOnFloor.add(passenger);
            }
        }
        return passengersOnFloor;
    }
}
