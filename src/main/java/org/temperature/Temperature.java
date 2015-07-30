package org.temperature;

public abstract class Temperature {

    private double baseValueInCelcius;

    public Temperature(double baseValueInCelcius)
    {
        this.baseValueInCelcius = baseValueInCelcius;
    }

    public double getBaseValueInCelcius()
    {
        return baseValueInCelcius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Temperature that = (Temperature) o;

        return  ((that.baseValueInCelcius - baseValueInCelcius)<=0.000002);
        //return Double.compare(that.baseValueInCelcius, baseValueInCelcius) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(baseValueInCelcius);
        return (int) (temp ^ (temp >>> 32));
    }
}
