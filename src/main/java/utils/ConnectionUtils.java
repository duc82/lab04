package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
	public static Connection getMSSQLConnection() throws SQLException, ClassNotFoundException {
		String databaseName = "JDBC";
		String hostName = "localhost";
		String port = "1433";
		String instance = "SQLEXPRESS";

		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

		String connectionURL = "jdbc:sqlserver://" + hostName + ":" + port + ";instance=" + instance + ";databaseName="
				+ databaseName + ";encrypt=true;trustServerCertificate=true;integratedSecurity=true";

		Connection conn = DriverManager.getConnection(connectionURL);
		return conn;
	}

	public static void closeQuietly(Connection conn) {
		try {
			conn.close();
		} catch (Exception e) {
		}
	}

	public static void rollbackQuietly(Connection conn) {
		try {
			conn.rollback();
		} catch (Exception e) {
		}
	}
}
