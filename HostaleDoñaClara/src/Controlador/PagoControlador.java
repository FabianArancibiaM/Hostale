/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Dao.PagoDao;
import java.util.List;

/**
 *
 * @author Cochy
 */
public class PagoControlador {
    private PagoDao _pagoDao;
    
    public PagoControlador(){
        _pagoDao = new PagoDao();
    }
    public List<?> formaDePagoMasUsado(){
        return _pagoDao.formaDePagoMasUsado();
    }
}
