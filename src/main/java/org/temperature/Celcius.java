package org.temperature;

public class Celcius extends Temperature {

    public Celcius(double baseValueInCelcius)
    {
        super(baseValueInCelcius);
    }

    public double getTemperatureInCelcius()
    {
        return super.getBaseValueInCelcius();
    }
}
