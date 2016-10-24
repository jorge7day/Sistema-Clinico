<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">
    
<head>
    <c:url value="/resources/css/materialize.min.css" var="materializeURL"/>
    <c:url value="/resources/images/Logo.png" var="logoURL"/>
    
  <!--<meta charset="UTF-8">-->
  <link rel="shortcut icon" href="${logoURL}">
  <!--Import Google Icon Font-->
  <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
  <!--Import materialize.css-->
  <link rel="stylesheet" href="${materializeURL}"/>

  <title>Inicio</title>
</head>
<body>


<header>
  <div class="container "><a href="#" data-activates="nav-mobile" class="button-collapse top-nav waves-effect waves-light circle hide-on-large-only"><i class="material-icons">menu</i></a></div>
        <ul id="nav-mobile" class="side-nav fixed">
            <img src="resources/images/Logo3.png" width="300px" />

          <li><div class="divider"></div></li>

          <li class="bold"><a href="usuarios.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Usuarios</a></li>
          <li class="bold"><a href="pacientes2.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Pacientes</a></li>
          <li class="bold"><a href="medicos.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Médicos</a></li>


           <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">settings</i>Laboratoristas</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Enfermeras</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Secretarias</a></li>
            <li class="bold"><a href="clinicas.htm" class="waves-effect waves-teal"><i class="material-icons">create</i>Clinicas</a></li>
            <li class="bold"><a href="index.htm" class="waves-effect waves-teal"><i class="material-icons">create</i>Cerrar Sesión</a></li>

          </ul>
</header>
<!-- FIN Barra Lateral-->


  <script type="js/jquery.js"></script>
  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="resources/js/materialize.min.js"></script>

  <script>
     		    $(document).ready(function(){
            $(".button-collapse").sideNav();
            });
  </script>

</body>
</html>
