import java.util.List;

public class MedidasTendenciaCentral {

    public static double mediaAgrupada(List<ClaseAgrupada> clases, int totalDatos) {
        double suma = 0.0;
        for (ClaseAgrupada c : clases) {
            suma += c.getMarcaClase() * c.getFrecuencia();
        }
        return suma / totalDatos;
    }

    public static double medianaAgrupada(List<ClaseAgrupada> clases, int totalDatos) {
        double mitad = totalDatos / 2.0;

        ClaseAgrupada claseMediana = null;
        ClaseAgrupada claseAnterior = null;

        for (ClaseAgrupada c : clases) {
            if (c.getFrecuenciaAcumulada() >= mitad) {
                claseMediana = c;
                break;
            }
            claseAnterior = c;
        }

        if (claseMediana == null) {
            return Double.NaN;
        }

        double Lm = claseMediana.getLimiteInferior();
        int Fm = claseMediana.getFrecuencia();
        int Fprev = (claseAnterior == null) ? 0 : claseAnterior.getFrecuenciaAcumulada();
        double h = claseMediana.getLimiteSuperior() - claseMediana.getLimiteInferior();

        return Lm + ((mitad - Fprev) / Fm) * h;
    }

    public static double modaAgrupada(List<ClaseAgrupada> clases) {
        if (clases.isEmpty()) {
            return Double.NaN;
        }

        int indiceModa = 0;
        int fmax = clases.get(0).getFrecuencia();

        for (int i = 1; i < clases.size(); i++) {
            if (clases.get(i).getFrecuencia() > fmax) {
                fmax = clases.get(i).getFrecuencia();
                indiceModa = i;
            }
        }

        ClaseAgrupada cModa = clases.get(indiceModa);
        double Lmod = cModa.getLimiteInferior();
        int fm = cModa.getFrecuencia();
        int fprev = (indiceModa == 0) ? 0 : clases.get(indiceModa - 1).getFrecuencia();
        int fnext = (indiceModa == clases.size() - 1) ? 0 : clases.get(indiceModa + 1).getFrecuencia();
        double h = cModa.getLimiteSuperior() - cModa.getLimiteInferior();

        double d1 = fm - fprev;
        double d2 = fm - fnext;
        if (d1 + d2 == 0) {
            return cModa.getMarcaClase();
        }

        return Lmod + (d1 / (d1 + d2)) * h;
    }
}
