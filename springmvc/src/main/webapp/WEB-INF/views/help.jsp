<%@page import="java.util.List"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<h2>Hello World!</h2>
	<%
	/* String name = (String) request.getAttribute("name");
	Integer roll = (Integer) request.getAttribute("rollnum"); */
	%>
	<h1>
		my name is
		<%-- <%=name%> --%>
		${name }
	</h1>
	<h1>
		roll number is
		<%-- <%=roll%> --%>
		${rollnum }
	</h1>
	<h1>
		time number is
		<%-- <%=roll%> --%>
		${time }
	</h1>
	<hr>
	<c:forEach var="item" items="${frnds }">
		<%-- <h1>${item }</h1> --%>
		<h1>
			<c:out value="${item }"></c:out>
		</h1>
	</c:forEach>

</body>
</html>
