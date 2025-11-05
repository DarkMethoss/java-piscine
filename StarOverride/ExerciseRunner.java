public class ExerciseRunner {

    public static void main(String[] args) {
        Star star = new Star();
        Star star2 = new Star();
        Star proxima = new Star("Proxima", 18.389, 832.32, 218, 0.4);
        CelestialObject celestialObject = new CelestialObject("Altair", 12.45, 328.8437, -328.3923);
        Star star1 = new Star("Altair", 12.45, 328.8437, -328.3923, 13.92);
        System.out.println(star.toString());
        System.out.println(proxima.toString());
        System.out.println(star.equals(star2));
        // System.out.println(star.equals(proxima));
        // System.out.println(star1.equals(celestialObject));
        star.hashCode();
    }
}