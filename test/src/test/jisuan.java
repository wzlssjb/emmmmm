package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

public class jisuan extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public jisuan() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest r, HttpServletResponse re)
			throws ServletException, IOException {

		this.doPost(r, re);
	}

	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		int  s1=Integer.parseInt(req.getParameter("s1"));
		int  s2=Integer.parseInt(req.getParameter("s2"));
		
		double s3=Math.pow(s1, s2);
		
		req.setAttribute("xs", s3);
	     req.getRequestDispatcher("index.jsp").forward(req, res);
		res.getWriter().print(s3);
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
