public class CelestialObject {
    public double x;
    public double y;
    public double z;
    public String name;

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
}
