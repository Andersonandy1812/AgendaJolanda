package proyectofinal1.pkg0;

import java.util.Date;
import java.sql.SQLException;

/**
 *
 * @author @Maycol
 */
public class Registro {

    private String Nombre, Lugar, Nota;
    private Date Fecha;
    private int  HoraInicio, HoraFinal;

    public Registro() {
    }

    public Registro(String Nombre, String Lugar, String Nota, Date Fecha, int HoraInicio, int HoraFinal) {
        this.Nombre = Nombre;
        this.Lugar = Lugar;
        this.Nota = Nota;
        this.Fecha = Fecha;
        this.HoraInicio = HoraInicio;
        this.HoraFinal = HoraFinal;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getLugar() {
        return Lugar;
    }

    public String getNota() {
        return Nota;
    }

    public Date getFecha() {
        return Fecha;
    }

    public int getHoraInicio() {
        return HoraInicio;
    }

    public int getHoraFinal() {
        return HoraFinal;
    }

/*    public boolean agregar() {
        
    }*/
  }

