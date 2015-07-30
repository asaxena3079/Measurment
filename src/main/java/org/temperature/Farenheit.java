package org.temperature;

public class Farenheit extends Temperature {

    public Farenheit(double baseValueInCelcius)
    {
        super(((baseValueInCelcius-32)/1.8));
    }

    public double getTemperatureInFarenheit()
    {
        return ((super.getBaseValueInCelcius()*1.8)+32);
    }
}
