public class Converter {

    public static Meter convertToMeter(Length length)
    {
        return new Meter(length.getValueInCentimeters()/100);
    }

    public static Centimeter convertToCentiMeter(Length length)
    {
        return new Centimeter(length.getValueInCentimeters());
    }

    public static Yard convertToYard(Length length)
    {
        return new Yard(length.getValueInCentimeters()/(double)(3*12*2.54));
    }

    public static Inch convertToInch(Length length)
    {
        return new Inch(length.getValueInCentimeters()/(double)2.54);
    }

    public static Feet convertToFeet(Length length)
    {
        return new Feet(length.getValueInCentimeters()/(double)(12*2.54));
    }

}
