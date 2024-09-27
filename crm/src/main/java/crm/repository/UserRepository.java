package crm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import crm.config.MySQLConnection;
import crm.model.User;

public class UserRepository {
	
	public List<User> getUserByFullNameandPassWord(String fullname, String password) {
		List<User> list = new ArrayList<User>();
		Connection connection = null;
		try {
			connection = MySQLConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "select * from user u where u.fullname = ? and u.password = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, fullname);
			preparedStatement.setString(2, password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				User user = new User();
				user.setId(resultSet.getInt("id"));
				user.setEmail(resultSet.getString("email"));
				user.setPassword(resultSet.getString("password"));
				user.setFullname(resultSet.getString("address"));
				user.setPhone(resultSet.getString("phone"));
				user.setRole_id(resultSet.getInt("role_id")); 
				list.add(user);
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) { 
				connection.close(); }
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} }
				return list;
	
}
}
