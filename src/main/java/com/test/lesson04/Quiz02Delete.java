package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz02_delete")
public class Quiz02Delete extends HttpServlet{
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 파라미터 꺼내기
		int id = Integer.parseInt(request.getParameter("id"));
		// DB 연결
		MysqlService mysqlService = MysqlService.getInstance();
		mysqlService.connect();
		// delete 쿼리 수행
		String deleteQuery = "delete from `favorite_list` where `id` = " + id;
		try {
			mysqlService.update(deleteQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// DB 연결 해제
		mysqlService.disconnect();
			
		// 리스트 목록 화면 이동 (Redirect)
		response.sendRedirect("/lesson04/quiz02/favList.jsp");
	}
}
