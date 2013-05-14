package EntidadBancaria;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Persona {
  private String nombre;
  private String apellidos;
  private Date fechaNacim;

  public Persona(String nombre, String apellidos, Date fechaNacim) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.fechaNacim = fechaNacim;
  }
  
  public Persona(){
    
  }

  protected String getNombre (){
    return nombre;
  }

  protected String getApellidos (){
    return apellidos;
  }

  protected Date getFechaNacim (){
    return this.fechaNacim;
  }

  protected void setNombre (String nombre){
    this.nombre= nombre;
  }

  protected void setApellidos (String apellidos){
    this.apellidos= apellidos;
  }

  protected void setFechaNacim (Date fechaNacim){
    this.fechaNacim= fechaNacim;
  }
  
  @Override
  public String toString() {
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    return nombre + " " + apellidos + ", "+ " " + formatoFecha.format(fechaNacim);
  }
}