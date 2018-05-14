/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;

/**
 *
 * @author Cochy
 */
public class HabitacionDao {
    private Session sesion;

    public HabitacionDao() {
        sesion = NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public List<?> estadoHabitaciones(){
        try {
            return (List<?> )sesion.createQuery("select estado, count(estado) from Habitacion group by estado").list();
        } catch (Exception e) {
            return null;
        }
    }
       
    
}
