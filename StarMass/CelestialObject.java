import java.lang.Math.*;
import java.util.Objects;

public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;
    public Integer mass;
    public static final double KM_IN_ONE_AU = 150000000; 

    public CelestialObject() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.name = "Soleil";
    }

    public CelestialObject(String name, double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.mass = 0;
    }

    public CelestialObject(String name, double x, double y, double z, Integer mass) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
        this.mass = mass;
    }

    public void setX(double x){
        this.x = x;
    }
    
    public double getX() {
        return x;
    }

    public void setY(double y){
        this.y = y;
    }
    
    public double getY() {
        return y;
    }

    public void setZ(double z){
        this.z = z ;
    }
    
    public double getZ() {
        return z;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public  void setMass(Integer value){
        this.mass = value;
    }
    
    public  Integer getMass() {
        return this.mass;
    }

    public static double getDistanceBetween(CelestialObject celestialObject1, CelestialObject celestialObject2) {
        double diffY = Math.pow((celestialObject1.y - celestialObject2.y), 2);
        double diffZ = Math.pow((celestialObject1.z - celestialObject2.z), 2);
        double diffX = Math.pow((celestialObject1.x - celestialObject2.x), 2);
        return Math.sqrt(diffX + diffY + diffZ);
    }    

    public static double getDistanceBetweenInKm(CelestialObject celestialObject1, CelestialObject celestialObject2) {
        return getDistanceBetween(celestialObject1, celestialObject2) * KM_IN_ONE_AU;
    }

    public String toString(){
        return String.format("%s is positioned at (%.3f, %.3f, %.3f)", name, x, y, z);
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if ( this.getClass() != object.getClass() ) {
            return false;
        }

        CelestialObject objectCasted = (CelestialObject) object;
        return x == objectCasted.x
            && y == objectCasted.y
            && z == objectCasted.z
            && name.equals(objectCasted.name);
    }

    public int hashCode() {
        return Objects.hash(x, y, z, name);
    }
}
