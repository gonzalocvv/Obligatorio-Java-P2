// Gonzalo Cabrera, 310651
package Dominio;


public class Experiencia {
    private Tema tema;
    private int nivel;
    
    public Experiencia (Tema unTema, int unNivel){
        this.tema = unTema;
        this.nivel = unNivel;
    }
    
    public Tema getTema(){
        return tema;
    }
    public int getNivel(){
        return nivel;
    }
    @Override
    public String toString() {
        return tema.getNombre() + " (" + nivel + ")";
    }
}
