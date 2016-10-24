<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
  <html>
    <head>
    <head>
        <c:url value="/resources/images/Logo.png" var="logoURL"/>
        <c:url value="/resources/css/materialize.min.css" var="materializeURL"/>
        <c:url value="/resources/css/index.css" var="indexURL"/>
        <c:url value="/resources/css/ghpages-materialize.css" var="ghpagesURL"/>
        <c:url value="/resources/css/prism.css" var="primURL"/>
               
    <!--<meta charset="UTF-8">-->
    <link rel="shortcut icon" href="${logoURL}">
      <!--Import Google Icon Font-->
      <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="${materializeURL}"  media="screen,projection"/>
      <link type="text/css" rel="stylesheet" href="${indexURL}"  media="screen,projection"/>
      <link href="${primURL}" rel="stylesheet">
  	  <link href="${ghpagesURL}" type="text/css" rel="stylesheet" media="screen,projection">

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
      <title>Clínicas</title>
</head>

   <body>


<!--Barra Lateral-->
<header>
  <div class="container "><a href="#" data-activates="nav-mobile" class="button-collapse top-nav waves-effect waves-light circle hide-on-large-only"><i class="material-icons">menu</i></a></div>
        <ul id="nav-mobile" class="side-nav fixed">
           <img src="resources/images/Logo3.png" width="300px">

          <li><div class="divider"></div></li>

          <li class="bold"><a href="principal.htm" class="waves-effect waves-teal"><i class="material-icons">home</i>Inicio</a></li>
          <li class="bold"><a href="usuarios.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Usuarios</a></li>
          <li class="bold"><a href="pacientes2.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Pacientes</a></li>
          <li class="bold"><a href="Medicos.html" class="waves-effect waves-teal"><i class="material-icons">book</i>Médicos</a></li>


           <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">settings</i>Laboratoristas</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Enfermeras</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Secretarias</a></li>
            <li class="bold active"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Clínicas</a></li>
            <li class="bold"><a href="index.htm" class="waves-effect waves-teal"><i class="material-icons">create</i>Cerrar Sesión</a></li>

          </ul>
</header>
<!-- FIN Barra Lateral-->


<main>
  <!-- barra de busqueda-->
  <nav>
    <div class="nav-wrapper">
      <form>
        <div class="input-field">
          <input id="search" type="search" placeholder ="Buscar Clínica" required>
          <label for="search"><i class="material-icons">search</i></label>
          <i class="material-icons">close</i>
        </div>
      </form>
    </div>
  </nav>
  <!-- FINbarra de busqueda--> 


  <!-- AGREGAR Clínica--> 
  <br>
    <a href="crearClinicas.htm" class="waves-effect waves-teal btn"><i class="material-icons">book</i>Crear Clínica</a>
  
<!-- tabla de resultados -->
<a href="getAllClinicas.htm" class="waves-effect waves-teal btn"><i class="material-icons">book</i>Ver Clínicas</a>
  <br>
  <br>
  
<div class="container">
<table class="highlight centered">
        <thead>
          <tr>
              <th data-field="id">ID </th>
              <th data-field="name">Sucursal</th>
              <th data-field="price">Direccion</th>
              <th data-field="price">Teléfono</th>   
              <th data-field="price">Opciones</th>  
          </tr>
        </thead>

        <c:forEach items ="${listaClinicas}" var ="pac">
        <tbody>
          <tr>
            <td>${pac.codclinica}</td>
            <td>${pac.nombre}</td>
            <td>${pac.direccion}</td>
            <td>${pac.telefono}</td>
            
            <td>
            <a href="editClinicas.htm?codlinica=${pac.codclinica}">Editar </a>
            
            </td>
          </tr>        
        </tbody>
        </c:forEach>
      </table>
    
</div>

      

</main>

  <script type="js/jquery.js"></script>
  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="resources/js/materialize.min.js"></script>

  <script>
            $(document).ready(function(){
           
            $(".button-collapse").sideNav();
            });
  

              $(document).ready(function(){
                // the "href" attribute of .modal-trigger must specify the modal ID that wants to be triggered
                $('.modal-trigger').leanModal();
              });

              $(document).ready(function() {
              $('select').material_select();
              });
  </script>


</body>
</html>

