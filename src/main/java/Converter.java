public class Converter {

    public static Length convertLength(Length length,ConversionLogic conversionLogic)
    {
        Length length1 = null;

        if(conversionLogic==ConversionLogic.CENTIMETER)
        {
            length1 = new Centimeter(length.getValueInCentimeters());
        }
        else if(conversionLogic==ConversionLogic.METER)
        {
            length1 = new Meter(length.getValueInCentimeters()/100);
        }
        else if(conversionLogic==ConversionLogic.INCH)
        {
            length1 = new Inch(length.getValueInCentimeters()/2.54);
        }
        else if(conversionLogic==ConversionLogic.YARD)
        {
            length1 = new Yard(length.getValueInCentimeters()/(3*12*2.54));
        }
        else if(conversionLogic==ConversionLogic.FEET)
        {
            length1 = new Feet(length.getValueInCentimeters()/(12*2.54));
        }


        return length1;
    }

    public static Volume convertVolume(Volume volume,ConversionLogic conversionLogic)
    {
        Volume volume1 = null;

        if(conversionLogic==ConversionLogic.TEASPOON)
        {
            volume1 = new TeaSpoon(volume.getBaseValueInTeaSpoon());
        }
        if(conversionLogic==ConversionLogic.TABLESPOON)
        {
            volume1 = new TableSpoon(volume.getBaseValueInTeaSpoon()/3);
        }
        if(conversionLogic==ConversionLogic.OUNCE)
        {
            volume1 = new Ounce(volume.getBaseValueInTeaSpoon()/(3*2));
        }
        if(conversionLogic==ConversionLogic.CUP)
        {
            volume1 = new Cup(volume.getBaseValueInTeaSpoon()/(3*2*8));
        }

        return volume1;
    }

}
