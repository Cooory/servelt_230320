package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz02_insert")
public class Quiz02Insert extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 응답 정의 생략 - redirect 할 것이기 때문
		
		// request parameter 받기
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		// DB 연결
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		
		// DB insert
		String insertQuery = "insert into `favorite_list`"
				+ "(`name`, `url`)"
				+ "values ('" + name + "', '" +  url + "')";
		try {
			mysqlService.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB 연결 해제
		
		mysqlService.disconnect();
		
		// 유저 목록 화면으로 이동 (Redirect)
		response.sendRedirect("/lesson04/quiz02/favList.jsp");
	}
}
