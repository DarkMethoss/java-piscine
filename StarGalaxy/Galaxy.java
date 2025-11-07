import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Galaxy {
    private List<CelestialObject> celestialObjects;

    public Galaxy() {
        celestialObjects = new ArrayList<>();
    }

    public void setCelestialObjects( List<CelestialObject> objects) {
        this.celestialObjects = objects;
    }

    public List<CelestialObject> getCelestialObjects() {
        return this.celestialObjects;
    }

    public void addCelestialObject(CelestialObject object) {
        celestialObjects.add(object);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        
        if (!(this.getClass() == object.getClass())) {
            return false;
        }

        Galaxy otherCasted = (Galaxy) object;
        return this.celestialObjects.equals(otherCasted.getCelestialObjects());
    }

    public int hashCode() {
        return Objects.hash(this.celestialObjects);
    }
}