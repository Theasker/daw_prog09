package EntidadBancaria;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Persona {
  private String nombre;
  private String apellidos;
  private GregorianCalendar fechaNacim;

  public Persona (String nombre, String apellidos, GregorianCalendar fechaNacim) {           
    this.nombre= nombre;
    this.apellidos= apellidos;
    this.fechaNacim= (GregorianCalendar) fechaNacim.clone();
  }
  public Persona(){
    
  }

  protected String getNombre (){
    return nombre;
  }

  protected String getApellidos (){
    return apellidos;
  }

  protected GregorianCalendar getFechaNacim (){
    return this.fechaNacim;
  }

  protected void setNombre (String nombre){
    this.nombre= nombre;
  }

  protected void setApellidos (String apellidos){
    this.apellidos= apellidos;
  }

  protected void setFechaNacim (GregorianCalendar fechaNacim){
    this.fechaNacim= fechaNacim;
  }    
}