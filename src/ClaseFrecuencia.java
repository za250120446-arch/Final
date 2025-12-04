public class ClaseFrecuencia {

    private final double valor;
    private final int frecuencia;
    private final double frelativa;
    private final double porcentaje;

    public ClaseFrecuencia(double valor, int frecuencia, int totalDatos) {
        this.valor = valor;
        this.frecuencia = frecuencia;
        this.frelativa = (double) frecuencia / totalDatos;
        this.porcentaje = frelativa * 100.0;
    }

    public double getValor() {
        return valor;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public double getFrelativa() {
        return frelativa;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}
