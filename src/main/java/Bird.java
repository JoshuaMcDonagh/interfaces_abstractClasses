public class Bird extends Animal implements Flyable{


    @Override
    public String makeSound() {
        return "";
    }

    @Override
    public void fly(){
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
