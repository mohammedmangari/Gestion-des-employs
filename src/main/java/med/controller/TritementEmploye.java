package med.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import med.dao.EmployeDAO;
import med.dao.ServiceDAO;
import med.model.Employe;
import med.model.ListEmployes;
import med.model.ListServices;


@WebServlet("/TritementEmploye")
public class TritementEmploye extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 EmployeDAO operationEmp= new EmployeDAO();
		 ServiceDAO  operationServ = new ServiceDAO();
		// get data form request :
		String Name = request.getParameter("nameEmp");
		String Age = request.getParameter("ageEmp");
		String Fonction = request.getParameter("jobEmp");
		String Salaire = request.getParameter("salEmp");
		String Service = request.getParameter("service");
	

		
		Employe emp = new Employe();
		emp.setName(Name);
		emp.setAGE(Age);
		emp.setJOB(Fonction);
        emp.setSalaire(Salaire);
        emp.setRefdept(operationServ.getService(Service).getIdDept());
   
        operationEmp.enregistrerEmploye(emp);
        
        ListEmployes md = new ListEmployes();
        ListServices ls = new ListServices();

        md.setEmployes(operationEmp.getListEmployes());
        ls.setServices(operationServ.getListeServices());
        
        
        request.setAttribute("md",md);
        request.setAttribute("ls",ls);

        RequestDispatcher  rd = request.getRequestDispatcher("infoEmployes.jsp");
        rd.forward(request,response);
        
	}
	
	

}
