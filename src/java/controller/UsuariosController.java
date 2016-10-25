/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package controller;




import entity.Persona;
import entity.Rol;
import entity.Usuario;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import model.PersonaModel;
import model.RolModel;
import model.UsuarioModel;


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
public class UsuariosController {
    
    @RequestMapping(value="getAllUsuarios",method = RequestMethod.GET)
    public String getAll(Model m){
        UsuarioModel model= new UsuarioModel();
        List<Usuario> list = model.getAll();
        Persona p = list.get(0).getPersona();
        m.addAttribute("listaUsuarios", list);
        
        return "usuarios"; //Pag donde se muestran los datos
    }
    
    @RequestMapping(value="getAllUsuarios2",method = RequestMethod.GET)
    public String getAll2(Model m){
        UsuarioModel model= new UsuarioModel();
        List<Usuario> list = model.getAll();
        m.addAttribute("listaUsuarios",list);
        
        return "index"; //Pag donde se muestran los datos
    }
    
    //Crear Usuario
    @RequestMapping(value="addUsers",method = RequestMethod.POST)
    public String create(
            @RequestParam(value = "codUsuario") BigDecimal codUsuario,
            @RequestParam(value = "nombreUsuario") String nombreUsuario,
            @RequestParam(value = "contrasena") String contrasena,
            @RequestParam(value = "rol") BigDecimal codRol,
            @RequestParam(value = "codPersona") BigDecimal codPersona
        )
    {
        Usuario u = new Usuario();
        
        Persona p = (new PersonaModel()).getPersonaById(codPersona);
        
        if(p == null) {
            return "crearUsers";
        }
        
        u.setPersona(p);
        
        u.setCodUsuario(codUsuario);
        
        String contrasenaHash = encrypt(contrasena);
        
        u.setContrasena(contrasenaHash);
        u.setNombre(nombreUsuario);
        
        Rol rol = (new RolModel()).getRolById(codRol);
        
        if (rol == null){
            return "crearUsers";
        }
        
        u.setRol(rol);
        
        (new UsuarioModel()).create(u);
        
        return "redirect:getAllUsuarios.htm"; //redireccion a pagina donde se hará el proceso de guardar
    }
    
    @RequestMapping(value = "crearUsers",method=RequestMethod.GET)
    public String create()
    {
        return "crearUsuario";
    }
    
    @RequestMapping(value = "removeUsers", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "nombreUsuario") String nombreUsuario, Model m) {
        
        // java.math.BigDecimal bd = new java.math.BigDecimal(String.valueOf(id));
        UsuarioModel model = new UsuarioModel();
        Usuario e = new Usuario();
        e = model.findUsuarioByUserName(nombreUsuario); //Se obtiene el usuario con el nombreUsuario que llega
        model.remove(e);
        
        
        return "redirect:getAllUsuarios.htm";
    }
    
    @RequestMapping(value="editUsers",method = RequestMethod.GET)
    public String edit(@RequestParam(value="nombreUsuario") String nombreUsuario, Model m)
    {
        
        UsuarioModel model = new UsuarioModel();
        
        Usuario p = new Usuario();
//        Departamento dp=new Departamento();
//        DepartamentoModel dpModel= new DepartamentoModel();
p=model.findUsuarioByUserName(nombreUsuario); //Se obtiene el paciente segun si Id que es un String
//        dp=dpModel.getDepartamento(p.getDepartamento().getId());

m.addAttribute("p",p);


return "editarUsuario"; //pagina a donde llegará
    }
    
    
    //Para actualizar informacion
    @RequestMapping(value = "updateUsers",method=RequestMethod.POST)
    public String update(
            @RequestParam(value = "codUsuario") BigDecimal codUsuario,
            @RequestParam(value = "nombreUsuario") String nombreUsuario,
            @RequestParam(value = "password") String password,
            @RequestParam(value = "codRol") BigDecimal codRol,
            @RequestParam(value = "codPersona") BigDecimal codPersona
    )
            
    {
        
        UsuarioModel model = new UsuarioModel();
        
//        Usuario u = model.findUsuarioByUserName(nombreUsuario);
        Usuario u = model.findUsuarioById(codUsuario);
        
        u.setPersona((new PersonaModel()).getPersonaById(codPersona));
        u.setRol((new RolModel()).getRolById(codRol));
        
        u.setNombre(nombreUsuario);
        u.setContrasena(encrypt(password));
        
        model.update(u);
        
        return "redirect:getAllUsuarios.htm";
    }
    
    public static String encrypt(String val) {
        String hash = null; 
        
        try {
            //Encriptando contraseña ingresada
            MessageDigest dig = MessageDigest.getInstance("SHA-256");
            dig.update(val.getBytes(StandardCharsets.UTF_8));
//            String hash = Base64.getEncoder().encodeToString( dig.digest() );
            hash = (new HexBinaryAdapter()).marshal(dig.digest()).toLowerCase();
        } catch (NoSuchAlgorithmException ex) {
            return hash;
        }
        
        return hash;
    }
}
