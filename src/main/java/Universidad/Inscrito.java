package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Inscrito {
    private String fecha;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Catedra> catedras = new ArrayList<>();

    public Inscrito(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Catedra> getCatedras() {
        return catedras;
    }

    public void setCatedras(List<Catedra> catedras) {
        this.catedras = catedras;
    }

    @Override
    public String toString() {
        return "Inscrito{" +
                "fecha='" + fecha + '\'' +
                ", profesores=" + profesores +
                ", catedras=" + catedras +
                '}';
    }
}
