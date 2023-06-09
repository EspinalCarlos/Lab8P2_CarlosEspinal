
package lab8p2_carlosespinal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;


public class ThreadArtists extends Thread{
    private JDialog jd;
    private JDialog jd2;
    private int seconds = 0;
    private boolean Alive = true;
    
    
    public ThreadArtists() {
    }

    public ThreadArtists(JDialog jd, JDialog jd2) {
        this.jd = jd;
        this.jd2 = jd2;
    }

    public JDialog getJd() {
        return jd;
    }

    public void setJd(JDialog jd) {
        this.jd = jd;
    }
    
    
    @Override
    public void run(){
        while(Alive){
            if (seconds < 5000) {
                System.out.println("Sincronizando");
                seconds += 1000;
            } else if(seconds == 5000){
                jd.setEnabled(true);
                Alive = false;
                JOptionPane.showMessageDialog(jd , "Artista registrado correctamente!");
                jd.setVisible(false);
                jd2.setVisible(true);
                
                break;

            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadRegistrar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
