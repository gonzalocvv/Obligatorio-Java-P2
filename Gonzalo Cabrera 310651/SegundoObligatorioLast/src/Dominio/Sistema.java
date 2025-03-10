// Gonzalo Cabrera, 310651
package Dominio;
import java.util.*;

public class Sistema {
    private static Sistema instancia = null;
    
    private ArrayList<Postulante> postulantes;
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<Puesto> puestos;
    private ArrayList<Tema> temas;
    private ArrayList<Entrevista> entrevistas;
    private ArrayList<String> cedulas;
    
    public Sistema (){
        postulantes = new ArrayList<>();
        evaluadores = new ArrayList<>();
        puestos = new ArrayList<>();
        temas = new ArrayList<>();
        entrevistas = new ArrayList<>();
        cedulas = new ArrayList<>();
    }
    
    public ArrayList<Postulante> getListaPostulantes(){
        return postulantes;
    }
    public ArrayList<Evaluador> getListaEvaluadores(){
        return evaluadores;
    }
    public ArrayList<Puesto> getListaPuestos(){
        return puestos;
    }
    public ArrayList<Tema> getListaTemas(){
        return temas;
    }
    public ArrayList<Entrevista> getListaEntrevistas(){
        return entrevistas;
    }
    public ArrayList<String> getListaCedulas(){
        return cedulas;
    }
    
    public static Sistema getInstance() {
        if (instancia == null) {
            instancia = new Sistema();
        }
        return instancia;
    }
    
    public boolean cedulaExistente (String unaCedula){
        boolean existe = false;
        for (int i = 0; i < cedulas.size(); i++) {
            if (cedulas.get(i).equals(unaCedula)){
                existe = true;
                break;
            }
        }
        return existe;
    }
    public boolean nombreTemaExiste(String elNombre){
        boolean existe = false;
        String nombre = elNombre.toLowerCase();
        for (int i = 0; i < temas.size(); i++) {
            if (temas.get(i).getNombre().toLowerCase().equals(nombre)) {
                existe = true;
                break;
            }
        }
        return existe;
    }
    public boolean nombrePuestoExiste(String elNombre){
        boolean existe = false;
        for (int i = 0; i < puestos.size(); i++) {
            if (elNombre.equals(puestos.get(i).getNombre())) {
                existe = true;
                break;
            }
        }
        return existe;
    }
}
