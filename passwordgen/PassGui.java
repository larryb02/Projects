package passwordgen;
//this is legit a random string generator packaged into a gui lolz!!!!
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PassGui extends JFrame implements ActionListener{ //I will make this template reusable later
    
    JButton generateButton;  
    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    JPanel backgroundPanel = new JPanel();
    
    final int width = (int)screensize.getWidth()/4;
    final int height = (int)screensize.getHeight()/4;

    
    public PassGui(){
        generateButton = new JButton("Generate!");
        generateButton.addActionListener(this);
        
        this.setTitle("Password Generator");
        this.setSize(width, height);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundPanel.setBackground(Color.BLACK);
        this.add(backgroundPanel);
        backgroundPanel.add(generateButton); 
        
        
        
        this.setVisible(true);

    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == generateButton){
            //create new window and, run method that generates password string
            System.out.println("hacking... i'm in!");
            
        }
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
