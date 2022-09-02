/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseLayer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author sange
 */
public class DBConnection {
     public Connection getDBConnection() {
        String url;
         url = "jdbc:sqlserver://localhost:1433;databaseName=celsm;user=eranda;password=3227";
        //Create empty Connection 
        Connection con = null;
        // create live conneciton - for that we need to check
        // errors "Try- catch"
        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;// return connection
    }
    
}
