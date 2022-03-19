package Clases;

import JFrames.pantallaPrincipal;
import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica {

    private static Grafica instancia;

    public static Grafica getInstancia() {
        if (instancia == null) {
            instancia = new Grafica();
        }
        return instancia;
    }

    public void graficar(Integer arreglo[], String arregloDos[], int limite, String ejeX, String ejeY, String tituloGrafico) {
        DefaultCategoryDataset datos = new DefaultCategoryDataset();

        for (int i = 0; i < limite; i++) {
            datos.setValue(arreglo[i], arregloDos[i], ejeX);
        }

        JFreeChart grafico = ChartFactory.createBarChart(
                tituloGrafico,
                ejeX,
                ejeY,
                datos,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        ChartPanel panel = new ChartPanel(grafico);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(pantallaPrincipal.getInstancia().panel1.getWidth(), pantallaPrincipal.getInstancia().panel1.getHeight()));
        pantallaPrincipal.getInstancia().panel1.setLayout(new BorderLayout());
        pantallaPrincipal.getInstancia().panel1.add(panel, BorderLayout.NORTH);
        pantallaPrincipal.getInstancia().pack();
        pantallaPrincipal.getInstancia().repaint();
    }
}
