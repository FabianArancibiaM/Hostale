/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.ProductosDao;
import java.util.List;

/**
 *
 * @author Cochy
 */
public class ProductosControlador {
    private ProductosDao _ProductoDao;
    
    public ProductosControlador() {
        _ProductoDao= new ProductosDao();
    }
    
    public List<?> productosMasSolicitados(){
        try {
            return _ProductoDao.ProductosMasSolicitados();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    public List<?> stockProductos(){
        try {
            return _ProductoDao.StockProductos();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
