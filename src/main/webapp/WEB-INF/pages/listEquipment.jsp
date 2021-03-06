<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->

    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css"
          integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4"
          crossorigin="anonymous">


    <title>Все тяхника</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>

    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
                <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="listEquipment">ВСЕ ТМЦ</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="welcome">+ ТМЦ</a>
            </li>
        </ul>
        <form class="form-inline my-2 my-lg-0">
            <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
        </form>
    </div>
</nav>
<form action="/monitor/monitors" method="post">
<button type="submit" class="btn btn-success">
    Мониторы <span class="badge badge-light"><c:out value="${amountMonitors}" /></span>
</button>
</form>
<button type="button" class="btn btn-success">
    Ноутбуки <span class="badge badge-light"><c:out value="${amountLaptops}" /></span>
</button>
<button type="button" class="btn btn-success">
    Антены <span class="badge badge-light"><c:out value="${amountAntenas}" /></span>
</button>
<button type="button" class="btn btn-success">
    Аккамуляторы <span class="badge badge-light"><c:out value="${amountBattaries}" /></span>
</button>
<button type="button" class="btn btn-success">
    Принтеры <span class="badge badge-light"><c:out value="${amountPrinters}" /></span>
</button>
<button type="button" class="btn btn-success">
    Компьютеры <span class="badge badge-light"><c:out value="${amountComputers}" /></span>
</button>
<button type="button" class="btn btn-success">
    Коммутаторы <span class="badge badge-light"><c:out value="${amountCommutators}" /></span>
</button>
<button type="button" class="btn btn-success">
    NetCards <span class="badge badge-light"><c:out value="${amountNetCards}" /></span>
</button>
<button type="button" class="btn btn-success">
    Терминалы <span class="badge badge-light"><c:out value="${amountTerminals}" /></span>
</button>
<button type="button" class="btn btn-success">
    WifiCards <span class="badge badge-light"><c:out value="${amountWifiCards}" /></span>
</button>
<button type="button" class="btn btn-success">
    Серверы <span class="badge badge-light"><c:out value="${amountServers}" /></span>
</button>
<button type="button" class="btn btn-success">
    WifiDot <span class="badge badge-light"><c:out value="${amountWifiDots}" /></span>
</button>
<button type="button" class="btn btn-success">
    UPS <span class="badge badge-light"><c:out value="${amountUps}" /></span>
</button>
<button type="button" class="btn btn-success">
    Базы Терминалов <span class="badge badge-light"><c:out value="${amountTerminalDots}" /></span>
</button>
<button type="button" class="btn btn-success">
    Телефоны <span class="badge badge-light"><c:out value="${amountTelephones}" /></span>
</button>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script
        src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"
        integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ"
        crossorigin="anonymous"></script>
<script
        src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"
        integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm"
        crossorigin="anonymous"></script>
</body>
</html>
