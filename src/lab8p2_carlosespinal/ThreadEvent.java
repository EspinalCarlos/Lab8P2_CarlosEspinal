
package lab8p2_carlosespinal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class ThreadEvent extends Thread{
    private JProgressBar jpb;
    private JDialog jd;
    private JDialog jd2;
    private int seconds;
    private boolean Alive;

    public ThreadEvent() {
    }

    public ThreadEvent(JProgressBar jpb, JDialog jd, JDialog jd2) {
        this.jpb = jpb;
        this.jd = jd;
        this.jd2 = jd2;
    }

    public JProgressBar getJpb() {
        return jpb;
    }

    public void setJpb(JProgressBar jpb) {
        this.jpb = jpb;
    }

    public JDialog getJd() {
        return jd;
    }

    public void setJd(JDialog jd) {
        this.jd = jd;
    }
    
    @Override
    public void run(){
        int val = jpb.getMinimum();
        while(val < jpb.getMaximum()){
            val++;
            jpb.setValue(val);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadEvent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jd.setVisible(false);
        JOptionPane.showMessageDialog(jd, "Se ha creado el evento correctamente!");
        jd2.setVisible(true);
        
    }
    
    
}
