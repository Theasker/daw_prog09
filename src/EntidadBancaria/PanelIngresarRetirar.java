package EntidadBancaria;

import java.text.DecimalFormat;
import java.util.ListIterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class PanelIngresarRetirar extends javax.swing.JPanel {

  AplicacionCuentaBancaria padre; // objeto para acceder a la lista de cuentas

  public PanelIngresarRetirar(AplicacionCuentaBancaria pad) {
    this.padre = pad;
    initComponents();
    cmbCuentas.removeAll();
    actualizarCombo();
//    cmbCuentas.addItem("Selecciona una cuenta");
  }

  public void addCuentaACombo(String nCuenta) {
    cmbCuentas.addItem(nCuenta);
  }

  public void actualizarCombo() {
    DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();
    cmbCuentas.setModel(modeloCombo);
    
//    cmbCuentas.addItem("Selecciona una cuenta");
    for (CuentaBancaria cuenta : padre.listaCuentas) {
      cmbCuentas.addItem(cuenta);
    }
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    cmbCuentas = new javax.swing.JComboBox();
    btnVolver = new javax.swing.JButton();
    lblSaldo = new javax.swing.JLabel();
    txtCantidad = new javax.swing.JTextField();
    btnIngresar = new javax.swing.JButton();
    btnRetirar = new javax.swing.JButton();

    cmbCuentas.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        cmbCuentasItemStateChanged(evt);
      }
    });
    cmbCuentas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbCuentasActionPerformed(evt);
      }
    });

    btnVolver.setText("Volver");
    btnVolver.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVolverActionPerformed(evt);
      }
    });

    lblSaldo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
    lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    lblSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    txtCantidad.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
    txtCantidad.setText("15.00");

    btnIngresar.setText("Ingresar");
    btnIngresar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnIngresarActionPerformed(evt);
      }
    });

    btnRetirar.setText("Retirar");
    btnRetirar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnRetirarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnVolver)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(cmbCuentas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(cmbCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtCantidad)
          .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(btnRetirar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnVolver)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    padre.setContentPane(padre.panelPorDefecto);
    padre.pack();
  }//GEN-LAST:event_btnVolverActionPerformed

  private void cmbCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentasActionPerformed
  }//GEN-LAST:event_cmbCuentasActionPerformed

  private boolean comprobarDouble(String cadena) {
    boolean comprobado = true;
    try {
      Double num = Double.parseDouble(cadena);
      if (num < 0) {
        comprobado = false;
      }
      comprobado = true;
    } catch (Exception e) {
      comprobado = false;
    }
    return comprobado;
  }

  private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    CuentaBancaria cuenta = null;
    if (comprobarDouble(txtCantidad.getText())) {
      ListIterator iterador;
      try {
        iterador = padre.listaCuentas.listIterator();
        while (iterador.hasNext()) {
          cuenta = (CuentaBancaria) iterador.next();
          // nos paramos cuando encontramos la cuenta seleccionada
          if (cuenta.equals((CuentaBancaria) cmbCuentas.getSelectedItem())) {
            cuenta.realizarIngreso(Double.parseDouble(txtCantidad.getText()));
            // Formateamos la salida del saldo
            DecimalFormat decim = new DecimalFormat("#.##");

            lblSaldo.setText(decim.format(cuenta.getSaldo()));
            //lblSaldo.setText(cuenta.getSaldo().toString());
            padre.pack();
            break;
          }
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Introduce un número correcto", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
    } else {
      JOptionPane.showMessageDialog(this, "Introduce un número correcto", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnIngresarActionPerformed

  private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
    CuentaBancaria cuenta = null;
    if (comprobarDouble(txtCantidad.getText())) {
      ListIterator iterador;
      try {
        iterador = padre.listaCuentas.listIterator();
        while (iterador.hasNext()) {
          cuenta = (CuentaBancaria) iterador.next();
          // nos paramos cuando encontramos la cuenta seleccionada
          if (cuenta.equals((CuentaBancaria) cmbCuentas.getSelectedItem())) {
            if (cuenta.retirarEfectivo(Double.parseDouble(txtCantidad.getText()))) {
              DecimalFormat decim = new DecimalFormat("#.##");
              lblSaldo.setText(decim.format(cuenta.getSaldo()));
              padre.pack();
              break;
            } else {
              JOptionPane.showMessageDialog(this, "La cantidad es mayor que el saldo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
          }
        }
      } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Introduce un número correcto", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
    } else {
      JOptionPane.showMessageDialog(this, "Introduce un número correcto", "ERROR", JOptionPane.ERROR_MESSAGE);
    }
  }//GEN-LAST:event_btnRetirarActionPerformed

  private void cmbCuentasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCuentasItemStateChanged
    if (!padre.listaCuentas.isEmpty()) {
      for (CuentaBancaria cuenta : padre.listaCuentas) {
        if ((cmbCuentas.getSelectedItem()).equals(cuenta)) {
          //DecimalFormat decim = new DecimalFormat("#.##");
          //Double saldo = Double.parseDouble(decim.format(cuenta.getSaldo()));
          //lblSaldo.setText(saldo.toString());
          lblSaldo.setText(cuenta.getSaldo().toString());
          break;
        }
      }
    }

  }//GEN-LAST:event_cmbCuentasItemStateChanged
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnIngresar;
  private javax.swing.JButton btnRetirar;
  private javax.swing.JButton btnVolver;
  private javax.swing.JComboBox cmbCuentas;
  private javax.swing.JLabel lblSaldo;
  private javax.swing.JTextField txtCantidad;
  // End of variables declaration//GEN-END:variables
}
