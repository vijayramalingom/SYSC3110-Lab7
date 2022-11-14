public class ResidentialSite extends Site{

    public double getBillableAmount(double _units, double _rate) {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }

    @Override
    public double getBaseAmount(double _units, double _rate) {
        return _units * _rate;
    }

    @Override
    public double getTaxAmount(double _base) {
        return _base * Site.TAX_RATE;
    }
}
