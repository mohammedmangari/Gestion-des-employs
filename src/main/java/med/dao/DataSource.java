package med.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource implements Configuration  {
   private Connection cn;
	@Override
	public Connection connectionDb() {
	
		try {
			//1
			Class.forName("com.mysql.jdbc.Driver");
			//2
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionemployes","root","");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cn;
	}
	/*
	INSERT INTO service VALUES(40,"OPERATIONS","BOSTON");
	INSERT INTO service VALUES(30,"SALES","CHICAGO");
	INSERT INTO service VALUES(20,"RESEARCH","DALLAS");
	INSERT INTO service VALUES(10,"ACCOUNTING","NEW YORK");
	*/
}


