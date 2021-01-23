package metiers;
import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;

import donnee.EnseignantsDao;
import entity.Enseignants;

@WebService
public class EnseignantSoap {

	EnseignantsDao enseignantsDao;

	public EnseignantSoap() {
		enseignantsDao = new EnseignantsDao();
	}
	
	@WebMethod
	public void enregistrement(Enseignants enseignants) throws SQLException
	{
		enseignantsDao.enregistrement(enseignants);
		System.out.println("enseignant ets bien cree");
	}
	
	
	@WebMethod
	public void modification(Enseignants enseignants) throws SQLException
	{
		enseignantsDao.modification(enseignants);
	}
	
	
	@WebMethod
	public void suppression(String cni) throws SQLException
	{
		enseignantsDao.suppression(cni);
	}
	
	
}
