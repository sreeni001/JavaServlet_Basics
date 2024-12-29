package com.sreeni.servletproj1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.*;

public class AddServlet extends HttpServlet{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException , ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		int k = i+j;
		PrintWriter out = res.getWriter();
		out.println("The sum of " + i + "+" + j + "=" + k + "/n");
//		int result = Integer.parseInt(req.getAttribute("k"));

		//====RequestDispatcher Example=====
		
/*		RequestDispatcher rd = req.getRequestDispatcher("square");   
		req.setAttribute("k",k);
		rd.forward(req,res); */
		

		//====SendRedirect Example=====
		
//		res.sendRedirect("square?k="+k);
		
		//====SendRedirect with Session as Example===
		
/*		HttpSession session = req.getSession();
		
		session.setAttribute("k",k);  
		session.setMaxInactiveInterval(10); //seconds format */
		
		//====SendRedirect with Cookie as Example===
		
	/*	Cookie cookie = new Cookie("k",k+"");
		
		res.addCookie(cookie);
		res.sendRedirect("square");  */
		
		
		//====Example for ServletConfig and ServletContext
		
		ServletContext ct = getServletContext();
		ServletConfig  cf = getServletConfig();
		int ctval = Integer.parseInt(ct.getInitParameter("contextVal"));
		int cfval = Integer.parseInt(cf.getInitParameter("configVal"));
		
		out.println("Here is the sum of ServletContext and ServletConfig value"+(cfval+ctval));
		
		
	}

}
