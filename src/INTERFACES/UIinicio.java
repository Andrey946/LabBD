package INTERFACES;


import java.io.File;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andrey
 */
public class UIinicio extends javax.swing.JFrame {

    /**
     * Creates new form UIinicio
     */
    public UIinicio() {
        
        initComponents();
        tiempo.start();
        
    }
    int i;
    File archivo = new File("C:\\Users\\Andrey\\Documents\\AdministradorVehiculos\\config.ini");
    Thread tiempo = new Thread(){

        public void run() {
            try {
                for (int i = 1; i <= 100; i++) {
                    Jpinicio.setValue(i);
                   if(i<=50){   
                        lblinicio.setText("VALIDANDO");
                   }else{
                        lblinicio.setText("PRUEBA DE CONEXIÓN");
                   }
                   
                
                    tiempo.sleep(50);
                    
                }
                validar();
            } catch (InterruptedException ex) {
                System.out.println("ERRROR");
            }

        }

    } ;

    public void validar(){
        if (!archivo.exists()) {
            try {
                JOptionPane.showMessageDialog(null, "NO SE PUDO CONECTAR A LA BASE DE DATOS.\n POR FAVOR CONFIGURE MANUALMENTE");
                UIConfiguracion c=new UIConfiguracion();
                c.setVisible(true);
                this.dispose();
            } catch (Exception ex) {
                System.out.println("ERROR");
            }
        }else{
            System.out.println("CONECTADO");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jpinicio = new javax.swing.JProgressBar();
        lblinicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));

        lblinicio.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        lblinicio.setText("-------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(Jpinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(lblinicio)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblinicio)
                .addGap(18, 18, 18)
                .addComponent(Jpinicio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(UIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIinicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIinicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Jpinicio;
    private javax.swing.JLabel lblinicio;
    // End of variables declaration//GEN-END:variables
}
