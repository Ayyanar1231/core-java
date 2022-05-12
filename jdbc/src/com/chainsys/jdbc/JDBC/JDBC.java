package com.chainsys.jdbc.JDBC;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC {
   public static void main(String[] args) throws SQLException {
//	   sambleJDBC();
//	   imageJDBC();
//	   transferManagement();
	   deleteRecord1();
   }
   public static void sambleJDBC() {
    try {
           Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle"); 
           java.sql.Statement stat = con.createStatement();
           ResultSet rs  = stat.executeQuery("select * from employees");
           while(rs.next()) {
               System.out.println(rs.getString("last_name") + ", " +rs.getString("first_name"));
           }
           con.close();
       }catch(Exception err) {
           err.printStackTrace();
       }
}
   
   public static void deleteJDBC() {
	    try {
	           Connection con  = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle"); 
	           java.sql.Statement stat = con.createStatement();
	           ResultSet rs  = stat.executeQuery("select * from employees where name =3114");
	           
	           while(rs.next()) {
	               System.out.println(rs.getString("last_name") + ", " +rs.getString("first_name"));
	           }
	           con.close();
	       }catch(Exception err) {
	           err.printStackTrace();
	       }
   }
   
   public static void imageJDBC()
   {
   try{  
       Class.forName("oracle.jdbc.driver.OracleDriver");  
       Connection con=DriverManager.getConnection(  
       "jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
                     
       PreparedStatement ps=con.prepareStatement("insert into friend values(?,?)");  
       ps.setString(1,"Ayyanar");  
         
       FileInputStream fin=new FileInputStream("D:\\picture\\3114.jpg");  
       ps.setBinaryStream(2,fin,fin.available());  
       int i=ps.executeUpdate();  
       System.out.println(i+" records affected");  
                 
       con.close(); 
       }
   catch (Exception e) 
   {
    	   e.printStackTrace();
    	   }  
   }
     
   public static void transferManagement(){  
   try{  
     
   Class.forName("oracle.jdbc.driver.OracleDriver");  
   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
   con.setAutoCommit(false);  
     
   PreparedStatement ps=con.prepareStatement("insert into ayy values(?,?,?)");  
     
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
   while(true){  
     
   System.out.println("enter id:");  
   String s1=br.readLine();  
   int id=Integer.parseInt(s1);  
     
   System.out.println("enter name:");  
   String name=br.readLine();  
     
   System.out.println("enter salary:");  
   String s3=br.readLine();  
   int salary=Integer.parseInt(s3);  
     
   ps.setInt(1,id);  
   ps.setString(2,name);  
   ps.setInt(3,salary);  
   ps.executeUpdate();  
     
   System.out.println("commit/rollback");  
   String answer=br.readLine();  
   if(answer.equals("commit")){  
   con.commit();  
   }  
   if(answer.equals("rollback")){  
   con.rollback();  
   }  
     
     
   System.out.println("Want to add more records y/n");  
   String ans=br.readLine();  
   if(ans.equals("n")){  
   break;  
   }  
     
   }  
   con.commit();  
   System.out.println("record successfully saved");  
     
   con.close();//before closing connection commit() is called  
   }catch(Exception e)
   {
	   System.out.println(e.getMessage());
	   }  
     
   }
   
	public static void deleteRecord() throws SQLException{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		Statement statement = conn.createStatement();
 
		//String query = "delete friend " + "where ID = 3113 ";
 
		try{			
			//get connection
			//conn = JDBC.getConnection();
 
			//create statement
			statement = conn.createStatement();
 
			//execute query
			statement.executeUpdate("delete Photo from friend where Name='3114'");
 
			//close connection
			statement.close();
			conn.close();
 
		     System.out.println("Record deleted successfully.");
		}catch(Exception e){
			e.printStackTrace();
		}
	}


	public static void deleteRecord1() {
		
	try{  
		Class.forName("oracle.jdbc.driver.OracleDriver");  
		  
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");  
		  
		/*PreparedStatement stmt=con.prepareStatement("delete from Employees where employee_id = '100'");  
		//stmt.setString(1,"Ayya");//1 specifies the first parameter in the query  
		//stmt.setInt(2,3110);  
		  
		//int i=stmt.executeUpdate();  
		System.out.println(" records Deleted"); */ 
		  PreparedStatement stmt = con.prepareStatement("delete from friend1 where ID='3110'");
    //tmt.setString(1, "Deepa");
        int i = stmt.executeUpdate();
        System.out.println(i + " records deleted");
		con.close();  
		  
		}catch(Exception e){ System.out.println(e.getMessage());}  
		  
	}

	
}
	