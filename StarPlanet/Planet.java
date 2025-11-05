import java.util.Objects;
public class Planet extends CelestialObject{
    private Star centerStar;

    public Planet() {
        super();
        centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar) {
        super(name, x, y, z);
        this.centerStar = centerStar;
    }

    public Star getCenterStar() {
        return this.centerStar;
    }

    public void setCenterStar(Star centerStar) {
        this.centerStar = centerStar;
    }

    public String toString(){
        double distance = super.getDistanceBetween(this, this.centerStar);
        return String.format("%s circles around %s at the %.3f AU", name,centerStar.getName(), distance);
    }

    @Override
    public Boolean equals(CelestialObject object) {
        if (object == null) {
            return false;
        }

        if (!(object instanceof Planet)) {
            return false;
        }
        
        Planet castedObject = (Planet) object; 
        return super.equals(castedObject)
            && this.centerStar.equals(castedObject.getCenterStar());
    }

    public int hashCode() {
        return Objects.hash(this.x, this.y, this.z, this.name, this.centerStar);
    }
}