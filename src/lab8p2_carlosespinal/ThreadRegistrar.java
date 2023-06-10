
package lab8p2_carlosespinal;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ThreadRegistrar extends Thread implements Serializable{
    private JDialog jd;
    JFrame jf;
    private int seconds = 0;
    private boolean Alive = true;

    public ThreadRegistrar() {
    }

    public ThreadRegistrar(JDialog jd) {
        this.jd = jd;
    }

    
    
    public ThreadRegistrar(JDialog jd, JFrame jf) {
        this.jd = jd;
        this.jf = jf;
    }

    public JDialog getJd() {
        return jd;
    }

    public void setJd(JDialog jd) {
        this.jd = jd;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public JFrame getJf() {
        return jf;
    }

    public void setJf(JFrame jf) {
        this.jf = jf;
    }
    

    @Override
    public String toString() {
        return "ThreadRegistrar{" + "jd=" + jd + ", seconds=" + seconds + '}';
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
                JOptionPane.showMessageDialog(jd , "Usuario registrado correctamente!");
                jd.setVisible(false);
                jf.setVisible(true);
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
