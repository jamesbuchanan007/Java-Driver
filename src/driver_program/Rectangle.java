package driver_program;

/**
 *
 * @author James
 */
public class Rectangle {
    
    private double width;
    private double length;
    
    public void setWidth(double w)
    {   width = w;
    }
    public void setLength (double l)
    {   length = l;    
    }
    public double getWidth ()
    {   return width;
    }
    public double getLength()
    {   return length;
    }
    public double getArea()
    {   return length * width;    
    }
}
