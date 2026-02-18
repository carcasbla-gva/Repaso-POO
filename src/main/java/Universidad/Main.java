package Universidad;

public class Main {
    public static void main(String[] args) {
        AreaDeConocimiento TI = new AreaDeConocimiento("Informatica");
        Departamento it = new Departamento("Departamento de Informatica", TI);
        Facultad i = new Facultad("Facultad de Informatica");
        Catedra h = new Catedra("Informatica", it, i);
        Profesor Jordi = new Profesor("Jordi", it);
        Inscrito a = new Inscrito("20-02-2026", Jordi, h);
    }
}
