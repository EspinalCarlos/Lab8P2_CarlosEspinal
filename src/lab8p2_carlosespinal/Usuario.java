
package lab8p2_carlosespinal;

import java.util.ArrayList;


public class Usuario {
    private String Username;
    private String Password;
    private String Name;
    private int Age;
    private ArrayList<Artista> ArtistList = new ArrayList();

    public Usuario() {
    }

    
    
    public Usuario(String Username, String Password, String Name, int Age) {
        this.Username = Username;
        this.Password = Password;
        this.Name = Name;
        this.Age = Age;
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

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public ArrayList<Artista> getArtistList() {
        return ArtistList;
    }

    public void setArtistList(ArrayList<Artista> ArtistList) {
        this.ArtistList = ArtistList;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Username=" + Username + ", Password=" + Password + ", Name=" + Name + ", Age=" + Age + ", ArtistList=" + ArtistList + '}';
    }
    
    
    
    
}
