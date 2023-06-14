package passwordgen;
//this is legit a random string generator packaged into a gui lolz!!!!
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class gui extends JFrame implements ActionListener{ //I will make this template reusable later
    JButton generateButton = new JButton();
    public gui(){
        this.setTitle("Password Generator");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == generateButton){

        }
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
