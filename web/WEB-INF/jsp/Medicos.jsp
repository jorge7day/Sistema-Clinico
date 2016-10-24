<jsp:include page="plantilla head.jsp"></jsp:include>
<title>Médicos</title>
</head>

   <body>


<!--Barra Lateral-->
<header>
  <div class="container "><a href="#" data-activates="nav-mobile" class="button-collapse top-nav waves-effect waves-light circle hide-on-large-only"><i class="material-icons">menu</i></a></div>
        <ul id="nav-mobile" class="side-nav fixed">
          <img src="resources/images/Logo3.png" width="300px">

          <li><div class="divider"></div></li>

          <li class="bold"><a href="principal.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Inicio</a></li>
          <li class="bold"><a href="pacientes2.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Pacientes</a></li>
          <li class="bold active"><a href="medicos.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Médicos</a></li>


           <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">settings</i>Laboratoristas</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Enfermeras</a></li>
            <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Secretarias</a></li>
            <li class="bold"><a href="clinicas.htm" class="waves-effect waves-teal"><i class="material-icons">create</i>Clínicas</a></li>
            <li class="bold"><a href="index.htm" class="waves-effect waves-teclinicas.htmal"><i class="material-icons">create</i>Salir</a></li>

          </ul>
</header>
<!-- FIN Barra Lateral-->


<main>
  <!-- barra de busqueda-->
  <nav>
    <div class="nav-wrapper">
      <form>
        <div class="input-field">
          <input id="search" type="search" placeholder ="Buscar Medico" required>
          <label for="search"><i class="material-icons">search</i></label>
          <i class="material-icons">close</i>
        </div>
      </form>
    </div>
  </nav>
  <!-- FINbarra de busqueda-->


  <!-- AGREGAR MEDICO-->

  <!-- Modal Trigger -->
   <div class="row"></div>
  <a class="waves-effect waves-light btn modal-trigger" href="#modal1"><i class="material-icons left">person_add</i>Agregar Medico</a>
  
  
  <!-- tabla de resultados -->
  <div class="row"></div>
  <div class="row"></div>
<div class="container">
<table class="highlight centered">
        <thead>
          <tr>
              <th data-field="id">Nombres</th>
              <th data-field="name">Apellidos</th>
              <th data-field="price">Documento de identidad</th>
              <th data-field="price">Fecha de nacimiento</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <td>Alvin</td>
            <td>Eclair</td>
            <td>051342-0</td>
            <td>24/2/1998</td>
          </tr>
          <tr>
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

          </tr>
        </tbody>
      </table>

</div>
  
  <!-- Modal Structure -->
  <div id="modal1" class="modal">
    <div class="modal-content">
      <h4>Agregar Medico</h4>
    </div>
      
  
  <div class="row">
            <form class="col s12">
              <div class="row">
                <div class="input-field col s6">
                  <input id="first_name" type="text" class="validate" maxlength="50">
                  <label for="first_name">Nombres</label>
                </div>
                <div class="input-field col s6">
                  <input id="last_name" type="text" maxlength="50" class="validate">
                  <label for="last_name">Apellidos</label>
                </div>
              </div>
              <div class="row">
                <div class="input-field col s6">

                   <input type="date" class="datepicker" id="burnDate" required="">
                   <label for="burnDate">Fecha de nacimiento</label>
                </div>
                  <div class="input-field col s6">

                   <div class="input-field col s6">
                       <select>
                           <option id="1">Soltero/a</option>
                           <option id="2">Casado/a</option>
                           <option id="3">Viudo/a</option>
                       </select>
                       <label>Estado civil</label>
                   </div>
                  
                </div>
              </div>
                <f:form action="addMedico" modelAtribute="Medico">
              <div class="row">
                  <div class="input-field col s6">
                        <select>
                          <option value="" disabled selected>Seleccionar Departamento</option>
                          <c:forEach items="${listaDepartamentos}" var="dep">
                          <option value="${dep.codDepartamento}">${dep.nombre}</option>
                          </c:forEach>

                        </select>
                        <label>Departamento de residencia</label>
                      </div>

                      <div class="input-field col s6">
                        <select>
                          <option value="" disabled selected>Seleccionar Municipio</option>
                          <c:forEach items="${listaMunicipios}" var="municipio">
                          <option value="${municipio.codMunicipio}">${municipio.nombre}</option>    
                              
                          </c:forEach>
                          
                         
                        </select>
                        <label>Municipio de residencia</label>

                      </div>
                <div class="input-field col s6"  >
                       <label for="first_name">Direccion</label>
                      <input id="direccion" type="text" class="validate" maxlength="50">
                  </div>

              <div class="row">
                <div class="input-field col s6">
                        <select>
                          <option value="" disabled selected>Seleccionar Clinica</option>
                          <c:forEach items="${listaClinicas}" var="clinica">
                              <option value="codClinica" >${clinica.nombre}</option>
                          </c:forEach>
                        </select>
                        <label>Clinica Asignada</label>

                      </div>

                <div class="input-field col s6">
                        <select>
                          <option value="" disabled selected>Seleccionar Especialidad</option>
                          <option value="1">Medico General</option>
                          <option value="2">Cardiologo</option>
                          
                        </select>
                        <label>Especialidad Medica</label>

                      </div>


              <div class="row">
                <div class="input-field col s6">
                  <input id="dui" type="text" class="validate" maxlength="50">
                  <label for="dui">DUI</label>
                </div>

                <div class="input-field col s6">
                  <input id="nit" type="text" class="validate">
                  <label for="nit">NIT</label>
              </div>
                    <div class="input-field col s6">
                        <select id="genero">
                            <option id="1">M</option>
                            <option id="2">F</option>
                        </select>
                  <label for="nit">Genero</label>
              </div>

              </div>
              <div class="row">
                <div class="input-field col s6">
                  <input id="usuario" type="text" class="validate">
                  <label for="usuario">Usuario</label>
                </div>

                <div class="input-field col s6">
                  <input id="password" type="text" class="validate">
                  <label for="password">Contraseña</label>
              </div>
 
              </div>
              
              <!--Botones guardar/cancelar -->
               <button class="btn waves-effect waves-light" type="submit" name="action">Guardar</button>

                 <a href="#!" class=" modal-action modal-close waves-effect #e53935 red darken-1 waves-red btn-flat white-text">Cancelar</a>
            </form>
          </div>
  </div>
   <!-- FIN AGREGAR MEDICO-->
   

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

              $('.datepicker').pickadate({
              selectMonths: true, // Creates a dropdown to control month
               selectYears: 15 // Creates a dropdown of 15 years to control year
              });

  </script>


</body>
</html>
