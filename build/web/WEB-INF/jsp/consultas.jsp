<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
 <html>
<head>
<html lang="en">
<c:url value="/resources/images/Logo.png" var="logoURL"/>
        <c:url value="/resources/css/materialize.min.css" var="materializeURL"/>
        <c:url value="/resources/css/index.css" var="indexURL"/>
        <c:url value="/resources/css/ghpages-materialize.css" var="ghpagesURL"/>
        <c:url value="/resources/css/prism.css" var="primURL"/>
               
    <meta charset="UTF-8">
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
      <title>Consultas Médicas</title>
</head>
<body>



<!--Barra Lateral-->
<header>
  <div class="container "><a href="#" data-activates="nav-mobile" class="button-collapse top-nav waves-effect waves-light circle hide-on-large-only"><i class="material-icons">menu</i></a></div>
        <ul id="nav-mobile" class="side-nav fixed">
          <img src="Images/logo3.png" width="300px">

          <li><div class="divider"></div></li>

          <li class="bold"><a href="libro_diario.html" class="waves-effect waves-teal"><i class="material-icons">book</i>Pacientes</a></li>

          <li class="no-padding">
            <ul class="collapsible collapsible-accordion">
              <li class="bold "><a class="collapsible-header  waves-effect waves-teal"><i class="material-icons ">assessment</i>MÃ©dicos</a>
                <div class="collapsible-body">
                  <ul>
                    <li><a href="balance_comprobacion.html">Balance de comprobaciÃ³n</a></li>
                    <li><a href="estado_resultados.html">Estado de resultados</a></li>
                    <li><a href="estado_capital.html">Estado de capital </a></li>
                    <li><a href="balance_general.html">Balance general</a></li>
                  </ul>
                </div>
              </li>

           <li class="bold"><a href="ajustes_financieros.html" class="waves-effect waves-teal"><i class="material-icons">settings</i>Laboratoristas</a></li>
           <li class="bold"><a class="collapsible-header  waves-effect waves-teal"><i class="material-icons">create</i>Enfermeras</a>
           <li class="bold"><a class="collapsible-header  waves-effect waves-teal"><i class="material-icons">create</i>ClÃ­nicas</a>
                <div class="collapsible-body">
                    <ul>
                          <li><a href="empleados.html">Empleados</a></li>
                          <li><a href="usuarios.html">Usuarios</a></li>
                          <li><a href="proveedores.html">Proveedores</a></li>
                    </ul>
                </div>
            </li>
          </ul>
        </li>

        <li class="bold"><a href="login.html" class="waves-effect waves-teal"><i class="material-icons">close</i>Salir</a></li>
      </ul>
</header>
<!-- FIN Barra Lateral-->
<main>
  

   <div class="section no-pad-bot #880e4f pink darken-4" id="ini">
         <div class="container ">
          <h2 class="white-text left thin">Registro de consultas medicas</h2>
          <div class='row center'>
          </div>
        </div>
        </div>


        <!--Barra de búsqueda-->
        <div class="container">
        <nav>
                <div class="nav-wrapper #ffd600 yellow accent-4">
                  <form>
                    <div class="input-field">
        
                      <input id="search" type="search" required placeholder="Buscar paciente">
                      <label for="search"><i class="material-icons">search</i></label>
                                 <i class="material-icons">close</i>
                   </div>
                  </form>
                </div>
              </nav>

              <br>
              </div>



        <form>


            <div class="container">
            <div class="input-field col s12">
            <textarea id="textarea1" class="materialize-textarea" length="500"></textarea>
            <label for="textarea1">SintomatologÃ­a</label>
            </div>

             
            <div class="input-field col s12">
            <textarea id="textarea2" class="materialize-textarea" length="500"></textarea>
            <label for="textarea2">Diagnostico</label>
            </div>

            <div class="input-field col s12">
            <textarea id="textarea3" class="materialize-textarea" length="500"></textarea>
            <label for="textarea3">Tratamiento mÃ©dico</label>
            </div>

            <div class="row">

          <div class="input-field col s6">
          <input id="medicamento" type="text" class="validate">
          <label for="medicamento">Medicamentos</label>
          </div>

          <div class="input-field col s6">
          <input id="medico" type="text" class="validate">
          <label for="medico">MÃ©dico que atendiÃ³</label>
            </div>


            <div class="row">

      
          </div>
          <div class="input-field col s6">
          
           <input type="date" class="datepicker" id="Date" required="">
           <label for="Date">Fecha</label>

        </div>
        <div class="input-field col s6">
          <input id="hora" type="text" class="validate">
          <label for="hora">Hora</label>
          </div>
          </div>


          <button class="btn waves-effect waves-light" type="submit" name="action">Guardar
         <i class="material-icons right">send</i>
          </button>




        </form>







</main>


  <script type="js/jquery.js"></script>
  <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
  <script type="text/javascript" src="resources/js/materialize.min.js"></script>

  <script>
     		    $(document).ready(function(){
            $(".button-collapse").sideNav();
            });
             $('input#input_text, textarea#textarea1').characterCounter();
             $('.datepicker').pickadate({
              selectMonths: true, // Creates a dropdown to control month
               selectYears: 15 // Creates a dropdown of 15 years to control year
              });
  </script>

</body>
</html>
