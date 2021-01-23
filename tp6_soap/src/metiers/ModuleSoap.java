package metiers;

import java.sql.SQLException;

import javax.jws.WebMethod;
import javax.jws.WebService;
import donnee.ModuleDao;
import entity.Module;


@WebService
public class ModuleSoap {

	ModuleDao moduleDao;

	public ModuleSoap() {
		moduleDao = new ModuleDao();
	}
	
	@WebMethod
	public void enregistrement(Module module) throws SQLException
	{
		moduleDao.enregistrement(module);
		System.out.println("enseignant ets bien cree");
	}
	
	
	@WebMethod
	public void modification(Module module) throws SQLException
	{
		moduleDao.modification(module);
	}
	
	
	@WebMethod
	public void suppression(String cni) throws SQLException
	{
		moduleDao.suppression(cni);
	}
	
	
}
