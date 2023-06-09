
package lab8p2_carlosespinal;

public class Cancion {
    private String Nombre;
    private int Duracion;

    public Cancion() {
    }

    public Cancion(String Nombre, int Duracion) {
        this.Nombre = Nombre;
        this.Duracion = Duracion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "Nombre=" + Nombre + ", Duracion=" + Duracion + '}';
    }
    
    
}
