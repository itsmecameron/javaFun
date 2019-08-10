package com.javaoop.checkerboard;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckerBoard
 */
@WebServlet("/Checkerboard")
public class CheckerBoard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String row = request.getParameter("row");
        String col = request.getParameter("column");
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        out.write("<h1>Welcome, " + row + " " + col + "</h1>");
       
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}