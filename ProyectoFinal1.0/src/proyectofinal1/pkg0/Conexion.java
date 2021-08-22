package proyectofinal1.pkg0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Shoto
 */
public class Conexion {

private static final String SERVIDOR="jdbc:mysql://localhost/registro";
private static final String user="root";
private static final String pass="";
private static final String driver="com.mysql.jdbc.Driver";
private Connection CN;

  public Conexion(){
     CN = null;
  }
  
  public Connection getConnection(){
     try{
         Class.forName(driver);
         CN = DriverManager.getConnection(SERVIDOR,user,pass);
     }
     catch(ClassNotFoundException | SQLException ex){
         JOptionPane.showMessageDialog(null,ex.getMessage());
         System.exit(0);
     }
     return CN;
  }
  
  public void close(){
      
  try{CN.close();}
  catch(SQLException ex){
   JOptionPane.showMessageDialog(null,ex.getMessage());
  }

  }
}
