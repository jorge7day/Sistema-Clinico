/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Paciente;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Daniel
 */
public class PacienteModel {
    
//CRUD
public List <Paciente> getAll(){
    List <Paciente> listaPacientes = new ArrayList<Paciente>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       listaPacientes = s.createCriteria(Paciente.class).list();
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }
    
    return listaPacientes;
 }

//Create
public void create(Paciente p){
    List <Paciente> listaPacientes = new ArrayList<Paciente>();
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
public void remove(Paciente p){
    List <Paciente> listaPacientes = new ArrayList<Paciente>();
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
public void update(Paciente p){
    List <Paciente> listaPacientes = new ArrayList<Paciente>();
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

public Paciente getPacientes (BigDecimal idAfiliado){
    List <Paciente> listaPacientes = this.getAll();
    for(Paciente paciente:listaPacientes){
        if(paciente.getIdAfiliado()==idAfiliado)
            return paciente;
    }
    
    
   return null;
}
    
}


