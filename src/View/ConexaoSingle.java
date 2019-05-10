package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 * 
 *
 * @author Ricardo_pc
 */
public class ConexaoSingle {
  



    private static ConexaoSingle myConn ;
    private static Connection conn ;
    
    private ConexaoSingle getconnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/ricardo", "root", "");
         } catch (SQLException ex) {
            
               JOptionPane.showMessageDialog(null, "Erro de Conexão/nERRO:"+ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexaoSingle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static synchronized ConexaoSingle getInstance() throws SQLException{
        if (myConn == null){
            myConn = new ConexaoSingle();
        }
        return myConn;
    }
    public static Connection getConnection() throws SQLException{
        return conn;
    }
}



            
            
            
            
            
            
            

