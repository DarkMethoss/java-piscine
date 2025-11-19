class DriverFactory {
    public static Driver getDriver(String type){
        switch (type) {
            case "Car":
                return new CarDriver();
            case "Plane":
                return new PlaneDriver();
        }
        return null;
    }
}