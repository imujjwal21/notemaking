package com.DAO;
import com.User.UserDetails;
import java.sql.*;

public class UserDAO {
    
    private Connection conn;
    
   

    public UserDAO(Connection conn) {
        this.conn = conn;
    }
    
    public boolean addUser(UserDetails us)
    {
        boolean f = false;
        
        try{
            String query = "insert into user(name,email,password) values(?,?,?)";
            
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, us.getName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getPassword());
            
            ps.executeUpdate();
            
            f = true;
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
    
        return f;
    }
    
    
    public UserDetails loginUser(String email, String password)
    {
      
        UserDetails us = null;
                
        try{
            
            String query = "select * from user where email=? and password=?";
            
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1,email);
            ps.setString(2,password);
             
            ResultSet rs = ps.executeQuery();
         
            while(rs.next())
            {
                us = new UserDetails();
                
                String name = rs.getString("name"); //database se nikala  ( also like this  rs.getString(2); )
                us.setName(name);            //set to user obj
                
                us.setId(rs.getInt("id"));
                us.setEmail(rs.getString("email"));
                us.setPassword(rs.getString("password"));
            }
            
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
        
        return us;
    }
    
    
    
}
