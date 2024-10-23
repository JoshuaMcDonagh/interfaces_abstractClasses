public class Aeroplane extends Vehicle implements Flyable{

    @Override
    public void move() {
        fly();
    }

    @Override
    public void fly(){
        System.out.println("Aeroplane is flying.");
    }
}
