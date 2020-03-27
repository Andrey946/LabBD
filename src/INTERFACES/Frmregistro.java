package INTERFACES;

import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Frmregistro extends javax.swing.JFrame {

    public Frmregistro() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        imagenes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        Menubar = new javax.swing.JMenuBar();
        Mregistrar = new javax.swing.JMenu();
        Mvehiculos = new javax.swing.JMenuItem();
        Msalidas = new javax.swing.JMenuItem();
        Mllegadas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 250));

        Mregistrar.setText("Registrar");

        Mvehiculos.setText("Vehículos");
        Mvehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MvehiculosActionPerformed(evt);
            }
        });
        Mregistrar.add(Mvehiculos);

        Msalidas.setText("Salidas");
        Msalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MsalidasActionPerformed(evt);
            }
        });
        Mregistrar.add(Msalidas);

        Mllegadas.setText("Llegadas");
        Mllegadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MllegadasActionPerformed(evt);
            }
        });
        Mregistrar.add(Mllegadas);

        Menubar.add(Mregistrar);

        setJMenuBar(Menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MllegadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MllegadasActionPerformed
        
        Vista.vistaLlegadas Lle = new Vista.vistaLlegadas();
        escritorio.add(Lle);
        Lle.show();
        
    }//GEN-LAST:event_MllegadasActionPerformed

    private void MvehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MvehiculosActionPerformed
        Vista.vistavehiculos c = new Vista.vistavehiculos();
        escritorio.add(c);
        c.show();
    }//GEN-LAST:event_MvehiculosActionPerformed

    private void MsalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MsalidasActionPerformed
        Vista.vistaSalidas Sal = new Vista.vistaSalidas();
        escritorio.add(Sal);
        Sal.show();
    }//GEN-LAST:event_MsalidasActionPerformed

    public void imagenes(){
        ImageIcon vehi = new ImageIcon("C:\\Users\\Andrey\\Documents\\NetBeansProjects\\LaboratorioBD\\src\\Iconos\\vehi.png");
        Mvehiculos.setIcon(new ImageIcon(vehi.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH)));
        ImageIcon start = new ImageIcon("C:\\Users\\Andrey\\Documents\\NetBeansProjects\\LaboratorioBD\\src\\Iconos\\start.png");
        Msalidas.setIcon(new ImageIcon(start.getImage().getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH)));
        ImageIcon end = new ImageIcon("C:\\Users\\Andrey\\Documents\\NetBeansProjects\\LaboratorioBD\\src\\Iconos\\end.png");
        Mllegadas.setIcon(new ImageIcon(end.getImage().getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH)));
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmregistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmregistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menubar;
    private javax.swing.JMenuItem Mllegadas;
    private javax.swing.JMenu Mregistrar;
    private javax.swing.JMenuItem Msalidas;
    private javax.swing.JMenuItem Mvehiculos;
    private javax.swing.JDesktopPane escritorio;
    // End of variables declaration//GEN-END:variables
}
