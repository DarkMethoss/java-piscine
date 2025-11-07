import java.util.*;

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


    public HashMap<String, Integer> computeMassRepartition() {
        HashMap<String, Integer> res = new HashMap<String, Integer>();
        res.put("Planet",0);
        res.put("Star",0);
        res.put("Other",0);
        
        String key = "";

        for (CelestialObject object: this.celestialObjects) {
            if (object instanceof Planet) {
                key = "Planet";
            } else if (object instanceof Star) {
                key = "Star";
            } else {
                key = "Other";
            }
            res.put(key, res.get(key) + object.getMass());
        }

        return res;
    }
}