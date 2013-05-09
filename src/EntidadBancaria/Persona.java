/*
 * Clase Persona
 */
package EntidadBancaria;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase abstracta Persona
 */
public class Persona {
  private String nombre;
  private String apellidos;
  private GregorianCalendar fechaNacim;

  // Constructor
  public Persona (String nombre, String apellidos, GregorianCalendar fechaNacim) {           
    this.nombre= nombre;
    this.apellidos= apellidos;
    this.fechaNacim= (GregorianCalendar) fechaNacim.clone();
  }

  // Método getNombre
  protected String getNombre (){
    return nombre;
  }

  // Método getApellidos
  protected String getApellidos (){
    return apellidos;
  }

  // Método getFechaNacim
  protected GregorianCalendar getFechaNacim (){
    return this.fechaNacim;
  }

  // Método setNombre
  protected void setNombre (String nombre){
    this.nombre= nombre;
  }

  // Método setApellidos
  protected void setApellidos (String apellidos){
    this.apellidos= apellidos;
  }

  // Método setFechaNacim
  protected void setFechaNacim (GregorianCalendar fechaNacim){
    this.fechaNacim= fechaNacim;
  }    
}