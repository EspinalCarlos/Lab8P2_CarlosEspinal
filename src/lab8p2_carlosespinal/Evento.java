
package lab8p2_carlosespinal;

import java.util.ArrayList;
import java.util.Date;


public class Evento {
    private Date fecha;
    private String Ciudad;
    private String Lugar;
    private int CapacidadPersonas;
    private ArrayList<Cancion> setlist = new ArrayList();

    public Evento() {
    }

    public Evento(Date fecha, String Ciudad, String Lugar, int CapacidadPersonas) {
        this.fecha = fecha;
        this.Ciudad = Ciudad;
        this.Lugar = Lugar;
        this.CapacidadPersonas = CapacidadPersonas;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public String getLugar() {
        return Lugar;
    }

    public int getCapacidadPersonas() {
        return CapacidadPersonas;
    }

    public ArrayList<Cancion> getSetlist() {
        return setlist;
    }

    @Override
    public String toString() {
        return "Evento{" + "fecha=" + fecha + ", Ciudad=" + Ciudad + ", Lugar=" + Lugar + ", CapacidadPersonas=" + CapacidadPersonas + ", setlist=" + setlist + '}';
    }
    
    
    
    
    
}
