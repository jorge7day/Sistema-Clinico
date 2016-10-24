/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;




import entity.Usuarios;


import model.UsuariosModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Daniel
 */

@Controller
public class UsuariosController {
    
    @RequestMapping(value="getAllUsuarios",method = RequestMethod.GET)
    public String getAll(Model m){
    UsuariosModel model= new UsuariosModel();
    m.addAttribute("listaUsuarios",model.getAllUsers());
    
    return "usuarios"; //Pag donde se muestran los datos
    }
    
    @RequestMapping(value="getAllUsuarios2",method = RequestMethod.GET)
    public String getAll2(Model m){
    UsuariosModel model= new UsuariosModel();
    m.addAttribute("listaUsuarios",model.getAllUsers());
    
    return "index"; //Pag donde se muestran los datos
    }
    
//    @RequestMapping(value = "validacion",method=RequestMethod.POST)
//    public String create(@ModelAttribute(value="") Usuarios p)
//    {
//        if(2+2 == 3){
//          p.getNombreUsuario();
//        }
//        
//        int a=0;
//        if(a==0){
//        return "principal";
//        }
//         return "clinicas";
//        
//    }
    
    //Crear Usuario
     @RequestMapping(value="crearUsers",method = RequestMethod.GET)
    public String create(Model m)
    {
      //  java.math.BigDecimal bd=new java.math.BigDecimal(String.valueOf(id));
        //PacienteModel model= new PacienteModel();
        Usuarios p =new Usuarios();
        
                
        m.addAttribute("p",p);
               
        return "crearUsuario"; //redireccion a pagina donde se hará el proceso de guardar
    }
    
    @RequestMapping(value = "addUsers",method=RequestMethod.POST)
    public String create(@ModelAttribute(value="Usuarios") Usuarios p)
    {
        
        UsuariosModel model=new UsuariosModel();
        model.createUsers(p);
        
        if(p.getCodRol().equals("Administrador")){   
            return "redirect:clinicas.htm";
        }
        int a=0;
        if(a==0){
        return "redirect:getAllUsuarios.htm";
        }
         return "index";
        
    }
    
     @RequestMapping(value = "removeUsers", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "nombreUsuario") String nombreUsuario, Model m) {

       // java.math.BigDecimal bd = new java.math.BigDecimal(String.valueOf(id));
        UsuariosModel model = new UsuariosModel();
        Usuarios e = new Usuarios();
        e = model.getUsuario(nombreUsuario); //Se obtiene el usuario con el nombreUsuario que llega
        model.remove(e); 
                    

        return "redirect:getAllUsuarios.htm";
    }
    
    @RequestMapping(value="editUsers",method = RequestMethod.GET)
    public String edit(@RequestParam(value="nombreUsuario") String nombreUsuario, Model m)
    {
        
        UsuariosModel model = new UsuariosModel();
       
        Usuarios p = new Usuarios();
//        Departamento dp=new Departamento();
//        DepartamentoModel dpModel= new DepartamentoModel();
        p=model.getUsuario(nombreUsuario); //Se obtiene el paciente segun si Id que es un String
//        dp=dpModel.getDepartamento(p.getDepartamento().getId());
        
        m.addAttribute("p",p);
   
        
        return "editarUsuario"; //pagina a donde llegará
    }
    
    
    //Para actualizar informacion
    @RequestMapping(value = "updateUsers",method=RequestMethod.POST)
    public String update(
    @RequestParam(value = "nombreUsuario") String nombreUsuario,
    @RequestParam(value = "password") String password,
    @RequestParam(value = "codRol") String codRol,
    @RequestParam(value = "codPersona") String codPersona
    )
            
    {
        
        UsuariosModel model = new UsuariosModel();
        
        Usuarios p = model.getUsuario(nombreUsuario);
        
       p.setNombreUsuario(nombreUsuario);
        p.setPassword(password);
        
       p.setCodPersona(codPersona);
       p.setCodRol(codRol);
        
        model.edit(p);
        
        return "redirect:getAllUsuarios.htm";
    }
    
    
}
