 public class Ejercicio19 {
        public int numeroCopias;
        public int precioTotal;

        public int verificarCopias(){
            if(numeroCopias<500){
                return precioTotal =numeroCopias*120;
            }else if(numeroCopias<750){
                return precioTotal=numeroCopias*100;
            }else if(numeroCopias<1000){
                return precioTotal =numeroCopias*80;
            }else{
                return precioTotal=numeroCopias*50;
            }
        }

        public String valorTotal(){
            if(numeroCopias<500){
                return "El valor por copia es de $120 y el valor total es de $"+precioTotal;
            }else if(numeroCopias<750){
                return "El valor por copia es de $100 y el valor total es de $"+precioTotal;
            }else if(numeroCopias<1000){
                return "El valor por copia es de $80 y el valor total es de $"+precioTotal;
            }else{
                return "El valor por copia es de $50 y el valor total es de $"+precioTotal;
            }
        }
    }
