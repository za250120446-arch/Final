public class RegresionLineal { // Clase que implementa la regresion lineal simple

    private final double b0; // Intercepto del modelo (cuando x = 0)
    private final double b1; // Pendiente del modelo (cambio de y respecto a x)

    public RegresionLineal(double[] x, double[] y) { // Constructor que recibe los datos X y Y
        if (x == null || y == null) { // Valida que los arreglos no sean nulos
            throw new IllegalArgumentException("Los arreglos no pueden ser nulos");
        }
        if (x.length != y.length) { // Valida que ambos arreglos tengan la misma longitud
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud");
        }
        if (x.length == 0) { // Valida que haya al menos un dato
            throw new IllegalArgumentException("Los arreglos deben tener al menos un elemento");
        }

        int n = x.length; // Numero total de datos

        double sumX = MatematicasDiscretas.suma(x); // Calcula Σx
        double sumY = MatematicasDiscretas.suma(y); // Calcula Σy
        double sumXY = MatematicasDiscretas.sumaProducto(x, y); // Calcula Σ(x*y)
        double sumX2 = MatematicasDiscretas.sumaCuadrados(x); // Calcula Σ(x^2)

        double numerator = n * sumXY - sumX * sumY; // Numerador de la formula de la pendiente
        double denominator = n * sumX2 - sumX * sumX; // Denominador de la formula de la pendiente

        this.b1 = numerator / denominator; // Calcula la pendiente b1
        this.b0 = (sumY - this.b1 * sumX) / n; // Calcula el intercepto b0
    }

    public double predecir(double x) { // Metodo para predecir un valor de y
        return b0 + b1 * x; // Aplica la ecuacion de la recta
    }

    public double getB0() { // Devuelve el intercepto
        return b0;
    }

    public double getB1() { // Devuelve la pendiente
        return b1;
    }
}
