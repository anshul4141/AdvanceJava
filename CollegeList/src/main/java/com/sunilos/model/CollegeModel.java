package com.sunilos.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.sunilos.bean.CollegeBean;

public class CollegeModel {

	ResourceBundle rb = ResourceBundle.getBundle("com.raystec.rb.app");

	public Integer nextPk() throws Exception {

		int pk = 0;

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select max(id) from college");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {

			pk = rs.getInt(1);

		}
		return pk + 1;

	}

	public void add(CollegeBean bean) {

		try {
			Class.forName(rb.getString("driver"));

			Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
					rb.getString("password"));

			PreparedStatement ps = conn.prepareStatement("insert into college values(?,?,?,?)");

			conn.setAutoCommit(false);

			ps.setInt(1, nextPk());
			ps.setString(2, bean.getCollegeName());
			ps.setString(3, bean.getCollegeMob());
			ps.setString(4, bean.getCollegeAddress());

			ps.executeUpdate();

			conn.commit();
			System.out.println("Inserted");
			conn.close();

		} catch (Exception e) {
			System.out.println("Error In Add Data");
		}

	}

	public void update(CollegeBean bean) {

		try {
			Class.forName(rb.getString("driver"));

			Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
					rb.getString("password"));

			PreparedStatement ps = conn
					.prepareStatement("update college set college_mob =?, college_address =? where college_name = ?");

			conn.setAutoCommit(false);

			ps.setString(1, bean.getCollegeMob());
			ps.setString(2, bean.getCollegeAddress());
			ps.setString(3, bean.getCollegeName());

			ps.executeUpdate();

			conn.commit();
			System.out.println("Updated");
			conn.close();

		} catch (Exception e) {
			System.out.println("Error In Updation");
		}

	}

	public void delete(CollegeBean bean) {

		try {
			Class.forName(rb.getString("driver"));

			Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
					rb.getString("password"));

			PreparedStatement ps = conn.prepareStatement("delete from college where college_name =?");

			conn.setAutoCommit(false);

			ps.setString(1, bean.getCollegeName());

			ps.executeUpdate();

			conn.commit();
			System.out.println("Deleted");
			conn.close();

		} catch (Exception e) {
			System.out.println("Error in Deleting Data");
		}

	}

	public List<CollegeBean> search() throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement("select * from college");

		ResultSet rs = ps.executeQuery();

		ArrayList<CollegeBean> list = new ArrayList<CollegeBean>();

		CollegeBean bean = null;

		while (rs.next()) {

			bean = new CollegeBean();
			bean.setId(rs.getInt(1));
			bean.setCollegeName(rs.getString(2));
			bean.setCollegeMob(rs.getString(3));
			bean.setCollegeAddress(rs.getString(4));

			list.add(bean);

		}
		return list;

	}

}
