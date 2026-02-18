package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
    private String nombre;
    private Departamento departamento;
    private Facultad facultad;
    private List<Profesor> profesores = new ArrayList<>();

    public Catedra(String nombre, Departamento departamento, Facultad facultad) {
        this.nombre = nombre;
        this.departamento = departamento;
        departamento.getCatedras().add(this);
        this.facultad = facultad;
        facultad.getCatedras().add(this);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    @Override
    public String toString() {
        return "Catedra{" +
                "nombre='" + nombre + '\'' +
                ", departamento=" + departamento +
                ", facultad=" + facultad +
                '}';
    }
}
