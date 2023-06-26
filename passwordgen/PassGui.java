package passwordgen;
//this is legit a random string generator packaged into a gui lolz!!!!
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PassGui extends JFrame implements ActionListener{ //I will make this template reusable later
    JButton generateButton = new JButton("Generate!");
    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    JPanel backgroundPanel = new JPanel();
    
    final int width = (int)screensize.getWidth()/4;
    final int height = (int)screensize.getHeight()/4;

    public String test = "";
    
    public PassGui(){
        this.setTitle("Password Generator");
        this.setSize(width, height);
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //this.generateButton.setBounds(50, 50, 125, 125);
        this.add(generateButton); 

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == generateButton){
            //create new window and, run method that generates password string
            
            
        }
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
