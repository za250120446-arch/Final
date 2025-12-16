public class HandsOn2 { // Clase principal para ejecutar la regresion lineal simple

    public static void main(String[] args) { // Metodo main, punto de entrada del programa

        double[] x = Datos.X; // Arreglo de valores independientes (X)
        double[] y = Datos.Y; // Arreglo de valores dependientes (Y)

        // Mostrar los datos originales
        System.out.println("Datos del conjunto (X, Y):");
        for (int i = 0; i < x.length; i++) { // Recorre los arreglos X y Y
            System.out.println("x[" + i + "] = " + x[i] + " , y[" + i + "] = " + y[i]); // Imprime cada par (X, Y)
        }

        // Calculo de sumatorias usando matematicas discretas
        double sumX = MatematicasDiscretas.suma(x); // Calcula la suma de X
        double sumY = MatematicasDiscretas.suma(y); // Calcula la suma de Y
        double sumXY = MatematicasDiscretas.sumaProducto(x, y); // Calcula la suma de X*Y
        double sumX2 = MatematicasDiscretas.sumaCuadrados(x); // Calcula la suma de X al cuadrado

        System.out.println();
        System.out.println("Sumatorias:");
        System.out.println("Σx   = " + sumX);   // Imprime suma de X
        System.out.println("Σy   = " + sumY);   // Imprime suma de Y
        System.out.println("Σxy  = " + sumXY);  // Imprime suma de X*Y
        System.out.println("Σx^2 = " + sumX2);  // Imprime suma de X^2

        // Crear el modelo de regresion lineal
        RegresionLineal modelo = new RegresionLineal(x, y); // Inicializa el modelo con los datos

        System.out.println();
        System.out.println("Modelo de regresion lineal simple:");
        System.out.println("b0 (intercepto) = " + modelo.getB0()); // Muestra el intercepto
        System.out.println("b1 (pendiente)  = " + modelo.getB1()); // Muestra la pendiente
        System.out.println("Ecuacion: y = " + modelo.getB0() + " + " + modelo.getB1() + " * x"); // Ecuacion del modelo

        // Predicciones usando el modelo
        System.out.println();
        System.out.println("Predicciones:");
        double[] nuevosX = {20, 25, 30, 35, 40}; // Nuevos valores de X
        for (double valorX : nuevosX) { // Recorre los nuevos valores
            double yPred = modelo.predecir(valorX); // Calcula la prediccion
            System.out.println("x = " + valorX + " -> y^ = " + yPred); // Imprime la prediccion
        }
    }
}
