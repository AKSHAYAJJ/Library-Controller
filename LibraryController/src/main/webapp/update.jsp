<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Update Book</title>
</head>
<body>
    <h2>Update Book</h2>
    <form th:action="@{/library/update/{id}}" th:object="${book}" th:method="post">
        <input type="hidden" th:field="*{id}">
        <label>Title: <input type="text" th:field="*{title}" required></label><br>
        <label>Author: <input type="text" th:field="*{author}" required></label><br>
        <button type="submit">Update</button>
    </form>
    <a href="/library/view">Back to Library</a>
</body>
</html>