import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void compareMeterAndCentimeter()
    {
        assertEquals(new Centimeter(100), new Meter(1));
    }

    @Test
    public void compareInchAndCentimeter()
    {
        assertEquals(new Centimeter(2.54), new Inch(1));
    }

    @Test
    public void compareYardAndFoot()
    {
        assertEquals(new Yard(1), new Feet(3));
    }

    @Test
    public void compareFeetAndInch()
    {
        assertEquals(new Feet(1), new Inch(12));
    }

    @Test
    public void testConversionFromCentimeterToMeter()
    {
        assertEquals(new Meter(1),Converter.convertLength(new Centimeter(100),ConversionLogic.METER));
    }

    @Test
    public void testConversionFromYardToMeter()
    {
        assertEquals(new Meter(0.9144),Converter.convertLength(new Yard(1), ConversionLogic.METER));
    }

    @Test
    public void testConversionFromInchToMeter()
    {
        assertEquals(new Meter(0.0254),Converter.convertLength(new Inch(1), ConversionLogic.METER));
    }

    @Test
    public void testConversionFromFeetToMeter()
    {
        assertEquals(new Meter(0.3048),Converter.convertLength(new Feet(1), ConversionLogic.METER));
    }

    @Test
    public void testConversionFromFeetToInch()
    {
        assertEquals(new Inch(12),Converter.convertLength(new Feet(1), ConversionLogic.INCH));
    }

    @Test
    public void testConversionFromYardToInch()
    {
        assertEquals(new Inch(36),Converter.convertLength(new Yard(1), ConversionLogic.INCH));
    }

    @Test
    public void testConversionFromMeterToInch()
    {
        //System.out.println(Converter.convertToInch(meter).getValue());
        assertEquals(new Inch(39.37007874015748), Converter.convertLength(new Meter(1), ConversionLogic.INCH));
    }

    @Test
    public void testConversionFromCentiMeterToInch()
    {
        //System.out.println(Converter.convertToInch(centimeter).getValue());
        assertEquals(new Inch(0.39370078740157477),Converter.convertLength(new Centimeter(1), ConversionLogic.INCH));
    }

}