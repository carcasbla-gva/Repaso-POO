package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Inscrito {
    private String fecha;
    private Profesor profesor;
    private Catedra catedra;

    public Inscrito(String fecha, Profesor profesor, Catedra catedra) {
        this.fecha = fecha;
        this.profesor = profesor;
        this.catedra = catedra;
        profesor.getCatedras().add(catedra);
        catedra.getProfesores().add(profesor);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Catedra getCatedra() {
        return catedra;
    }

    public void setCatedra(Catedra catedra) {
        this.catedra = catedra;
    }

    @Override
    public String toString() {
        return "Inscrito{" +
                "fecha='" + fecha + '\'' +
                ", profesor=" + profesor +
                ", catedra=" + catedra +
                '}';
    }
}
