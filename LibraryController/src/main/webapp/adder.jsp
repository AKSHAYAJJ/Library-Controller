<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Add Book</title>
</head>
<body>
    <h2>Add Book</h2>
    <form th:action="@{/library/add}" th:object="${book}" method="post">
        <label>Title: <input type="text" th:field="*{title}" required></label><br>
        <label>Author: <input type="text" th:field="*{author}" required></label><br>
        <button type="submit">Add</button>
    </form>
    <a href="/library/view">Back to Library</a>
</body>
</html>