
package lab8p2_carlosespinal;

import java.util.ArrayList;


public class Artista {
    protected String Username;
    protected String Password;
    protected String Name;
    protected String GeneroMusical;
    protected ArrayList<Cancion> listaCanciones = new ArrayList();

    public Artista() {
    }
    
    public Artista(String Username, String Password, String Name, String GeneroMusical) {
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.GeneroMusical = GeneroMusical;
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
        return "Artista{" + "Username=" + Username + ", Password=" + Password + ", Name=" + Name + ", GeneroMusical=" + GeneroMusical + ", listaCanciones=" + listaCanciones + '}';
    }
    
    
    
    
    
    
    
}
