/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Sesion;
import entity.Municipio;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author carlosantonio
 */
public class MunicipioModel {
    
    public List<Municipio> getAll(){
    List <Municipio> listaMunicipios = new ArrayList<Municipio>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       listaMunicipios = s.createCriteria(Municipio.class).list();
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }
    
    return listaMunicipios;
 }

//Create
public void create(Municipio p){
    List <Municipio> listaMunicipios = new ArrayList<Municipio>();
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
public void remove(Municipio p){
    List <Municipio> listaMunicipios = new ArrayList<Municipio>();
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
public void update(Municipio p){
    List <Municipio> listaMunicipios = new ArrayList<Municipio>();
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

public Municipio getMunicipioById (BigDecimal codMunicipio){
    Session s = Sesion.getSession();
    Municipio pac = new Municipio();
    
    try{
        s.beginTransaction();
        pac = (Municipio) s.get(Municipio.class, codMunicipio);
        
    }catch(Exception e){
        e.printStackTrace();
    }
    
    return pac;
}
}
