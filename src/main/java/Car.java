public class Car extends Vehicle implements Driveable{

    @Override
    public void move() {
        drive();
    }

    @Override
    public void drive() {
            System.out.println(this.getClass().getSimpleName() + " is driving.");
        }

    }

