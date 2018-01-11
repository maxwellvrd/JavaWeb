package model.persistence;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConnectionDAO {

	public ConnectionDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println("Erro ao selecionar o driver:" + e.getMessage());
			
		}
	}
	
	protected Connection getConnection() throws SQLException {
		String url ="jdbc:mysql://localhost:3306/projetoWeb03";
		Connection conn = (Connection) DriverManager.getConnection(url, "root", "");
		return conn;
	}
}
