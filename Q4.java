import java.awt.*;

public class Q4 {
    public static void main(String[] args) {
        Rectangle X = new Rectangle(5, 10, 20, 30);
        System.out.println(X);
        System.out.println("Expected: Width = 20 , Height = 30");
        X.add(0,0);
        System.out.println(X);
        System.out.println("Expected: Width = 25 , Height = 40");
    }
}