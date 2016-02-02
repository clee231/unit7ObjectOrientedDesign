

/**
 * Write a description of class BillFold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BillFold extends Card
{
    private Card card1;
    private Card card2;
    private boolean status= false;
    /**
     * Default constructor for objects of class BillFold
     */
    public BillFold()
    {
        this.card1= null;
        this.card2= null;
    }
    
    public void addCard(String name)
    {
        
        if (card1==null)
        {
             this.card1= new Card(name);
        }
        else if (card2== null)
        {
             this.card2= new Card(name);
        }
        else
        {
            System.out.println("Wallet is full");
            this.status=true;
        }
    }
    public boolean getStat()
    {
        return status;
    }
}
