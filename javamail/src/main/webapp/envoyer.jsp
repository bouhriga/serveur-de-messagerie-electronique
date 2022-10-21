<%@page import="Model.Email"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
	
	<link rel="stylesheet" type="text/css" href="css/nav.css">
	<link rel="stylesheet" type="text/css" href="css/fin.css">
	
</head>
<body>
 <%@ include file="dashboard.html" %>
        <section >
<%
    List<Email> emails = (List<Email>) request.getAttribute("emails");
%>
<%@ page import="java.util.List" %>

<div class="container mt-5">
    <div class="row">
        <div class="col-lg-12">
            <div class="card">
                <div class="card-body">
	                
             <center><h3><i class="fa-solid fa-paper-plane"></i> Messages envoyés</h3></center>
                        <div class="col-lg-12 col-md-12">
                            <div class="card shadow-none mt-3 border border-light">
                                <div class="table-responsive">
                                    <table class="table">
                                        <tbody id="inbox_body_table">
                                       <%
                                            for (Email e:emails){
                                        %>
                                       <tr>
                                            <td class="name"><%=e.getTo()%></td>
                                            <td class="subject"><%= e.getSubject()%> </td>
                                            <td class="time">
                                                <%=e.getd()%>
                                            </td>
                                            <td class="action"><a href="detailmail?id=<%=e.getId() %>" ><i class="fa-solid fa-eye"></i></a></td>
                                            <td class="action"><a href="supmail?id=<%=e.getId() %>" ><i class="fa-solid fa-trash-can"></i></a></td>
                                        </tr>
                                        <%
                                            }
                                        %>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                                <!-- card -->
                        </div> <!-- end Col-9 -->

                    </div><!-- End row -->

                </div>
            </div>
        </div>
    </div><!-- End row -->
</div>
</section>
</body>
</html>