public class LifelineSite extends Site {

    @Override
    public double getBaseAmount(double _units, double _rate) {
        return _units * _rate * 0.5;
    }

    @Override
    public double getTaxAmount(double _base) {
        return _base * Site.TAX_RATE * 0.2;
    }
}
