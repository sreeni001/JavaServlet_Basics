package com.sreeni.servletproj1;
import jakarta.servlet.http.*;
import java.io.*;

public class SquareServlet extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		
	/*	 ====Getting value from session===
	  	HttpSession session = req.getSession();
		int result = (Integer)session.getAttribute("k"); */
		
		
		//======Getting value from Cookie====
		
		int result=0;
		
		/*	Cookie cookie[] = req.getCookies();
		for(Cookie c:cookie) {
			if(c.getName().equals("k")) {
				 result = Integer.parseInt(c.getValue());
			}
		} */
		
		result *=result;
		
		PrintWriter out = res.getWriter();
		out.println("Result's square value is "+ result);
	}
}
