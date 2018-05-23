/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Clases.Persona;
import java.util.List;
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
    //Promedio de Edad
    public List<?> PromedioEdad(){
        String q = "SELECT round(AVG(EXTRACT(YEAR FROM sysdate)-EXTRACT(YEAR FROM nacimiento))) FROM Persona";
        return (List<?>)sesion.createQuery(q).list();
    }
}
