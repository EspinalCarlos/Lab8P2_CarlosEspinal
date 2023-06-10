
package lab8p2_carlosespinal;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class adminBin implements Serializable{
    private ArrayList<ArrayList> arrays = new ArrayList();
    private File archivo = null;
    
    public adminBin(String path,ArrayList<Artista> a, ArrayList<Evento> e, ArrayList<Usuario> u) {
        archivo = new File(path);
        arrays.add(a);
        arrays.add(e);
        arrays.add(u);
    }

    public ArrayList<ArrayList> getArrays() {
        return arrays;
    }

    public void setArrays(ArrayList<ArrayList> arrays) {
        this.arrays = arrays;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (ArrayList t : arrays) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
    
    public void cargarArchivo() {
        try {            
            arrays = new ArrayList();
            ArrayList temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (ArrayList) objeto.readObject()) != null) {
                        arrays.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
    
    
}
