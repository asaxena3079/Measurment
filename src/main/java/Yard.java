public class Yard extends Length {

    public Yard(double value)
    {
        super(value*3*12*2.54);
    }

    public double getValue()
    {
        return  super.getValueInCentimeters()/(double)(3*12*2.54);
    }
}
