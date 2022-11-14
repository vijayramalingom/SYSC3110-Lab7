public class LifelineSite extends Site {

    public double getBillableAmount(double _units, double _rate) {
        double base = _units * _rate * 0.5;
        double tax = base * Site.TAX_RATE * 0.2;
        return base + tax;
    }

    @Override
    public double getBaseAmount(double _units, double _rate) {
        return _units * _rate * 0.5;
    }

    @Override
    public double getTaxAmount(double _base) {
        return _base * Site.TAX_RATE * 0.2;
    }
}
