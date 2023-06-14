package LearnJavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class frame2 extends JFrame implements ActionListener{ //creating jframe as a class
    

    JButton button;
    frame2(){
        this.setSize(750,750); //dimensions
        this.setTitle("Windows hahahahahehehehe");//names window
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exits instead of hides, very useful hehehe
        this.setVisible(true);//outputs to screen
        this.setResizable(true);//obvious #facepalm emogie
        this.setLayout(null);
        
        //JButtons
        button = new JButton();
        button.setBounds(200,100,250,50);
        button.addActionListener(this);
        button.setText("Don't Click Me!");
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        this.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            System.out.println("yep");
        }
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
