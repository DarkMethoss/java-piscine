import java.util.Objects;
public class Star extends CelestialObject {
    private double magnitude;

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }
    public Star() {
        super();
        this.magnitude = 0;
    }

    public double getMagnitude(){
        return magnitude;
    }

    public void setMagnitude(double value){
        this.magnitude = value;
    }

    public String toString(){
        return String.format("%s shines at the %.3f magnitude", name, magnitude);
    }

    public Boolean equals(Star object) {
        if (object == null) {
            return false;
        }
        return x == object.x
            && y == object.y
            && z == object.z
            && magnitude == object.magnitude
            && name.equals(object.name);
    }

    public int hashCode() {
        return Objects.hash(x, y, z, name, magnitude);
    }
}