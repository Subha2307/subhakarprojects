package com.Table.Jprgms;
import java.sql.*;
public class Main{
public static void main(String args[]){
String url="jdbc:mysql:localhost:3306/peters";
String uname="root";
String pwd="root";
String query="update Student set marks=?where stud_name=?";
try{
Connection c=DriverManager.getConnection(url,uname,pwd);
DatabaseMetaData d=c.getMetaData();
System.out.println(d.getDatabaseProductName()+" "+d.getDatabaseProductVersion()+" "+d.getDriverName()+" "+d.getUserName()+" ");
Statement s=c.createStatement();
PreparedStatement pstmt=c.prepareStatement(query);
pstmt.setInt(1,29);
pstmt.setString(2,"Ram");
int rowsEffected=pstmt.executeUpdate();
System.out.println(rowsEffected);

ResultSet rs=s.executeQuery("select * from Student");
System.out.println("stud_id\stud_name\tmarks\tskill");
while(rs.next())
{
int id=rs.getInt("stud_id");
String name=rs.getString("stud_name");
int marks=rs.getInt("marks");
String skill=rs.getString("skill");
System.out.println(id +" "+name+" "+marks+" "+skill);
}
rs.close();
s.close();
c.close();
}
catch (Exception e){
e.printStackTrace();
}

}

}