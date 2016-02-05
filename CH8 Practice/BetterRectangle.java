

public class BetterRectangle extends Rectangle
{
    int area;
    int perimeter;
    public BetterRectangle()
    {
      super();
      area = 0;
      perimeter=0;
    }
    
    public int getPerimeter()
    {
        perimeter=super.getHeight()*2+super.getWidth()*2;
        return perimeter;
    }
    
    public int getArea()
    {
        area=super.getHeight()*super.getWidth();
        return area;
    }
  
}
