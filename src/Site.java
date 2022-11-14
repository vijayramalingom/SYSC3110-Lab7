public abstract class Site {
    public static double TAX_RATE = 0.13;
    public abstract double getBillableAmount(double _units, double _rate);
    public abstract double getBaseAmount(double _units, double _rate);
    public abstract double getTaxAmount(double _base);
}
