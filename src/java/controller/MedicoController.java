/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ClinicaModel;
import model.DepartamentoModel;
import model.MunicipioModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author carlosantonio
 */
@Controller
public class MedicoController {
    
 @RequestMapping(value="/medicos.htm", method=RequestMethod.GET)
 
    public String medico(Model m){
        
        DepartamentoModel departamentos=new DepartamentoModel();
        m.addAttribute("listaDepartamentos",departamentos.getAll());
        ClinicaModel clinicas=new ClinicaModel();
        m.addAttribute("listaClinicas",clinicas.getAll());
        MunicipioModel municipios=new MunicipioModel();
        m.addAttribute("listaMunicipios",municipios.getAll());
        return "Medicos";
    }
}
