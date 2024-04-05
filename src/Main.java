//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Building building = new Building(30);

        Passenger passenger1 = new PatientPassenger(1, 15);
        Passenger passenger2 = new StaffPassenger(5, 20);
        Passenger passenger3 = new PatientPassenger(10, 25);
        Passenger passenger4 = new StaffPassenger(20, 5);

        building.addPassenger(passenger1, passenger1.getStartingFloor());
        building.addPassenger(passenger2, passenger2.getStartingFloor());
        building.addPassenger(passenger3, passenger3.getStartingFloor());
        building.addPassenger(passenger4, passenger4.getStartingFloor());

        Elevator standardElevator = new StandardElevator(10);
        Elevator expressElevator = new ExpressElevator(8);

        runMain(building, standardElevator, expressElevator, 60); // Run for 60 iterations
    }

    private static void runMain(Building building, Elevator standardElevator, Elevator expressElevator, int iterations) {
        for (int i = 1; i <= iterations; i++) {
            // Move elevators
            standardElevator.move();
            expressElevator.move();

            System.out.println("Iteration " + i + " completed.");
        }
    }
}