package proyectofinal1.pkg0;

import java.sql.Connection;
import proyectofinal1.pkg0.Conexion;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author @Maycol
 */
public class Query {

    private final String SQL_INSERT = "INSERT INTO reuniones (NombreE,Fecha,HoraInicio,HoraFinal,Lugar,Nota ) values (?,?,?,?,?,?);";
    private PreparedStatement P;
    private Conexion CN;

    public Query() {
        P = null;
        CN = new Conexion();
    }

    public int inser(String Nombre, String Fecha, String Hora_i, String Hora_c, String Lugar, String Nota) {
        try {
            P = CN.getConnection().prepareStatement(SQL_INSERT);
            P.setString(1, Nombre);
            P.setString(2, Fecha);
            P.setString(3, Hora_i);
            P.setString(4, Hora_c);
            P.setString(5, Lugar);
            P.setString(6, Nota);
            int R = P.executeUpdate();
            if (R > 0) {
                JOptionPane.showMessageDialog(null, "Registros guardados");
            }
        } catch (Exception e) {
            System.err.print("error" + e.getMessage());
        } finally {
            P = null;
            CN.close();
        }
        return 0;
    }
}
