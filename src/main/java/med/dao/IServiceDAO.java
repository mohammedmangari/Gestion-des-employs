package med.dao;

import java.util.List;

import med.model.Service;

public interface IServiceDAO {

	public Service getService(String s);
	public Service getServiceById(int id);
    public List<Service> getListeServices();
	
	
}
