/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dam.vehiculos.vista;

import javax.swing.JPanel;

/**
 *
 * @author manu1
 */
public class VentanaVehiculo extends javax.swing.JFrame {
    private JPanel panelActivo;
    /**
     * Creates new form VentanaVehiculo
     */
    public VentanaVehiculo() {
        initComponents();
        
        PanelPrincipal panel = new PanelPrincipal(this);
        
        this.setSize(700, 550);
        
        panelActivo = panel;
        this.getContentPane().add(panelActivo);
        panelActivo.setSize(this.getSize());
        panelActivo.setVisible(true);
    }
    
    public void cambiarPanel(JPanel panel){
        panelActivo.setVisible(false);
        this.getContentPane().remove(panelActivo);
        panelActivo = panel;
        this.getContentPane().add(panelActivo);
        panelActivo.setSize(this.getSize());
        panelActivo.setVisible(true);
        panelActivo.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        btnOpciones = new javax.swing.JMenu();
        btnCRUD = new javax.swing.JMenuItem();
        btnJuego = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnOpciones.setText("Opciones");

        btnCRUD.setText("CRUD");
        btnCRUD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCRUDActionPerformed(evt);
            }
        });
        btnOpciones.add(btnCRUD);

        btnJuego.setText("Juego");
        btnJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJuegoActionPerformed(evt);
            }
        });
        btnOpciones.add(btnJuego);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        btnOpciones.add(btnSalir);

        jMenuBar1.add(btnOpciones);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJuegoActionPerformed
        PanelJuego panel = new PanelJuego(this);

        this.cambiarPanel(panel);
    }//GEN-LAST:event_btnJuegoActionPerformed

    private void btnCRUDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCRUDActionPerformed
        PanelCRUD panel = new PanelCRUD(this);

        this.cambiarPanel(panel);
    }//GEN-LAST:event_btnCRUDActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnCRUD;
    private javax.swing.JMenuItem btnJuego;
    private javax.swing.JMenu btnOpciones;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
