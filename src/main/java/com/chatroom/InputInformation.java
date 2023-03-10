package com.chatroom;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.tomcat.jni.User;

import com.chatroom.Server.ClientHandler;

/**
 * Servlet implementation class InputInformation
 */
public class InputInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public String chat_record = "";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputInformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		String input_textarea= request.getParameter("input_textarea");
		Date now = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = dateFormat.format(now);
		String t =(String)request.getSession().getAttribute("account");
		chat_record += time+"\t"+t+" :"+input_textarea+" "+"\n";
		request.setAttribute("input_textarea", chat_record);
		request.getRequestDispatcher("mainroom.jsp").forward(request, response);
		//
		
	}
	public void senteveryone() {
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
