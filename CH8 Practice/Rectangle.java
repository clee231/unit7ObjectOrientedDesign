import java.util.Scanner;

public class Rectangle
{
    int width;
    int height;
    
    Scanner scan= new Scanner(System.in);
    /**
     * Default constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        height= 5;
        width= 50;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    public void setSize()
    {
        System.out.println("Length of Height: ");
        this.height= scan.nextInt();
        System.out.println("Length of Width: ");
        this.width= scan.nextInt();
    }

}
