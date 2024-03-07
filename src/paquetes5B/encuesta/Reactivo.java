package paquetes5B.encuesta;

public class Reactivo {
    private int folio;
    private String pregunta;

    public int getFolio(){
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getPregunta() {
        return pregunta;
    }
    public void setPregunta(String pregunta){
        this.pregunta = pregunta;
    }
}