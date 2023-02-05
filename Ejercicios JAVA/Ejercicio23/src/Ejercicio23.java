
public class Ejercicio23 {
    public byte operadorUsuario;
    public byte minutosInternacionales = (byte)(Math.random()*15);

    public String verificarServicios(){
        if(operadorUsuario == 1){
            return ("Su plan Claro tiene un valor fijo de $45000, el valor por minuto internacional es de $200 y el valor del paquete de datos es $12000");
        }else if(operadorUsuario ==2){
            return ("Su plan Tigo tiene un valor fijo de $30000, el valor por minuto internacional es de $100 y el valor del paquete de datos es $18000");
        }else if(operadorUsuario == 3){
            return ("Su plan Movistar tiene un valor fijo de $40000, el valor por minuto internacional es de $250 y el valor del paquete de datos es $8000");
        }else{
            return "Este no cooresponde a ningun operador.";
        }
    }

    public int total(){
        if(operadorUsuario == 1){
            return 45000+200*minutosInternacionales+12000;
        }else if (operadorUsuario ==2){
            return 30000+100*minutosInternacionales+18000;
        }else if (operadorUsuario == 3){
            return 40000+250*minutosInternacionales+8000;
        }else{
            return 0;
        }
    }
}
