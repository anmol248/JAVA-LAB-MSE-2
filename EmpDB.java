package com.anudip;
import java.sql.*;
public class EmpDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String driver_name="com.mysql.cj.jdbc.Driver";
        String host="jdbc:mysql://localhost:3306/Employeedb";
        String username="root";
        String pwd="8968749647";
        String create_table="""
        		CREATE TABLE IF NOT EXISTS employee (
        		id INT PRIMARY KEY AUTO_INCREMENT,
        		name VARCHAR(50) NOT NULL,
        		dept VARCHAR(50),
        		salary DECIMAL(10,2)
        		)
        		""";
        try {
        	Class.forName(driver_name);
        	System.out.println("Driver is ready");
        	Connection con=DriverManager.getConnection(host,username,pwd);
        	System.out.println("Host is ready");
        	Statement smt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        	smt.execute(create_table);
        	System.out.println("table is ready:");
        	ResultSet rs=smt.executeQuery("select * from employee");
        	System.out.println("ID\t|Name\t|Dept\t\t|Salary");
        	while(rs.next()) {
        		rs.moveToInsertRow();
        		rs.updateString("name","Emp4");
        		rs.updateString("dept","MCA");
        		rs.updateDouble("Salary",80000);
        		rs.insertRow();
        		break;
        	}
        	while(rs.next()) {
        		long salary=rs.getLong("salary");
        		if(salary<=50000) {
        			rs.updateDouble("salary",salary*1.1);
        					rs.updateRow();
        		}
        		int id=rs.getInt("id");
        		String name=rs.getString("name");
        		String dept=rs.getString("dept");
        		long Salary=rs.getLong("salary");
        		System.out.println(String.format("%d\t|%s\t|%s       |%d", id,name,dept,salary));
        	}
//        	int rowAffected=smt.executeUpdate(""" 
//        			
//        	 insert into employee
//        	(name,dept,salary) values('Emp1','Account',40000),('Emp2','IT',60000),('Emp3','FInance',50000)
//        	""");
        	rs.close();smt.close();con.close();
        }catch (ClassNotFoundException | SQLException e) {
        	e.printStackTrace();
        }
	}

}

