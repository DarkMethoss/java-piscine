import java.util.Objects;
public class Star extends CelestialObject {
    private double magnitude;

    public Star(String name, double x, double y, double z, double magnitude) {
        super(name, x, y, z);
        this.magnitude = magnitude;
    }
    public Star(String name, double x, double y, double z, double magnitude, Integer mass) {
        super(name, x, y, z, mass);
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

    @Override
    public boolean equals(Object object) {

        if (super.equals(object)) {
            Star otherCasted = (Star) object;
            return this.magnitude == otherCasted.getMagnitude();
        }

        return false ;
    }

    public int hashCode() {
        return Objects.hash(super.x, super.y, super.z, super.name, this.magnitude);
    }
}