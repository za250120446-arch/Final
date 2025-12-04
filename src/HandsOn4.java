import java.util.List;

public class HandsOn4 {

    public static void main(String[] args) {

        double[] datos = DatosFrecuencia.DATOS;
        int numClases = 5; // puedes cambiarlo si tu profe pide un numero especifico

        System.out.println("DATOS PARA TABLA AGRUPADA:");
        for (double d : datos) {
            System.out.print(d + " ");
        }
        System.out.println("\n");

        List<ClaseAgrupada> clases = TablaFrecuenciaAgrupada.construirTabla(datos, numClases);
        TablaFrecuenciaAgrupada.imprimirTabla(clases);
    }
}
