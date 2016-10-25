/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Municipio;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
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
        if (s.getTransaction().isActive() != false) {
                s.close();
                HibernateUtil.getSessionFactory().openSession();
                s = HibernateUtil.getSessionFactory().getCurrentSession();
            }
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
        if (s.getTransaction().isActive() != false) {
                s.close();
                HibernateUtil.getSessionFactory().openSession();
                s = HibernateUtil.getSessionFactory().getCurrentSession();
            }
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
        if (s.getTransaction().isActive() != false) {
                s.close();
                HibernateUtil.getSessionFactory().openSession();
                s = HibernateUtil.getSessionFactory().getCurrentSession();
            }
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
        if (s.getTransaction().isActive() != false) {
                s.close();
                HibernateUtil.getSessionFactory().openSession();
                s = HibernateUtil.getSessionFactory().getCurrentSession();
            }
       s.beginTransaction();
       s.update(p);
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        s.getTransaction().rollback();
        
    }   
 }

public Municipio getMunicipioById (BigDecimal codMunicipio){
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    Municipio pac = new Municipio();
    
    try{
        if (s.getTransaction().isActive() != false) {
                s.close();
                HibernateUtil.getSessionFactory().openSession();
                s = HibernateUtil.getSessionFactory().getCurrentSession();
            }
        s.beginTransaction();
//        pac = (Municipio) s.get(Municipio.class, codMunicipio);
        Query q = s.createQuery("from Municipio u where u.codMunicipio = :cMunicipio");
        q.setBigDecimal("cMunicipio", codMunicipio);
        pac = (Municipio) q.uniqueResult();
        s.getTransaction().commit();

    }catch(Exception e){
        e.printStackTrace();
    }
    
    return pac;
}
}
