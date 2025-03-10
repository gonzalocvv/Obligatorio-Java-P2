// Gonzalo Cabrera, 310651
package Dominio;


public class Tema {
    private String nombre;
    private String descripcion;
    
    public Tema (String unNombre, String unaDescripcion){
        this.nombre = unNombre;
        this.descripcion = unaDescripcion;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
}
