package com.anudip;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class PreEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String driver_name="com.mysql.cj.jdbc.Driver";
	        String host="jdbc:mysql://localhost:3306/Employeedb";
	        String username="root";
	        String pwd="8968749647";
	        String query="select * from employee where salary>=?";
	        long inSalary=50000;
	        String insertQuery="""insert
	        
	        try {
	        	Class.forName(driver_name);
	        	System.out.println("Driver is ready");
	        	Connection con=DriverManager.getConnection(host,username,pwd);
	        	PreparedStatement inpst=con,prepareStatement(insertQuery);
	        	inpst.setString(1, "Emp5");
	        	inpst.setString(2, "MCA");
	        	inpst.setLong(3,65000);
	        	inpst.executeUpdate();
	        	PreparedStatement pst=con.prepareStatement(query);
	        	pst.setting(1,inSalary);
	        	ResultSet rs=pst.executeQuery();
	        	System.out.println("ID\tName\tDepartment\tSalary");
	        	while(rs.next()) {
	        	int id=rs.getInt("id");
        		String name=rs.getString("name");
        		String dept=rs.getString("dept");
        		long Salary=rs.getLong("salary");
        		System.out.println(String.format("%d\t|%s\t|%s       |%d", id,name,dept,salary));
	        	}
	        }catch (ClassNotFoundException | SQLException e) {
	        	e.printStackTrace();
	        }

	}
	}
	
