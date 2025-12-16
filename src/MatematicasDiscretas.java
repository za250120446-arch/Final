public class MatematicasDiscretas { // Clase con metodos matematicos de apoyo

    // Suma de un arreglo de doubles
    public static double suma(double[] valores) {
        double suma = 0.0; // Inicializa acumulador
        for (double v : valores) { // Recorre todos los valores del arreglo
            suma += v; // Acumula cada valor
        }
        return suma; // Regresa la suma total
    }

    // Suma de productos: Σ(x[i] * y[i])
    public static double sumaProducto(double[] x, double[] y) {
        if (x.length != y.length) { // Verifica que ambos arreglos tengan la misma longitud
            throw new IllegalArgumentException("Los arreglos deben tener la misma longitud");
        }
        double suma = 0.0; // Inicializa acumulador
        for (int i = 0; i < x.length; i++) { // Recorre los arreglos
            suma += x[i] * y[i]; // Multiplica x por y y acumula
        }
        return suma; // Regresa la suma de productos
    }

    // Suma de cuadrados: Σ(x[i]^2)
    public static double sumaCuadrados(double[] valores) {
        double suma = 0.0; // Inicializa acumulador
        for (double v : valores) { // Recorre el arreglo
            suma += v * v; // Eleva al cuadrado y acumula
        }
        return suma; // Regresa la suma de cuadrados
    }

    // Media de un arreglo de doubles
    public static double media(double[] valores) {
        if (valores == null || valores.length == 0) { // Valida que el arreglo no este vacio
            throw new IllegalArgumentException("El arreglo no puede estar vacio");
        }
        double suma = suma(valores); // Calcula la suma de los valores
        return suma / valores.length; // Calcula y regresa la media
    }

    // Calculo del factorial (opcional)
    public static long factorial(int n) {
        if (n < 0) { // Valida que n no sea negativo
            throw new IllegalArgumentException("El factorial no esta definido para n < 0");
        }
        long resultado = 1; // Inicializa el resultado
        for (int i = 2; i <= n; i++) { // Recorre desde 2 hasta n
            resultado *= i; // Multiplica acumulativamente
        }
        return resultado; // Regresa el factorial
    }

    // Calculo de combinaciones C(n, k)
    public static long combinaciones(int n, int k) {
        if (k < 0 || k > n) { // Valida que k sea valido
            throw new IllegalArgumentException("k debe estar entre 0 y n");
        }
        if (k > n - k) { // Optimiza el calculo
            k = n - k;
        }
        long numerador = 1; // Inicializa numerador
        long denominador = 1; // Inicializa denominador
        for (int i = 1; i <= k; i++) { // Recorre hasta k
            numerador *= (n - (k - i)); // Calcula el numerador
            denominador *= i; // Calcula el denominador
        }
        return numerador / denominador; // Regresa el resultado de la combinacion
    }
}
