public class ClaseFrecuencia { // Clase que representa una fila de la tabla de frecuencia simple

    private final double valor;      // Valor del dato
    private final int frecuencia;    // Frecuencia absoluta del valor
    private final double frelativa;  // Frecuencia relativa
    private final double porcentaje; // Frecuencia expresada en porcentaje

    public ClaseFrecuencia(double valor, int frecuencia, int totalDatos) { // Constructor
        this.valor = valor; // Asigna el valor del dato
        this.frecuencia = frecuencia; // Asigna la frecuencia absoluta
        this.frelativa = (double) frecuencia / totalDatos; // Calcula la frecuencia relativa
        this.porcentaje = frelativa * 100.0; // Calcula el porcentaje
    }

    public double getValor() { // Devuelve el valor del dato
        return valor;
    }

    public int getFrecuencia() { // Devuelve la frecuencia absoluta
        return frecuencia;
    }

    public double getFrelativa() { // Devuelve la frecuencia relativa
        return frelativa;
    }

    public double getPorcentaje() { // Devuelve el porcentaje
        return porcentaje;
    }
}
