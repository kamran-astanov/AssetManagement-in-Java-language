/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kastanov
 */
public class DBConnection {
    
    public static Connection DBcon() throws SQLException{
    String url = "jdbc:mysql://localhost:3306/assetmanagement";
    String username = "root";
    String password = "12345";
    Connection c = DriverManager.getConnection(url,username ,password );
    return c;
}
} 
