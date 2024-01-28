<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Library</title>
</head>
<body>
    <h2>Library</h2>
    <table bord="1">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author</th>
            <th>Actions</th>
        </tr>
        <tr th:each="book : ${books}">
            <td th:text="${book.id}"></td>
            <td th:text="${book.title}"></td>
            <td th:text="${book.author}"></td>
            <td>
                <a th:href="@{'/library/update/' + ${book.id}}">Update</a>
                <a th:href="@{'/library/delete/' + ${book.id}}" style="color: red;">Delete</a>
            </td>
        </tr>
    </table>
    <br>
    <a href="/library/add">Add Book</a>
</body>
</html>