/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Paciente;
import java.math.BigDecimal;
import model.PacienteModel;
import model.PersonaModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    PacienteModel model= new PacienteModel();
    m.addAttribute("listaPacientes",model.getAll());
    
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
    public String create(@ModelAttribute(value="Pacientes") Paciente p)
    {
        
//        Departamento dp=new Departamento();
//        DepartamentoModel dpm=new DepartamentoModel();
//        dp=dpm.getDepartamento(BigDecimal.ONE);
//        p.setId(p.getId());
//        p.setDepartamento(dp);
        
        PacienteModel model=new PacienteModel();
        model.create(p);
        int a=0;
        if(a==0){
        return "redirect:getAll.htm";
        }
         return "index";
        
    }
    
    @RequestMapping(value="edit",method = RequestMethod.GET)
    public String edit(@RequestParam(value="idAfiliado") String idAfiliado, Model m)
    {
        //java.math.BigDecimal bd=new java.math.BigDecimal(String.valueOf(idAfiliado));
        PacienteModel model= new PacienteModel();
       
        Pacientes p =new Pacientes();
//        Departamento dp=new Departamento();
//        DepartamentoModel dpModel= new DepartamentoModel();
        p=model.getPacientes(idAfiliado); //Se obtiene el paciente segun si Id que es un String
//        dp=dpModel.getDepartamento(p.getDepartamento().getId());
        
        m.addAttribute("p",p);
        //m.addAttribute("d", dp);
      //  m.addAttribute("d",p.getDepartamento());
        
        return "editarPacientes"; //pagina a donde llegará
    }
    
    @RequestMapping(value = "update",method=RequestMethod.POST)
    public String update(
    @RequestParam(value = "idAfiliado") String idAfiliado,
    @RequestParam(value = "nombre") String nombre,
    @RequestParam(value = "apellido") String apellido,
    @RequestParam(value = "direccion") String direccion,
    @RequestParam(value = "profesion") String profesion,
    @RequestParam(value = "dui") String dui,
    @RequestParam(value = "fechaNacimiento") Date fechaNacimiento
    )
            
    {
        
        PacienteModel model = new PacienteModel();
        
        Pacientes p = model.getPacientes(idAfiliado);
        
        p.setNombre(nombre);
        p.setApellido(apellido);
        p.setFechaNacimiento(fechaNacimiento);
       // p.setConyuge(conyuge);
        p.setDireccion(direccion);
        p.setDui(dui);
         p.setProfesion(profesion);
//        p.setMadre(madre);
//        p.setPadre(padre);
        
        model.edit(p);
//       PacienteModel model= new PacienteModel();

//       Pacientes aux= new Pacientes();
//       aux=model.getPacientes(p.getIdAfiliado());
//        aux.setNombre(p.getNombre());
//        aux.setApellido(p.getApellido());
//        aux.setFechaNacimiento(p.getFechaNacimiento());
//        aux.setConyuge(p.getConyuge());
//        aux.setDui(p.getDui());
//        aux.setProfesion(p.getProfesion());
//        aux.setPadre(p.getPadre());
//        aux.setMadre(p.getMadre());
//        
//        aux.setDireccion(p.getDireccion());
//        model.edit(aux);
        return "redirect:getAll.htm";
    }
}
