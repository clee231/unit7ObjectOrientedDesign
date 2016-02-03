

/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    private String expDate;
    //private GregorianCalendar;
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
    //public boolean isExpired()
    //{
    //    GregorianCalendar calendar= new GreforianCalendar();
    //    if (calendar.get(Calendar.YEAR)>expYear)
    //    {
    //        return true;
    //    }
   //     else
    //    {
   //         return false;
   //     }
   // }
}