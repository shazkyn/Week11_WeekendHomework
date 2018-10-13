public enum FlightType {

    JW123("LONDON"),
    JW345("NEW_YORK"),
    JW567("PARIS"),
    JW789("TIMBUKTOO");

    private final String destination;

    FlightType(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

}
