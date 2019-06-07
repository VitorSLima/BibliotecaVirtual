package br.cinema.JPA;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class FabricaConexao {

	public static Connection getConnection() throws CinemaDAOException {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			String user = "root";
			String senha = "";
			return DriverManager.getConnection("jdbc:mysql://localhost/cinema", user, senha);
		} catch (Exception ex) {
			throw new CinemaDAOException(ex.getMessage());
		}
	}
//-------------------------------------------------------------------------------------------------------------------

	public static void closeConnection(Connection conn, Statement stmt) throws CinemaDAOException {
		close(conn, stmt, null);

	}

//--------------------------------------------------------------------------------------------------------------------		
	
	public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws CinemaDAOException {
		close(conn, stmt, null);

	}

	private static void close(Connection conn, Statement stmt, ResultSet rs) throws CinemaDAOException {

		try {
			if (conn != null)
				conn.close();
			if (stmt != null)
				stmt.close();
			if (rs != null)
				rs.close();
		} catch (Exception ex) {
			throw new CinemaDAOException(ex.getMessage());
		}

	}

}
