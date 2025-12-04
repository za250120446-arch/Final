public class HandsOn2 {

    public static void main(String[] args) {

        double[] x = Datos.X;
        double[] y = Datos.Y;

        // Mostrar los datos
        System.out.println("Datos del conjunto (X, Y):");
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i] + " , y[" + i + "] = " + y[i]);
        }

        // Mostrar sumatorias (para que se vea la parte "discretas")
        double sumX = MatematicasDiscretas.suma(x);
        double sumY = MatematicasDiscretas.suma(y);
        double sumXY = MatematicasDiscretas.sumaProducto(x, y);
        double sumX2 = MatematicasDiscretas.sumaCuadrados(x);

        System.out.println();
        System.out.println("Sumatorias:");
        System.out.println("Σx   = " + sumX);
        System.out.println("Σy   = " + sumY);
        System.out.println("Σxy  = " + sumXY);
        System.out.println("Σx^2 = " + sumX2);

        // Crear el modelo de regresion lineal
        RegresionLineal modelo = new RegresionLineal(x, y);

        System.out.println();
        System.out.println("Modelo de regresion lineal simple:");
        System.out.println("b0 (intercepto) = " + modelo.getB0());
        System.out.println("b1 (pendiente)  = " + modelo.getB1());
        System.out.println("Ecuacion: y = " + modelo.getB0() + " + " + modelo.getB1() + " * x");

        // Predicciones de ejemplo
        System.out.println();
        System.out.println("Predicciones:");
        double[] nuevosX = {20, 25, 30, 35, 40};
        for (double valorX : nuevosX) {
            double yPred = modelo.predecir(valorX);
            System.out.println("x = " + valorX + " -> y^ = " + yPred);
        }
    }
}
