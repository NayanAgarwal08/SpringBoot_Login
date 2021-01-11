package com.zensar.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class loginRepository {

	
	public boolean checkLogin(String userName,String pass) {
        boolean result=false;
        Connection con=DBUtil.getDbConnection();
        String sql="select * from user_login where id=?";
        try {
        	
            PreparedStatement pst=con.prepareStatement(sql);
             pst.setString(1,userName);
             ResultSet rs=pst.executeQuery();
             while(rs.next()) {
                 String passwordFromDb = rs.getString("pass");
                 if(pass.equals(passwordFromDb)){
                     result=true;
                 }
             }
        }catch(Exception e) {
             e.printStackTrace();
         }
     return result;
    }
}
