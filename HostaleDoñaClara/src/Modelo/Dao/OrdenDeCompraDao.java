/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Cochy
 */
public class OrdenDeCompraDao {
    private Session sesion;

    public OrdenDeCompraDao() {
        sesion = NewHibernateUtil.getSessionFactory().openSession();
    }
    //promedio venta mensual
    public List<?> promedioVentaMensual(){
        String q =" select round(sum(valorBruto)/count(valorBruto)),fecha \n" +
                " from Factura where ordenDeCompra is not null group by fecha order by fecha desc";
        return  (List<?>)sesion.createQuery(q).list();
    }
    public List<?> promedioPerdidaMensual(){
        String q =" ";
        return  (List<?>)sesion.createQuery(q).list();
    }
    public List<?> PorcentajeCierreEfectivo(){
        String q =" ";
        return  (List<?>)sesion.createQuery(q).list();
    }
}
