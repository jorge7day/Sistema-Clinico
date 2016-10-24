/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;



import model.UsuariosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Daniel
 */

@Controller
public class IndexController {
    
    @RequestMapping(value="getAllUsers",method = RequestMethod.GET)
    public String getAll(Model m){
   UsuariosModel model= new UsuariosModel();
    m.addAttribute("listaUsuarios",model.getAllUsers());
    
    return "index"; //Pag donde se muestran los datos
    }
    
}