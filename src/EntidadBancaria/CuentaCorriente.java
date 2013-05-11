package EntidadBancaria;

import java.util.Hashtable;

public abstract class CuentaCorriente extends CuentaBancaria{
  protected Hashtable <String,String> listaEntidesAutorizadas;

  public CuentaCorriente(Hashtable<String, String> listaEntidesAutorizadas, Persona persona, Double saldo, String ccc) {
    super(persona, saldo, ccc);
    this.listaEntidesAutorizadas = listaEntidesAutorizadas;
  }

  public Hashtable<String, String> getListaEntidesAutorizadas() {
    return listaEntidesAutorizadas;
  }

  public void setListaEntidesAutorizadas(Hashtable<String, String> listaEntidesAutorizadas) {
    this.listaEntidesAutorizadas = listaEntidesAutorizadas;
  }

  
}
