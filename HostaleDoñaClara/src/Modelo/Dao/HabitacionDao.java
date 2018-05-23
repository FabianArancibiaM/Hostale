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
    //Estado de habitaciones
    public List<?> estadoHabitaciones(){
        try {
            return (List<?> )sesion.createQuery("select estado, count(estado) from Habitacion group by estado").list();
        } catch (Exception e) {
            return null;
        }
    }
    //habitaciones mas solicitadas
    public List<?> HaitacionesMasSolicitadas(){
        String q ="select h.descripcion , count(h.capacidad) from Alojamiento a \n "
            + " join a.cama as c  join c.habitacion h " +
            "group by h.descripcion \n" +
            "order by count(h.capacidad) desc";
        return  (List<?>)sesion.createQuery(q).list();
    }
    //Fecha de MAyor auge
    public List<?> fechaMayorAuge(){
        String q ="select count(fecha),fecha, sum(valorBruto) \n" +
                " from Factura where ordenDeCompra is not null \n" +
                " group by fecha order by count(fecha) desc";
        return  (List<?>)sesion.createQuery(q).list();
    }
}
