/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author synx
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
    private Connection con;
    private String Driver = "com.mysql.cj.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/uts_pbd(p)";
    private String Username = "root";
    private String Password = "basdat2020";
    
    public Connection LogOn(){
        try {
            Class.forName(Driver).newInstance();
            con = DriverManager.getConnection(url, Username, Password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
    public void LogOff(){
        try {
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

