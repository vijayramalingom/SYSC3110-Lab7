public abstract class Site {
    public static double TAX_RATE = 0.13;
    public double getBillableAmount(double _units, double _rate) {
        double _base = getBaseAmount(_units, _rate);
        return _base + getTaxAmount(_base);
    }
    public abstract double getBaseAmount(double _units, double _rate);
    public abstract double getTaxAmount(double _base);
}
