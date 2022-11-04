import javax.swing.*;
import java.awt.*;

public class Q7 {
    public static void main(String[] args) {
        JFrame Fr = new JFrame();
        Fr.setSize(250,250);
        JLabel Lb = new JLabel("Hello PM77!");
        Lb.setOpaque(true);
        Lb.setBackground(Color.black);
        Image Im = new ImageIcon("E:\\Pics\\FB_IMG_1507191611045").getImage();
        Fr.add(new JLabel(new ImageIcon((Im))));
        Fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Fr.setVisible(true);
    }
}