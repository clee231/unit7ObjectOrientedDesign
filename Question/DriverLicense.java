

/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    private String expDate;
    public DriverLicense(String name, String expDate)
    {
        super(name);
        this.expDate = expDate;
    }
    public String getDate()
    {
        return this.expDate;
    }
    public String format()
    {
      return super.format()+ "The Expiration Date is: "+ this.getDate();
    }
}