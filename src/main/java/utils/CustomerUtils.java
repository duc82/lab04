package utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Customer;

public class CustomerUtils {
	public static List<Customer> queryCustomer(Connection conn) throws SQLException {
		String sql = "SELECT a.CusId, a.CusUser, a.CusPass, a.CusName, a.CusPhone, a.CusAdd, a.CusEmail, a.CusFacebook, a.CusSkyper, a.CusStatus from CUSTOMER a";
		PreparedStatement pstm = conn.prepareStatement(sql);
		ResultSet rs = pstm.executeQuery();
		List<Customer> list = new ArrayList<Customer>();
		while (rs.next()) {
			int id = rs.getInt("CusId");
			String user = rs.getString("CusUser");
			String pass = rs.getString("CusPass");
			String name = rs.getString("CusName");
			String phone = rs.getString("CusPhone");
			String add = rs.getString("CusAdd");
			String email = rs.getString("CusEmail");
			String facebook = rs.getString("CusFacebook");
			String skyper = rs.getString("CusSkyper");
			int status = rs.getInt("CusStatus");
			Customer cus = new Customer(id, user, pass, name, phone, add, email, facebook, skyper, status);
			list.add(cus);
		}
		return list;
	}
}
