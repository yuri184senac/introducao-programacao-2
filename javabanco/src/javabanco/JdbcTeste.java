package javabanco;

import java.sql.Connection;
import java.sql.SQLException;

public class JdbcTeste {
	static Connection con;
	public static void main(String[] args) {
		try {
			con = ConnectionFactory.getConnection();
			System.out.println("Conectado no banco de dados");	
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
