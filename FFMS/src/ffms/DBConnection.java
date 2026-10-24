/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffms;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sabestean
 */
public class DBConnection {

    static Connection con = null;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public static Connection db()
    {
       try{
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           String conn = "jdbc:sqlserver://localhost:1433; databaseName=Fast Food;user=sabestean;password=admin12345";
           con= DriverManager.getConnection(conn);
           
           JOptionPane.showMessageDialog(null, "Connection Established");
           
           
           
       } catch(HeadlessException | ClassNotFoundException | SQLException e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       return con;  
}}
