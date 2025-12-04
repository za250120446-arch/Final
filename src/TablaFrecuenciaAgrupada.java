import java.util.ArrayList;
import java.util.List;

public class TablaFrecuenciaAgrupada {

    public static List<ClaseAgrupada> construirTabla(double[] datos, int numClases) {
        double min = datos[0];
        double max = datos[0];

        for (double d : datos) {
            if (d < min) min = d;
            if (d > max) max = d;
        }

        double rango = max - min;
        double amplitud = Math.ceil(rango / numClases);

        List<ClaseAgrupada> clases = new ArrayList<>();

        double li = min;
        for (int i = 0; i < numClases; i++) {
            double ls = li + amplitud;
            clases.add(new ClaseAgrupada(li, ls));
            li = ls;
        }

        for (double dato : datos) {
            for (ClaseAgrupada clase : clases) {
                if (dato >= clase.getLimiteInferior() && dato < clase.getLimiteSuperior()) {
                    clase.setFrecuencia(clase.getFrecuencia() + 1);
                    break;
                }
            }
        }

        int total = datos.length;
        int fac = 0;
        double facRel = 0.0;

        for (ClaseAgrupada clase : clases) {
            int f = clase.getFrecuencia();
            fac += f;
            double fr = (double) f / total;
            facRel += fr;
            double porc = fr * 100.0;
            double porcAc = facRel * 100.0;

            clase.setFrecuenciaAcumulada(fac);
            clase.setFrelativa(fr);
            clase.setFrelativaAcumulada(facRel);
            clase.setPorcentaje(porc);
            clase.setPorcentajeAcumulado(porcAc);
        }

        return clases;
    }

    public static void imprimirTabla(List<ClaseAgrupada> clases) {
        System.out.println("TABLA DE FRECUENCIA AGRUPADA");
        System.out.println("Clase\t\tMC\tf\tFa\tfr\t\tFra\t\t%\t\t%ac");

        for (ClaseAgrupada c : clases) {
            System.out.printf("[%.2f - %.2f)\t%.2f\t%d\t%d\t%.4f\t%.4f\t%.2f\t%.2f%n",
                    c.getLimiteInferior(),
                    c.getLimiteSuperior(),
                    c.getMarcaClase(),
                    c.getFrecuencia(),
                    c.getFrecuenciaAcumulada(),
                    c.getFrelativa(),
                    c.getFrelativaAcumulada(),
                    c.getPorcentaje(),
                    c.getPorcentajeAcumulado());
        }
    }
}
