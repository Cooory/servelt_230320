package com.test.lesson04;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz01")
public class DatabaseQuiz01 extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// response의 형태
		response.setContentType("text/plain");
		
		// DB 연결
		MysqlService ms = MysqlService.getInstance();
		ms.connect(); // 여기서 진짜 DB 연결!!
		
		// DB insert
		String insertQuery = "insert into `real_estate`"
				+ "(`realtorId`, `address`, `area`, `type`, `price`, `rentPrice`)"
				+ "value"
				+ "(3, '헤라펠리스 101동 5305호', 350, '매매', 1500000, null)";
		try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// DB select & 결과 출력
		String selectQuery = "select `address`, `area`, `type` from `real_estate`"
				+ "order by `id` desc"
				+ "limit 10;";
		try {
			PrintWriter out = response.getWriter();
			ResultSet res = ms.select(selectQuery);
			while(res.next()) {// 결과 행이 있는동안 수행
				String address = res.getString("address");
				int area = res.getInt("area");
				String type = res.getString("type");
				
				out.println("매물 주소 : " + address + ", 면적 : " + area + ", 타입 : " + type);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ms.disconnect();
	}
}
