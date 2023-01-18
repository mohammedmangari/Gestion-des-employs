package med.model;

import java.util.ArrayList;
import java.util.List;

public class ListServices {

	
	ArrayList<Service> services = new ArrayList<Service>();

	public ArrayList<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> list) {
		this.services = (ArrayList<Service>) list;
	}
	
	
}
