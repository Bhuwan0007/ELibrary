package com.javatpoint.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=sa;password=demo.demo;database=ELib");
		
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
