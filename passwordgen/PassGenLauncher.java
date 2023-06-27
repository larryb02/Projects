package passwordgen;

import javax.swing.SwingUtilities;

public class PassGenLauncher {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new PassGui();
            }
        });
        
        //System.out.println(launcher.getLayout());
        
        
    }
}
