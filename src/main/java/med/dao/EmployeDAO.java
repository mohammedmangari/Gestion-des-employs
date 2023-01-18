package med.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import med.model.Employe;

public class EmployeDAO implements IEmployeDao {

	Connection cn = new DataSource().connectionDb();
	
	List<Employe> employes = new ArrayList<Employe>();
	
	
	@Override
	public void enregistrerEmploye(Employe e) {
	
		try {
			PreparedStatement ps = cn.prepareStatement("INSERT INTO employe(name,age,job,sal,servid) Value(?,?,?,?,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getAGE());
			ps.setString(3, e.getJOB());
			ps.setString(4, e.getSalaire());
			ps.setInt(5, e.getRefdept());
			ps.execute();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	 }

	@Override
	public List<Employe> getListEmployes() {
		
		try {
			PreparedStatement ps = cn.prepareStatement("SELECT * FROM employe");
		    ResultSet rs = ps.executeQuery();
		    while(rs.next()) {
		    	Employe em = new Employe();
		    	em.setIdEmp(rs.getInt("id"));
		    	em.setName(rs.getString("name"));
		    	em.setAGE(rs.getString("age"));
		    	em.setJOB(rs.getString("job"));
		    	em.setSalaire(rs.getString("sal"));
		    	em.setRefdept(rs.getInt("servid"));
		    	employes.add(em);
		    }
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return employes;
	}


}
