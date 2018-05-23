/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import org.hibernate.Session;

/**
 *
 * @author Cochy
 */
public class OrdenDePedidoDao {
    private Session sesion;

    public OrdenDePedidoDao() {
        sesion = NewHibernateUtil.getSessionFactory().openSession();
    }
    
    
    
}
