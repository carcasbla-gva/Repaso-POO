package Universidad;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private AreaDeConocimiento areaDeConocimiento;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Catedra> catedras = new ArrayList<>();

    public Departamento(String nombre, AreaDeConocimiento areaDeConocimiento) {
        this.nombre = nombre;
        this.areaDeConocimiento = areaDeConocimiento;
        areaDeConocimiento.getDepartamentos().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public AreaDeConocimiento getAreaDeConocimiento() {
        return areaDeConocimiento;
    }

    public void setAreaDeConocimiento(AreaDeConocimiento areaDeConocimiento) {
        this.areaDeConocimiento = areaDeConocimiento;
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
        return "Departamento{" +
                "areaDeConocimiento=" + areaDeConocimiento +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
