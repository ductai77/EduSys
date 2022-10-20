
package com.edusys.utils;



import java.sql.*;

public class jDBChelper {
    static String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String url="jdbc:sqlserver://localhost;database=Polypro";
    static String user="sa";
    static String pass="151103";
    static{
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
   public static PreparedStatement getStmt(String sql, Object...args) throws SQLException{
       Connection conn=DriverManager.getConnection(url,user,pass);
       PreparedStatement stmt;
       if(sql.trim().startsWith("{")){
           stmt = conn.prepareCall(sql);
       }else{
           stmt = conn.prepareStatement(sql);
       }
       for(int i=0;i<args.length;i++){
           stmt.setObject(i+1, args[i]);
       }
       return stmt;
   }
   public static void update(String sql,Object...args) {
        try {
            PreparedStatement stmt=getStmt(sql, args);
            try {
                stmt.executeUpdate();
            } 
            finally{
                stmt.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
       
   
}
   public static ResultSet query(String sql,Object...args) {
       try {
            PreparedStatement stmt = getStmt(sql, args);
            return stmt.executeQuery();
       } catch (Exception e) {
            throw new RuntimeException(e);
       }
      
   }
   public static Object value(String sql,Object...args){
       try {
           ResultSet rs = query(sql,args);
           if(rs.next()){
               return rs.getObject(0);
           }
           rs.getStatement().getConnection().close();
       } catch (Exception e) {
           throw new RuntimeException(e);
       }
       return null;
   }
    
}
