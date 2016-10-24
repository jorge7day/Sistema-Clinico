/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Departamento;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author carlosantonio
 */
public class DepartamentoModel {
     public List <Departamento> getAll(){
    List <Departamento> listaDepartamentos = new ArrayList<Departamento>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       listaDepartamentos = s.createCriteria(Departamento.class).list();
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }
    
    return listaDepartamentos;
 }

//Create
public void create(Departamento p){
    List <Departamento> listaDepartamentos = new ArrayList<Departamento>();
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
public void remove(Departamento p){
    List <Departamento> listaDepartamentos = new ArrayList<Departamento>();
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
public void update(Departamento p){
    List <Departamento> listaDepartamentos = new ArrayList<Departamento>();
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

public Departamento getDepartamentoById (BigDecimal codDepartamento){
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    Departamento pac = new Departamento();
    
    try{
        s.beginTransaction();
        pac = (Departamento) s.get(Departamento.class, codDepartamento);
        
    }catch(Exception e){
        e.printStackTrace();
    }
    
    return pac;
}
    
}
