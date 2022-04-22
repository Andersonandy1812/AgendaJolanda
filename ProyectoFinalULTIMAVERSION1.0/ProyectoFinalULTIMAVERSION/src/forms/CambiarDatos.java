package forms;

import app.Menu;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import proyectofinal1.pkg0.*;
import proyectofinal1.pkg0.Query;

/**
 *
 * @author Maycol
 */
public class CambiarDatos extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection conexion = con.getConnection();
    private String fecha;

    public CambiarDatos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.mostrarDatos();

        //  int n=pst.executeUpdate(SQL);
    }

    public void eliminar() {

        int filaSeleccionada = tablaRegistros.getSelectedRow();
        try {

            String SQL = "delete from reuniones where Id=" + tablaRegistros.getValueAt(filaSeleccionada, 0);

            Statement st = conexion.createStatement();

            int n = st.executeUpdate(SQL);
            if (n >= 0) {

                JOptionPane.showMessageDialog(null, "Registro eliminado");

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar " + e.getMessage());
        }

    }

    public void actualizarDatos() {

        int filaSeleccionada = tablaRegistros.getSelectedRow();
        try {
            String SQL = "update reuniones set Fecha=?,HoraFinal=?,HoraInicio=?,Lugar=?,NombreE=?,Nota=? where Id=?";
            var dao = (String) tablaRegistros.getValueAt(filaSeleccionada, 0);

            PreparedStatement pst = conexion.prepareStatement(SQL);

            pst.setString(7, txtId.getText());
            Date Fecha = JcalendarFecha.getDate();
            long jd = Fecha.getTime();
            java.sql.Date fecha = new java.sql.Date(jd);
            this.fecha = fecha.toString();
            pst.setString(1, fecha.toString());
            pst.setString(3, cbHoraInicio.getSelectedItem().toString());
            pst.setString(2, cbHoraCierre.getSelectedItem().toString());
            int seleccionadoLugar = cbLugar.getSelectedIndex();
            pst.setString(4, cbLugar.getItemAt(seleccionadoLugar));
            pst.setString(5, txtNombreEvento.getText());
            pst.setString(6, txtNota.getText());

            pst.execute();
            JOptionPane.showConfirmDialog(null, "Actualizacion exitosa");
        } catch (Exception e) {

            JOptionPane.showConfirmDialog(null, "Error en la actualizacion del registro" + e.getMessage());

        }

    }

    public void mostrarDatos() {
        String[] titulos = {"ID ", "Nombre del evento", "Fecha", "Hora de inicio ", "Hora de cierre", "Lugar ", "Nota"};
        String[] registros = new String[7];
        DefaultTableModel dtModel = new DefaultTableModel(null, titulos);
        String SQL = "select * from reuniones";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {
                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("NombreE");
                registros[2] = rs.getString("Fecha");
                registros[3] = rs.getString("HoraInicio");
                registros[4] = rs.getString("HoraFinal");
                registros[5] = rs.getString("Lugar");
                registros[6] = rs.getString("Nota");
                dtModel.addRow(registros);
            }
            tablaRegistros.setModel(dtModel);

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Error al mostrar los datos" + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JcalendarFecha = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cbLugar = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtNombreEvento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaRegistros = new javax.swing.JTable();
        cbHoraInicio = new javax.swing.JComboBox<>();
        cbHoraCierre = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Open Sans", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Actualizar/Eliminar datos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 660, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/h3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 130));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/h3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 80, 130));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("NOMBRE DEL EVENTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("FECHA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        JcalendarFecha.setDateFormatString("yyy-MM-dd");
        jPanel1.add(JcalendarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 160, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("HORA DE CIERRE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 130, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("HORA DE INICIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("LUGAR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        cbLugar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "MULTIUSO 1", "MULTIUSO 2", "MULTIUSO 3", "MULTIUSO 4", "MULTIUSO 5", "MULTIUSO 6", "MULTIUSO 7", "MULTIUSO 8" }));
        jPanel1.add(cbLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 160, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("NOTA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));
        jPanel1.add(txtNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 160, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton_back1.png"))); // NOI18N
        jButton2.setText("ELIMINAR");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 160, 40));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setText("ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 40));
        jPanel1.add(txtNombreEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 40));

        tablaRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaRegistros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 720, 250));

        cbHoraInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00 am", "2:00 am", "3:00 am", "4:00 am", "5:00 am", "6:00 am", "7:00 am", "8:00 am", "9:00 am", "10:00 am", "11:00 am", "12:00 pm", "1:00 pm", "2:00 pm", "3:00 pm", "4:00 pm", "5:00 pm", "6:00 pm", "7:00 pm", "8:00 pm", "9:00 pm", "10:00 pm", "11:00 pm", "12:00 am" }));
        jPanel1.add(cbHoraInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 140, 30));

        cbHoraCierre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1:00 am", "2:00 am", "3:00 am", "4:00 am", "5:00 am", "6:00 am", "7:00 am", "8:00 am", "9:00 am", "10:00 am", "11:00 am", "12:00 pm", "1:00 pm", "2:00 pm", "3:00 pm", "4:00 pm", "5:00 pm", "6:00 pm", "7:00 pm", "8:00 pm", "9:00 pm", "10:00 pm", "11:00 pm", "12:00 am" }));
        jPanel1.add(cbHoraCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, 30));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton_back1.png"))); // NOI18N
        jButton4.setText("ACTUALIZAR");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 160, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atras.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 50, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 720, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")

    private void tablaRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaRegistrosMouseClicked

        int filaSeleccionada = tablaRegistros.rowAtPoint(evt.getPoint());

        txtId.setText(tablaRegistros.getValueAt(filaSeleccionada, 0).toString());
        txtNombreEvento.setText(tablaRegistros.getValueAt(filaSeleccionada, 1).toString());

        ///-------------- Fecha
        String valor = tablaRegistros.getValueAt(filaSeleccionada, 2).toString();

        //El formato de la fecha de MySql es "yyy-MM-dd"
        SimpleDateFormat fechaFormat = new SimpleDateFormat("yyy-MM-dd");
        Date txtFecha;

        try {
            txtFecha = fechaFormat.parse(valor);
            JcalendarFecha.setDate(txtFecha);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Eror en el parseo de la fecha" + e.getMessage(), "", JOptionPane.ERROR_MESSAGE);
        }
        ///-------------- Fecha

//        cbHoraInicio.setSelectedItem(tablaRegistros.getValueAt(filaSeleccionada, 3));
        cbHoraInicio.setToolTipText(tablaRegistros.getValueAt(filaSeleccionada, 6).toString());

//        cbHoraCierre.setSelectedItem(tablaRegistros.getValueAt(filaSeleccionada, 4));
        cbHoraCierre.setToolTipText(tablaRegistros.getValueAt(filaSeleccionada, 6).toString());
        cbLugar.setSelectedItem(tablaRegistros.getValueAt(filaSeleccionada, 5));
        txtNota.setText(tablaRegistros.getValueAt(filaSeleccionada, 6).toString());

    }//GEN-LAST:event_tablaRegistrosMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        eliminar();
        mostrarDatos();
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        actualizarDatos();
        mostrarDatos();
    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CambiarDatos().setVisible(true);
            }
        });

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
    private com.toedter.calendar.JDateChooser JcalendarFecha;
    private javax.swing.JComboBox<String> cbHoraCierre;
    private javax.swing.JComboBox<String> cbHoraInicio;
    private javax.swing.JComboBox<String> cbLugar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaRegistros;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreEvento;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables
}
