
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
 * @author Shoto
 */
public class Reuniones extends javax.swing.JFrame {

    String fecha;
    
    
    private proyectofinal1.pkg0.Query in;
    /**
     * Creates new form Reuniones
     */
    public Reuniones() {
        initComponents();
        in=new Query();
    }

    /**
     * @falta arreglar el comboBox de lugar (no obtiene el lugar que seleccionamos)
     * @cambios documente el metodo que guarda los datos en la bd hasta que se arreglen los errores
     * @author Maycol
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
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
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Hora1 = new javax.swing.JTextField();
        Hora2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/h3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 80, 130));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registro de Eventos/Reuniones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 660, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/h3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 130));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("<NOMBRE/>");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("NOMBRE DEL EVENTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        jPanel1.add(NombreE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 160, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("FECHA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 160, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("HORA DE CIERRE");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("HORA DE INICIO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("LUGAR");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        Lugar1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONAR", "MULTIUSO 1", "MULTIUSO 2", "MULTIUSO 3", "MULTIUSO 4", "MULTIUSO 5", "MULTIUSO 6", "MULTIUSO 7", "MULTIUSO 8" }));
        jPanel1.add(Lugar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 160, 40));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("NOTA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));
        jPanel1.add(Nota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 160, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton_back1.png"))); // NOI18N
        jButton2.setText("GUARDAR");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.gray, null));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 160, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cerr.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 100, 60));
        jPanel1.add(Hora1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 160, 40));
        jPanel1.add(Hora2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 720, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Nombre=NombreE1.getText();
        
        // ------------------- fecha inicio
        Date Fecha = jDateChooser1.getDate();
        long jd = Fecha.getTime();

        java.sql.Date fecha = new java.sql.Date(jd);

        this.fecha = fecha.toString();
        // ------------------- fecha termina
        
        String Hora_i= Hora1.getText();
        String Hora_c= Hora2.getText();
        
        String Lugar= Lugar1.getSelectedItem().toString(); // arreglar esto, que obtenga el valor del combo
        
        String Nota=Nota1.getText();
        
        
        // despliegue en pantalla, creado solo para probar si funcionan los campos
      
        
        in.inser(Nombre, this.fecha, Hora_i, Hora_c, Lugar, Nota);
    }//GEN-LAST:event_jButton2ActionPerformed

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
                new Reuniones().setVisible(true);
            }
        });
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
    private javax.swing.JTextField Hora1;
    private javax.swing.JTextField Hora2;
    private javax.swing.JComboBox<String> Lugar1;
    private javax.swing.JTextField NombreE1;
    private javax.swing.JTextField Nota1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
