// Gonzalo Cabrera, 310651
package Dominio;
import java.util.*;

public class Postulante {
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String mail;
    private String linkedin;
    private String formato;
    private ArrayList<Experiencia> experiencias;
    
    public Postulante (String unNombre, String unaCedula, String unaDireccion, String unTelefono, String unMail, String unLinkedin, String unFormato, ArrayList<Experiencia> expe){
        this.nombre = unNombre;
        this.cedula = unaCedula;
        this.direccion = unaDireccion;
        this.telefono = unTelefono;
        this.mail = unMail;
        this.linkedin = unLinkedin;
        this.experiencias = expe;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCedula(){
        return cedula;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getTelefono(){
        return telefono;
    }
    public String getMail(){
        return mail;
    }
    public String getLinkedin(){
        return linkedin;
    }
    public String getFormato(){
        return formato;
    }
    public ArrayList<Experiencia> getExperiencias(){
        return experiencias;
    }
    
}
