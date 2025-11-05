public class ExerciseRunner {

    public static void main(String[] args) {
        Planet earth = new Planet();
        Planet naboo = new Planet("Naboo", 17.4389, 8349.1, 8943.92, new Star("Betelgeuse", 128.23, -12.82, 32.328, 1289.3));
        Star star = new Star("Aldebarran", 3278.12, 4893.3289, 192.32, 329.32);
        Planet planet = new Planet();

        // System.out.println(naboo.toString());
        // System.out.println(earth.toString());
        System.out.println(planet.getCenterStar().equals(new Star()));
    }
}