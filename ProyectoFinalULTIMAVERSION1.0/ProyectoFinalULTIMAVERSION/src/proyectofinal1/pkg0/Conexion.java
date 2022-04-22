package proyectofinal1.pkg0;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author @Maycol
 */
public class Conexion {

    private static final String SERVIDOR = "jdbc:mysql://localhost/registro";
    //private static final String SERVIDOR = "jdbc:mysql://sql3.freemysqlhosting.net/sql3432328";
    private static final String user = "root";
    private static final String pass = "";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection conectar;

    public Conexion() {
        conectar = null;
    }

    public Connection getConnection() {
        try {
            Class.forName(driver);
            conectar = DriverManager.getConnection(SERVIDOR, user, pass);
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion nula" +e.getMessage());
        }
        return conectar;
    }

    public void close() {

        try {
            conectar.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }
}
