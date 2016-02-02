

public class CallingCard extends Card
{
   private String cardNumber;
    public CallingCard(String name,String pin )
   {
       super(name);
       this.cardNumber=pin;
    }
    
   public String getPin()
   {
        return this.cardNumber;
   }
    
   public String format()
  {
      return super.format()+ "The Card Number is: "+ this.getPin();
  }
}
