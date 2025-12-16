import java.util.List; // Importa List para manejar listas de clases agrupadas

public class MedidasTendenciaCentral { // Clase para calcular media, mediana y moda agrupadas

    public static double mediaAgrupada(List<ClaseAgrupada> clases, int totalDatos) { // Calcula la media agrupada
        double suma = 0.0; // Inicializa acumulador
        for (ClaseAgrupada c : clases) { // Recorre cada clase estadistica
            suma += c.getMarcaClase() * c.getFrecuencia(); // Marca de clase por su frecuencia
        }
        return suma / totalDatos; // Divide entre el total de datos
    }

    public static double medianaAgrupada(List<ClaseAgrupada> clases, int totalDatos) { // Calcula la mediana agrupada
        double mitad = totalDatos / 2.0; // Posicion de la mediana

        ClaseAgrupada claseMediana = null; // Guardara la clase donde cae la mediana
        ClaseAgrupada claseAnterior = null; // Guarda la clase anterior

        for (ClaseAgrupada c : clases) { // Recorre las clases
            if (c.getFrecuenciaAcumulada() >= mitad) { // Encuentra donde se alcanza la mitad
                claseMediana = c; // Asigna la clase mediana
                break; // Sale del ciclo
            }
            claseAnterior = c; // Guarda la clase previa
        }

        if (claseMediana == null) { // Si no se encontro la mediana
            return Double.NaN; // Regresa valor invalido
        }

        double Lm = claseMediana.getLimiteInferior(); // Limite inferior de la clase mediana
        int Fm = claseMediana.getFrecuencia(); // Frecuencia de la clase mediana
        int Fprev = (claseAnterior == null) ? 0 : claseAnterior.getFrecuenciaAcumulada(); // Frecuencia acumulada anterior
        double h = claseMediana.getLimiteSuperior() - claseMediana.getLimiteInferior(); // Amplitud del intervalo

        return Lm + ((mitad - Fprev) / Fm) * h; // Formula de la mediana agrupada
    }

    public static double modaAgrupada(List<ClaseAgrupada> clases) { // Calcula la moda agrupada
        if (clases.isEmpty()) { // Verifica que haya datos
            return Double.NaN; // Regresa valor invalido
        }

        int indiceModa = 0; // Indice de la clase modal
        int fmax = clases.get(0).getFrecuencia(); // Frecuencia maxima inicial

        for (int i = 1; i < clases.size(); i++) { // Recorre las clases
            if (clases.get(i).getFrecuencia() > fmax) { // Busca la mayor frecuencia
                fmax = clases.get(i).getFrecuencia(); // Actualiza frecuencia maxima
                indiceModa = i; // Guarda el indice de la clase modal
            }
        }

        ClaseAgrupada cModa = clases.get(indiceModa); // Obtiene la clase modal
        double Lmod = cModa.getLimiteInferior(); // Limite inferior de la clase modal
        int fm = cModa.getFrecuencia(); // Frecuencia de la clase modal
        int fprev = (indiceModa == 0) ? 0 : clases.get(indiceModa - 1).getFrecuencia(); // Frecuencia anterior
        int fnext = (indiceModa == clases.size() - 1) ? 0 : clases.get(indiceModa + 1).getFrecuencia(); // Frecuencia siguiente
        double h = cModa.getLimiteSuperior() - cModa.getLimiteInferior(); // Amplitud del intervalo

        double d1 = fm - fprev; // Diferencia con la clase anterior
        double d2 = fm - fnext; // Diferencia con la clase siguiente
        if (d1 + d2 == 0) { // Evita division entre cero
            return cModa.getMarcaClase(); // Regresa la marca de clase
        }

        return Lmod + (d1 / (d1 + d2)) * h; // Formula de la moda agrupada
    }
}
