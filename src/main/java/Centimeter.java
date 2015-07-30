public class Centimeter extends Length{

    public Centimeter(double value)
    {
        super(value);
    }

    public double getValue()
    {
        return  super.getValueInCentimeters();
    }

    public Centimeter add(Length length)
    {
        return new Centimeter(this.getValue()+ ((Centimeter)Converter.convertLength(length,ConversionLogic.CENTIMETER)).getValue());
    }
}
