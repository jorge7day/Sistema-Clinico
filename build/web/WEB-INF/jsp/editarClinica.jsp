<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags"%>


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
        <title>Crear Pacientes</title>
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
                <li class="bold active"><a href="pacientes2.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Pacientes</a></li>
                <li class="bold"><a href="medicos.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Médicos</a></li>
                
                
                <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">settings</i>Laboratoristas</a></li>
                <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Enfermeras</a></li>
                <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Secretarias</a></li>
                <li class="bold active"><a href="clinicas.htm" class="waves-effect waves-teal"><i class="material-icons">create</i>Clínicas</a></li>
                <li class="bold"><a href="index.htm" class="waves-effect waves-teal"><i class="material-icons">create</i>Cerrar Sesión</a></li>
                
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
            
            
            
            <!-- tabla de resultados -->
            <a href="getAll.htm" class="waves-effect waves-teal btn"><i class="material-icons">book</i>Ver Pacientes</a>
            <!--<a class="waves-effect waves-light btn modal-trigger #ffd600 yellow accent-4"  href="#modal1" id="addbuton"><i class="material-icons left ">book</i>Ver lista de pacientes</a>-->
            
            <div class ="row"></div>
            <div class="modal-content">
                <f:form action="updateClinica.htm" modelAttribute="Clinica" method="POST">
                    
                    
                    <div class="row">
                        <div class="input-field col s4">
                            <label for="idid">ID Clínica</label>
                            <input type="text" name="codClinica" id="idAfiliado" value="${p.codClinica}"/>
                        </div>
                        
                        
                        <div class="input-field col s4">
                            <label for="nombreid">Nombre</label>
                            <input type="text" name="nombre" id="nombreid" value="${p.nombre}"/>
                        </div>
                        <div class="input-field col s4">
                            <label for="nombreid">Teléfono</label>
                            <input type="text" name="telefono" id="nombreid" value="${p.telefono}"/>
                        </div>
                        
                        <div class="input-field col s4">
                            <label for="apellidoid">Direccion</label>
                            <input type="text" name="direccion" id="apellidoid" value="${p.direccion}"/>
                        </div> 
                    </div>
                    <div class="row">
                        <div class="input-field col s4">
                            <input id="direccion"  name="codDepartamento" type="text" class="validate" value ="${p.departamento.codDepartamento}">
                            <label for="direccion">Departamento</label>
                        </div>
                        <div class="input-field col s4">
                            <input id="direccion"  name="codMunicipio" type="text" class="validate" value ="${p.municipio.codMunicipio}">
                            <label for="direccion">Municipio</label>
                        </div>
                    </div>
                </div>
                
                <button class="btn waves-effect waves-light" type="submit" name="">Guardar Paciente</button>
                
                <input type="submit" value="Guardar Paciente"/>
            </f:form>
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