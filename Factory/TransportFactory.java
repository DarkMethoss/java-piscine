class TransportFactory {
    public static Transport getTransport(String type){
        switch (type) {
            case "Car":
                return new Car();
            case "Plane":
                return new Plane();
        }
        return null;
    }
}