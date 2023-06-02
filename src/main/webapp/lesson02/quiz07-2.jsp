<%-- <!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<html>
<head>
<meta charset="UTF-8">
<title>4점 이상 메뉴 목록</title>
	<!-- bootstrap CDN link -->
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>

<body>
	<div class="container">
		<h1>4점 이상 메뉴 목록</h1>
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
					<th>식당 이름</th>
					<th>메뉴</th>
					<th>별점</th>
				</tr>
			</thead>
			<tbody>
				<%
				List<Map<String, Object>> list = new ArrayList<>();
				Map<String, Object> map = new HashMap<String, Object>() {
					{
						put("name", "버거킹");
						put("menu", "햄버거");
						put("point", 4.3);
					}
				};
				list.add(map);
				map = new HashMap<String, Object>() {
					{
						put("name", "BBQ");
						put("menu", "치킨");
						put("point", 3.8);
					}
				};
				list.add(map);
				map = new HashMap<String, Object>() {
					{
						put("name", "교촌치킨");
						put("menu", "치킨");
						put("point", 4.1);
					}
				};
				list.add(map);
				map = new HashMap<String, Object>() {
					{
						put("name", "도미노피자");
						put("menu", "피자");
						put("point", 4.5);
					}
				};
				list.add(map);
				map = new HashMap<String, Object>() {
					{
						put("name", "맥도날드");
						put("menu", "햄버거");
						put("point", 3.8);
					}
				};
				list.add(map);
				map = new HashMap<String, Object>() {
					{
						put("name", "BHC");
						put("menu", "치킨");
						put("point", 4.2);
					}
				};
				list.add(map);
				map = new HashMap<String, Object>() {
					{
						put("name", "반올림피자");
						put("menu", "피자");
						put("point", 4.3);
					}
				};
				list.add(map);

				for (Map<String, Object> item : list) {
					double point = (double) item.get("point");
					if (point >= 4.0) {
				%>
				<tr>
					<td><%=item.get("name")%></td>
					<td><%=item.get("menu")%></td>
					<td><%=item.get("point")%></td>
				</tr>
				<%
				}
				}
				%>
			</tbody>
		</table>
	</div>

</body>
</html> --%>
