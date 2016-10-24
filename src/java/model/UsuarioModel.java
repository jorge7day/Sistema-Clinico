/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package model;

import controller.Sesion;
import entity.Rol;
import entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NonUniqueResultException;
import org.hibernate.Session;

/**
 *
 * @author Otoniel
 */
public class UsuarioModel {
    
    public List <Usuario> getAll(){
        List <Usuario> lista = new ArrayList<>();
        Session s = Sesion.getSession();
        
        try{
            
            s.beginTransaction();
            lista = s.createCriteria(Usuario.class).list();
            s.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
            Sesion.closeSession();
        
        return lista;
    }
    
//Create
    public void create(Usuario u){
        List <Usuario> listaRoles = new ArrayList<>();
        Session s = Sesion.getSession();
        
        try{
            
            s.beginTransaction();
            s.save(u);
            s.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
            Sesion.closeSession();
    }
    
//Remove
    public void remove(Usuario u){
        List <Usuario> listaRoles = new ArrayList<>();
        Session s = Sesion.getSession();
        
        try{
            
            s.beginTransaction();
            s.delete(u);
            s.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
            Sesion.closeSession();
    }
    
//Update
    public void update(Usuario u){
        List <Usuario> listaRoles = new ArrayList<>();
        Session s = Sesion.getSession();
        
        try{
            
            s.beginTransaction();
            s.update(u);
            s.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
            s.getTransaction().rollback();
            
        }
            Sesion.closeSession();
    }
    
    public Usuario findUsuarioById (int codUsuario){
        Session s = Sesion.getSession();
        Usuario pac = new Usuario();
        
        try{
            s.beginTransaction();
            pac = (Usuario) s.get(Usuario.class, codUsuario);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        Sesion.closeSession();
        
        return pac;
    }
    
    public Usuario findUsuarioByUserName(String userName)  {
        Usuario u = null;
        
        try{
            List<Usuario> users = getAll();
            
            for (Usuario x : users) {
                if (x.getNombre().equals(userName)) {
                    return x;
                }
            }
        }catch(NullPointerException | NonUniqueResultException e){
            e.printStackTrace();
        }
        
        return u;
    }
}
