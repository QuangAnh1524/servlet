package crm.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import crm.config.MySQLConnection;
import crm.model.Role;
import crm.model.User;

public class RoleRepository {
	public List<Role> getRole() {
		List<Role> list = new ArrayList<>();
		Connection connection = null;
		try {
			connection = MySQLConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "select * from role";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Role role = new Role();
				role.setId(resultSet.getInt("id"));
				role.setName(resultSet.getString("name"));
				role.setDescription(resultSet.getString("description"));
				list.add(role);
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
	
	public int deleteByRoleID(int id) {
		Connection connection = null;
		try {
			connection = MySQLConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "delete from role where id = ?";
		int isDelete = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			
			isDelete = preparedStatement.executeUpdate();
		
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
			return isDelete;
	}
	
	public int insertRole(int id, String name, String description) {
		Connection connection = null;
		try {
			connection = MySQLConnection.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql = "insert into role (id, name, description) VALUES (?,?,?);";
		int isSuccess = 0;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, description);
			
			isSuccess = preparedStatement.executeUpdate();
		
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
			}
			}
			return isSuccess;
	}
}
