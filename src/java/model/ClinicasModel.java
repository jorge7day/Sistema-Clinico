/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entity.Clinicas;
import entity.Usuarios;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Daniel
 */
public class ClinicasModel {
    
    //Recuperar datos para la tabla
    public List <Clinicas> getAllClinicas(){
    List <Clinicas> listaClinicas = new ArrayList<Clinicas>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       listaClinicas = s.createCriteria(Clinicas.class).list();
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }
    
    return listaClinicas;
 }
    
    //Create
public void createClinicas(Clinicas p){
    List <Clinicas> listaClinicas = new ArrayList<Clinicas>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       s.save(p);
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }   
 }
    
}
