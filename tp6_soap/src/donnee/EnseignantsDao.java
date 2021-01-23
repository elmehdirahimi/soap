package donnee;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import entity.Enseignants;

public class EnseignantsDao {

	
private Connection connectionDb;
	
	public EnseignantsDao() {
		
		connectionDb = ConnectionDb.getConnection();
		// TODO Auto-generated constructor stub
	}
	public void enregistrement(Enseignants e) throws SQLException
	{
		String sql = "INSERT INTO enseignant (cni, nom, prenom, age, adresse, ville, photo, sexe) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		statement.setString(1, e.getCni());
		statement.setString(2, e.getNom());
		statement.setString(3, e.getPrenom());
		statement.setInt(4, e.getAge());
		statement.setString(5, e.getAddresse());
		statement.setString(6, e.getVille());
		statement.setString(7, e.getPhoto());
		statement.setString(8, e.getSexe());
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}
	
	public void modification(Enseignants e) throws SQLException
	{
		String sql = "update  enseignant set nom = ?, prenom = ?, age = ?, adresse = ?, ville = ?"
				+ ", photo = ?, sexe = ? where cni = ?";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		
		statement.setString(1, e.getNom());
		statement.setString(2, e.getPrenom());
		statement.setInt(3, e.getAge());
		statement.setString(4, e.getAddresse());
		statement.setString(5, e.getVille());
		statement.setString(8, e.getPhoto());
		statement.setString(9, e.getSexe());
		statement.setString(10, e.getCni());
		
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}
	
	
	public void suppression(String cni) throws SQLException
	{
		String sql = "delete from  enseignant  where cni = ?";

		
		java.sql.PreparedStatement statement = connectionDb.prepareStatement(sql);
		statement.setString(1, cni);
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
			System.out.println("A new user was inserted successfully!");
		}

	}

}
