package EntidadBancaria;

import java.text.SimpleDateFormat;

public class PanelNuevaCuenta extends javax.swing.JPanel {
  AplicacionCuentaBancaria padre; // objeto para acceder a la lista de cuentas
  String texto;
  Comprobaciones comprobar;
  String[] tipCuen={  "",
                        "Cuenta de Ahorro",
                        "Cuenta Corriente Personal",
                        "Cuenta Corriente de Empresa"};
  
  public PanelNuevaCuenta(AplicacionCuentaBancaria pad) {
    this.padre = pad;
    this.comprobar = new Comprobaciones();
    initComponents();
    TiposdeCuenta.addItem("Selecciona el tipo de cuenta");
    TiposdeCuenta.addItem("Cuenta de Ahorro");
    TiposdeCuenta.addItem("Cuenta Corriente Personal");
    TiposdeCuenta.addItem("Cuenta Corriente de Empresa");
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
    jLabel4 = new javax.swing.JLabel();
    txtNacimiento = new com.toedter.calendar.JDateChooser();
    TiposdeCuenta = new javax.swing.JComboBox();
    jLabel1 = new javax.swing.JLabel();
    txtCuenta = new javax.swing.JFormattedTextField();
    EtiquetaErrores = new javax.swing.JLabel();
    PanelInteres = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    txtInteres = new javax.swing.JFormattedTextField();
    PanelCuentaCorrientePersonal = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    txtComMantenimiento = new javax.swing.JFormattedTextField();
    txtSaldo = new javax.swing.JFormattedTextField();

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

    jLabel4.setText("Fecha de Nacimiento:");

    txtNacimiento.setDateFormatString("dd-MM-yyyy");

    TiposdeCuenta.setToolTipText("Seleccione el tipo de cuenta");
    TiposdeCuenta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        TiposdeCuentaActionPerformed(evt);
      }
    });

    jLabel1.setText("Número de cuenta:");

    try {
      txtCuenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### ## ##########")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    txtCuenta.setText("5289 0686 79 8440413488");
    txtCuenta.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
      public void propertyChange(java.beans.PropertyChangeEvent evt) {
        txtCuentaPropertyChange(evt);
      }
    });

    EtiquetaErrores.setForeground(new java.awt.Color(204, 51, 0));
    EtiquetaErrores.setText(" ");

    jLabel5.setText("Tipo de interés:");

    txtInteres.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##.##"))));
    txtInteres.setToolTipText("Decimales separados por coma");

    javax.swing.GroupLayout PanelInteresLayout = new javax.swing.GroupLayout(PanelInteres);
    PanelInteres.setLayout(PanelInteresLayout);
    PanelInteresLayout.setHorizontalGroup(
      PanelInteresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInteresLayout.createSequentialGroup()
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    PanelInteresLayout.setVerticalGroup(
      PanelInteresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelInteresLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PanelInteresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    PanelCuentaCorrientePersonal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel6.setText("Comisión de mantenimiento");

    txtComMantenimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##.##"))));
    txtComMantenimiento.setText("7,51");
    txtComMantenimiento.setToolTipText("Decimales separados por coma");

    javax.swing.GroupLayout PanelCuentaCorrientePersonalLayout = new javax.swing.GroupLayout(PanelCuentaCorrientePersonal);
    PanelCuentaCorrientePersonal.setLayout(PanelCuentaCorrientePersonalLayout);
    PanelCuentaCorrientePersonalLayout.setHorizontalGroup(
      PanelCuentaCorrientePersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelCuentaCorrientePersonalLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel6)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(txtComMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(21, Short.MAX_VALUE))
    );
    PanelCuentaCorrientePersonalLayout.setVerticalGroup(
      PanelCuentaCorrientePersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelCuentaCorrientePersonalLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PanelCuentaCorrientePersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6)
          .addComponent(txtComMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(136, Short.MAX_VALUE))
    );

    txtSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
    txtSaldo.setText("1000,53");
    txtSaldo.setToolTipText("Saldo inicial de la cuenta\nDecimales separados por coma");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(PanelCuentaCorrientePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(EtiquetaErrores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(0, 154, Short.MAX_VALUE))
              .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel3)
              .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(BotonCancelar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botonGrabar))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel10)
                    .addGap(47, 47, 47))
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)))
                .addComponent(PanelInteres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
              .addGroup(layout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TiposdeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addComponent(TiposdeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(jLabel10))
            .addGap(17, 17, 17))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(PanelInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
        .addComponent(PanelCuentaCorrientePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
        .addComponent(EtiquetaErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    EtiquetaErrores.setText(texto);
    //this.padre.listaCuentas.add(personita);
  }//GEN-LAST:event_botonGrabarActionPerformed

  private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
    padre.setContentPane(padre.panelPorDefecto);
  }//GEN-LAST:event_BotonCancelarActionPerformed

  private void TiposdeCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiposdeCuentaActionPerformed
    EtiquetaErrores.setText(TiposdeCuenta.getSelectedItem().toString());
    switch(TiposdeCuenta.getSelectedItem().toString()){
      case "Cuenta de Ahorro":
        PanelInteres.setVisible(true);
        break;
      case "Cuenta Corriente Personal":
        PanelInteres.setVisible(false);
        break;
      case "Cuenta Corriente de Empresa":
        PanelInteres.setVisible(false);
        break;
    }
  }//GEN-LAST:event_TiposdeCuentaActionPerformed

  private void txtCuentaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtCuentaPropertyChange
    EtiquetaErrores.setText("He cambiado la cuenta");
    if (comprobar.comprobarCuenta(txtCuenta.getText())==false){
      txtCuenta.requestFocus();
    }    
  }//GEN-LAST:event_txtCuentaPropertyChange

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BotonCancelar;
  private javax.swing.JLabel EtiquetaErrores;
  private javax.swing.JPanel PanelCuentaCorrientePersonal;
  private javax.swing.JPanel PanelInteres;
  private javax.swing.JComboBox TiposdeCuenta;
  private javax.swing.JButton botonGrabar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JTextField txtApellidos;
  private javax.swing.JFormattedTextField txtComMantenimiento;
  private javax.swing.JFormattedTextField txtCuenta;
  private javax.swing.JFormattedTextField txtInteres;
  private com.toedter.calendar.JDateChooser txtNacimiento;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JFormattedTextField txtSaldo;
  // End of variables declaration//GEN-END:variables
}
