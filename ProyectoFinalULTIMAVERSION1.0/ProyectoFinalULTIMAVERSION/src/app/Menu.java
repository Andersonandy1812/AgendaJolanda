package app;


import forms.*;
import javax.swing.UIManager;

public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCreadores = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnCambiarDatos = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Actualizar/Eliminar datos");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Open Sans", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bienvenido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 320, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/h3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 130));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCreadores.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnCreadores.setForeground(new java.awt.Color(0, 0, 0));
        btnCreadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton_back1.png"))); // NOI18N
        btnCreadores.setText("Creador");
        btnCreadores.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));
        btnCreadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCreadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreadoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 160, 40));

        btnBuscar.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton_back1.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 160, 40));

        jButton5.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton_back1.png"))); // NOI18N
        jButton5.setText("Registrar");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 160, 40));

        btnCambiarDatos.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        btnCambiarDatos.setForeground(new java.awt.Color(0, 0, 0));
        btnCambiarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton_back1.png"))); // NOI18N
        btnCambiarDatos.setText("Modificar");
        btnCambiarDatos.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));
        btnCambiarDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCambiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarDatosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCambiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 410, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.setVisible(false);
        dispose();
        
        var buscar =  new Buscar();
        buscar.setVisible(true);
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCambiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarDatosActionPerformed
        this.setVisible(false);
        dispose();
        
        var cambiarDatos =  new CambiarDatos();
        cambiarDatos.setVisible(true);
        
    }//GEN-LAST:event_btnCambiarDatosActionPerformed

    private void btnCreadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreadoresActionPerformed
        this.setVisible(false);
        dispose();
        
        var creadores =  new Informacion();
        creadores.setVisible(true);
        
    }//GEN-LAST:event_btnCreadoresActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        dispose();
        
        var agregar =  new Reuniones();
        agregar.setVisible(true);
       
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCambiarDatos;
    private javax.swing.JButton btnCreadores;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
