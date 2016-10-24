/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Otoniel
 */
public class Sesion {
    
    public static Session getSession() {
        return HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public static void closeSession() {
        getSession().close();
    }
}
