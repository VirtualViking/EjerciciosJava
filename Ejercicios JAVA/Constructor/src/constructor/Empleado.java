package constructor;
// Constructor (no retorna valores) (es un metodo) (toda clase default)
// constructor se usa para inicializar algo, asignar algo. "ejecutar codigo en segundo plano"
//instancia crea objeto (se llama al constructor
public class Empleado {
    public int cod;
    public String Nombre;

    public Empleado(int cod, String nombre) {
        this.cod = cod;
        Nombre = nombre;
    }

    public Empleado() {
        System.out.println("Conectandome");
    }

    public Empleado(String nombre) {
        Nombre = nombre;
    }
}
