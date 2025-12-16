import java.util.List; // Importa List para manejar listas de clases agrupadas

public class HandsOn5 { // Clase principal para calcular medidas de tendencia central agrupadas

    public static void main(String[] args) { // Metodo main, punto de entrada del programa

        double[] datos = DatosFrecuencia.DATOS; // Obtiene los datos crudos desde DatosFrecuencia
        int numClases = 5; // Numero de clases (intervalos) para agrupar los datos

        List<ClaseAgrupada> clases =
                TablaFrecuenciaAgrupada.construirTabla(datos, numClases); // Construye la tabla agrupada

        int totalDatos = datos.length; // Total de datos originales

        double media = MedidasTendenciaCentral.mediaAgrupada(clases, totalDatos);   // Calcula la media agrupada
        double mediana = MedidasTendenciaCentral.medianaAgrupada(clases, totalDatos); // Calcula la mediana agrupada
        double moda = MedidasTendenciaCentral.modaAgrupada(clases); // Calcula la moda agrupada

        System.out.println("MEDIDAS DE TENDENCIA CENTRAL (DATOS AGRUPADOS):"); // Imprime titulo
        System.out.println("Media   = " + media);   // Imprime media
        System.out.println("Mediana = " + mediana); // Imprime mediana
        System.out.println("Moda    = " + moda);    // Imprime moda
    }
}
