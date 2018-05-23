/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.Clases.Persona;
import Modelo.Clases.Producto;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Cochy
 */
public class ProductosDao {
    private Session sesion;

    public ProductosDao() {
        sesion = NewHibernateUtil.getSessionFactory().openSession();
    }
    //Productos en stock
    public List<?> StockProductos(){
        String q = "select stock, descripcion, stockCritico from Producto";
        return (List<?>)sesion.createQuery(q).list();
    }
    //Productos mas solicitados ?????? son servicios    
    public List<?> ProductosMasSolicitados(){
        String q = "select serv.tipo, count(serv.tipo) "
                + "FROM ServicioComida serv join serv.platos as p join p.comidas as c"
                + " GROUP by serv.tipo"
                + " order by count(serv.tipo) desc";
        return (List<?>)sesion.createQuery(q).list();
    }
    
    
}
