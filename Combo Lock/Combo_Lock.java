

/**
 * Write a description of class Combo_Lock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Combo_Lock
{
    private int number1;
    private int number2;
    private int number3;
    private int num1;
    private int num2;
    private int num3;
    
    private int curPos;
    /**
     * Default constructor for objects of class Combo_Lock
     */
    public Combo_Lock(int secret1, int secret2, int secret3)
    {
        this.number1= secret1;
        this.number2= secret2;
        this.number3= secret3;
        this.num1=100;
        this.num2=100;
        this.num3=100;
        
        this.curPos=0;
        
    }
    
    public int turnLeft(int ticks)
    {
        for (int i=0; i<ticks; i++)
        {
         
            if(curPos==40)
            {
                curPos=0;
            }
            curPos+=1;

        }
         if (num2==100)
          {num2= curPos;
           }
       return curPos;
    }
    
    public int turnRight(int ticks)
    {
        for (int i=0; i<ticks; i++)
        {
          
            if(curPos==0)
            {
                curPos=40;
            }
            curPos-=1;
        }
        if (num1==100)
        {num1= curPos;
        }
        else
        {
         num3=curPos;
        }
         return curPos;
    }
    public void reset()
    {
        curPos=0;
        this.num1=100;
        this.num2=100;
        this.num3=100;
    }
    public boolean open()
    {
        if( num1==number1 && num2==number2 && num3==number3)
        {return true;
        }
        else
        {
            return false;
        }
    }
}
