/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles.Contenido;

import Controlador.PagoControlador;
import Modelo.Dao.EmpresaDao;
import Modelo.Dao.PersonaDao;
import java.awt.GridBagConstraints;
import java.awt.Rectangle;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Cochy
 */
public class Cont_Clientes extends javax.swing.JPanel {

    /**
     * Creates new form Cont_Clientes
     */
    
    public Cont_Clientes() {
        initComponents();
        pGraficoEmpresa.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        pEmpresas = new javax.swing.JPanel();
        pGraficoEmpresa = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnGraficoEmpresa = new javax.swing.JButton();
        pPagos = new javax.swing.JPanel();
        pGraficosPagos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnGraficoPagos = new javax.swing.JButton();
        texto_error = new javax.swing.JLabel();
        pCiudad = new javax.swing.JPanel();
        pGraficoCiudad = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnGraficoCiudad = new javax.swing.JButton();
        pPers_Serv = new javax.swing.JPanel();
        pGraficoPers_Serv = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnGraficoPers_Serv_Genero = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnGraficoPers_Serv_Edad = new javax.swing.JButton();

        setBackground(new java.awt.Color(12, 8, 53));
        setMinimumSize(new java.awt.Dimension(690, 550));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(690, 550));

        jTabbedPane1.setBackground(new java.awt.Color(12, 8, 53));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        pEmpresas.setBackground(new java.awt.Color(37, 36, 39));

        pGraficoEmpresa.setBackground(new java.awt.Color(37, 36, 39));
        pGraficoEmpresa.setMinimumSize(new java.awt.Dimension(0, 420));
        pGraficoEmpresa.setPreferredSize(new java.awt.Dimension(0, 420));

        javax.swing.GroupLayout pGraficoEmpresaLayout = new javax.swing.GroupLayout(pGraficoEmpresa);
        pGraficoEmpresa.setLayout(pGraficoEmpresaLayout);
        pGraficoEmpresaLayout.setHorizontalGroup(
            pGraficoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pGraficoEmpresaLayout.setVerticalGroup(
            pGraficoEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Grafico Segun Rubro de Empresa ");

        btnGraficoEmpresa.setText("GENERAR");
        btnGraficoEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoEmpresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEmpresasLayout = new javax.swing.GroupLayout(pEmpresas);
        pEmpresas.setLayout(pEmpresasLayout);
        pEmpresasLayout.setHorizontalGroup(
            pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pGraficoEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
            .addGroup(pEmpresasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnGraficoEmpresa)
                .addContainerGap(397, Short.MAX_VALUE))
        );
        pEmpresasLayout.setVerticalGroup(
            pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pEmpresasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pEmpresasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnGraficoEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(pGraficoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Empresas", pEmpresas);

        pPagos.setBackground(new java.awt.Color(37, 36, 39));

        pGraficosPagos.setBackground(new java.awt.Color(37, 36, 39));
        pGraficosPagos.setMinimumSize(new java.awt.Dimension(0, 420));
        pGraficosPagos.setPreferredSize(new java.awt.Dimension(0, 420));

        javax.swing.GroupLayout pGraficosPagosLayout = new javax.swing.GroupLayout(pGraficosPagos);
        pGraficosPagos.setLayout(pGraficosPagosLayout);
        pGraficosPagosLayout.setHorizontalGroup(
            pGraficosPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pGraficosPagosLayout.setVerticalGroup(
            pGraficosPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de Pago Mas Usado");

        btnGraficoPagos.setText("GENERAR");
        btnGraficoPagos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoPagosActionPerformed(evt);
            }
        });

        texto_error.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pPagosLayout = new javax.swing.GroupLayout(pPagos);
        pPagos.setLayout(pPagosLayout);
        pPagosLayout.setHorizontalGroup(
            pPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pGraficosPagos, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
            .addGroup(pPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGraficoPagos)
                .addGap(18, 18, 18)
                .addComponent(texto_error, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        pPagosLayout.setVerticalGroup(
            pPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2)
                    .addComponent(btnGraficoPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(texto_error, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(pGraficosPagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Pagos", pPagos);

        pCiudad.setBackground(new java.awt.Color(37, 36, 39));

        pGraficoCiudad.setBackground(new java.awt.Color(37, 36, 39));
        pGraficoCiudad.setMinimumSize(new java.awt.Dimension(0, 420));
        pGraficoCiudad.setPreferredSize(new java.awt.Dimension(0, 420));

        javax.swing.GroupLayout pGraficoCiudadLayout = new javax.swing.GroupLayout(pGraficoCiudad);
        pGraficoCiudad.setLayout(pGraficoCiudadLayout);
        pGraficoCiudadLayout.setHorizontalGroup(
            pGraficoCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pGraficoCiudadLayout.setVerticalGroup(
            pGraficoCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ciudad que Más Utiliza el Servicio");

        btnGraficoCiudad.setText("GENERAR");
        btnGraficoCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoCiudadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pCiudadLayout = new javax.swing.GroupLayout(pCiudad);
        pCiudad.setLayout(pCiudadLayout);
        pCiudadLayout.setHorizontalGroup(
            pCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pGraficoCiudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
            .addGroup(pCiudadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGraficoCiudad)
                .addContainerGap(408, Short.MAX_VALUE))
        );
        pCiudadLayout.setVerticalGroup(
            pCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCiudadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCiudadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(btnGraficoCiudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(pGraficoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Ciudad de Procedencia", pCiudad);

        pPers_Serv.setBackground(new java.awt.Color(37, 36, 39));

        pGraficoPers_Serv.setBackground(new java.awt.Color(37, 36, 39));
        pGraficoPers_Serv.setMinimumSize(new java.awt.Dimension(0, 420));
        pGraficoPers_Serv.setPreferredSize(new java.awt.Dimension(0, 420));

        javax.swing.GroupLayout pGraficoPers_ServLayout = new javax.swing.GroupLayout(pGraficoPers_Serv);
        pGraficoPers_Serv.setLayout(pGraficoPers_ServLayout);
        pGraficoPers_ServLayout.setHorizontalGroup(
            pGraficoPers_ServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pGraficoPers_ServLayout.setVerticalGroup(
            pGraficoPers_ServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Personas (Genero) que Más Utilizan el Servicio (Hombre / Mujer)");

        btnGraficoPers_Serv_Genero.setText("GENERAR");
        btnGraficoPers_Serv_Genero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoPers_Serv_GeneroActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Promedio de Edad que Ocupa el Servicio");

        btnGraficoPers_Serv_Edad.setText("GENERAR");
        btnGraficoPers_Serv_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficoPers_Serv_EdadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pPers_ServLayout = new javax.swing.GroupLayout(pPers_Serv);
        pPers_Serv.setLayout(pPers_ServLayout);
        pPers_ServLayout.setHorizontalGroup(
            pPers_ServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pGraficoPers_Serv, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
            .addGroup(pPers_ServLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPers_ServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pPers_ServLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(btnGraficoPers_Serv_Genero))
                    .addGroup(pPers_ServLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGraficoPers_Serv_Edad)))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        pPers_ServLayout.setVerticalGroup(
            pPers_ServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPers_ServLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPers_ServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnGraficoPers_Serv_Genero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPers_ServLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnGraficoPers_Serv_Edad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(pGraficoPers_Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Personas & Servicios", pPers_Serv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnGraficoEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoEmpresaActionPerformed
        // TODO add your handling code here:
        pGraficoEmpresa.removeAll();
        DefaultPieDataset dt = new DefaultPieDataset();
        EmpresaDao empDao = new EmpresaDao();
        List<?> lista = empDao.listaRubros();
        if(lista!=null){
           for (int i = 0; i < lista.size(); i++) {
                Object[] row = (Object[]) lista.get(i);
                dt.setValue(row[0].toString(),Integer.parseInt(row[1].toString()));
            }
            JFreeChart jf = ChartFactory.createPieChart3D("Rubros Empresas Clientes", dt,true, true, false);
            ChartPanel cp = new ChartPanel(jf);
            pGraficoEmpresa.setVisible(true);
            cp.setBounds(150,20,350,350);
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 100;
            c.gridy = 100;
            pGraficoEmpresa.add(cp ,c); 
        }else{
            JOptionPane.showMessageDialog(this,"No hay datos");
        }
        //pGraficoEmpresa.setLayout(new BoxLayout(pGraficoEmpresa,BoxLayout.PAGE_AXIS));
    }//GEN-LAST:event_btnGraficoEmpresaActionPerformed

    private void btnGraficoPers_Serv_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoPers_Serv_EdadActionPerformed
        // TODO add your handling code here:
        pGraficoEmpresa.removeAll();
        PersonaDao pDao = new PersonaDao();
        DefaultPieDataset dt = new DefaultPieDataset();
        EmpresaDao empDao = new EmpresaDao();
        List<?> lista = pDao.PromedioEdad();
        if(lista!=null){
           for (int i = 0; i < lista.size(); i++) {
                Object[] row = (Object[]) lista.get(i);
                String txt = "Promedio de años es "+ row[0];
                JOptionPane.showMessageDialog(this,txt);
            }
        }else{
            JOptionPane.showMessageDialog(this,"Seprodujo un error");
        }
    }//GEN-LAST:event_btnGraficoPers_Serv_EdadActionPerformed
    private PagoControlador _pagoControl = new PagoControlador();
    private void btnGraficoPagosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoPagosActionPerformed
        // TODO add your handling code here:
        pGraficosPagos.removeAll();
        DefaultPieDataset dt = new DefaultPieDataset();
        List<?> lista = _pagoControl.formaDePagoMasUsado();
        if (lista==null) {
            texto_error.setText("Se produjo un error en la coneccion o no hay datos");
        } else {
            for (int i = 0; i < lista.size(); i++) {
                Object[] row = (Object[]) lista.get(i);
                dt.setValue(row[1].toString(),Integer.parseInt(row[0].toString()));
            }
            JFreeChart jf = ChartFactory.createPieChart3D("Metodos De Pago", dt,true, true, false);
            ChartPanel cp = new ChartPanel(jf);
            pGraficoEmpresa.setVisible(true);
            cp.setBounds(150,20,350,350);
            GridBagConstraints c = new GridBagConstraints();
            c.gridx = 100;
            c.gridy = 100;
            pGraficoEmpresa.add(cp ,c); 
        }       
    }//GEN-LAST:event_btnGraficoPagosActionPerformed

    private void btnGraficoCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGraficoCiudadActionPerformed

    private void btnGraficoPers_Serv_GeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficoPers_Serv_GeneroActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnGraficoPers_Serv_GeneroActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGraficoCiudad;
    private javax.swing.JButton btnGraficoEmpresa;
    private javax.swing.JButton btnGraficoPagos;
    private javax.swing.JButton btnGraficoPers_Serv_Edad;
    private javax.swing.JButton btnGraficoPers_Serv_Genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pCiudad;
    private javax.swing.JPanel pEmpresas;
    private javax.swing.JPanel pGraficoCiudad;
    private javax.swing.JPanel pGraficoEmpresa;
    private javax.swing.JPanel pGraficoPers_Serv;
    private javax.swing.JPanel pGraficosPagos;
    private javax.swing.JPanel pPagos;
    private javax.swing.JPanel pPers_Serv;
    private javax.swing.JLabel texto_error;
    // End of variables declaration//GEN-END:variables
}
