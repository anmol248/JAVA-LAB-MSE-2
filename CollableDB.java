package com.anudip;



import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class CollableDB {

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  String driver_name = "com.mysql.cj.jdbc.Driver";
  String host = "jdbc:mysql://localhost:3306/Employeedb";
  String username = "root";
  String pwd = "8968749647";
  
  Savepoint sp1 = null, sp2=null;
  Connection con = null;
  try {
   Class.forName(driver_name);
   con = DriverManager.getConnection(host, username, pwd);
   
//   CallableStatement cstmt = con.prepareCall("{call showEmployees()}");
//   ResultSet rs = cstmt.executeQuery();
//   
   System.out.println("ID\t Name\t Dept\t\t Salary");

//   while(rs.next()) {
//    int id = rs.getInt("id");
//    String name = rs.getString("name");
//    String dept = rs.getString("dept");
//    long salary = rs.getLong("salary");
//    System.out.println(String.format("%d\t %s \t %s \t\t %s", id, name, dept, salary));
//   }
   
   Statement smt = con.createStatement();
   con.setAutoCommit(false);
   int rowAffected = smt.executeUpdate("""
    insert into employee (name, dept, salary) values ('Emp8', 'Account', 40000)
    """);
   
   
   
   if(rowAffected>0) {
    sp1 = con.setSavepoint("inserted");
   }
   
   rowAffected = smt.executeUpdate("""
     update employee set salary = 60000 where name = "Emp8"
     """);
   
   if(rowAffected>0) {
    sp2 = con.setSavepoint("updated");
   }
   
   CallableStatement cstmt = con.prepareCall("{call showEmployees()}");
   ResultSet rs = cstmt.executeQuery();
   
   System.out.println("ID\t Name\t Dept\t\t Salary");

   while(rs.next()) {
    int id = rs.getInt("id");
    String name = rs.getString("name");
    String dept = rs.getString("dept");
    long salary = rs.getLong("salary");
    System.out.println(String.format("%d\t %s \t %s \t\t %s", id, name, dept, salary));
   }
   smt.executeUpdate("""
     delete from employee where id = 800
     """);
   con.commit();
   con.setAutoCommit(true);
   
  } catch(ClassNotFoundException | SQLException e) {
   try {
    con.rollback(sp2);
    con.commit();
   } catch (SQLException e1) {
    e1.printStackTrace();
   }
   e.printStackTrace();
  }
 }

}
