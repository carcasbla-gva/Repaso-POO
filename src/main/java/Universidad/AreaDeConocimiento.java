package Universidad;

import java.util.ArrayList;
import java.util.List;

public class AreaDeConocimiento {
    private String nombre;
    private List<Departamento> departamentos = new ArrayList<>();

    public AreaDeConocimiento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "AreaDeConocimiento{" +
                "nombre='" + nombre + '\'' +
                ", departamentos=" + departamentos +
                '}';
    }
}
