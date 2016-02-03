
/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    private String idNumber;
    public IDCard(String n, String id)
    {  
        super(n);
        idNumber = id;
    }

    /**
     * Gets the ID number of the card.
     */
    public String getID()
    {
        return this.idNumber;
    }

    public String format()
    {
        return super.format()+ "ID number is: "+ this.getID();
    }
    
    public boolean equals (IDCard otherCard)
    {
        //okay solution :boolean isEqual = this.getName().equals(otherCard.getName());
        //Better
        boolean isEqual = super.equals(otherCard);
        return isEqual && this.idNumber.equals(otherCard.idNumber); 
    }
    
    //override the equal method defined in Card as well as Object
    public boolean equals( Object other)
    {
        //check if this object and the other object are both of the same class
        if(this.getClass()==other.getClass())
        {
           // first check if this object and the other object are equal from the perspective
           // of the superclass(i.e.,Card)
           boolean isEqual = super.equals(other);
           //second, cast the other object to an IDCard and check if idNumber are equal.
           IDCard otherIDCard= (IDCard) other;
           return isEqual && this.idNumber.equals(otherIDCard.idNumber); 
        }
        return false;
    }
}