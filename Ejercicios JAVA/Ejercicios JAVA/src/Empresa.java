public class Empresa {
    public Empresa() {


    }
    public void calcularPago(Empleado empleado){
        int totalaPagar;
        if (empleado.workTime <= 10){
            totalaPagar = 30000;
        }else{
            totalaPagar = 33000;
        }
        System.out.println("Señor" + empleado.name +" el número de horas es " +empleado.workTime +" y su salario equivale a " +totalaPagar);
    }
}
