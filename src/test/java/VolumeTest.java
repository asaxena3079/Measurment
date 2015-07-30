import org.junit.Test;
import org.lenthAndVolume.*;

import static org.junit.Assert.*;

public class VolumeTest {

    @Test
    public void testCompareTeaSpoonAndTableSpoon()
    {
        assertEquals(new TableSpoon(1),new TeaSpoon(3));
    }

    @Test
    public void testCompareOunceAndTableSpoon()
    {
        assertEquals(new Ounce(1),new TableSpoon(2));
    }

    @Test
    public void testCompareCupAndOunce()
    {
        assertEquals(new Cup(1),new Ounce(8));
    }

    @Test
    public void testCompareTeaSpoonAndOunce()
    {
        assertEquals(new Cup(1),new TeaSpoon(48));
    }

    @Test
    public void testConvertOunceToTeaSpoon()
    {
        assertEquals(new TeaSpoon(6),Converter.convertVolume(new Ounce(1), ConversionLogic.TEASPOON));
    }

    @Test
    public void testConvertCupToOunce()
    {
        assertEquals(new Ounce(8),Converter.convertVolume(new Cup(1),ConversionLogic.OUNCE));
    }

    @Test
    public void testConvertOunceToTableSpoon()
    {
        assertEquals(new TableSpoon(2), Converter.convertVolume(new Ounce(1), ConversionLogic.TABLESPOON) );
    }

}