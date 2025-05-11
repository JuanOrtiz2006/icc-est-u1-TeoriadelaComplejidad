import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.Map;

public class GraficaOrdenamientos extends JFrame {

    public GraficaOrdenamientos(DefaultCategoryDataset dataset) {
        super("Comparación de Algoritmos de Ordenamiento");

        JFreeChart chart = ChartFactory.createLineChart(
                "Comparación de Tiempos",
                "Tamaño del Arreglo",
                "Tiempo (segundos)",
                dataset,
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel panel = new ChartPanel(chart);
        setContentPane(panel);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void generar(Map<String, Map<Integer, Double>> resultados) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (String metodo : resultados.keySet()) {
            Map<Integer, Double> datos = resultados.get(metodo);
            for (Map.Entry<Integer, Double> entrada : datos.entrySet()) {
                dataset.addValue(entrada.getValue(), metodo, String.valueOf(entrada.getKey()));
            }
        }

        SwingUtilities.invokeLater(() -> {
            GraficaOrdenamientos grafica = new GraficaOrdenamientos(dataset);
            grafica.setVisible(true);
        });
    }
}
