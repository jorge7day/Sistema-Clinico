<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
  <html>
      
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
      <title>Pacientes</title>
</head>

   <body>


<!--Barra Lateral-->
<header>
  <div class="container "><a href="#" data-activates="nav-mobile" class="button-collapse top-nav waves-effect waves-light circle hide-on-large-only"><i class="material-icons">menu</i></a></div>
        <ul id="nav-mobile" class="side-nav fixed">
          <img src="resources/images/Logo3.png" width="300px">

          <li><div class="divider"></div></li>

          <li class="bold"><a href="principal.htm" class="waves-effect waves-teal"><i class="material-icons">home</i>Inicio</a></li>
          <li class="bold active"><a href="pacientes2.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Pacientes</a></li>
          <li class="bold"><a href="medicos.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Médicos</a></li>


           <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">settings</i>Laboratoristas</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Enfermeras</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Secretarias</a></li>
            <li class="bold"><a href="clinicas.htm" class="waves-effect waves-teal"><i class="material-icons">create</i>Clínicas</a></li>
            <li class="bold"><a href="index.htm" class="waves-effect waves-teal"><i class="material-icons">create</i>Salir</a></li>

          </ul>
</header>
<!-- FIN Barra Lateral-->


<!-- barra de busqueda-->

  <main>

  <nav>
    <div class="nav-wrapper #880e4f pink darken-4">
      <form>
        <div class="input-field">

          <input id="search" type="search" required placeholder="Buscar">
          <label for="search"><i class="material-icons">search</i></label>
          <i class="material-icons">close</i>
        </div>
      </form>
    </div>
  </nav>
  <br>


<!-- formulario en un modal -->
    <!-- Modal Trigger -->
  <a class="waves-effect waves-light btn modal-trigger #ffd600 yellow accent-4"  href="#modal1" id="addbuton"><i class="material-icons left ">person_add</i>Agregar paciente</a>
  <a href="crear.htm" class="waves-effect waves-teal btn"><i class="material-icons">book</i>Crear Pacientes 2</a>
  
  <!-- Modal Structure -->
  <div id="modal1" class="modal">
    <div class="modal-content">

      <h4>Agregar paciente</h4>
      <div class="divider"></div>
      <div class="row">
    <form class="col s12" action="#">
      <div class="row">
        <div class="input-field col s6">

          <input id="name" type="text" class="validate" required="">
          <label for="name">Nombres</label>
        </div>
        <div class="input-field col s6">

          <input id="lastName" type="text" class="validate" required="">
          <label for="lastName">Apellidos</label>
        </div>
      </div>

      <div class="row">
        <div class="input-field col s6">

           <input type="date" class="datepicker" id="burnDate" required="">
           <label for="burnDate">Fecha de nacimiento</label>
        </div>
        <div class="input-field col s6">

          <input id="icon_telephone" type="tel" class="validate" required="">
          <label for="icon_telephone">Dirección</label>
        </div>
      </div>

      <div class="row">
         <div class="input-field col s3">
            <input id="document" type="text" length="10" required="">
            <label for="document">Identificación </label >
          </div>

              <div class="input-field col s3">
              <select required="Falta este campo">
                <option value="" disabled selected>Elige una opción </option>
                <option value="1">Masculino</option>
                <option value="2">Femenino</option>

              </select>
           <label>Género </label>
              </div>

        <div class="input-field col s6">

          <input id="profecion" type="tel" class="validate" required="">
          <label for="profecion">Profecion u oficio</label>
        </div>

      </div>
        <div class="row">
        <div class="input-field col s6">

          <input id="padre" type="text" class="validate" required="">
          <label for="padre">Nombre del padre</label>
        </div>
        <div class="input-field col s6">

          <input id="madre" type="tel" class="validate" required="">
          <label for="madre">Nombre de la madre</label>
        </div>
      </div>
      <div class="row">
      <div class="input-field col s6">
              <select required="Falta este campo">
                <option value="" disabled selected>Elige una opción </option>
                <option value="1">Casado</option>
                <option value="2">Soltero</option>
                <option value="3">Acompañado </option>s
                <option value="4">Viudo </option>



              </select>
           <label>Estado civil </label>
              </div>

        <div class="input-field col s6">

          <input id="esposo" type="text" class="validate" >
          <label for="esposo">Nombre del conyuge</label>
        </div>

      </div>


  <button class="btn waves-effect waves-light" type="submit" name="action">Guardar</button>

    <a href="#!" class=" modal-action modal-close waves-effect #e53935 red darken-1 waves-red btn-flat white-text">Cancelar</a>

    </form>
  </div>



    </div>
    <div class="modal-footer">

    </div>
  </div>



<!-- tabla de resultados -->
<a href="getAll.htm" class="waves-effect waves-teal btn"><i class="material-icons">book</i>Ver Pacientes</a>
<!--<a class="waves-effect waves-light btn modal-trigger #ffd600 yellow accent-4"  href="#modal1" id="addbuton"><i class="material-icons left ">book</i>Ver lista de pacientes</a>-->

<div class ="row"></div>
<div class="container">
<table class="highlight centered">
        <thead>
          <tr>
              <th data-field="id">Id afiliado </th>
              <th data-field="name">Apellido</th>
              <th data-field="price">Nombre</th>
              <th data-field="price">genero</th>
              <th data-field="price">opciones</th>
          </tr>
        </thead>

        <c:forEach items="${listaPacientes}" var="pac">
        <tbody>
          <tr>
              
            <td>${pac.persona.codPersona}</td>
          <td>${listaPersonas.getPersonas(pac.persona.codPersona).nombre}</td>
            
           
         
            
            
            <td>
            <a href="edit.htm?id=${pac.idAfiliado}">Editar </a>
            <a href="remove.htm?id=${pac.idAfiliado}" onclick="return confirm('Are you sure?')"> Eliminar</a>
            </td>
          </tr>
          
<!--          <tr>
            <td>Alan</td>
            <td>Jellybean</td>
            <td>6754315-1</td>
            <td>24/2/1998</td>

          </tr>
          <tr>
            <td>Jonathan</td>
            <td>Lollipop</td>
            <td>6543245-7</td>
            <td>24/2/1998</td>
          </tr>-->
        
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
             $('.modal-trigger').leanModal();
            });

             $('.datepicker').pickadate({
              selectMonths: true, // Creates a dropdown to control month
               selectYears: 15 // Creates a dropdown of 15 years to control year
              });

             $('select').material_select();
  </script>

</body>
</html>

