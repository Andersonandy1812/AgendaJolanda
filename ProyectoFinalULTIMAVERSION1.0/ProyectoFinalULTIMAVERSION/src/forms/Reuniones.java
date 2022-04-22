package forms;

import app.Menu;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import proyectofinal1.pkg0.Query;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author @Maycol
 */
public class Reuniones extends javax.swing.JFrame {

    String fecha;

    private proyectofinal1.pkg0.Query in;

    public Reuniones() {
        initComponents();
        in = new Query();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * @falta arreglar el comboBox de lugar (no obtiene el lugar que
     * seleccionamos)
     * @cambios documente el metodo que guarda los datos en la bd hasta que se
     * arreglen los errores
     * @author Maycol
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        NombreE1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Lugar1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        Nota1 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cbCierre = new javax.swing.JComboBox<>();
        cbInicio = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/h3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 80, 130));

        jLabel3.setFont(new java.awt.Font("Open Sans", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro de Eventos/Reuniones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 720, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/h3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 130));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE DEL EVENTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel1.add(NombreE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("FECHA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 160, 40));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel7.setText("HORA DE CIERRE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("HORA DE INICIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("LUGAR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, -1, -1));

        Lugar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "MULTIUSO 1", "MULTIUSO 2", "MULTIUSO 3", "MULTIUSO 4", "MULTIUSO 5", "MULTIUSO 6", "MULTIUSO 7", "MULTIUSO 8" }));
        jPanel1.add(Lugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 160, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("NOTA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));
        jPanel1.add(Nota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 160, 40));

        btnGuardar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton_back1.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 160, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atras.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 50, 60));

        cbCierre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00 am", "2:00 am", "3:00 am", "4:00 am", "5:00 am", "6:00 am", "7:00 am", "8:00 am", "9:00 am", "10:00 am", "11:00 am", "12:00 pm", "1:00 pm", "2:00 pm", "3:00 pm", "4:00 pm", "5:00 pm", "6:00 pm", "7:00 pm", "8:00 pm", "9:00 pm", "10:00 pm", "11:00 pm", "12:00 am" }));
        jPanel1.add(cbCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 40));

        cbInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00 am", "2:00 am", "3:00 am", "4:00 am", "5:00 am", "6:00 am", "7:00 am", "8:00 am", "9:00 am", "10:00 am", "11:00 am", "12:00 pm", "1:00 pm", "2:00 pm", "3:00 pm", "4:00 pm", "5:00 pm", "6:00 pm", "7:00 pm", "8:00 pm", "9:00 pm", "10:00 pm", "11:00 pm", "12:00 am" }));
        jPanel1.add(cbInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 720, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            String Nombre = NombreE1.getText();

            // ------------------- fecha inicio
            Date Fecha = jDateChooser1.getDate();
            long jd = Fecha.getTime();

            java.sql.Date fecha = new java.sql.Date(jd);

            this.fecha = fecha.toString();
            // ------------------- fecha termina

            String HoraInicio = cbInicio.getSelectedItem().toString();
            String HoraFin = cbCierre.getSelectedItem().toString();

            String Lugar = Lugar1.getSelectedItem().toString(); // arreglar esto, que obtenga el valor del combo

            String Nota = Nota1.getText();

            // despliegue en pantalla, creado solo para probar si funcionan los campos
            in.inser(Nombre, this.fecha, HoraInicio, HoraFin, Lugar, Nota);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "No ingreso los datos correctamente, Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        this.setVisible(false);
        dispose();

        var Menu = new Menu();
        Menu.setVisible(true);

    }//GEN-LAST:event_jLabel11MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        try {
//            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Lugar1;
    private javax.swing.JTextField NombreE1;
    private javax.swing.JTextField Nota1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbCierre;
    private javax.swing.JComboBox<String> cbInicio;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
