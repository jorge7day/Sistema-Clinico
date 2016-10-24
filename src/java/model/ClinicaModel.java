/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Sesion;
import entity.Clinica;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author carlosantonio
 */
public class ClinicaModel {
    public List <Clinica> getAll(){
    List <Clinica> listaClinicas = new ArrayList<Clinica>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       listaClinicas = s.createCriteria(Clinica.class).list();
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }
    
    return listaClinicas;
 }

//Create
public void create(Clinica p){
    List <Clinica> listaClinicas = new ArrayList<Clinica>();
    Session s = Sesion.getSession();
    
    try{
        
       s.beginTransaction();
       s.save(p);
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }   
 }

//Remove
public void remove(Clinica p){
    List <Clinica> listaClinicas = new ArrayList<Clinica>();
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
public void update(Clinica p){
    List <Clinica> listaClinicas = new ArrayList<Clinica>();
    Session s = Sesion.getSession();
    
    try{
        
       s.beginTransaction();
       s.save(p);
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }    
 }

public Clinica getClinicaById (BigDecimal codClinica){
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    Clinica pac = new Clinica();
    
    try{
        s.beginTransaction();
        pac = (Clinica) s.get(Clinica.class, codClinica);
        
    }catch(Exception e){
        e.printStackTrace();
    }
    
    return pac;
}
}
