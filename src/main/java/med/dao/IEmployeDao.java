package med.dao;

import java.util.List;

import med.model.Employe;

public interface IEmployeDao {
   
	public void enregistrerEmploye(Employe e);
	public List<Employe> getListEmployes();
	
}
