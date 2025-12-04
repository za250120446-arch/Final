public class ClaseAgrupada {

    private final double limiteInferior;
    private final double limiteSuperior;
    private final double marcaClase;
    private int frecuencia;
    private int frecuenciaAcumulada;
    private double frelativa;
    private double frelativaAcumulada;
    private double porcentaje;
    private double porcentajeAcumulado;

    public ClaseAgrupada(double limiteInferior, double limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.marcaClase = (limiteInferior + limiteSuperior) / 2.0;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void setFrecuenciaAcumulada(int frecuenciaAcumulada) {
        this.frecuenciaAcumulada = frecuenciaAcumulada;
    }

    public void setFrelativa(double frelativa) {
        this.frelativa = frelativa;
    }

    public void setFrelativaAcumulada(double frelativaAcumulada) {
        this.frelativaAcumulada = frelativaAcumulada;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public void setPorcentajeAcumulado(double porcentajeAcumulado) {
        this.porcentajeAcumulado = porcentajeAcumulado;
    }

    public double getLimiteInferior() {
        return limiteInferior;
    }

    public double getLimiteSuperior() {
        return limiteSuperior;
    }

    public double getMarcaClase() {
        return marcaClase;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public int getFrecuenciaAcumulada() {
        return frecuenciaAcumulada;
    }

    public double getFrelativa() {
        return frelativa;
    }

    public double getFrelativaAcumulada() {
        return frelativaAcumulada;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public double getPorcentajeAcumulado() {
        return porcentajeAcumulado;
    }
}
