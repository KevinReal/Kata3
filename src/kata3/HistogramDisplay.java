package Kata3;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

import java.awt.*;

public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("Histograma de prueba");
        setContentPane(createPanel());
        pack();
    }

    public void execute() {
        setVisible(true);
    }

    public ChartPanel createPanel() {
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500, 400));
        return chartPanel;
    }

    public JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart(
                "JFreeChart Histogram",
                "Dominios Email",
                "Nº Emails",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                true,
                false);
        return chart;
    }

    private DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(25, "", "@gmail.com");
        dataSet.addValue(7, "", "@yahoo.com");
        dataSet.addValue(14, "", "@hotmail.com");
        return dataSet;
    }

}
