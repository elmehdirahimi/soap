package donnee;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import entity.Enseignants;
import entity.Module;

public class ModuleDao {
private Connection connectionDb;
	
	public ModuleDao() {
		
		connectionDb = ConnectionDb.getConnection();
		// TODO Auto-generated constructor stub
	}
	public void enregistrement(Module e) throws SQLException
	{
		String sql = "INSERT INTO module (code_module, nom_module, code_enseignant) "
				+ "VALUES (?, ?, ?)";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		statement.setString(1, e.getCode_module());
		statement.setString(2, e.getNom_module());
		statement.setString(3, e.getCode_enseignant());
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}
	
	public void modification(Module e) throws SQLException
	{
		String sql = "update  module set nom_module = ?, code_enseignant  where code_module = ?";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		
		statement.setString(1, e.getNom_module());
		statement.setString(2, e.getCode_enseignant());
		statement.setString(3, e.getCode_module());
		
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}
	
	
	public void suppression(String cni) throws SQLException
	{
		String sql = "delete from  module  where code_module = ?";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		statement.setString(1, cni);
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}
}
