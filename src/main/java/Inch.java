public class Inch extends Length {

    public Inch(double value)
    {
        super(value*2.54);
    }

    public double getValue()
    {
        return  super.getValueInCentimeters()/(double)2.54;
    }

}
