/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package model;

import entity.Usuario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import org.hibernate.Session;

/**
 *
 * @author Otoniel
 */
public class UsuarioModel {
    
    public List <Usuario> getAll(){
        List <Usuario> lista = new ArrayList<>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            
            if (s.getTransaction().isActive() == false) {
                s.beginTransaction();
            }
            org.hibernate.Query q = s.createQuery("from Usuario u");
            lista = q.list();
            s.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return lista;
    }
    
//Create
    public void create(Usuario u){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            if (s.getTransaction().isActive() == false) {
                s.beginTransaction();
            }
//            s.beginTransaction();
s.save(u);
s.getTransaction().commit();

        }catch(Exception e){
            e.printStackTrace();
            
        }
//            Sesion.closeSession();
    }
    
//Remove
    public void remove(Usuario u){
        List <Usuario> listaRoles = new ArrayList<>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            if (s.getTransaction().isActive() == false) {
                s.beginTransaction();
            }
//            Usuario ux = (Usuario) s.merge(u);
s.delete(u);
s.getTransaction().commit();

        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    
//Update
    public void update(Usuario u){
        List <Usuario> listaRoles = new ArrayList<>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            if (s.getTransaction().isActive() != false) {
                s.close();
                HibernateUtil.getSessionFactory().openSession();
                s = HibernateUtil.getSessionFactory().getCurrentSession();
                s.beginTransaction();
            }
            
            s.update(u);
            s.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
            s.getTransaction().rollback();
            
        }
    }
    
    public Usuario findUsuarioById (BigDecimal codUsuario){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Usuario pac = new Usuario();
        
        try{
            if (s.getTransaction().isActive() == false) {
                s.beginTransaction();
            }
            pac = (Usuario) s.get(Usuario.class, codUsuario);
            s.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace();
        }
//        Sesion.closeSession();

return pac;
    }
    
    public Usuario findUsuarioByUserName(String userName)  {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Usuario u = null;
        
        try{
            if (s.getTransaction().isActive() == false) {
                s.beginTransaction();
            }
            org.hibernate.Query q = s.createQuery("from Usuario u where u.nombre = :userName");
            q.setString("userName", userName);
            
            u = (Usuario) q.uniqueResult();
            s.getTransaction().commit();
        }catch(NullPointerException | NonUniqueResultException e){
            e.printStackTrace();
        }
        
        return u;
    }
}
