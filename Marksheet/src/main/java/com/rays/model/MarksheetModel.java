package com.rays.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.rays.bean.MarksheetBean;

public class MarksheetModel {

	ResourceBundle rb = ResourceBundle.getBundle("com.raystec.rb.app");

	public List<MarksheetBean> search() throws Exception {

		Class.forName(rb.getString("driver"));

		Connection conn = DriverManager.getConnection(rb.getString("url"), rb.getString("user"),
				rb.getString("password"));

		PreparedStatement ps = conn.prepareStatement(
				" select * ,(phy+chm+math) as total from marksheet where phy between 40 and 100 and chm between 40 and 100 and math between 40 and 100 order by total desc limit 0,5");

		ResultSet rs = ps.executeQuery();

		conn.setAutoCommit(false);

		List<MarksheetBean> list = new ArrayList<MarksheetBean>();

		while (rs.next()) {

			MarksheetBean bean = new MarksheetBean();

			bean.setId(rs.getInt(1));
			bean.setRollNo(rs.getInt(2));
			bean.setFname(rs.getString(3));
			bean.setLname(rs.getString(4));
			bean.setPhy(rs.getInt(5));
			bean.setChm(rs.getInt(6));
			bean.setMath(rs.getInt(7));

			list.add(bean);

		}
		return list;
	}

}
