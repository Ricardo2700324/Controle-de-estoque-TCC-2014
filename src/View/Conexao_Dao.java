package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao_Dao {
 
    public static Connection getConnection() throws SQLException{

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/ricardo", "root", "");

        } catch (ClassNotFoundException ex) {
            throw new SQLException(ex.getMessage());

        }
    }
}



            
            
            
            
            
            
            