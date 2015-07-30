public class TableSpoon extends Volume {

    public TableSpoon(double tableSpoon)
    {
        super(tableSpoon*3);
    }

    public double getValue()
    {
        return super.getBaseValueInTeaSpoon()/3;
    }
}
