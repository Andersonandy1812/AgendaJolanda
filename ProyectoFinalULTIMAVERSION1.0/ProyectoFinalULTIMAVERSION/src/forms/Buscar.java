package forms;

import app.Menu;
import javax.swing.UIManager;
import proyectofinal1.pkg0.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Maycol
 */
public class Buscar extends javax.swing.JFrame {

    Conexion conx = new Conexion();
    Connection con = conx.getConnection();

    /**
     * @what happens when form starts
     */
    public Buscar() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.getContentPane().setBackground(getBackground());
        mostrarDatos();
    }

    private void filtrarDatos(String valor) {

        String[] titulos = {"ID", "NOMBRE EVENTO", "FECHA", "HORA INICIO", "HORA FIN", "LUGAR", "NOTA"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        String SQL = "SELECT * FROM reuniones";
        
        if (radioNombre.isSelected() && radioFecha.isSelected() || radioNombre.isSelected() && radioNota.isSelected() ) {
            
            JOptionPane.showMessageDialog(null, "Seleccione solamente 1 opcion por favor.", "", JOptionPane.ERROR_MESSAGE);
            
        } else if (radioNombre.isSelected()) {
            SQL = "SELECT * FROM reuniones where NombreE like '%" + valor + "%' ";

        } else if (radioFecha.isSelected()) {
            SQL = "SELECT * FROM reuniones where Fecha like '%" + valor + "%' ";

        } else if (radioNota.isSelected()) {
            SQL = "SELECT * FROM reuniones where Nota like '%" + valor + "%' ";
        }
            
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("NombreE");
                registros[2] = rs.getString("Fecha");
                registros[3] = rs.getString("HoraInicio");
                registros[4] = rs.getString("HoraFinal");
                registros[5] = rs.getString("Lugar");
                registros[6] = rs.getString("Nota");

                modelo.addRow(registros);

            }

            tblResultados.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: " + e.getMessage(),"",JOptionPane.ERROR_MESSAGE );
        }
    
}
    private void mostrarDatos() {

        String[] titulos = {"ID", "NOMBRE EVENTO", "FECHA", "HORA INICIO", "HORA FIN", "LUGAR", "NOTA"};
        String[] registros = new String[7];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "SELECT * FROM reuniones";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("Id");
                registros[1] = rs.getString("NombreE");
                registros[2] = rs.getString("Fecha");
                registros[3] = rs.getString("HoraInicio");
                registros[4] = rs.getString("HoraFinal");
                registros[5] = rs.getString("Lugar");
                registros[6] = rs.getString("Nota");

                modelo.addRow(registros);

            }

            tblResultados.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVentana = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblFiltrar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        lblBuscar = new javax.swing.JLabel();
        radioNota = new javax.swing.JRadioButton();
        radioFecha = new javax.swing.JRadioButton();
        radioNombre = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResultados = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblVentana.setFont(new java.awt.Font("Open Sans", 3, 48)); // NOI18N
        lblVentana.setForeground(new java.awt.Color(255, 255, 255));
        lblVentana.setText("Buscar Eventos/Reuniones");
        getContentPane().add(lblVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 640, 100));

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/h3.jpg"))); // NOI18N
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 640, 100));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFiltrar.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblFiltrar.setForeground(new java.awt.Color(51, 51, 51));
        lblFiltrar.setText("Opciones:");
        jPanel1.add(lblFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, 30));

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(51, 51, 51));
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 410, 30));

        lblBuscar.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblBuscar.setForeground(new java.awt.Color(51, 51, 51));
        lblBuscar.setText("Filtrar");
        jPanel1.add(lblBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        radioNota.setBackground(new java.awt.Color(204, 255, 255));
        radioNota.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        radioNota.setForeground(new java.awt.Color(51, 51, 51));
        radioNota.setText("Nota");
        jPanel1.add(radioNota, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 30, -1, 30));

        radioFecha.setBackground(new java.awt.Color(204, 255, 255));
        radioFecha.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        radioFecha.setForeground(new java.awt.Color(51, 51, 51));
        radioFecha.setText("Fecha");
        jPanel1.add(radioFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, 30));

        radioNombre.setBackground(new java.awt.Color(204, 255, 255));
        radioNombre.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        radioNombre.setForeground(new java.awt.Color(51, 51, 51));
        radioNombre.setText("Nombre");
        jPanel1.add(radioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 30, 90, 30));

        tblResultados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblResultados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 990, 260));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 990, 350));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atras.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 50, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

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
                new Buscar().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblFiltrar;
    private javax.swing.JLabel lblVentana;
    private javax.swing.JRadioButton radioFecha;
    private javax.swing.JRadioButton radioNombre;
    private javax.swing.JRadioButton radioNota;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
