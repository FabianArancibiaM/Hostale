/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import static java.lang.Math.round;
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
    //venta mensual
    public List<?> ventaMensual(){
        String q =" select round(sum(valorBruto)/count(valorBruto)),extract(month from fecha),extract(year from fecha)"
                + " from Factura where ordenDeCompra is not null "
                + " group by extract(year from fecha), extract(month from fecha) "
                + " order by extract(year from fecha), extract(month from fecha) desc"; 
        return  (List<?>)sesion.createQuery(q).list();
    }
    //promedio perdida mensual
    public int perdidaMensual(int anno,int mes){
        int valor = sumFacturas( anno, mes)-sumOrdenComp( anno, mes);
        return valor;
    }
    
    private int sumFacturas(int anno,int mes){
        Object  obj1;
        String q ="select sum(valorBruto) \n" +
                    " from Factura where ordenDeCompra is not null "
                + "and extract(month from fecha)= :mes "
                + "and extract(year from fecha) = :anno";
        try {
            obj1 = (Object)sesion.createQuery(q)
                .setParameter("mes", mes)
                .setParameter("anno", anno).uniqueResult();
            return Integer.parseInt(obj1.toString());
        } catch (Exception e) {
            return 0;
        }   
    }
    private int sumOrdenComp(int anno,int mes){
        Object  obj1;
        String q ="select sum(monto) \n" +
                " from OrdenDeCompra "
                 + "where extract(month from recepcion)= :mes "
                + "and extract(year from recepcion) = :anno";
        try {
            obj1 = (Object)sesion.createQuery(q)
                .setParameter("mes", mes)
                .setParameter("anno", anno).uniqueResult();
            return Integer.parseInt(obj1.toString());
        } catch (Exception e) {
            return 0;
        }   
    }
    
    //porcentage cierre efectivo
    public int PorcentajeCierreEfectivo(int anno,int mes){
        int num1 = countFacturas( anno, mes);
        int num2 = countOrdenComp( anno, mes);
        int valor = round(num1*100/num2);
        return  valor;
    }
    
    //Solicitudes no terminadas
    public int solicitudesNoTerminadas(int anno,int mes){
        int num1 = countFacturas( anno, mes);
        int num2 = countOrdenComp( anno, mes);
        int valor = num2 - num1;
        return  valor;
    }
        
    private int countFacturas(int anno,int mes){
        Object  obj1;
        String q ="select count(valorBruto) \n" +
                    " from Factura where ordenDeCompra is not null "
                + "and extract(month from fecha)= :mes "
                + "and extract(year from fecha) = :anno";
        try {
            obj1 = (Object)sesion.createQuery(q)
                .setParameter("mes", mes)
                .setParameter("anno", anno).uniqueResult();
            return Integer.parseInt(obj1.toString());
        } catch (Exception e) {
            return 0;
        }   
    }
    private int countOrdenComp(int anno,int mes){
        Object  obj1;
        String q ="select count(monto) \n" +
                " from OrdenDeCompra "
                 + "where extract(month from recepcion)= :mes "
                + "and extract(year from recepcion) = :anno";
        try {
            obj1 = (Object)sesion.createQuery(q)
                .setParameter("mes", mes)
                .setParameter("anno", anno).uniqueResult();
            return Integer.parseInt(obj1.toString());
        } catch (Exception e) {
            return 0;
        }   
    }
    
}
