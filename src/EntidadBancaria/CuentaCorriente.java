package EntidadBancaria;

import java.util.Hashtable;

public abstract class CuentaCorriente extends CuentaBancaria{
  protected Hashtable <String,Double> listaEntidesAutorizadas;

  public CuentaCorriente(Hashtable<String, Double> listaEntidesAutorizadas, Persona persona, Double saldo, String ccc) {
    super(persona, saldo, ccc);
    this.listaEntidesAutorizadas = listaEntidesAutorizadas;
  }

  public Hashtable<String, Double> getListaEntidesAutorizadas() {
    return listaEntidesAutorizadas;
  }

  public void setListaEntidesAutorizadas(Hashtable<String, Double> listaEntidesAutorizadas) {
    this.listaEntidesAutorizadas = listaEntidesAutorizadas;
  }

  
}
