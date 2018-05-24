package Conexion;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConexionBD {
    Connection CN;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            CN = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bd_transito","root","123");        
            System.out.println("Se hizo la conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return CN;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No Soportada");
    }

    public PreparedStatement prepareStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PreparedStatement prepareStatement(String update) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

