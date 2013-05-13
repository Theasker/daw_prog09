package EntidadBancaria;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;
import java.text.SimpleDateFormat;

public class PanelNuevaCuenta extends javax.swing.JPanel {
  AplicacionCuentaBancaria padre; // objeto para acceder a la lista de cuentas
  String texto;
  Comprobaciones comprobar;
  String[] tipCuen={  "",
                        "Cuenta de Ahorro",
                        "Cuenta Corriente Personal",
                        "Cuenta Corriente de Empresa"};
  Hashtable entidades;
  
  
  public PanelNuevaCuenta(AplicacionCuentaBancaria pad) {
    this.padre = pad;
    this.comprobar = new Comprobaciones();
    initComponents();
    this.ocultar();
    this.cargarComboTipoCuenta();
    
  }
  
  private void cargarComboTipoCuenta(){
    cmbTiposdeCuenta.addItem("Selecciona el tipo de cuenta");
    cmbTiposdeCuenta.addItem("Cuenta de Ahorro");
    cmbTiposdeCuenta.addItem("Cuenta Corriente Personal");
    cmbTiposdeCuenta.addItem("Cuenta Corriente de Empresa");
  }
  
  private void ocultar(){
    PanelInteres.setVisible(false);
    PanelCuentaCorrientePersonal.setVisible(false);
    btnEntidades.setVisible(false);
    PanelCuentaCorrienteEmpresa.setVisible(false);
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
    cmbTiposdeCuenta = new javax.swing.JComboBox();
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
    btnEntidades = new javax.swing.JButton();
    PanelCuentaCorrienteEmpresa = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jFormattedTextField1 = new javax.swing.JFormattedTextField();
    jFormattedTextField2 = new javax.swing.JFormattedTextField();
    jFormattedTextField3 = new javax.swing.JFormattedTextField();

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

    cmbTiposdeCuenta.setToolTipText("Seleccione el tipo de cuenta");
    cmbTiposdeCuenta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbTiposdeCuentaActionPerformed(evt);
      }
    });

    jLabel1.setText("Número de cuenta:");

    try {
      txtCuenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#### #### ## ##########")));
    } catch (java.text.ParseException ex) {
      ex.printStackTrace();
    }
    txtCuenta.setText("5289 0686 79 8440413488");

    EtiquetaErrores.setForeground(new java.awt.Color(204, 51, 0));
    EtiquetaErrores.setText(" ");
    EtiquetaErrores.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel5.setText("Tipo de interés:");

    txtInteres.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##.##"))));
    txtInteres.setText("3,51");
    txtInteres.setToolTipText("Decimales separados por coma");

    javax.swing.GroupLayout PanelInteresLayout = new javax.swing.GroupLayout(PanelInteres);
    PanelInteres.setLayout(PanelInteresLayout);
    PanelInteresLayout.setHorizontalGroup(
      PanelInteresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInteresLayout.createSequentialGroup()
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    txtSaldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.##"))));
    txtSaldo.setText("1000,53");
    txtSaldo.setToolTipText("Saldo inicial de la cuenta\nDecimales separados por coma");

    btnEntidades.setText("Agregar entidades autorizadas");
    btnEntidades.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEntidadesActionPerformed(evt);
      }
    });

    PanelCuentaCorrienteEmpresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel7.setText("Descubierto Máximo:");

    jLabel8.setText("Interés Descubierto:");

    jLabel9.setText("Comisión Descubierto:");

    jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##.##"))));
    jFormattedTextField1.setText("500,51");

    jFormattedTextField2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##.##"))));
    jFormattedTextField2.setText("15,51");

    jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##.##"))));
    jFormattedTextField3.setText("19,13");

    javax.swing.GroupLayout PanelCuentaCorrienteEmpresaLayout = new javax.swing.GroupLayout(PanelCuentaCorrienteEmpresa);
    PanelCuentaCorrienteEmpresa.setLayout(PanelCuentaCorrienteEmpresaLayout);
    PanelCuentaCorrienteEmpresaLayout.setHorizontalGroup(
      PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelCuentaCorrienteEmpresaLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(PanelCuentaCorrienteEmpresaLayout.createSequentialGroup()
            .addComponent(jLabel9)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jFormattedTextField3))
          .addGroup(PanelCuentaCorrienteEmpresaLayout.createSequentialGroup()
            .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel7)
              .addComponent(jLabel8))
            .addGap(29, 29, 29)
            .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jFormattedTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
              .addComponent(jFormattedTextField2))))
        .addContainerGap(35, Short.MAX_VALUE))
    );
    PanelCuentaCorrienteEmpresaLayout.setVerticalGroup(
      PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelCuentaCorrienteEmpresaLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
        .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel8)
          .addComponent(jFormattedTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel9)
          .addComponent(jFormattedTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap())
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGap(18, 18, 18)
            .addComponent(PanelInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
            .addComponent(cmbTiposdeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(104, 104, 104))))
      .addGroup(layout.createSequentialGroup()
        .addGap(12, 12, 12)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel2)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel3)
          .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(104, 104, 104))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(BotonCancelar)
        .addGap(356, 356, 356)
        .addComponent(botonGrabar)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(EtiquetaErrores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(PanelCuentaCorrienteEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
              .addGap(110, 110, 110)
              .addComponent(PanelCuentaCorrientePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
              .addGap(139, 139, 139)
              .addComponent(btnEntidades))))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
          .addComponent(cmbTiposdeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addComponent(jLabel10)))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(PanelInteres, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(PanelCuentaCorrientePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnEntidades)
        .addGap(12, 12, 12)
        .addComponent(PanelCuentaCorrienteEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        .addComponent(EtiquetaErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
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
    padre.pack();
  }//GEN-LAST:event_BotonCancelarActionPerformed

  private void cmbTiposdeCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTiposdeCuentaActionPerformed
    EtiquetaErrores.setText(cmbTiposdeCuenta.getSelectedItem().toString());
    switch(cmbTiposdeCuenta.getSelectedItem().toString()){
      case "Cuenta de Ahorro":
      PanelInteres.setVisible(true);
      PanelCuentaCorrientePersonal.setVisible(false);
      btnEntidades.setVisible(false);
      PanelCuentaCorrienteEmpresa.setVisible(false);
      padre.pack();
      break;
      case "Cuenta Corriente Personal":
      PanelInteres.setVisible(false);
      PanelCuentaCorrientePersonal.setVisible(true);
      btnEntidades.setVisible(true);
      PanelCuentaCorrienteEmpresa.setVisible(false);
      padre.pack();
      break;
      case "Cuenta Corriente de Empresa":
      PanelInteres.setVisible(false);
      PanelCuentaCorrientePersonal.setVisible(false);
      btnEntidades.setVisible(true);
      PanelCuentaCorrienteEmpresa.setVisible(true);
      padre.pack();
      break;
    }
  }//GEN-LAST:event_cmbTiposdeCuentaActionPerformed

  private void btnEntidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntidadesActionPerformed
    padre.setContentPane(padre.panelEntidades);
    padre.pack();
  }//GEN-LAST:event_btnEntidadesActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BotonCancelar;
  private javax.swing.JLabel EtiquetaErrores;
  private javax.swing.JPanel PanelCuentaCorrienteEmpresa;
  private javax.swing.JPanel PanelCuentaCorrientePersonal;
  private javax.swing.JPanel PanelInteres;
  private javax.swing.JButton botonGrabar;
  private javax.swing.JButton btnEntidades;
  private javax.swing.JComboBox cmbTiposdeCuenta;
  private javax.swing.JFormattedTextField jFormattedTextField1;
  private javax.swing.JFormattedTextField jFormattedTextField2;
  private javax.swing.JFormattedTextField jFormattedTextField3;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JTextField txtApellidos;
  private javax.swing.JFormattedTextField txtComMantenimiento;
  private javax.swing.JFormattedTextField txtCuenta;
  private javax.swing.JFormattedTextField txtInteres;
  private com.toedter.calendar.JDateChooser txtNacimiento;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JFormattedTextField txtSaldo;
  // End of variables declaration//GEN-END:variables
}
