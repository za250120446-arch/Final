import java.util.List;

public class HandsOn5 {

    public static void main(String[] args) {

        double[] datos = DatosFrecuencia.DATOS;
        int numClases = 5;

        List<ClaseAgrupada> clases = TablaFrecuenciaAgrupada.construirTabla(datos, numClases);

        int totalDatos = datos.length;

        double media = MedidasTendenciaCentral.mediaAgrupada(clases, totalDatos);
        double mediana = MedidasTendenciaCentral.medianaAgrupada(clases, totalDatos);
        double moda = MedidasTendenciaCentral.modaAgrupada(clases);

        System.out.println("MEDIDAS DE TENDENCIA CENTRAL (DATOS AGRUPADOS):");
        System.out.println("Media   = " + media);
        System.out.println("Mediana = " + mediana);
        System.out.println("Moda    = " + moda);
    }
}
