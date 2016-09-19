import javax.swing.*;
import java.awt.*;


public class ColorPanel extends JPanel {    

    public ColorPanel (Color backColor){
        setBackground(backColor);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = getWidth() / 2 - 60;
        int y = getHeight() / 2;
        g.setColor(Color.white);
        g.fillRect(x, y, 120, 30);
        g.setColor(Color.red);
        Font font = new Font("Courier", Font.BOLD, 14);
        g.setFont(font);
        g.drawString("You’re a winner!", x + 10, y + 15);    
        }
}
