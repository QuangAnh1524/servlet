<!DOCTYPE html>
 <%@page import="crm.model.Role"%>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Quản lý Phân quyền</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f0f0;
        }
        .container {
            display: flex;
            height: 100vh;
        }
        .sidebar {
            width: 200px;
            background-color: #333;
            color: white;
            padding: 20px;
        }
        .sidebar a {
            display: block;
            color: white;
            text-decoration: none;
            margin-bottom: 10px;
        }
        .main-content {
            flex-grow: 1;
            padding: 20px;
        }
        .header {
            background-color: #4a90e2;
            color: white;
            padding: 10px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
        .action-btn {
            padding: 5px 10px;
            margin-right: 5px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        .action-btn.edit {
            background-color: #2196F3;
        }
        .action-btn.delete {
            background-color: #f44336;
        }
    </style>
</head>

<% 
List<Role> list = (List<Role>) request.getAttribute("role");
%>

<body>
    <div class="container">
        <div class="sidebar">
            <a href="#">Dashboard</a>
            <a href="#">Thành viên</a>
            <a href="#">Quyền</a>
            <a href="#">Dự án</a>
            <a href="#">Công việc</a>
        </div>
        <div class="main-content">
            <div class="header">
                <h1>Danh sách quyền</h1>
                <input type="text" placeholder="Tìm kiếm...">
            </div>
            <table>
                <thead>
                    <tr>
                        <th>STT</th>
                        <th>Tên Quyền</th>
                        <th>Mô tả</th>
                        <th>Hành động</th>
                    </tr>
                </thead>
                <tbody>
                <% for(Role role:list) { %>
                	 <tr>
                
                        <td><%= role.getId() %></td>
                        <td><%= role.getName() %></td>
                        <td><%= role.getDescription() %></td>
                        <td>
                            <button class="action-btn edit">Sửa</button>
                            <button class="action-btn delete">Xóa</button>
                        </td>
                    </tr>
                <%} %>
                   
                </tbody>
            </table>
        </div>
    </div>
</body>
</html>