/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Persona;
import org.hibernate.Session;

/**
 *
 * @author Cochy
 */
public class PersonaDao {
    private Session sesion;

    public PersonaDao() {
        sesion = NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public Persona buscarPersona(String rut){
        return (Persona)sesion.createQuery("from Persona where rut = :run")
                .setParameter("run", rut).uniqueResult();
    }
    
}
