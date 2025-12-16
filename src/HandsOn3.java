import java.util.List; // Importa List para manejar listas de frecuencias

public class HandsOn3 { // Clase principal para ejecutar la tabla de frecuencia simple

    public static void main(String[] args) { // Metodo main, punto de entrada del programa

        double[] datos = DatosFrecuencia.DATOS; // Obtiene los datos crudos desde DatosFrecuencia

        System.out.println("DATOS PARA TABLA DE FRECUENCIA SIMPLE:"); // Imprime titulo
        for (double d : datos) { // Recorre todos los datos
            System.out.print(d + " "); // Imprime cada dato
        }
        System.out.println("\n"); // Salto de linea

        List<ClaseFrecuencia> tabla =
                TablaFrecuenciaSimple.construirTabla(datos); // Construye la tabla de frecuencia simple

        TablaFrecuenciaSimple.imprimirTabla(tabla); // Imprime la tabla de frecuencia simple
    }
}
