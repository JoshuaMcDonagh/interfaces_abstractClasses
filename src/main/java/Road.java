public class Road extends Environment <Driveable> {

    @Override
    public void checkTraffic() {
        for (Object object : traffic) {
            System.out.println(object.getClass().getSimpleName() + " is driving!");

        }
    }
}