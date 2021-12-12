<%@page import="java.util.List"%>
<html>
<body>
	<h2>Hello World!</h2>
	<%
	String name = (String) request.getAttribute("name");
	List<String> f = (List<String>) request.getAttribute("f");
	%>
	<h1>
		my name is
		<%=name%></h1>
	<%
	for (String fr : f) {
	%>
	<h1><%=fr%></h1>
	<%
	}
	%>

</body>
</html>
