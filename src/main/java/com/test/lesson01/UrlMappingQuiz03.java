package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson/quiz03")
public class UrlMappingQuiz03 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		
		out.print("<html><head><title></title></head><body>");
		out.print("<h1>[단독] 고양이가 야옹해</h1>");
		out.print("<p>기사 입력 시간: " + sdf.format(now) + "</p>");
		out.print("<hr>");
		out.print("");
		out.print("끝");
		out.print("</body></html>");
	}
}
