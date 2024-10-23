public class Sky extends Environment<Flyable>{

    @Override
    public void checkTraffic() {
        for (Object object : traffic) {
            System.out.println(object.getClass().getSimpleName() + " is flying!");
        }
    }
}
