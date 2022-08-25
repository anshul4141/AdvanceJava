package com.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.rays.bean.StudentBean;

public class StudentModel {

	ResourceBundle rb = ResourceBundle.getBundle("com.raystec.rb.app");

	public Integer nextPk() throws Exception {

		int pk = 0;

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select max(id) from student");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;
	}

	public void add(StudentBean bean) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?,?)");

		conn.setAutoCommit(false);

		ps.setInt(1, nextPk());
		ps.setString(2, bean.getRollNo());
		ps.setString(3, bean.getFname());
		ps.setString(4, bean.getLname());
		ps.setString(5, bean.getSession());

		ps.executeUpdate();

		conn.commit();
		System.out.println("Data....Inserted");
		conn.close();
		ps.close();

	}

	public void update(StudentBean bean) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn
				.prepareStatement("update student set fname =?, lname =?, session =? where rollNo =?");

		conn.setAutoCommit(false);

		ps.setString(1, bean.getFname());
		ps.setString(2, bean.getLname());
		ps.setString(3, bean.getSession());
		ps.setString(4, bean.getRollNo());

		ps.executeUpdate();

		conn.commit();
		System.out.println("Data....Updated");
		conn.close();
		ps.close();

	}

	public void delete(StudentBean bean) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("delete from student where rollNo =?");

		conn.setAutoCommit(false);

		ps.setString(1, bean.getRollNo());

		ps.executeUpdate();

		conn.commit();
		System.out.println("Data delete.....");
		conn.close();
		ps.close();

	}

	public List<StudentBean> get(StudentBean bean) throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select * from Student where rollNo = ?");

		ps.setString(1, bean.getRollNo());

		ResultSet rs = ps.executeQuery();

		ArrayList<StudentBean> list = new ArrayList<StudentBean>();

		while (rs.next()) {

			StudentBean bean1 = new StudentBean();

			bean1.setId(rs.getInt(1));
			bean1.setRollNo(rs.getString(2));
			bean1.setFname(rs.getString(3));
			bean1.setLname(rs.getString(4));
			bean1.setSession(rs.getString(5));

			list.add(bean1);
		}
		return list;

	}

	public List<StudentBean> search() throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select * from Student");

		ResultSet rs = ps.executeQuery();

		ArrayList<StudentBean> list = new ArrayList<>();

		while (rs.next()) {

			StudentBean bean1 = new StudentBean();

			bean1.setId(rs.getInt(1));
			bean1.setRollNo(rs.getString(2));
			bean1.setFname(rs.getString(3));
			bean1.setLname(rs.getString(4));
			bean1.setSession(rs.getString(5));
			
			list.add(bean1);

		}
		return list;

	}
}
