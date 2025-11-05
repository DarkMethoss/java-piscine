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

    @Override
    public Boolean equals(CelestialObject object) {
        if (object == null) {
            return false;
        }
        
        if (object instanceof Star) {
            return false;
        }
        
        Star castedObject = (Star) object; 
        return x == castedObject.x
            && y == castedObject.y
            && z == castedObject.z
            && magnitude == castedObject.magnitude
            && name.equals(castedObject.name);
    }

    public int hashCode() {
        return Objects.hash(x, y, z, name, magnitude);
    }
}