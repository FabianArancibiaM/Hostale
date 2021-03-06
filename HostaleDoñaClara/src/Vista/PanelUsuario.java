/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.PersonaControlador;
import Modelo.Clases.Persona;
import Modelo.Clases.Usuario;
import Vista.Paneles.Menu_Adminstrador;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

/**
 *
 * @author Cochy
 */
public class PanelUsuario extends javax.swing.JFrame {
    
    GridBagLayout layout = new GridBagLayout();
    Menu_Adminstrador m_Admin;
    private static Persona persona;
    private static PersonaControlador personaControl;
    /**
     * Creates new form NewJFrame
     */
    public PanelUsuario() {
        initComponents();
        
        personaControl = new PersonaControlador();
        
        this.setLocationRelativeTo(null);
        m_Admin = new Menu_Adminstrador();
        pDinamicoBtn.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        pDinamicoBtn.add(m_Admin,c);
        c.gridx = 0;
        c.gridy = 0;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelIzquierdo = new javax.swing.JPanel();
        pDinamicoBtn = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        nomUsuario = new javax.swing.JLabel();
        bienvenido = new javax.swing.JLabel();
        panelDerecha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(12, 8, 53));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(900, 500));

        panelIzquierdo.setBackground(new java.awt.Color(12, 8, 53));

        pDinamicoBtn.setBackground(new java.awt.Color(12, 8, 53));
        pDinamicoBtn.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pDinamicoBtnLayout = new javax.swing.GroupLayout(pDinamicoBtn);
        pDinamicoBtn.setLayout(pDinamicoBtnLayout);
        pDinamicoBtnLayout.setHorizontalGroup(
            pDinamicoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pDinamicoBtnLayout.setVerticalGroup(
            pDinamicoBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 296, Short.MAX_VALUE)
        );

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/svg pegado 191_poster_.png"))); // NOI18N

        nomUsuario.setForeground(new java.awt.Color(255, 255, 255));

        bienvenido.setForeground(new java.awt.Color(255, 255, 255));
        bienvenido.setText("BIENVENIDO");

        javax.swing.GroupLayout panelIzquierdoLayout = new javax.swing.GroupLayout(panelIzquierdo);
        panelIzquierdo.setLayout(panelIzquierdoLayout);
        panelIzquierdoLayout.setHorizontalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIzquierdoLayout.createSequentialGroup()
                        .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(nomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(bienvenido)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIzquierdoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pDinamicoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelIzquierdoLayout.setVerticalGroup(
            panelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bienvenido)
                .addGap(19, 19, 19)
                .addComponent(nomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pDinamicoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(panelIzquierdo, java.awt.BorderLayout.LINE_START);

        panelDerecha.setBackground(new java.awt.Color(12, 8, 53));
        panelDerecha.setMinimumSize(new java.awt.Dimension(690, 550));

        javax.swing.GroupLayout panelDerechaLayout = new javax.swing.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(panelDerecha, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelUsuario().setVisible(true);
            }
        });
    }
    
    public void iniciarSesion(Usuario u){
        System.out.println(u.getPersona().getRut()+ " iniciarSesion");
        persona = personaControl.bucarRut(u.getPersona().getRut());
        String texto = persona.getNombre()+" "+ persona.getApellido();
        nomUsuario.setText(texto);
        cargarPanelesEmpleado();
    }
    
    private void cargarPanelesEmpleado(){
        m_Admin.setVisible(true);
        m_Admin.instanciarPaneles(panelDerecha);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenido;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nomUsuario;
    private javax.swing.JPanel pDinamicoBtn;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierdo;
    // End of variables declaration//GEN-END:variables

    
}
