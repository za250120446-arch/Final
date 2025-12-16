import java.util.List; // Importa List para manejar listas de objetos

public class HandsOn4 { // Clase principal que ejecuta la tabla de frecuencia agrupada

    public static void main(String[] args) { // Metodo main, punto de inicio del programa

        double[] datos = DatosFrecuencia.DATOS; // Obtiene los datos desde DatosFrecuencia
        int numClases = 5; // Numero de clases (intervalos) para la tabla agrupada

        System.out.println("DATOS PARA TABLA AGRUPADA:"); // Imprime titulo
        for (double d : datos) { // Recorre el arreglo de datos
            System.out.print(d + " "); // Imprime cada dato
        }
        System.out.println("\n"); // Salto de linea

        List<ClaseAgrupada> clases =
                TablaFrecuenciaAgrupada.construirTabla(datos, numClases); // Construye la tabla agrupada

        TablaFrecuenciaAgrupada.imprimirTabla(clases); // Imprime la tabla agrupada
    }
}
