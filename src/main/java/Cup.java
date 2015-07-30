public class Cup extends Volume {

    public Cup(double cup) {
        super(cup*3*2*8);
    }

    public double getValue()
    {
        return super.getBaseValueInTeaSpoon()/3*2*8;
    }
}
