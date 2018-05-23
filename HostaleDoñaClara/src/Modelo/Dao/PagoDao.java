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
public class PagoDao {
    private Session sesion;

    public PagoDao() {
        sesion = NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public List<?> formaDePagoMasUsado(){
        try {
            String q1 ="select count(p.medioPago), p.medioPago from Pago p "
                + " join p.factura f "
                + " where f.ordenDeCompra is not null  group by p.medioPago";
            return sesion.createQuery(q1).list();
        } catch (Exception e) {
            return null;
        }
    }
}
