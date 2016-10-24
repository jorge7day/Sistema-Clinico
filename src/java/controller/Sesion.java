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
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        if (s.isOpen() == false) {
            s = HibernateUtil.getSessionFactory().openSession();
        }
        return s;
    }
    
    public static void closeSession() {
        if (HibernateUtil.getSessionFactory().getCurrentSession() != null) {
            if (HibernateUtil.getSessionFactory().getCurrentSession().isOpen() == true) {
                HibernateUtil.getSessionFactory().getCurrentSession().close();
            }
        }
    }
}
