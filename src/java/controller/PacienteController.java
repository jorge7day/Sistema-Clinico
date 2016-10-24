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
    PersonaModel personas= new PersonaModel();
    m.addAttribute("listaPersonas",personas);
    
    
    return "pacientes2"; //Pag donde se muestran los datos
    }
    
    //Para eliminar
    
    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "idAfiliado") BigDecimal idAfiliado, Model m) {

        //java.math.BigDecimal bd = new java.math.BigDecimal(String.valueOf(idAfiliado));
        PacienteModel model = new PacienteModel();
        Paciente e = new Paciente();
        e = model.getPacientes(idAfiliado);
        model.remove(e);
                    

        return "redirect:getAll.htm";
    }
    
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
        
        return "redirect:getAll.htm";
    }
    
    
    
}
