package com.spring.mvc;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class StudentController 

{
	@RequestMapping("/register")
	public ModelAndView registerStudent(HttpServletRequest request,HttpServletResponse response)
	{
		int studentID = Integer.parseInt(request.getParameter("studentID"));  
		String username=request.getParameter("username");  
		String password=request.getParameter("password");  
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");  
		String city=request.getParameter("city"); 
		String postalcode=request.getParameter("postalcode");

		Students student = new Students();

		student.setStudentID(studentID);
		student.setUsername(username);
		student.setPassword(password);
		student.setFirstname(firstname);
		student.setLastname(lastname);
		student.setCity(city);
		student.setPostalcode(postalcode);

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab02");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();

		return new ModelAndView("registered");

	}

	@RequestMapping("/login")
	public ModelAndView loginStudent(HttpServletRequest request,HttpServletResponse response/*,@PathVariable int studentID*//*,RedirectAttributes redirectAttributes*/)
	{
		int studentID = Integer.parseInt(request.getParameter("studentID"));	
		String username=request.getParameter("username");
		String password=request.getParameter("password");  

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab02");
		EntityManager em = emf.createEntityManager();

		Query query = em.createQuery("select username,password from Students where username='"+username+"' and password ='"+password+"'");
		List<Students>studentList = query.getResultList();

		HttpServletRequest request1 = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request1.getSession(true);

		session.setAttribute("studentID", studentID); 

		// redirectAttributes.addAttribute("studentID", "studentID");

		if ((studentList!=null) && (studentList.size()>0)){
			//selectProgram(Integer.parseInt(request.getParameter("studentID")));
			return new ModelAndView("loginSuccessful"/*,"studentID",studentID*/);
		}
		else {
			return new ModelAndView("loginFailed");
		}



	}

	@RequestMapping("/checkout")
	public ModelAndView selectProgram()
	{
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();  
		HttpSession session = request.getSession();
		int studentID = (int) session.getAttribute("studentID");

		String program=request.getParameter("program");
		

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Lab02");
		EntityManager em = emf.createEntityManager();
		
		Programs p = new Programs();
		
		Enrollment e = new Enrollment();
		
		
		Query query = em.createQuery("SELECT 1 FROM Programs WHERE studentID='"+studentID+"'");
	    List<Programs>programList = query.getResultList(); 
		
		if((programList!=null) && (programList.size()>0))
		{
			
		}
		else
		{
			p.setStudentId(studentID);
			int randomNum = (int) Math.random();
			e.setApplicationNO(randomNum);
			e.setStudentID(studentID);
			
//			if(program=="Software Engineering")
//			{
//				e.setProgramCode(141);
//			}
//			else if(program=="Game Development")
//			{
//				e.setProgramCode(142);
//			}
//			else if(program=="Health Informatics")
//			{
//				e.setProgramCode(143);
//			}
//			else if(program=="Robotics")
//			{
//				e.setProgramCode(144);
//			}
			
			p.setApplicationNo(randomNum);
			em.getTransaction().begin();
			em.persist(e);
			em.persist(p);	
			em.getTransaction().commit();

		}
		
		
		if(program=="Software Engineering")
		{
			p.setProgramCode(141);
		//	e.setProgramCode(141);
			p.setProgramName("Software Engineering");
			p.setDuration(1);
			p.setFee(3000);
			int randomNum = (int) Math.random();
			p.setApplicationNo(randomNum);
			
			em.getTransaction().begin();
			em.persist(p);
		//	em.persist(e);
			em.getTransaction().commit();
		}

		else if(program=="Game Development")
		{
			p.setProgramCode(142);
		//	e.setProgramCode(142);
			p.setProgramName("Game Development");
			p.setDuration(1);
			p.setFee(3500);
			int randomNum = (int) Math.random();
			p.setApplicationNo(randomNum);
			
			em.getTransaction().begin();
			em.persist(p);
		//	em.persist(e);
			em.getTransaction().commit();
		}
		
		else if(program=="Health Informatics")
		{
			p.setProgramCode(143);
		//	e.setProgramCode(143);
			p.setProgramName("Health Informatics");
			p.setDuration(2);
			p.setFee(4000);
			int randomNum = (int) Math.random();
			p.setApplicationNo(randomNum);
			
			em.getTransaction().begin();
			em.persist(p);
		//	em.persist(e);
			em.getTransaction().commit();
		}
		
		else if(program=="Robotics")
		{
			p.setProgramCode(144);
		//	e.setProgramCode(144);
			p.setProgramName("Robotics");
			p.setDuration(3);
			p.setFee(6000);
			int randomNum = (int) Math.random();
			p.setApplicationNo(randomNum);
			
			em.getTransaction().begin();
			em.persist(p);
		//	em.persist(e);
			em.getTransaction().commit();
		}
		
		return new ModelAndView("paymentDetails");
	}

}
