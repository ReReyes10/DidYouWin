import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DidYouWin { 
   
    public static void main(String[] args){
        JFrame DidYouWin = new JFrame();
        DidYouWin.setTitle("Did You Win?");
        DidYouWin.setSize(900,200);
        DidYouWin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JPanel panel1 = new JPanel();
            panel1.setBackground(Color.red);
            JPanel panel2 = new JPanel();
            panel2.setBackground(Color.blue);
            JPanel panel3 = new JPanel();
            panel3.setBackground(Color.green);
            JPanel panel4 = new JPanel();
            panel4.setBackground(Color.blue);
            JPanel panel5 = new JPanel();
            panel5.setBackground(Color.red);
            Container pane = DidYouWin.getContentPane();
            pane.setLayout(new GridLayout(1,5));
            pane.add(panel1);
            pane.add(panel2);
            pane.add(panel3);
            pane.add(panel4);
            pane.add(panel5);
            Random gen = new Random();            int blue = gen.nextInt(1);            Color backColor = new Color (blue);            //Panel panel = new Panel();            //panel.setBackground(backColor);            ColorPanel panel = new ColorPanel(backColor);            pane.add(panel);
            DidYouWin.setVisible(true);
    }

}
        