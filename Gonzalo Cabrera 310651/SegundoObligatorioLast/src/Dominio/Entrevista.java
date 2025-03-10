// Gonzalo Cabrera, 310651
package Dominio;

public class Entrevista {
    private Postulante postulante;
    private Evaluador evaluador;
    private int puntaje;
    private String comentarios;
    private int numRegistro;
    
    public Entrevista (Postulante unPostulante, Evaluador unEvaluador, int unPuntaje, String unComment, int numRegistrado){
        this.postulante = unPostulante;
        this.evaluador = unEvaluador;
        this.puntaje = unPuntaje;
        this.comentarios = unComment;
        this.numRegistro = numRegistrado;
    }
    
    public Postulante getPostulante(){
        return postulante;        
    }
    public Evaluador getEvaluador(){
        return evaluador;
    }
    public int getPuntaje(){
        return puntaje;
    }
    public String getComentarios(){
        return comentarios;
    }
    public int getNumRegistro(){
        return numRegistro;
    }
}
