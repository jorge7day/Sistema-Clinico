/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package controller;

import entity.Usuario;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import model.UsuarioModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Otoniel
 */
@Controller
public class sesionController {
    
    Usuario user = null;
    
    @RequestMapping(value = "/login.htm", method = RequestMethod.POST)
    public String login (
            @RequestParam(value = "nombre") String usuario,
            @RequestParam(value = "contrasena") String contraseña
    ) {
        
        UsuarioModel users = new UsuarioModel();
        
        //Buscando al usuario en la BD por su nombre de usuario
        this.user = users.findUsuarioByUserName(usuario);
        
        //Si el usuario no existe, entonces no se puede iniciar sesión con ese nombre de usuario
        if(user == null) {
            return "redirect:index.htm";
        }
        
        try {
            //Encriptando contraseña ingresada
            MessageDigest dig = MessageDigest.getInstance("SHA-256");
            dig.update(contraseña.getBytes(StandardCharsets.UTF_8));
//            String hash = Base64.getEncoder().encodeToString( dig.digest() );
            String hash = (new HexBinaryAdapter()).marshal(dig.digest()).toLowerCase();
            
            if(user.getContrasena().equals(hash)) {
                switch(user.getRol().getCodRol().intValueExact()) {
                    case 1:
                        return "redirect:principal.htm";
                    case 2:
                        return "redirect:consultas.htm";
                    default:
                        return "redirect:index.htm";
                }
            }
            else {
                return "redirect:index.htm";
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(sesionController.class.getName()).log(Level.SEVERE, null, ex);
            return "redirect:index.htm"; 
        }
    }
    
    public String isLogged() {
        return (user != null)? "redirect:index.htm": "redirect:index.htm";        
    }

    @RequestMapping(value = "/logout.htm", method = RequestMethod.GET)
    public String logout() {
        this.user = null;
        return "redirect:index.htm";
    }
}
