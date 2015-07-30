public class Meter extends  Length{

    public Meter(double value)
    {
        super(value * 100);
    }

    public double getValue()
    {
        return  super.getValueInCentimeters()/(double)100;
    }

    public Meter add(Length length)
    {
        return new Meter(this.getValue()+ ((Meter)Converter.convertLength(length,ConversionLogic.METER)).getValue());

    }
}
