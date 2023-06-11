package LearnJavaSwing;

//import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon; //for images 

public class frame {
    public static void main(String[] args) {
        frame2 brame = new frame2(); //instance of my jframe class
        // JFrame brame = new JFrame(); //creates frame
        // brame.setSize(420,420); //dimensions
        // brame.setTitle("Windows hahahahahehehehe");//names window
        // brame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits instead of hides, very useful hehehe
        // brame.setVisible(true);//outputs to screen
        // brame.setResizable(true);//obvious #facepalm emogie

        ImageIcon theBronJane = new ImageIcon("\\C:\\Users\\lolz\\Pictures\\Camera Roll\\bronbron.jpg");
        brame.setIconImage(theBronJane.getImage()); //sets application/window icon
        brame.getContentPane().setBackground(Color.blue); //changes color

        //JLabels

        JLabel label = new JLabel();
        label.setText("yep");//can also be passed as parameter when creating JLabel object
        brame.add(label);
        label.setIcon(theBronJane);
        brame.pack();
    }
    
}
