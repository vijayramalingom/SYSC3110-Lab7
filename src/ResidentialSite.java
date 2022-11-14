public class ResidentialSite extends Site{

    @Override
    public double getBaseAmount(double _units, double _rate) {
        return _units * _rate;
    }

    @Override
    public double getTaxAmount(double _base) {
        return _base * Site.TAX_RATE;
    }
}
