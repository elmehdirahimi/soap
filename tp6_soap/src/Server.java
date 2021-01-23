import java.sql.SQLException;

import javax.xml.ws.Endpoint;

import donnee.EtudiantDao;
import entity.Etudiant;
import metiers.EnseignantSoap;
import metiers.EtudiantSoap;
import metiers.ModuleSoap;

public class Server {

	public static void main(String[] args) throws SQLException {
		String address1 = "http://localhost:9999/enseignants";
		EnseignantSoap enseignantSoap = new EnseignantSoap();
		Endpoint.publish(address1, enseignantSoap);
		System.out.println("my server is runing at " + address1);
		
//		
//		String address2 = "http://localhost:9999/modules";
//		ModuleSoap moduleSoap = new ModuleSoap();
//		Endpoint.publish(address2, moduleSoap);
//		System.out.println("my server is runing at " + address2);
	}

}
