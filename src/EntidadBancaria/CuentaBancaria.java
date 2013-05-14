package EntidadBancaria;

public abstract class CuentaBancaria{
  protected Persona titular;
  protected Double saldo;
  protected String ccc;

  public CuentaBancaria(Persona persona, Double saldo, String ccc){
    this.titular = persona;
    this.saldo = saldo;
    this.ccc = ccc;
  }
  
  public void realizarIngreso(String cantidad) {
        double valor = 0;
        valor = Double.parseDouble(cantidad);
        saldo += valor;
    }

    public boolean retirarEfectivo(String cantidad){
        double valor = 0;
        valor = Double.parseDouble(cantidad);
        if (valor <= saldo) {
          saldo -= valor;
          return true;
        }else return false;
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

  public String getccc() {
    return ccc;
  }

  public void setccc(String ccc) {
    this.ccc = ccc;
  }
}
