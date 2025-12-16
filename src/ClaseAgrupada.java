public class ClaseAgrupada { // Clase que representa una clase estadistica (intervalo)

    private final double limiteInferior; // Limite inferior del intervalo
    private final double limiteSuperior; // Limite superior del intervalo
    private final double marcaClase;     // Punto medio del intervalo

    private int frecuencia;              // Frecuencia absoluta
    private int frecuenciaAcumulada;     // Frecuencia acumulada

    private double frelativa;             // Frecuencia relativa
    private double frelativaAcumulada;    // Frecuencia relativa acumulada

    private double porcentaje;            // Frecuencia en porcentaje
    private double porcentajeAcumulado;   // Porcentaje acumulado

    public ClaseAgrupada(double limiteInferior, double limiteSuperior) { // Constructor
        this.limiteInferior = limiteInferior;   // Asigna limite inferior
        this.limiteSuperior = limiteSuperior;   // Asigna limite superior
        this.marcaClase = (limiteInferior + limiteSuperior) / 2.0; // Calcula marca de clase
    }

    public void setFrecuencia(int frecuencia) { // Asigna frecuencia absoluta
        this.frecuencia = frecuencia;
    }

    public void setFrecuenciaAcumulada(int frecuenciaAcumulada) { // Asigna frecuencia acumulada
        this.frecuenciaAcumulada = frecuenciaAcumulada;
    }

    public void setFrelativa(double frelativa) { // Asigna frecuencia relativa
        this.frelativa = frelativa;
    }

    public void setFrelativaAcumulada(double frelativaAcumulada) { // Asigna frecuencia relativa acumulada
        this.frelativaAcumulada = frelativaAcumulada;
    }

    public void setPorcentaje(double porcentaje) { // Asigna porcentaje
        this.porcentaje = porcentaje;
    }

    public void setPorcentajeAcumulado(double porcentajeAcumulado) { // Asigna porcentaje acumulado
        this.porcentajeAcumulado = porcentajeAcumulado;
    }

    public double getLimiteInferior() { // Devuelve limite inferior
        return limiteInferior;
    }

    public double getLimiteSuperior() { // Devuelve limite superior
        return limiteSuperior;
    }

    public double getMarcaClase() { // Devuelve marca de clase
        return marcaClase;
    }

    public int getFrecuencia() { // Devuelve frecuencia absoluta
        return frecuencia;
    }

    public int getFrecuenciaAcumulada() { // Devuelve frecuencia acumulada
        return frecuenciaAcumulada;
    }

    public double getFrelativa() { // Devuelve frecuencia relativa
        return frelativa;
    }

    public double getFrelativaAcumulada() { // Devuelve frecuencia relativa acumulada
        return frelativaAcumulada;
    }

    public double getPorcentaje() { // Devuelve porcentaje
        return porcentaje;
    }

    public double getPorcentajeAcumulado() { // Devuelve porcentaje acumulado
        return porcentajeAcumulado;
    }
}
