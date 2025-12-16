import java.util.ArrayList;      // Importa ArrayList para almacenar la tabla final
import java.util.LinkedHashMap;  // Importa LinkedHashMap para contar valores manteniendo el orden
import java.util.List;           // Importa List para manejar listas
import java.util.Map;            // Importa Map para usar pares clave-valor

public class TablaFrecuenciaSimple { // Clase que construye e imprime la tabla de frecuencia simple

    public static List<ClaseFrecuencia> construirTabla(double[] datos) { // Construye la tabla simple
        Map<Double, Integer> conteo = new LinkedHashMap<>(); // Mapa para contar cada valor sin perder el orden

        for (double v : datos) { // Recorre todos los datos
            conteo.put(v, conteo.getOrDefault(v, 0) + 1); // Incrementa la frecuencia del valor
        }

        int total = datos.length; // Total de datos
        List<ClaseFrecuencia> tabla = new ArrayList<>(); // Lista para guardar la tabla final

        for (Map.Entry<Double, Integer> entry : conteo.entrySet()) { // Recorre el mapa de conteo
            tabla.add(
                    new ClaseFrecuencia(
                            entry.getKey(),    // Valor del dato
                            entry.getValue(),  // Frecuencia absoluta
                            total              // Total de datos (para fr y %)
                    )
            );
        }

        return tabla; // Regresa la tabla de frecuencia simple
    }

    public static void imprimirTabla(List<ClaseFrecuencia> tabla) { // Imprime la tabla en consola
        System.out.println("TABLA DE FRECUENCIA SIMPLE"); // Titulo
        System.out.println("Valor\tf\tfr\t\t%"); // Encabezados

        for (ClaseFrecuencia cf : tabla) { // Recorre cada fila de la tabla
            System.out.printf(
                    "%.2f\t%d\t%.4f\t%.2f%n", // Formato de salida
                    cf.getValor(),       // Valor del dato
                    cf.getFrecuencia(),  // Frecuencia absoluta
                    cf.getFrelativa(),   // Frecuencia relativa
                    cf.getPorcentaje()   // Porcentaje
            );
        }
    }
}
