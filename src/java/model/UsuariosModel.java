/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import entity.Pacientes;
import entity.Usuarios;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Daniel
 */
public class UsuariosModel {
    
    public List <Usuarios> getAllUsers(){
    List <Usuarios> listaUsuarios = new ArrayList<Usuarios>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       listaUsuarios = s.createCriteria(Usuarios.class).list();
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }
    
    return listaUsuarios;
 }
    
    //Create
public void createUsers(Usuarios p){
    List <Usuarios> listaUsuarios = new ArrayList<Usuarios>();
    Session s = HibernateUtil.getSessionFactory().getCurrentSession();
    
    try{
        
       s.beginTransaction();
       s.save(p);
       s.getTransaction().commit();
        
    }catch(Exception e){
        e.printStackTrace();
        
    }   
 }

//Eliminar Usuario
public void remove(Usuarios p)
    {
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            s.beginTransaction();
            s.delete(p);
            s.getTransaction().commit();

        } catch (Exception e) {

            e.printStackTrace();
              s.getTransaction().rollback();
        }
    }

//obtenerUsuario
public Usuarios getUsuario(String nombreUsuario){
          
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Usuarios p=new Usuarios();
        
        try {
            s.beginTransaction();
            p=(Usuarios) s.get(Usuarios.class, nombreUsuario);
            HibernateUtil.getSessionFactory().getCurrentSession().close();

        } catch (Exception e) {

            e.printStackTrace();
            s.getTransaction().rollback();
        }
        
     return p;
      
      }

//Update
public void update(Usuarios p){
    List <Pacientes> listaPacientes = new ArrayList<Pacientes>();
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

//edit
      public void edit(Usuarios p)
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
