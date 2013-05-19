package EntidadBancaria;

public class CuentaCorrienteEmpresa extends CuentaBancaria {
  private Double descubiertoMax;
  private Double interesDescubierto;
  private Double comisionDescubierto;

  public CuentaCorrienteEmpresa
          (Double descubiertoMax, Double interesDescubierto, Double comisionDescubierto, Persona persona, Double saldo, String ccc) {
    super(persona, saldo, ccc);
    this.descubiertoMax = descubiertoMax;
    this.interesDescubierto = interesDescubierto;
    this.comisionDescubierto = comisionDescubierto;
  }
  public Double getDescubiertoMax() {
    return descubiertoMax;
  }
  public void setDescubiertoMax(Double descubiertoMax) {
    this.descubiertoMax = descubiertoMax;
  }
  public Double getInteresDescubierto() {
    return interesDescubierto;
  }
  public void setInteresDescubierto(Double interesDescubierto) {
    this.interesDescubierto = interesDescubierto;
  }
  public Double getComisionDescubierto() {
    return comisionDescubierto;
  }
  public void setComisionDescubierto(Double comisionDescubierto) {
    this.comisionDescubierto = comisionDescubierto;
  }
  @Override
  public String toString(){
//    String texto;
//    texto = titular.toString()+" "+ccc+"("+saldo+")"+", Descubierto max.: "+descubiertoMax+
//            ", int.descubierto: "+interesDescubierto+", comisión desc: "+comisionDescubierto;
//    return texto;
    return ccc;
  }
}
