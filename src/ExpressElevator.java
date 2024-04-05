public class ExpressElevator extends Elevator {
    public ExpressElevator(int capacity) {
        super(capacity);
    }

    @Override
    public void move() {
        if (direction == 1) {
            currentFloor += 2;
        } else {
            currentFloor -= 2;
        }
        System.out.println("Express elevator moving " + (direction == 1 ? "up" : "down") + " to floor " + currentFloor);
    }
}
