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
                <li class="bold"><a href="pacientes2.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Usuarios</a></li>
                <li class="bold active"><a href="pacientes2.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Pacientes</a></li>
                <li class="bold"><a href="medicos.htm" class="waves-effect waves-teal"><i class="material-icons">book</i>Médicos</a></li>
                
                
                <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">settings</i>Laboratoristas</a></li>
                <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Enfermeras</a></li>
                <li class="bold"><a href="" class="waves-effect waves-teal"><i class="material-icons">create</i>Secretarias</a></li>
                <li class="bold"><a href="clinicas.htm" class="waves-effect waves-teal"><i class="material-icons">create</i>Clínicas</a></li>
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
                <f:form action="add.htm" modelAttribute="Pacientes">
                    
                    
                    <div class="row">
                        <div class="input-field col s4">
                            <label for="idid">ID Afiliado</label>
                            <input type="text" name="idAfiliado" id="idAfiliado" value=""/>
                        </div>
                        <div class="input-field col s4">
                            <label for="idid">ID Persona</label>
                            <input type="text" name="idPersona" id="idAfiliado" value=""/>
                        </div>
                        
                        
                        <div class="input-field col s4">
                            <label for="nombreid">Nombres</label>
                            <input type="text" name="nombre" id="nombreid" value=""/>
                        </div>
                        
                        <div class="input-field col s4">
                            <label for="apellidoid">Apellidos</label>
                            <input type="text" name="apellido" id="apellidoid" value=""/>
                        </div>
                        <div class="input-field col s4">
                            
                            <input id="estadoCivil" name ="estadoCivil" type="text" class="validate" value="${p.persona.estadoCivil}">
                            <label for="estadoCivil">Estado Civil</label>
                        </div>
                        <div class="input-field col s4">
                            
                            <input id="conyuge" name ="conyuge" type="text" class="validate" value="${p.persona.conyuge}">
                            <label for="conyuge">Conyuge</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s4">
                            
                            <input type="date" name ="fechaNacimiento" id="fechaNacimiento" >
                            <label for="fechaNacimiento">Fecha de nacimiento</label>
                        </div>
                        <div class="input-field col s4">
                            
                            <input id="direccion"  name="direccion" type="text" class="validate">
                            <label for="direccion">Dirección</label>
                        </div>
                        
                        <div class="input-field col s4">
                            
                            <input id="codMunicipio"  name="codMunicipio" type="text" class="validate" value="${p.persona.municipio.codMunicipio}">
                            <label for="codMunicipio">Código del Municipio</label>
                        </div>
                        <div class="input-field col s4">
                            
                            <input id="codDepartamento"  name="codDepartamento" type="text" class="validate" value="${p.persona.departamento.codDepartamento}">
                            <label for="codDepartamento">Código del Departamento</label>
                        </div>
                    </div>
                    
                    <div class="row">
                        <div class="input-field col s4">
                            <input id="dui" name ="dui" type="text" length="10" >
                            <label for="dui">DUI </label >
                        </div>
                        
                        <div class="input-field col s4">
                            <select id="genero" name ="genero">
                                <!--<option value="" selected>Elige una opción </option>-->
                                <option value="M">Masculino</option>
                                <option value="F">Femenino</option>
                                
                            </select>
                            <label>Género </label>
                        </div>
                        
                        <div class="input-field col s4">
                            
                            <input id="profesion" name ="profesion" type="text" class="validate">
                            <label for="profesion">Profesión u oficio</label>
                        </div>
                        
                    </div>
                    
                    <div class="row">
                        <div class="input-field col s6">
                            
                            <input id="padre" type="text" class="validate" name="padre">
                            <label for="padre">Nombre del padre</label>
                        </div>
                        <div class="input-field col s6">
                            
                            <input id="madre" type="tel" class="validate" name="madre" >
                            <label for="madre">Nombre de la madre</label>
                        </div>
                    </div>       
                    <button class="btn waves-effect waves-light" type="submit" name="">Guardar Paciente
                        <!--    <i class="material-icons right">send</i>-->
                    </button>
                    
                    <a class="waves-effect waves-light btn red"  href="pacientes2.htm"><i class="material-icons left ">person_add</i>Cancelar</a>
                    
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

