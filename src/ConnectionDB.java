
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Rizz
 */
public class ConnectionDB {
//    private static final String USERNAME="root";
//    private static final String PASSWORD = null;
//    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/Diag_centre";
    private static Connection con = null;

    /**
     *
     */
    public static Connection dbcon(){
  
        try {
            con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/diag_centre","root","");
            //System.out.println("connected!");
            return con;
        }catch(SQLException e){
            System.err.println("e");
            return null;
        }
        
        
        
    }
    
}
