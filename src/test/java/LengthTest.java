import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    @Test
    public void compareMeterAndCentimeter()
    {
        Length length1 = new Centimeter(100);
        Length length2 = new Meter(1);

        assertEquals(length1,length2);
    }

    @Test
    public void compareInchAndCentimeter()
    {
        Length length1 = new Centimeter(2.54);
        Length length2 = new Inch(1);

        assertEquals(length1,length2);
    }

    @Test
    public void compareYardAndFoot()
    {
        Length length1 = new Yard(1);
        Length length2 = new Feet(3);

        assertEquals(length1,length2);
    }

    @Test
    public void compareFeetAndInch()
    {
        Length length1 = new Feet(1);
        Length length2 = new Inch(12);

        assertEquals(length1,length2);
    }

}