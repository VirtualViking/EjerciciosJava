public class AreaRectangulo {

    public int base;
    public int altura;

    public String validarDatos(){

        return "La base es de: " + base +"cm"+ " La altura es de: " + altura + "cm";
    }

    public int calcularArea(){

        return base * altura;

    }

}