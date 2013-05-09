package EntidadBancaria;

public class CuentaBancaria{
  protected Persona titular;
  protected Double saldo;
  protected String CCC;

  public CuentaBancaria(Persona p, Double s, String c){
    this.titular = p;
    this.saldo = s;
    this.CCC = c;
  }
  
  public Persona getTitular() {
    return titular;
  }

  public void setTitular(Persona titular) {
    this.titular = titular;
  }

  public Double getSaldo() {
    return saldo;
  }

  public void setSaldo(Double saldo) {
    this.saldo = saldo;
  }

  public String getCCC() {
    return CCC;
  }

  public void setCCC(String CCC) {
    this.CCC = CCC;
  }
  
  
}
