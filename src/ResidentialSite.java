public class ResidentialSite extends Site{

    public double getBillableAmount(double _units, double _rate) {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
