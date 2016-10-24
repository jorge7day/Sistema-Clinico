/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Paciente;
import entity.Persona;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author carlosantonio
 */
public class PersonaModel {
    
//CRUD
public List <Persona> getAll(){
    List <Persona> listaPersonas = new ArrayList<Persona>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       listaPersonas = s.createCriteria(Persona.class).list();
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }
    
    return listaPersonas;
 }

//Create
public void create(Persona p){
    List <Persona> listaPersonas = new ArrayList<Persona>();
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
public void remove(Persona p){
    List <Persona> listaPersonas = new ArrayList<Persona>();
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
public void update(Persona p){
    List <Persona> listaPersonas = new ArrayList<Persona>();
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

public Persona getPersonaById(BigDecimal codPersona){
     PersonaModel listaPersonas=new PersonaModel();
    for(Persona persona:listaPersonas.getAll()){
        if(persona.getCodPersona().equals(codPersona))
            return persona;
    }
    
    
   return null;
}
}
