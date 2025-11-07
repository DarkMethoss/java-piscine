import java.util.Objects;
public class Planet extends CelestialObject{
    private Star centerStar;

    public Planet() {
        super();
        centerStar = new Star();
    }

    public Planet(String name, double x, double y, double z, Star centerStar, Integer mass) {
        super(name, x, y, z, mass);
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
    public boolean equals(Object other) {
        if (super.equals(other)) {
            Planet otherCasted = (Planet) other;
            return this.centerStar.equals(otherCasted.getCenterStar());
        }

        return false ;
    }

    public int hashCode() {
        return Objects.hash(this.x, this.y, this.z, this.name, this.centerStar);
    }

    
}