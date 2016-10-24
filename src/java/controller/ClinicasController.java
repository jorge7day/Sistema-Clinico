/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Clinica;
import entity.Departamento;
import entity.Municipio;
import java.math.BigDecimal;
import model.ClinicaModel;
import model.DepartamentoModel;
import model.MunicipioModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Daniel
 */
@Controller

public class ClinicasController {
    
    @RequestMapping(value="getAllClinicas",method = RequestMethod.GET)
    public String getAll(Model m){
    ClinicaModel model= new ClinicaModel();
    m.addAttribute("listaClinicas",model.getAll());
    
    return "clinicas"; //Pag donde se muestran los datos
    }
    
    
   
//Crear Clinica
     @RequestMapping(value="crearClinicas",method = RequestMethod.GET)
    public String create(Model m)
    {
      //  java.math.BigDecimal bd=new java.math.BigDecimal(String.valueOf(id));
        //PacienteModel model= new PacienteModel();
        Clinica p =new Clinica();
        
                
        m.addAttribute("p",p);
               
        return "crearClinica"; //redireccion a pagina donde se hará el proceso de guardar
    }
    
    @RequestMapping(value = "addClinica",method=RequestMethod.POST)
    public String create(
    @RequestParam(value = "codClinica") BigDecimal codClinica,
    @RequestParam(value = "nombre") String nombre,
    @RequestParam(value = "telefono") String telefono,
    @RequestParam(value = "direccion") String direccion,
    @RequestParam(value = "departamento") BigDecimal departamento,
    @RequestParam(value = "municipio") BigDecimal municipio)
    {
       Clinica c = new Clinica();
       
       c.setCodClinica(codClinica);
       c.setNombre(nombre);
       c.setTelefono(telefono);
       c.setDireccion(direccion);
       
        Departamento depto = (new DepartamentoModel()).getDepartamentoById(departamento);
        
        c.setDepartamento(depto);
        
        Municipio m = (new MunicipioModel()).getMunicipioById(municipio);
       
        c.setMunicipio(m);
       
       (new ClinicaModel()).create(c);
        
    
        return "redirect:getAllClinicas.htm";
      
        
    }
    
    @RequestMapping(value="editClinica",method = RequestMethod.GET)
    public String edit(@RequestParam(value="codClinica") BigDecimal codClinica, Model m)
    {
        //java.math.BigDecimal bd=new java.math.BigDecimal(String.valueOf(idAfiliado));
        ClinicaModel model= new ClinicaModel();
       
        Clinica p =new Clinica();
//        Departamento dp=new Departamento();
//        DepartamentoModel dpModel= new DepartamentoModel();
        p=model.getClinicaById(codClinica); //Se obtiene el paciente segun si Id que es un String
//        dp=dpModel.getDepartamento(p.getDepartamento().getId());
        
        m.addAttribute("p",p);
        //m.addAttribute("d", dp);
      //  m.addAttribute("d",p.getDepartamento());
        
        return "editClinica"; //pagina a donde llegará
    }
    
    
}
