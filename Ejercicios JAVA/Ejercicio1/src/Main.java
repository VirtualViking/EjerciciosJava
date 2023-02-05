public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan", "1990", true);
        if (usuario.permitirAcceso("Juan", "1990")){
            System.out.println("Acceso Permitido");
        }else{
            System.out.println("Acceso Denegado");
        }
    }
    }
//metodos=funciones