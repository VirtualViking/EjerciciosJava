

public class Empleado {
    public String name;
    public int workTime;

    public Empleado(String name, int workTime) {
        this.name = name;
        this.workTime = workTime;
    }
    public void saludar(){
        System.out.println("Hola soy " + this.name + " y he trabajado " + this.workTime );
    }
}
