import java.util.ArrayList; // Importa ArrayList para crear una lista mutable de clases
import java.util.List; // Importa List para usar la interfaz de lista

public class TablaFrecuenciaAgrupada { // Clase que construye e imprime la tabla de frecuencia agrupada

    public static List<ClaseAgrupada> construirTabla(double[] datos, int numClases) { // Construye la tabla agrupada
        double min = datos[0]; // Inicializa el minimo con el primer dato
        double max = datos[0]; // Inicializa el maximo con el primer dato

        for (double d : datos) { // Recorre todos los datos para encontrar min y max
            if (d < min) min = d; // Actualiza el minimo si encuentra uno menor
            if (d > max) max = d; // Actualiza el maximo si encuentra uno mayor
        }

        double rango = max - min; // Calcula el rango (max - min)
        double amplitud = Math.ceil(rango / numClases); // Calcula la amplitud del intervalo (redondeando hacia arriba)

        List<ClaseAgrupada> clases = new ArrayList<>(); // Crea la lista donde se guardaran las clases (intervalos)

        double li = min; // Limite inferior inicial empieza en el minimo
        for (int i = 0; i < numClases; i++) { // Crea numClases intervalos
            double ls = li + amplitud; // Calcula limite superior sumando la amplitud
            clases.add(new ClaseAgrupada(li, ls)); // Agrega un intervalo a la lista
            li = ls; // El siguiente limite inferior sera el limite superior actual
        }

        for (double dato : datos) { // Recorre cada dato para contarlo en su clase
            for (ClaseAgrupada clase : clases) { // Recorre cada intervalo
                if (dato >= clase.getLimiteInferior() && dato < clase.getLimiteSuperior()) { // Verifica si cae en el intervalo
                    clase.setFrecuencia(clase.getFrecuencia() + 1); // Aumenta la frecuencia en 1
                    break; // Sale del ciclo para no contar el dato en otra clase
                }
            }
        }

        int total = datos.length; // Total de datos
        int fac = 0; // Acumulador de frecuencia acumulada (Fa)
        double facRel = 0.0; // Acumulador de frecuencia relativa acumulada (Fra)

        for (ClaseAgrupada clase : clases) { // Recorre cada clase para calcular acumuladas y porcentajes
            int f = clase.getFrecuencia(); // Obtiene la frecuencia absoluta de la clase
            fac += f; // Actualiza la frecuencia acumulada
            double fr = (double) f / total; // Calcula la frecuencia relativa
            facRel += fr; // Actualiza la frecuencia relativa acumulada
            double porc = fr * 100.0; // Calcula porcentaje
            double porcAc = facRel * 100.0; // Calcula porcentaje acumulado

            clase.setFrecuenciaAcumulada(fac); // Guarda Fa en la clase
            clase.setFrelativa(fr); // Guarda fr en la clase
            clase.setFrelativaAcumulada(facRel); // Guarda Fra en la clase
            clase.setPorcentaje(porc); // Guarda porcentaje en la clase
            clase.setPorcentajeAcumulado(porcAc); // Guarda porcentaje acumulado en la clase
        }

        return clases; // Regresa la lista completa con toda la informacion calculada
    }

    public static void imprimirTabla(List<ClaseAgrupada> clases) { // Imprime la tabla agrupada en consola
        System.out.println("TABLA DE FRECUENCIA AGRUPADA"); // Titulo
        System.out.println("Clase\t\tMC\tf\tFa\tfr\t\tFra\t\t%\t\t%ac"); // Encabezados

        for (ClaseAgrupada c : clases) { // Recorre cada clase para imprimir su fila
            System.out.printf("[%.2f - %.2f)\t%.2f\t%d\t%d\t%.4f\t%.4f\t%.2f\t%.2f%n", // Formato de salida
                    c.getLimiteInferior(), // Imprime limite inferior
                    c.getLimiteSuperior(), // Imprime limite superior
                    c.getMarcaClase(), // Imprime marca de clase
                    c.getFrecuencia(), // Imprime frecuencia
                    c.getFrecuenciaAcumulada(), // Imprime frecuencia acumulada
                    c.getFrelativa(), // Imprime frecuencia relativa
                    c.getFrelativaAcumulada(), // Imprime frecuencia relativa acumulada
                    c.getPorcentaje(), // Imprime porcentaje
                    c.getPorcentajeAcumulado()); // Imprime porcentaje acumulado
        }
    }
}
