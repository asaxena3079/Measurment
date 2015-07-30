package org.temperature;

public class Converter {

    public static Temperature convertTemperature(Temperature temperature, ConversionLogic conversionLogic)
    {
        Temperature temperature1 = null;

        switch (conversionLogic)
        {
            case CELCIUS:
                temperature = new Celcius(temperature.getBaseValueInCelcius());

            case FARENHEIT:
                temperature = new Farenheit((temperature.getBaseValueInCelcius()*1.8)+32);
        }

        return temperature;
    }

}

