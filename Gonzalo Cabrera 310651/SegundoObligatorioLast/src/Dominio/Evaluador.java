// Gonzalo Cabrera, 310651
package Dominio;


public class Evaluador {
    private String nombre;
    private String cedula;
    private String direccion;
    private String anIngreso;
    
    public Evaluador (String unNombre, String unaCedula, String unaDireccion, String unAno){
        this.nombre = unNombre;
        this.cedula = unaCedula;
        this.direccion = unaDireccion;
        this.anIngreso = unAno;
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
    public String getAnIngreso(){
        return anIngreso;
    }
}
