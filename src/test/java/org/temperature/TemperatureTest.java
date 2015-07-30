package org.temperature;

import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {

    @Test
    public void testConvertCelciusToFarenheit()
    {
        assertEquals(new Farenheit(33.8),Converter.convertTemperature(new Celcius(1),ConversionLogic.FARENHEIT));
    }

    @Test
    public void testConvertFarenheitToCelcius()
    {
        assertEquals(new Celcius(1),Converter.convertTemperature(new Farenheit(33.8),ConversionLogic.CELCIUS));
    }

}