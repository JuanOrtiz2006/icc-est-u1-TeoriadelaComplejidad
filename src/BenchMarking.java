import java.util.*;

public class BenchMarking {

    private final MetodosOrdenamiento metodosOrdenamiento;
    private final Map<String, Map<Integer, Double>> resultados;

    public BenchMarking() {
        metodosOrdenamiento = new MetodosOrdenamiento();
        resultados = new LinkedHashMap<>();

        int[] tamanos = {5000, 10000, 30000, 50000, 100000};
        int[] arregloMaestro = generarArregloAleatorio(100000);

        for (int tam : tamanos) {
            System.out.println("========== Tamaño: " + tam + " ==========");
            int[] base = Arrays.copyOf(arregloMaestro, tam);

            medir("Burbuja", base.clone(), () -> metodosOrdenamiento.burbujaTradicional(base.clone()));
            medir("Seleccion", base.clone(), () -> metodosOrdenamiento.seleccionPrimero(base.clone()));
            medir("Insercion", base.clone(), () -> metodosOrdenamiento.insercionPrimero(base.clone()));
            medir("Shell", base.clone(), () -> metodosOrdenamiento.shellSort(base.clone()));

            System.out.println();
        }


        GraficaOrdenamientos.generar(resultados);
    }

    private int[] generarArregloAleatorio(int n) {
        int[] arreglo = new int[n];
        for (int i = 0; i < n; i++) {
            arreglo[i] = (int) (Math.random() * 100000);
        }
        return arreglo;
    }

    private void medir(String nombreMetodo, int[] arreglo, Runnable metodo) {
        long inicio = System.nanoTime();
        metodo.run();
        long fin = System.nanoTime();
        double tiempo = (fin - inicio) / 1_000_000_000.0;

        System.out.printf("Tamano: %d, Algoritmo: %s, Tiempo: %.5f segundos%n", arreglo.length, nombreMetodo, tiempo);

        resultados.putIfAbsent(nombreMetodo, new LinkedHashMap<>());
        resultados.get(nombreMetodo).put(arreglo.length, tiempo);
    }
}

