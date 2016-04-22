package driver_program;

/**
 *
 * @author James
 */
public class Driver_Program {

    public static void main(String[] args) {
        
        Rectangle r = new Rectangle();
        r.setWidth(20);
        r.setLength(10);
        System.out.println("Width = " + r.getWidth());
        System.out.println("Length = " + r.getLength());
        System.out.println("Area = " + r.getArea());
        
    }
    
}
