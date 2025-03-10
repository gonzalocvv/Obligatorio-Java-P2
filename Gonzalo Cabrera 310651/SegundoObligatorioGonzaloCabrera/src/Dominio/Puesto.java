// Gonzalo Cabrera, 310651
package Dominio;
import java.util.*;

public class Puesto {
    private String nombre;
    private String tipo;
    private ArrayList<Tema> temas;
    
    public Puesto (String unNombre, String unTipo, ArrayList<Tema> unTema){
        this.nombre = unNombre;
        this.tipo = unTipo;
        this.temas = unTema;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public ArrayList<Tema> getTemas(){
        return temas;
    }
}
