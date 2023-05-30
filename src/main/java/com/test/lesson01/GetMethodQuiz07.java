package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz07")
public class GetMethodQuiz07 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String address = request.getParameter("address");
		String card = request.getParameter("card");
		String price = request.getParameter("price");
		
		out.println("<html><head><title></title></head><body>");
		if (!address.contains("서울시")) {
			out.println("배달 불가 지역입니다.");
		} else if (card.contains("신한카드")) {
			out.println("결제 불가 카드 입니다.");
		} else {
			out.println(address + " <b>배달 준비중</b>" + "<br>");
			out.println("결제금액 : " + price + "원");
		}
		out.println("</body></html>");
		
	}
}

