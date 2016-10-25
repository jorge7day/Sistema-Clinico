/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package controller;

import entity.Paciente;
import entity.Persona;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.util.converter.DateStringConverter;
import model.DepartamentoModel;
import model.MunicipioModel;
import model.PacienteModel;
import model.PersonaModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;


/**
 *
 * @author Daniel
 */

@Controller
public class PacienteController {
    
    @RequestMapping("index")
    public ModelAndView redireccio()
    {
        
        ModelAndView MV= new ModelAndView();
        MV.setView("index");
        
        
        return MV;
    }
    
    
    
    //Para mostrarlos en la tabla
    @RequestMapping(value="getAll",method = RequestMethod.GET)
    public String getAll(Model m){
        
        m.addAttribute("listaPacientes",(new PacienteModel()).getAll());
        
        return "pacientes2"; //Pag donde se muestran los datos
    }
    
    //Para eliminar
    
//    @RequestMapping(value = "remove", method = RequestMethod.GET)
//    public String remove(@RequestParam(value = "idAfiliado") String idAfiliado, Model m) {
//
//        //java.math.BigDecimal bd = new java.math.BigDecimal(String.valueOf(idAfiliado));
//        PacienteModel model = new PacienteModel();
//        Pacientes e = new Pacientes();
//        e = model.getPacientes(idAfiliado);
//        model.remove(e);
//
//
//        return "redirect:getAll.htm";
//    }
    
    //Crear Paciente
    @RequestMapping(value="crear",method = RequestMethod.GET)
    public String create(Model m)
    {
        //  java.math.BigDecimal bd=new java.math.BigDecimal(String.valueOf(id));
        //PacienteModel model= new PacienteModel();
        Paciente p =new Paciente();
        
        
        m.addAttribute("p",p);
        
        return "crearPacientes"; //redireccion a pagina donde se hará el proceso de guardar
    }
    
    @RequestMapping(value = "add",method=RequestMethod.POST)
    public String create(
            @RequestParam(value = "idAfiliado") BigDecimal idAfiliado,
            @RequestParam(value = "idPersona") BigDecimal idPersona,
            @RequestParam(value = "nombre") String nombre,
            @RequestParam(value = "apellido") String apellido,
            @RequestParam(value = "direccion") String direccion,
            @RequestParam(value = "fechaNacimiento") String fechaNacimiento,
            @RequestParam(value = "dui") String dui,
            @RequestParam(value = "genero") char genero,
            @RequestParam(value = "profesion") String profesion,
            @RequestParam(value = "conyuge") String conyuge,
            @RequestParam(value = "estadoCivil") String estadoCivil,
            @RequestParam(value = "codDepartamento") BigDecimal codDepartamento,
            @RequestParam(value = "codMunicipio") BigDecimal codMunicipio,
            @RequestParam(value = "padre") String padre,
            @RequestParam(value = "madre") String madre
    )
    {
        Persona p = new Persona();
        
        //Convirtiendo la fecha:
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fNacimiento;
        
        fNacimiento = new Date();
        try {
            fNacimiento = format.parse(fechaNacimiento);
        } catch (ParseException ex) {
            fNacimiento = new Date();
        }
        
        p.setCodPersona(idPersona);
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setDireccion(direccion);
        p.setFechaNacimiento(fNacimiento);
        p.setConyuge(conyuge);
        p.setEstadoCivil(estadoCivil);
        p.setDui(dui);
        p.setGenero(genero);
        p.setProfesion(profesion);
        p.setPadre(padre);
        p.setMadre(madre);
        
        p.setDepartamento((new DepartamentoModel().getDepartamentoById(codDepartamento)));
        p.setMunicipio((new MunicipioModel()).getMunicipioById(codMunicipio));
        
        (new PersonaModel()).create(p);
        
        Paciente paciente = new Paciente();
        
        paciente.setPersona(p);
        paciente.setIdAfiliado(idAfiliado);
        
        PacienteModel model=new PacienteModel();
        model.create(paciente);
        
        return "redirect:getAll.htm";
        
        
    }
    
    @RequestMapping(value="edit",method = RequestMethod.GET)
    public String edit(@RequestParam(value="idAfiliado") BigDecimal idAfiliado, Model m)
    {
        //java.math.BigDecimal bd=new java.math.BigDecimal(String.valueOf(idAfiliado));
        PacienteModel model= new PacienteModel();
        
        Paciente p =new Paciente();
//        Departamento dp=new Departamento();
//        DepartamentoModel dpModel= new DepartamentoModel();
p=model.getPacienteById(idAfiliado); //Se obtiene el paciente segun si Id que es un String
//        dp=dpModel.getDepartamento(p.getDepartamento().getId());

m.addAttribute("p",p);
//m.addAttribute("d", dp);
//  m.addAttribute("d",p.getDepartamento());

return "editarPacientes"; //pagina a donde llegará
    }
    
    @RequestMapping(value = "update",method=RequestMethod.POST)
    public String update(
            @RequestParam(value = "idAfiliado") BigDecimal idAfiliado,
            @RequestParam(value = "idPersona") BigDecimal idPersona,
            @RequestParam(value = "nombre") String nombre,
            @RequestParam(value = "apellido") String apellido,
            @RequestParam(value = "direccion") String direccion,
            @RequestParam(value = "fechaNacimiento") String fechaNacimiento,
            @RequestParam(value = "dui") String dui,
            @RequestParam(value = "genero") char genero,
            @RequestParam(value = "profesion") String profesion,
            @RequestParam(value = "estadoCivil") String estadoCivil,
            @RequestParam(value = "conyuge") String conyuge,
            @RequestParam(value = "codDepartamento") BigDecimal codDepartamento,
            @RequestParam(value = "codMunicipio") BigDecimal codMunicipio,
            @RequestParam(value = "padre") String padre,
            @RequestParam(value = "madre") String madre
    )
            
    {
        
//        PacienteModel model = new PacienteModel();
        
//        Paciente p = model.getPacientes(idAfiliado);
        Persona p = new Persona();
        
        //Convirtiendo la fecha:
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date fNacimiento;
        
        fNacimiento = new Date();
        try {
            fNacimiento = format.parse(fechaNacimiento);
        } catch (ParseException ex) {
            fNacimiento = new Date();
        }
        
        p.setCodPersona(idPersona);
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setDireccion(direccion);
        p.setFechaNacimiento(fNacimiento);
        p.setConyuge(conyuge);
        p.setEstadoCivil(estadoCivil);
        p.setDui(dui);
        p.setGenero(genero);
        p.setProfesion(profesion);
        p.setPadre(padre);
        p.setMadre(madre);
        
        p.setDepartamento((new DepartamentoModel().getDepartamentoById(codDepartamento)));
        p.setMunicipio((new MunicipioModel()).getMunicipioById(codMunicipio));
        
        (new PersonaModel()).update(p);
        
        Paciente paciente = new Paciente();
        
        paciente.setPersona(p);
        paciente.setIdAfiliado(idAfiliado);
        
        PacienteModel model=new PacienteModel();
        model.update(paciente);
        
        return "redirect:getAll.htm";
    }
}
