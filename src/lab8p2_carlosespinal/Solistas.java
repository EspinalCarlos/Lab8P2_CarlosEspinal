
package lab8p2_carlosespinal;

import java.io.Serializable;
import java.util.ArrayList;


public class Solistas extends Artista implements Serializable{
    private int edad;

    public Solistas() {
        super();
    }

    public Solistas(int edad, String Username, String Password, String Name, String GeneroMusical) {
        super(Username, Password, Name, GeneroMusical);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGeneroMusical() {
        return GeneroMusical;
    }

    public void setGeneroMusical(String GeneroMusical) {
        this.GeneroMusical = GeneroMusical;
    }

    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }

    @Override
    public String toString() {
        return super.toString()+"Solistas{" + "edad=" + edad + '}';
    }
    
    
    
    
    
    
    
    
}
