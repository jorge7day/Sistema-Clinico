/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Paciente;
//import entity.Pacientes;
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
       HibernateUtil.getSessionFactory().getCurrentSession().close(); //Se debe cerrar la sesión después de cada transacción

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

public Paciente getPacienteById (String idAfiliado){
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    Paciente pac = new Paciente();
    
    try{
        s.beginTransaction();
        pac = (Paciente) s.get(Paciente.class, idAfiliado);
        HibernateUtil.getSessionFactory().getCurrentSession().close();
    }catch(Exception e){
        e.printStackTrace();
    }
    
    return pac;
}

//edit
      public void edit(Paciente p)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.saveOrUpdate(p);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
              s.getTransaction().rollback();
        }
    }
    
}


