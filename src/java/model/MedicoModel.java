/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Medico;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author carlosantonio
 */
public class MedicoModel {
   public List <Medico> getAll(){
    List <Medico> listaDoctores = new ArrayList<Medico>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       listaDoctores = s.createCriteria(Medico.class).list();
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }
    
    return listaDoctores;
 }

//Create
public void create(Medico p){
    List <Medico> listaDoctores = new ArrayList<Medico>();
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
public void remove(Medico p){
    List <Medico> listaDoctores = new ArrayList<Medico>();
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
public void update(Medico p){
    List <Medico> listaDoctores = new ArrayList<Medico>();
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

public Medico getPacientes (int idAfiliado){
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    Medico pac = new Medico();
    
    try{
        s.beginTransaction();
        pac = (Medico) s.get(Medico.class, idAfiliado);
        
    }catch(Exception e){
        e.printStackTrace();
    }
    
    return pac;
}
    
}
