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

	public void authentic(UserBean bean) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select * from user where userid =? , and pwd =?");

		ps.setString(1, bean.getUserid());
		ps.setString(2, bean.getPwd());

		ResultSet rs = ps.executeQuery();

		UserBean ub = new UserBean();

		while (rs.next()) {

			ub.setFname(rs.getString(1));
			ub.setLname(rs.getString(2));
			ub.setUserid(rs.getString(3));
			ub.setPwd(rs.getString(4));
			ub.setGender(rs.getString(5));
			ub.setNumber(rs.getString(7));
			ub.setDob(rs.getString(8));

		}
	}

	public UserBean Authenticate(String S, String t) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("Select * from user where userid = ? and pwd = ? ");

		ps.setString(1, S);
		ps.setString(2, t);

		ResultSet rs = ps.executeQuery();
		UserBean bean = new UserBean();

		while (rs.next()) {
			bean.setFname(rs.getString(1));
			bean.setLname(rs.getString(2));
			bean.setUserid(rs.getString(3));
			bean.setPwd(rs.getString(4));
			bean.setGender(rs.getString(5));
			bean.setNumber(rs.getString(6));
			bean.setDob(rs.getString(7));
		}
		return bean;

	}

	public UserBean forget(String s) {
		return null;
	}

}
