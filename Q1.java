import java.awt.*;

public class Q1 {
    public static void main(String[] args) {
        Rectangle X = new Rectangle(250,400);
        System.out.println("Enter the width and height of a rectangle");
        X.getWidth();
        X.getHeight();
        double Y = (X.getWidth()*X.getHeight());
        System.out.println("Expected: 250.0");
        System.out.println("Width:   " + X.getWidth());
        System.out.println("Expected: 400.0");
        System.out.println("Height:   " + X.getHeight());
        System.out.println("Expected: 100000.0");
        System.out.println("perimeter:   "+Y);
    }
}
