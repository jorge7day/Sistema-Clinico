/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Clinicas;
import entity.Usuarios;
import java.util.ArrayList;
import java.util.List;
import model.ClinicasModel;
import model.HibernateUtil;
import model.UsuariosModel;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Daniel
 */
@Controller

public class ClinicasController {
    
    @RequestMapping(value="getAllClinicas",method = RequestMethod.GET)
    public String getAll(Model m){
    ClinicasModel model= new ClinicasModel();
    m.addAttribute("listaClinicas",model.getAllClinicas());
    
    return "clinicas"; //Pag donde se muestran los datos
    }
    
    
   
//Crear Clinica
     @RequestMapping(value="crearClinicas",method = RequestMethod.GET)
    public String create(Model m)
    {
      //  java.math.BigDecimal bd=new java.math.BigDecimal(String.valueOf(id));
        //PacienteModel model= new PacienteModel();
        Clinicas p =new Clinicas();
        
                
        m.addAttribute("p",p);
               
        return "crearClinica"; //redireccion a pagina donde se hará el proceso de guardar
    }
    
    @RequestMapping(value = "addClinica",method=RequestMethod.POST)
    public String create(@ModelAttribute(value="Clinicas") Clinicas p)
    {
        
       ClinicasModel model=new ClinicasModel();
        model.createClinicas(p);
        
    
        return "redirect:getAllClinicas.htm";
      
        
    }
    
    
}
