package med.model;

public class Employe {
	private int idEmp;
	private String Name;
    private String JOB;
    private String AGE;
    private String Salaire;
    private int  refdept;
	public int getIdEmp() {
		return idEmp;
	}
	public void setIdEmp(int idEmp) {
		this.idEmp = idEmp;
	}
	public int getRefdept() {
		return refdept;
	}
	public void setRefdept(int refdept) {
		this.refdept = refdept;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getJOB() {
		return JOB;
	}
	public void setJOB(String jOB) {
		JOB = jOB;
	}
	public String getAGE() {
		return AGE;
	}
	public void setAGE(String aGE) {
		AGE = aGE;
	}
	public String getSalaire() {
		return Salaire;
	}
	public void setSalaire(String salaire) {
		Salaire = salaire;
	}
	
    
    
	
	
}
