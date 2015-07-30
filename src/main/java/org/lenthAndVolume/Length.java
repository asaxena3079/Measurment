package org.lenthAndVolume;

public abstract class Length {

    private double value;

    public Length(double value)
    {
        this.value = value;
    }

    public double getValueInCentimeters()
    {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Length length1 = (Length) o;

        return Double.compare(length1.value, value) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(value);
        return (int) (temp ^ (temp >>> 32));
    }
}
