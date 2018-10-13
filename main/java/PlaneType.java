public enum PlaneType {
    AIRBUS_A380(700),
    BOEING787(185),
    BOMBADIER_DASH8(50),
    LEAR_JET(4);


    private final int value;

    PlaneType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
