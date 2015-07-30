package org.lenthAndVolume;

public class Feet extends Length {

    public Feet(double value)
    {
        super(value * 12*2.54);
    }

    public double getValue()
    {
        return  super.getValueInCentimeters()/(double)(12*2.54);
    }

    public Feet add(Length length)
    {
        return new Feet(this.getValue()+ ((Feet)Converter.convertLength(length,ConversionLogic.FEET)).getValue());
    }
}
