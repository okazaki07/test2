package com.internousdev.login.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.internousdev.dto.LoginDTO;
import com.internousdev.util.DBConnector;

public class LoginDAO {
		public LoginDTO select(String name,String password) throws SQLException{
			LoginDTO dto=new LoginDTO();
			com.internousdev.login.util.DBConnector db = new DBConnector();
			Connection con = db.getConnection();
			String sql="select * from user where user_name=? and password=?";

			try{

			}
		}

}