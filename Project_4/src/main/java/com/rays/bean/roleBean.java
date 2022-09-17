package com.rays.bean;

public class roleBean extends BaseBean {
	
	public static final int ADMIN = 0;
	public static final int STUDENT = 0;
	public static final int COLLEGE = 0;
	public static final int KIOSK = 0;
	private String name;
	private String description;
	
	public roleBean() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
