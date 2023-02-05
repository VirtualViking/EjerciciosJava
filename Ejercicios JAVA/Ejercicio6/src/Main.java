public class Main {
    public static void main(String[] args) {

        AreaRectangulo areaRectangulo = new AreaRectangulo();

        areaRectangulo.altura = 12;
        areaRectangulo.base = 20;

        System.out.println(areaRectangulo.validarDatos());

        System.out.println("El area del rectgangulo es de: " + areaRectangulo.calcularArea() + "cm");

    }

}