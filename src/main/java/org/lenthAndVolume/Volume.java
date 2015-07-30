package org.lenthAndVolume;

public abstract class Volume {

    public double baseValueTeaSpoon;

    public Volume(double baseValueTeaSpoon)
    {
        this.baseValueTeaSpoon = baseValueTeaSpoon;
    }

    public double getBaseValueInTeaSpoon()
    {
        return  baseValueTeaSpoon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Volume volume = (Volume) o;

        return Double.compare(volume.baseValueTeaSpoon, baseValueTeaSpoon) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(baseValueTeaSpoon);
        return (int) (temp ^ (temp >>> 32));
    }
}
