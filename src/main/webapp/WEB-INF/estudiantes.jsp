<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
</head>
<body>
	<form:form class="row" method="POST" action="/filtrante"
		modelAttribute="employee">
		<div class="col-4">
			<select class="form-select" aria-label="Default select example" name="codigoRegion">
				<option selected>Sellecione la region</option>
				<c:forEach var="r" items="${region}">
					<option value="${r.getCodigoRegion()}"> <c:out value="${r.getNombre()}"> </c:out> </option>
				</c:forEach>
			</select>
		</div>
		<div class="col-4">
			<select class="form-select" aria-label="Default select example" name="codigoPlanFormativo">
				<option selected>Seleccione la descripcion de un curso</option>
				<c:forEach var="planFormativo" items="${planFormativo}">
					<option value="${planFormativo.getCodigoPlanFormativo()}"> <c:out value="${planFormativo.getDescripcion()}"> </c:out> </option>
				</c:forEach>
			</select>
		</div>
		<div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form:form>
	
	<div><table class="table">
  <thead>
    <tr>
      <th scope="col">rut</th>
      <th scope="col">nombre</th>
      <th scope="col">apellido pat</th>
      <th scope="col">apellido mat</th>
      <th scope="col">codigoCurso</th>
      <th scope="col">Descripcion curso</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="estudiante" items="${estudiante}">
  <tr>
      <th scope="row"><c:out value="${estudiante.getRut()}"> </c:out></th>
      <td><c:out value="${estudiante.getNombre()}"> </c:out></td>
      <td><c:out value="${estudiante.getApellidoPat()}"> </c:out></td>
      <td><c:out value="${estudiante.getApellidoMat()}"> </c:out></td>
      <td><c:out value="${estudiante.getCodigoCurso()}"> </c:out></td>
      <td><c:out value="${estudiante.getCurso().getPlanFormativo().getDescripcion()}"> </c:out></td>

    </tr>
  </c:forEach>
    
  </tbody>
</table>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
		crossorigin="anonymous"></script>

</body>
</html>