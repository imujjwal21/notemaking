package com.DAO;

import com.User.Post;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {
    
     private Connection conn;

    public PostDAO(Connection conn) {
        this.conn = conn;
    }
    
    public boolean AddNotes(String ti ,String co ,int uid)
    {
        boolean f = false;
        try{
            String query = "insert into post(title,content,uid) values(?,?,?)";
            
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, ti);
            ps.setString(2, co);
            ps.setInt(3, uid);
            
            ps.executeUpdate();
            
            f = true;
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
        
        return f;
    }
    
    public List<Post> getData(int id)
    {
        List<Post> list = new ArrayList<Post>();   //List<Post> list = new ArrayList<>();  also correct
        
        Post po = null;
        try
        {
            String query = "select * from post where uid=?  order by id desc";   // here id desc is post table id .
            
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next())
            {
//                int pid = rst.getInt("pid");
//                String pTitle = rst.getString("pTitle");
//                String pContent = rst.getString("pContent");
//                String pCode = rst.getString("pCode");
//                String pPic = rst.getString("pPic");
//                Timestamp date= rst.getTimestamp("pDate");
//                
//                int userId = rst.getInt("userId");
//                
//                Post post = new Post(pid, pTitle, pContent, pCode, pPic, date, catId, userId);
//                
//                list.add(post);
                
                po = new Post();
                
                po.setId(rs.getInt("id"));
                po.setContent(rs.getString("content"));
                po.setTitle(rs.getString("title"));
                po.setPdate(rs.getTimestamp("date"));
                po.setUserid(rs.getInt("uid"));
                
                list.add(po);
            }
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
        
        return list;
    }
    
    
    public Post getDataById(int id)
    {
        Post p=null;
        
        try{
            System.out.print(id+"\n");
            String query = "select * from post where id = ?";
            PreparedStatement ps  = this.conn.prepareStatement(query);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
             
            while(rs.next())
            {
                p = new Post();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setContent(rs.getString("content")); 
            }
            
                
        }catch(Exception e)
        {
            System.out.print(e);
        }
        
        return p;
    }
    
    public boolean PostUpdate(int nid,String ti,String co)
    {
        boolean f = false;
        
        try{
            
            String query = "update post set title=? , content=? where id =?";
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setString(1, ti);
            ps.setString(2, co);
            ps.setInt(3, nid);
            
            ps.executeUpdate();
            
            f=true;
               
        }catch(Exception e)
        {
            System.out.print(e);
        }
        
        return f;
    }
    
    
    
    public boolean DeleteNotes(int nid)
    {
        boolean f = false;
        
        try{
            String query = "delete from post where id=?";
            
            PreparedStatement ps = this.conn.prepareStatement(query);
            ps.setInt(1,nid);
            
            ps.executeUpdate();
            
            f= true;
            
        }catch(Exception e)
        {
            System.out.print(e);
        }
        
        return f;
    }
    
    
}
