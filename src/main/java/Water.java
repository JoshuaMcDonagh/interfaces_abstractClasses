public class Water extends Environment <Swimmable> {

    @Override
    public void checkTraffic() {
        for (Object object : traffic) {
            System.out.println(object.getClass().getSimpleName() + " is swimming!");
        }
    }
}
