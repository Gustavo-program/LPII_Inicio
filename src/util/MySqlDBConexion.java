package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlDBConexion {
	static{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConexion(){
		Connection con=null;
		try {
			
		    con = DriverManager.getConnection("jdbc:mysql://node225992-env-2701494.j.layershift.co.uk/sedenorte?serverTimezone=CST","root","FEBthh37214");           
		}catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
		
}