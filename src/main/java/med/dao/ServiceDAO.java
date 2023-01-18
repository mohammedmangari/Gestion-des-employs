package med.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import med.model.Employe;
import med.model.ListServices;
import med.model.Service;

public class ServiceDAO implements IServiceDAO{

Connection cn = new DataSource().connectionDb();
List<Service> services = new ArrayList<Service>();
	
	

	@Override
	public Service getService(String s) {
		ResultSet rs;
		 Service sv = null;
		try {
			PreparedStatement ps = cn.prepareStatement("SELECT * FROM service  where Sname=?");
			ps.setString(1, s);
			rs = ps.executeQuery();
		    rs.next();
		    sv = new Service();
		    sv.setIdDept(rs.getInt("id"));
		    sv.setSerNAme(rs.getString("Sname"));
		    sv.setLOC(rs.getString("Sloc"));
		    
		}catch(Exception e){
			e.getStackTrace();
		}

		return sv ;
	}

	@Override
	public Service getServiceById(int id) {
		ResultSet rs;
		 Service sv = null;
		try {
			PreparedStatement ps = cn.prepareStatement("SELECT * FROM service  where id=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
		    rs.next();
		    sv = new Service();
		    sv.setIdDept(rs.getInt("id"));
		    sv.setSerNAme(rs.getString("Sname"));
		    sv.setLOC(rs.getString("Sloc"));
		    
		}catch(Exception e){
			e.getStackTrace();
		}

		return sv ;
	}

	@Override
	public List<Service> getListeServices() {
		ResultSet rs;
		 Service sv = null;
	
		try {
			PreparedStatement ps = cn.prepareStatement("SELECT * FROM service");
			rs = ps.executeQuery();
			while( rs.next()) {
			   sv = new Service();
			   sv.setIdDept(rs.getInt("id"));
			   sv.setSerNAme(rs.getString("Sname"));
			   sv.setLOC(rs.getString("Sloc"));
               services.add(sv);  
			}
   
		}catch(Exception e){
			e.getStackTrace();
		}

		return services ;
	}

	
}
