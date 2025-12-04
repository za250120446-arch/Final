public class MatematicasDiscretas {

    // Suma de un arreglo de doubles
    public static double suma(double[] valores) {
        double suma = 0.0;
        for (double v : valores) {
            suma += v;
        }
        return suma;
    }

    // Suma de productos: Σ(x[i] * y[i])
    public static double sumaProducto(double[] x, double[] y) {
        if (x.length != y.length) {
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud");
        }
        double suma = 0.0;
        for (int i = 0; i < x.length; i++) {
            suma += x[i] * y[i];
        }
        return suma;
    }

    // Suma de cuadrados: Σ(x[i]^2)
    public static double sumaCuadrados(double[] valores) {
        double suma = 0.0;
        for (double v : valores) {
            suma += v * v;
        }
        return suma;
    }

    // Media de un arreglo de doubles
    public static double media(double[] valores) {
        if (valores == null || valores.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacio");
        }
        double suma = suma(valores);
        return suma / valores.length;
    }

    // (Opcional, para verse mas "discretas")
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El factorial no esta definido para n < 0");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static long combinaciones(int n, int k) {
        if (k < 0 || k > n) {
            throw new IllegalArgumentException("k debe estar entre 0 y n");
        }
        if (k > n - k) {
            k = n - k;
        }
        long numerador = 1;
        long denominador = 1;
        for (int i = 1; i <= k; i++) {
            numerador *= (n - (k - i));
            denominador *= i;
        }
        return numerador / denominador;
    }
}
