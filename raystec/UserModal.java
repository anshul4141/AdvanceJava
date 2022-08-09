package com.raystec;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class UserModal {

	ResourceBundle rb = ResourceBundle.getBundle("com.raystec.rb.app");

	public Integer nextPk() throws Exception {

		int pk = 0;

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select max(id) from user");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk +1;
	}

	public void add(UserBean bean) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
	
	    conn.setAutoCommit(false);
	    
	    ps.setInt(1, nextPk());
	    ps.setString(2, bean.getEmail());
	    ps.setString(3, bean.getFname());
	    ps.setString(4, bean.getLname());
	    ps.setString(5, bean.getGender());
	    ps.setString(6, bean.getNumber());
	    ps.setString(7, bean.getDob());
	    
	    ps.executeUpdate();
	    
	    conn.commit();
	    
	    conn.close();
	    ps.close();
	    
	}
	

}
