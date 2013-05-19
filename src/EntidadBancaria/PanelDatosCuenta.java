package EntidadBancaria;

import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;


public class PanelDatosCuenta extends javax.swing.JPanel {
  
  AplicacionCuentaBancaria padre;
  
  public PanelDatosCuenta(AplicacionCuentaBancaria pad) {
    this.padre = pad;
    initComponents();
    //lkcmbCuentas.addItem("Selecciona una cuenta");
    actualizarCombo();
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnVolver = new javax.swing.JButton();
    cmbCuentas = new javax.swing.JComboBox();
    lblDatos = new javax.swing.JLabel();

    btnVolver.setText("Volver");
    btnVolver.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVolverActionPerformed(evt);
      }
    });

    cmbCuentas.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cmbCuentasItemStateChanged(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnVolver)
          .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnVolver)
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  
  public void actualizarCombo(){
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    cmbCuentas.setModel(modeloCombo);
    //cmbCuentas.addItem("Selecciona una cuenta");
    for(CuentaBancaria cuenta : padre.listaCuentas){
      cmbCuentas.addItem(cuenta);
    }
  }
  
  private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    padre.setContentPane(padre.panelPorDefecto);
    padre.pack();
  }//GEN-LAST:event_btnVolverActionPerformed
  
  private void cmbCuentasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCuentasItemStateChanged
    lblDatos.setText("");
    for (CuentaBancaria cuenta : padre.listaCuentas) {
      // buscamos la cuenta seleccionada en el arrayList de cuentas
      if (cuenta.equals((CuentaBancaria) cmbCuentas.getSelectedItem())) {
        nuevaLinea("<html>");
        nuevaLinea("<center><h2>Datos de la cuenta <br>"+cmbCuentas.getSelectedItem().toString()+"</h2></center>");
        // Comprobamos el tipo de cuenta que es para visualizar unos datos u otros
        nuevaLinea("<b>Nombre: </b>"+cuenta.getTitular().getNombre()+" "+cuenta.getTitular().getApellidos()+"<br>");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
        nuevaLinea("<b>Fecha de nacimiento:</b> "+formatoFecha.format(cuenta.titular.getFechaNacim())+"<br>");
        nuevaLinea("<b>Saldo:</b> "+cuenta.getSaldo()+"<br><hr>");                
        if (cuenta instanceof CuentaAhorro) {
          CuentaAhorro cuentaAhorro = (CuentaAhorro) cuenta;
          nuevaLinea("<center><h3>Cuenta de Ahorro</h3></center><br>");
          nuevaLinea("<b>Tipo de interés:</b> "+cuentaAhorro.getInteresRemuneracion()+"<br>");
        } else if (cuenta instanceof CuentaCorrienteEmpresa) {
          CuentaCorrienteEmpresa ccEmpresa = (CuentaCorrienteEmpresa) cuenta;
          nuevaLinea("<center><h3>Cuenta Corriente de Empresa</h3></center><br>");
          nuevaLinea("<b>Descubierto máximo:</b> "+ccEmpresa.getDescubiertoMax()+"<br>");
          nuevaLinea("<b>Interés descubierto:</b> "+ccEmpresa.getInteresDescubierto()+"<br>");
          nuevaLinea("<b>Comisión Descubierto:</b> "+ccEmpresa.getComisionDescubierto()+"<br>");
        } else {
          CuentaCorrientePersonal ccPersonal = (CuentaCorrientePersonal) cuenta;
          nuevaLinea("<center><h3>Cuenta Corriente Personal</h3></center><br>");
          nuevaLinea("<b>Comisión mantenimiento:</b> "+ccPersonal.getComision()+"<br>");
        }
        nuevaLinea("<html>");
        padre.pack();
      }
    }
  }//GEN-LAST:event_cmbCuentasItemStateChanged
  
  private void nuevaLinea(String cadena) {
    lblDatos.setText(lblDatos.getText() + cadena);
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnVolver;
  private javax.swing.JComboBox cmbCuentas;
  private javax.swing.JLabel lblDatos;
  // End of variables declaration//GEN-END:variables
}
