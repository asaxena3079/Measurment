public class Meter extends  Length{

    public Meter(double value)
    {
        super(value * 100);
    }

    public double getValue()
    {
        return  super.getValueInCentimeters()/(double)100;
    }


}
