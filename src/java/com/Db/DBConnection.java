/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Db;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class DBConnection {
    private static Connection conn;
    
    public static Connection getConn()
    {
         try{
          if(conn==null)
           {
           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/enotes","root",null);
           }    
           } catch(Exception e)
           {
                System.out.print(e);
           }
       return conn;
        
    }
}
