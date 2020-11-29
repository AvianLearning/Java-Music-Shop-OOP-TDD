package stock;

public enum GuitarStringType {
    LOW_E(46),
    A(36),
    D(26),
    G(17),
    B(13),
    HIGH_E(10);

    private int gauge;

    GuitarStringType(int gauge) {
        this.gauge = gauge;
    }

    public int getGauge() {
        return gauge;
    }
}
