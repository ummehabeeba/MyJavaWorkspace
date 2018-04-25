package studentsApps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException
	{
	String id=req.getParameter("ID");
	String firstname=req.getParameter("First Name");
	String middlename=req.getParameter("Middle Name");
	String lastname=req.getParameter("Last Name");
	String address1=req.getParameter("Address1");
	String address2=req.getParameter("Address2");
	String[] knows=req.getParameterValues("KNOW");
	String gender=req.getParameter("gender");
	String[] haves=req.getParameterValues("Have");
	String about=req.getParameter("About");
	
	resp.setContentType("text/html");
	PrintWriter out=resp.getWriter();
	out.print("ID"+id);
	out.print("First Name"+firstname);
	out.print("Middle Name"+middlename);
	out.print("Last Name"+lastname);
	out.print("Address1"+address1);
	out.print("Address2"+address2);
	out.print("KNOW:");
	for (String know : knows)
	{
		out.print(know+", ");
	}
	out.print("Gender"+gender);
	out.print("Have:");
	for(String have : haves) 
	{
		out.print(have+", ");
	}
	out.print("About"+about);
	}
}
