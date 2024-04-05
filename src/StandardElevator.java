public class StandardElevator extends Elevator {
    public StandardElevator(int capacity) {
        super(capacity);

    }

    @Override
    public void move() {
        if (direction == 1) {
            currentFloor++;
        } else {
            currentFloor--;
        }
        System.out.println("Standard elevator moving " + (direction == 1 ? "up" : "down") + " to floor " + currentFloor);
    }
}
