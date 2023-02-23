package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class ApiController {
	
	@RequestMapping("/fav")
	public String getName(HttpServletRequest req)
	{
		String color=req.getParameter("favColor");
		HttpSession session = req.getSession();
		session.setAttribute("favColor", color);
		
		return "NewFile.jsp";
	}

}