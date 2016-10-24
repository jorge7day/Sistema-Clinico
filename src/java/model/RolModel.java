/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package model;

import entity.Rol;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author carlosantonio
 */
public class RolModel {
    
    public List <Rol> getAll(){
        List <Rol> listaRoles = new ArrayList<Rol>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            
            s.beginTransaction();
            listaRoles = s.createCriteria(Rol.class).list();
            s.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
        return listaRoles;
    }
    
//Create
    public void create(Rol p){
        List <Rol> listaRoles = new ArrayList<Rol>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            
            s.beginTransaction();
            s.save(p);
            s.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    
//Remove
    public void remove(Rol p){
        List <Rol> listaRoles = new ArrayList<Rol>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            
            s.beginTransaction();
            s.delete(p);
            s.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }
    
//Update
    public void update(Rol p){
        List <Rol> listaRoles = new ArrayList<Rol>();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try{
            
            s.beginTransaction();
            s.update(p);
            s.getTransaction().commit();
            
        }catch(Exception e){
            e.printStackTrace();
            s.getTransaction().rollback();
            
        }
    }
    
    public Rol getRolById (BigDecimal codRol){
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Rol pac = new Rol();
        
        try{
            s.beginTransaction();
            pac = (Rol) s.get(Rol.class, codRol);
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return pac;
    }
}
