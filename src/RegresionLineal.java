public class RegresionLineal {

    private final double b0; // intercepto
    private final double b1; // pendiente

    public RegresionLineal(double[] x, double[] y) {
        if (x == null || y == null) {
            throw new IllegalArgumentException("Los arreglos no pueden ser nulos");
        }
        if (x.length != y.length) {
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud");
        }
        if (x.length == 0) {
            throw new IllegalArgumentException("Los arreglos deben tener al menos un elemento");
        }

        int n = x.length;

        double sumX = MatematicasDiscretas.suma(x);
        double sumY = MatematicasDiscretas.suma(y);
        double sumXY = MatematicasDiscretas.sumaProducto(x, y);
        double sumX2 = MatematicasDiscretas.sumaCuadrados(x);

        double numerator = n * sumXY - sumX * sumY;
        double denominator = n * sumX2 - sumX * sumX;

        this.b1 = numerator / denominator;
        this.b0 = (sumY - this.b1 * sumX) / n;
    }

    public double predecir(double x) {
        return b0 + b1 * x;
    }

    public double getB0() {
        return b0;
    }

    public double getB1() {
        return b1;
    }
}
