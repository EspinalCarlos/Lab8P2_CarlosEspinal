
package lab8p2_carlosespinal;

import java.util.ArrayList;

public class Bandas extends Artista{
    private int NIntegrantes;

    public Bandas() {
        super();
        
    }

    public Bandas(int NIntegrantes, String Username, String Password, String Name, String GeneroMusical) {
        super(Username, Password, Name, GeneroMusical);
        this.NIntegrantes = NIntegrantes;
    }

    public int getNIntegrantes() {
        return NIntegrantes;
    }

    public void setNIntegrantes(int NIntegrantes) {
        this.NIntegrantes = NIntegrantes;
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
        return super.toString()+"Bandas{" + "NIntegrantes=" + NIntegrantes + '}';
    }
    
    
    
    
    
}
