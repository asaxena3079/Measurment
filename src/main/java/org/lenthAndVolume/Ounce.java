package org.lenthAndVolume;

public class Ounce extends Volume {

    public Ounce(double ounce)
    {
        super(ounce*2*3);
    }

    public double getValue()
    {
        return super.getBaseValueInTeaSpoon()/(3*2);
    }
}
