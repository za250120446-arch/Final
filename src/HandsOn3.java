import java.util.List;

public class HandsOn3 {

    public static void main(String[] args) {

        double[] datos = DatosFrecuencia.DATOS;

        System.out.println("DATOS PARA TABLA DE FRECUENCIA SIMPLE:");
        for (double d : datos) {
            System.out.print(d + " ");
        }
        System.out.println("\n");

        List<ClaseFrecuencia> tabla = TablaFrecuenciaSimple.construirTabla(datos);
        TablaFrecuenciaSimple.imprimirTabla(tabla);
    }
}
