package com.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.ResourceBundle;

import com.rays.bean.UserBean;

public class UserModel {

	ResourceBundle rb = ResourceBundle.getBundle("com.raystec.rb.app");

	public Integer nextPk() throws Exception {

		int pk = 0;

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select max(id) from user");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;
	}

	public void add(UserBean bean) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("insert into user values(?,?,?,?,?,?,?,?)");

		conn.setAutoCommit(false);

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getFname());
		ps.setString(3, bean.getLname());
		ps.setString(4, bean.getUserid());
		ps.setString(5, bean.getPwd());
		ps.setString(6, bean.getGender());
		ps.setString(7, bean.getNumber());
		ps.setString(8, bean.getDob());

		ps.executeUpdate();

		conn.commit();

		conn.close();
		ps.close();

	}

	public UserBean Authenticate(String S, String t) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("Select * from user where userid = ? and pwd = ? ");

		ps.setString(1, S);
		ps.setString(2, t);


		ResultSet rs = ps.executeQuery();
		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFname(rs.getString(2));
			bean.setLname(rs.getString(3));
			bean.setUserid(rs.getString(4));
			bean.setPwd(rs.getString(5));
			bean.setGender(rs.getString(6));
			bean.setNumber(rs.getString(7));
			bean.setDob(rs.getString(8));
		}

		return bean;

	}

	public UserBean forget(String a) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("Select * from user where userid = ?");

		ps.setString(1, a);

		ResultSet rs = ps.executeQuery();
		UserBean bean = null;

		while (rs.next()) {

			bean = new UserBean();
			bean.setId(rs.getInt(1));
			bean.setFname(rs.getString(2));
			bean.setLname(rs.getString(3));
			bean.setUserid(rs.getString(4));
			bean.setPwd(rs.getString(5));
			bean.setGender(rs.getString(6));
			bean.setNumber(rs.getString(7));
			bean.setDob(rs.getString(8));

		}
		return bean;

	}
	
	

}
