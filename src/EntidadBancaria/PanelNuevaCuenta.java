package EntidadBancaria;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class PanelNuevaCuenta extends javax.swing.JPanel {
  AplicacionCuentaBancaria padre; // objeto para acceder a la lista de cuentas
  String texto;
  Comprobaciones comprobar;
  public PanelNuevaCuenta(AplicacionCuentaBancaria pad) {
    this.padre = pad;
    this.comprobar = new Comprobaciones();
    initComponents();    
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    botonGrabar = new javax.swing.JButton();
    BotonCancelar = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtApellidos = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    txtSaldo = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtNacimiento = new com.toedter.calendar.JDateChooser();
    TiposdeCuenta = new javax.swing.JComboBox();
    jScrollPane1 = new javax.swing.JScrollPane();
    CajaTexto = new javax.swing.JTextArea();
    jLabel1 = new javax.swing.JLabel();
    txtCuenta = new javax.swing.JFormattedTextField();

    botonGrabar.setText("Grabar");
    botonGrabar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonGrabarActionPerformed(evt);
      }
    });

    BotonCancelar.setText("Volver");
    BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonCancelarActionPerformed(evt);
      }
    });

    jLabel2.setText("Nombre: ");

    txtNombre.setText("Mauri");
    txtNombre.setToolTipText("Introduzca el nombre del cliente");
    txtNombre.setMaximumSize(new java.awt.Dimension(10, 30));

    jLabel3.setText("Apellidos: ");

    txtApellidos.setText("Segura");
    txtApellidos.setToolTipText("Introduzca los apellidos del cliente");
    txtApellidos.setMaximumSize(new java.awt.Dimension(10, 30));

    jLabel10.setText("Saldo:");

    txtSaldo.setText("100,50");
    txtSaldo.setToolTipText("Cantidad con la que abre la cuenta");
    txtSaldo.setMaximumSize(new java.awt.Dimension(10, 30));

    jLabel4.setText("Fecha de Nacimiento:");

    txtNacimiento.setDateFormatString("dd-MM-yyyy");

    TiposdeCuenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cuenta Corriente", "Cuenta Corriente Personal", "Cuenta Corriente de Empresa" }));
    TiposdeCuenta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TiposdeCuentaActionPerformed(evt);
      }
    });

    CajaTexto.setColumns(20);
    CajaTexto.setRows(5);
    jScrollPane1.setViewportView(CajaTexto);

    jLabel1.setText("Número de cuenta:");

    try {
      txtCuenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### ## ##########")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    txtCuenta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
      public void propertyChange(java.beans.PropertyChangeEvent evt) {
        txtCuentaPropertyChange(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
              .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(BotonCancelar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonGrabar))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel10))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(txtNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(TiposdeCuenta, 0, 211, Short.MAX_VALUE))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel2)
          .addComponent(jLabel3))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel4)
              .addComponent(jLabel10))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(txtSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(txtNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addComponent(TiposdeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(botonGrabar)
          .addComponent(BotonCancelar))
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void botonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGrabarActionPerformed
    // Tratamiento de la fecha
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    
    texto = txtNombre.getText()+" "+txtApellidos.getText()+" "+formatoFecha.format(txtNacimiento.getDate())+" "+txtSaldo.getText();
    CajaTexto.setText(texto);
    //this.padre.listaCuentas.add(personita);
  }//GEN-LAST:event_botonGrabarActionPerformed

  private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
    padre.setContentPane(padre.panelPorDefecto);
  }//GEN-LAST:event_BotonCancelarActionPerformed

  private void TiposdeCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiposdeCuentaActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_TiposdeCuentaActionPerformed

  private void txtCuentaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCuentaPropertyChange
    CajaTexto.setText("He cambiado la cuenta");
    if (comprobar.comprobarCuenta(txtCuenta.getText())==false){
      txtCuenta.requestFocus();
    }    
  }//GEN-LAST:event_txtCuentaPropertyChange

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BotonCancelar;
  private javax.swing.JTextArea CajaTexto;
  private javax.swing.JComboBox TiposdeCuenta;
  private javax.swing.JButton botonGrabar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField txtApellidos;
  private javax.swing.JFormattedTextField txtCuenta;
  private com.toedter.calendar.JDateChooser txtNacimiento;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtSaldo;
  // End of variables declaration//GEN-END:variables
}
