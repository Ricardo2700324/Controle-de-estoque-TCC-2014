package View;

import java.awt.BorderLayout;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Ricardo_pc
 */
public class ReportUtils {

    public static void openReport(String titulo, InputStream inputStream, Map parametros, Connection conn) throws JRException, SQLException {

        JasperPrint print = JasperFillManager.fillReport("C:\\Users\\Ricardo_pc\\Desktop\\TCC_A\\src\\relatorio\\Relatório_Vendas.jasper", null);
        viewReportFrame(titulo, print);//Cria instancia para impressão.

//   JasperPrint print = JasperFillManager.fillReport(inputStream, parametros, conexao);
//   viewReportFrame(titulo, print);
    }

    private static void viewReportFrame(String titulo, JasperPrint print) {

        JRViewer viewer = new JRViewer(print);
        JFrame frameRelatorio = new JFrame(titulo);
        frameRelatorio.add(viewer, BorderLayout.CENTER);
        frameRelatorio.setSize(500, 500);
        frameRelatorio.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameRelatorio.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameRelatorio.setVisible(true);
    }
}
