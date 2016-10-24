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

          <li class="bold"><a href="pacientes2.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Pacientes</a></li>
          <li class="bold"><a href="Medicos.html" class="waves-effect waves-teal"><i class="material-icons">book</i>Médicos</a></li>


           <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">settings</i>Laboratoristas</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Enfermeras</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Secretarias</a></li>
            <li class="bold active"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Clínicas</a></li>
            <li class="bold"><a href="login.html" class="waves-effect waves-teal"><i class="material-icons">create</i>Salir</a></li>

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

  <!-- Modal Trigger -->
  <br>
        <br>
  <a class="waves-effect waves-light btn modal-trigger" href="#modal1"><i class="material-icons left">person_add</i>Agregar Clínica</a>

  <!-- Modal Structure -->
  <div id="modal1" class="modal">
    <div class="modal-content">
        
        
      <h4>Agregar Clínica</h4>
    </div>


  <div class="row">
            <form class="col s12">
              <div class="row">
                  <div class="input-field col s3">
                  <input id="id" type="text" class="validate">
                  <label for="id">ID</label>
                </div>
                  
                <div class="input-field col s3">
                  <input id="Sucursal" type="text" class="validate">
                  <label for="Sucursal">Nombre de la Sucursal</label>
                </div>
                <div class="input-field col s3">
                  <input id="Dirección" type="text" class="validate">
                  <label for="Dirección">Dirección</label>
                </div>
                <div class="input-field col s3">
                  <input id="telefono" type="text" class="validate">
                  <label for="telefono">Teléfono</label>
                </div>
              </div>
              </div>

               

              <div class="row">
                  <div class="input-field col s6">
                        <select>
                          <option value="" disabled selected>Seleccionar Departamento</option>
                          <option value="1">San Salvador</option>
                          <option value="2">Santa Ana</option>
                          <option value="3">Morazán</option>
                          <option value="4">La Unión</option>
                          <option value="5">San Miguel</option>
                          <option value="6">Cuscatlán</option>

                        </select>
                        <label>Departamento</label>
                      </div>

                      <div class="input-field col s6">
                        <select>
                          <option value="" disabled selected>Seleccionar Municipio</option>
                          <option value="1">Opción 1</option>
                          <option value="2">Opción 2</option>
                          <option value="3">Opción 3</option>
                        </select>
                        <label>Municipio</label>

                      </div>
                  </div>

                  <!--Botones guardar/cancelar -->
                <div class="row">
                  <div class="col m6 offset-m6">
                      <button class="btn waves-effect waves-light" type="submit" name="action">Guardar</button>
                          <a href="#!" class=" modal-action modal-close waves-effect #e53935 red darken-1 waves-red btn-flat white-text">Cancelar</a>
                       </div>
                </div>
                
            </form>
          </div>
                    
  </div>

   <!-- FIN MODAL AGREGAR Clinica--> 

      

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

