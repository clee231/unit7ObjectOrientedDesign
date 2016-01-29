

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
  
  public String getID()
  {
      return this.idNumber;
  }
  
}