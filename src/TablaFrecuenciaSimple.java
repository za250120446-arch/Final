import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TablaFrecuenciaSimple {

    public static List<ClaseFrecuencia> construirTabla(double[] datos) {
        Map<Double, Integer> conteo = new LinkedHashMap<>();

        for (double v : datos) {
            conteo.put(v, conteo.getOrDefault(v, 0) + 1);
        }

        int total = datos.length;
        List<ClaseFrecuencia> tabla = new ArrayList<>();

        for (Map.Entry<Double, Integer> entry : conteo.entrySet()) {
            tabla.add(new ClaseFrecuencia(entry.getKey(), entry.getValue(), total));
        }

        return tabla;
    }

    public static void imprimirTabla(List<ClaseFrecuencia> tabla) {
        System.out.println("TABLA DE FRECUENCIA SIMPLE");
        System.out.println("Valor\tf\tfr\t\t%");
        for (ClaseFrecuencia cf : tabla) {
            System.out.printf("%.2f\t%d\t%.4f\t%.2f%n",
                    cf.getValor(),
                    cf.getFrecuencia(),
                    cf.getFrelativa(),
                    cf.getPorcentaje());
        }
    }
}
