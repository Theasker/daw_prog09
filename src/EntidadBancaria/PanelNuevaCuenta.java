package EntidadBancaria;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ListIterator;
import javax.swing.JOptionPane;

public class PanelNuevaCuenta extends javax.swing.JPanel {
  AplicacionCuentaBancaria padre; // objeto para acceder a la lista de cuentas
  String texto;
  Comprobaciones comprobar;
  Hashtable entidades;
  SimpleDateFormat formatoFecha;
  
  public PanelNuevaCuenta(AplicacionCuentaBancaria pad) {
    this.padre = pad;
    this.comprobar = new Comprobaciones();
    initComponents();
    this.ocultar();
    this.cargarComboTipoCuenta();   
    PanelComun.setVisible(false);
    txtNacimiento.setDate(null);
    formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    try {    
      Date fecha = formatoFecha.parse("17-05-2013");
      txtNacimiento.setDate(fecha);
    } catch (ParseException ex) {
      System.out.println("Error de conversion de fecha");
    }
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

    PanelCuentaCorrientePersonal = new javax.swing.JPanel();
    jLabel6 = new javax.swing.JLabel();
    txtComMantenimiento = new javax.swing.JTextField();
    btnEntidades = new javax.swing.JButton();
    PanelCuentaCorrienteEmpresa = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    txtDescubiertoMaximo = new javax.swing.JTextField();
    txtInteresDescubierto = new javax.swing.JTextField();
    txtComisionDescubierto = new javax.swing.JTextField();
    PanelComun = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtApellidos = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtNacimiento = new com.toedter.calendar.JDateChooser();
    jLabel1 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    txtSaldo = new javax.swing.JTextField();
    txtCuenta = new javax.swing.JTextField();
    jPanel2 = new javax.swing.JPanel();
    EtiquetaErrores = new javax.swing.JLabel();
    BotonCancelar = new javax.swing.JButton();
    botonGrabar = new javax.swing.JButton();
    btnBorrarDatos = new javax.swing.JButton();
    cmbTiposdeCuenta = new javax.swing.JComboBox();
    PanelInteres = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();
    txtInteres = new javax.swing.JTextField();

    PanelCuentaCorrientePersonal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel6.setText("Comisión de mantenimiento");

    javax.swing.GroupLayout PanelCuentaCorrientePersonalLayout = new javax.swing.GroupLayout(PanelCuentaCorrientePersonal);
    PanelCuentaCorrientePersonal.setLayout(PanelCuentaCorrientePersonalLayout);
    PanelCuentaCorrientePersonalLayout.setHorizontalGroup(
      PanelCuentaCorrientePersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelCuentaCorrientePersonalLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel6)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtComMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    txtComisionDescubierto.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        txtComisionDescubiertoActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout PanelCuentaCorrienteEmpresaLayout = new javax.swing.GroupLayout(PanelCuentaCorrienteEmpresa);
    PanelCuentaCorrienteEmpresa.setLayout(PanelCuentaCorrienteEmpresaLayout);
    PanelCuentaCorrienteEmpresaLayout.setHorizontalGroup(
      PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelCuentaCorrienteEmpresaLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel9)
          .addComponent(jLabel7)
          .addComponent(jLabel8))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
        .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(txtComisionDescubierto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
            .addComponent(txtDescubiertoMaximo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
            .addComponent(txtInteresDescubierto, javax.swing.GroupLayout.Alignment.TRAILING)))
        .addContainerGap())
    );
    PanelCuentaCorrienteEmpresaLayout.setVerticalGroup(
      PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelCuentaCorrienteEmpresaLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7)
          .addComponent(txtDescubiertoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtInteresDescubierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(PanelCuentaCorrienteEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(txtComisionDescubierto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel9))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jLabel2.setText("Nombre: ");

    txtNombre.setToolTipText("Introduzca el nombre del cliente");
    txtNombre.setMaximumSize(new java.awt.Dimension(10, 30));

    jLabel3.setText("Apellidos: ");

    txtApellidos.setToolTipText("Introduzca los apellidos del cliente");
    txtApellidos.setMaximumSize(new java.awt.Dimension(10, 30));

    jLabel4.setText("Fecha de Nacimiento:");

    txtNacimiento.setToolTipText("Selecciona la fecha de naciemiento");
    txtNacimiento.setDateFormatString("dd-MM-yyyy");

    jLabel1.setText("Número de cuenta:");

    jLabel10.setText("Saldo:");

    txtSaldo.setToolTipText("");

    javax.swing.GroupLayout PanelComunLayout = new javax.swing.GroupLayout(PanelComun);
    PanelComun.setLayout(PanelComunLayout);
    PanelComunLayout.setHorizontalGroup(
      PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelComunLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(PanelComunLayout.createSequentialGroup()
            .addGroup(PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(5, 5, 5)
            .addGroup(PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(PanelComunLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 225, Short.MAX_VALUE)))
            .addContainerGap())
          .addGroup(PanelComunLayout.createSequentialGroup()
            .addGroup(PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel1)
              .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel10)
              .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(56, 56, 56))))
    );
    PanelComunLayout.setVerticalGroup(
      PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelComunLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelComunLayout.createSequentialGroup()
            .addGap(46, 46, 46)
            .addComponent(jLabel4)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelComunLayout.createSequentialGroup()
            .addGroup(PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel2)
              .addComponent(jLabel3))
            .addGroup(PanelComunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(PanelComunLayout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(PanelComunLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(PanelComunLayout.createSequentialGroup()
            .addComponent(jLabel10)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(56, 56, 56))
    );

    EtiquetaErrores.setForeground(new java.awt.Color(204, 51, 0));
    EtiquetaErrores.setText(" ");
    EtiquetaErrores.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    BotonCancelar.setText("Volver");
    BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonCancelarActionPerformed(evt);
      }
    });

    botonGrabar.setText("Grabar");
    botonGrabar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonGrabarActionPerformed(evt);
      }
    });

    btnBorrarDatos.setText("Borrar datos");
    btnBorrarDatos.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBorrarDatosActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(EtiquetaErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(BotonCancelar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBorrarDatos)
            .addGap(135, 135, 135)
            .addComponent(botonGrabar)))
        .addGap(9, 9, 9))
    );
    jPanel2Layout.setVerticalGroup(
      jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel2Layout.createSequentialGroup()
        .addGap(4, 4, 4)
        .addComponent(EtiquetaErrores, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(botonGrabar)
            .addComponent(btnBorrarDatos))
          .addComponent(BotonCancelar))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    cmbTiposdeCuenta.setToolTipText("Seleccione el tipo de cuenta");
    cmbTiposdeCuenta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cmbTiposdeCuentaActionPerformed(evt);
      }
    });

    PanelInteres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel5.setText("Tipo de interés:");

    javax.swing.GroupLayout PanelInteresLayout = new javax.swing.GroupLayout(PanelInteres);
    PanelInteres.setLayout(PanelInteresLayout);
    PanelInteresLayout.setHorizontalGroup(
      PanelInteresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelInteresLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtInteres, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        .addContainerGap())
    );
    PanelInteresLayout.setVerticalGroup(
      PanelInteresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelInteresLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(PanelInteresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5)
          .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(14, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(layout.createSequentialGroup()
            .addGap(100, 100, 100)
            .addComponent(cmbTiposdeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(PanelComun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addComponent(PanelCuentaCorrienteEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                      .addComponent(PanelCuentaCorrientePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                      .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnEntidades)))
                    .addGap(24, 24, 24)))
                .addGap(126, 126, 126))
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))))))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(cmbTiposdeCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(PanelComun, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(4, 4, 4)
        .addComponent(PanelInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(PanelCuentaCorrientePersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(7, 7, 7)
        .addComponent(btnEntidades)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(PanelCuentaCorrienteEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(6, 6, 6))
    );
  }// </editor-fold>//GEN-END:initComponents

  private void botonGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGrabarActionPerformed
    boolean comprobado;
    EtiquetaErrores.setText("");
    
    if (comprobarDatos()){
      switch(cmbTiposdeCuenta.getSelectedItem().toString()){
        case "Cuenta de Ahorro":          
          padre.listaCuentas.add(new CuentaAhorro(
                  Double.parseDouble(txtInteres.getText()), 
                  (new Persona(txtNombre.getText(), txtApellidos.getText(), txtNacimiento.getDate())), 
                  Double.parseDouble(txtSaldo.getText()), 
                  txtCuenta.getText()));
          EtiquetaErrores.setText("Se ha agregado una Cuenta de Ahorro");          
          break;
        case "Cuenta Corriente Personal":
          padre.listaCuentas.add(new CuentaCorrientePersonal(
                  Double.parseDouble(txtComMantenimiento.getText()), 
                  padre.hashLista, 
                  (new Persona(txtNombre.getText(), txtApellidos.getText(), txtNacimiento.getDate())), 
                  Double.parseDouble(txtSaldo.getText()), txtCuenta.getText()));
          EtiquetaErrores.setText("Se ha agregado una Cuenta Corriente Personal");          
          break;
        case "Cuenta Corriente de Empresa":
          padre.listaCuentas.add(new CuentaCorrienteEmpresa(
                  Double.parseDouble(txtDescubiertoMaximo.getText()), 
                  Double.parseDouble(txtInteresDescubierto.getText()), 
                  Double.parseDouble(txtComisionDescubierto.getText()), 
                  (new Persona(txtNombre.getText(), txtApellidos.getText(), txtNacimiento.getDate())), 
                  Double.parseDouble(txtSaldo.getText()), txtCuenta.getText()));
          EtiquetaErrores.setText("Se ha agregado una Cuenta Corriente de Empresa");          
          break;
      }
      padre.panelIngresarRetirar.actualizarCombo();
      padre.panelDatosCuenta.actualizarCombo();
    }else{
      JOptionPane.showMessageDialog
              (this,"Los datos no se han validado correctamente","ERROR",JOptionPane.ERROR_MESSAGE);
    }
      
  }//GEN-LAST:event_botonGrabarActionPerformed
  
  private boolean comprobarDatos() {
    boolean comprobado = true;
    //Comprobamos el nombre
    if (txtNombre.getText().equals("") || txtNombre.getText().equals(null)){
      nuevoError("Error en el nombre");
      comprobado = false;
    }
    //Comprobamos el apellido
    if (txtApellidos.getText().equals("") || txtApellidos.getText().equals(null)){
      nuevoError("Error en los apellidos");
      comprobado = false;
    }
    //Comprobamos el saldo
    if (comprobarDouble(txtSaldo.getText()) == false){ //si da error
      comprobado = false;
      nuevoError("Error en el saldo");
    }
    //Comprobamos la fecha de nacimiento
    // Supongo que la fecha es introducida correctamente con el JCalendar
    
    //Comprobamos si la cuenta corriente es correcta
    if (comprobar.comprobarCuenta(txtCuenta.getText())==false){
      nuevoError("Error en el número de cuenta "+txtCuenta.getText());
      comprobado = false;
    }
    // compruebo que el nº de cta. no está duplicado
      if (comprobarDuplicidadCuenta()==false){
        comprobado = false;
      }
    
    switch(cmbTiposdeCuenta.getSelectedItem().toString()){
      case "Cuenta de Ahorro":
        if (comprobarDouble(txtInteres.getText()) == false){ //si da error
          comprobado = false;
          nuevoError("Error en el interés");
        }
      break;
      case "Cuenta Corriente Personal":
        if (comprobarDouble(txtComMantenimiento.getText()) == false){
          comprobado = false;
          nuevoError("Error en comisión mantenimiento");
        }
        break;
      case "Cuenta Corriente de Empresa":
        if (comprobarDouble(txtDescubiertoMaximo.getText()) == false){
          comprobado = false;
          nuevoError("Error en Descubierto máximo");
        }
        if (comprobarDouble(txtInteresDescubierto.getText()) == false){
          comprobado = false;
          nuevoError("Error en Interés descubierto");
        }
        if (comprobarDouble(txtComisionDescubierto.getText()) == false){
          comprobado = false;
          nuevoError("Error en comisión descubierto");
        }
      break;
    }
    return comprobado;
  }
  
  private boolean comprobarDuplicidadCuenta() {
    boolean duplicado = true;
    try{
      ListIterator iterador;
      iterador = padre.listaCuentas.listIterator();
      while(iterador.hasNext()){
        CuentaBancaria cuenta = (CuentaBancaria) iterador.next();
        if (cuenta.ccc.equals(txtCuenta.getText())){
          nuevoError("nº de cuenta duplicado");
          duplicado = false;
        }
      }
    }catch(Exception e){
      jLabel1.setText("Error con la lista de cuentas");
    }
    return duplicado;
  }
  
  private boolean comprobarDouble(String cadena){
    boolean comprobado = true;
    try{
      Double num = Double.parseDouble(cadena);
      if (num < 0){
        comprobado = false;
        nuevoError(num+" es negativo");
      }      
      comprobado = true;
    }catch(Exception e){
      comprobado = false;
    }
    return comprobado;
  }
  
  private void nuevoError(String error){
    EtiquetaErrores.setText(EtiquetaErrores.getText()+error+"\n");
  }
  
  private void borrarDatos(){
    txtNombre.setText("");
    txtApellidos.setText("");
    txtCuenta.setText("");
    txtSaldo.setText("");
    txtInteres.setText("");
    txtComMantenimiento.setText("");
    txtDescubiertoMaximo.setText("");
    txtInteresDescubierto.setText("");
    txtComisionDescubierto.setText("");
  }
  
  private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
    padre.setContentPane(padre.panelPorDefecto);
    padre.pack();
  }//GEN-LAST:event_BotonCancelarActionPerformed

  private void cmbTiposdeCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTiposdeCuentaActionPerformed
    EtiquetaErrores.setText("");
    switch(cmbTiposdeCuenta.getSelectedItem().toString()){
      case "Cuenta de Ahorro":
        PanelComun.setVisible(true);
        PanelInteres.setVisible(true);
        PanelCuentaCorrientePersonal.setVisible(false);
        btnEntidades.setVisible(false);
        PanelCuentaCorrienteEmpresa.setVisible(false);
        padre.pack();
        break;
      case "Cuenta Corriente Personal":
        PanelComun.setVisible(true);
        PanelInteres.setVisible(false);
        PanelCuentaCorrientePersonal.setVisible(true);
        btnEntidades.setVisible(true);
        PanelCuentaCorrienteEmpresa.setVisible(false);
        padre.pack();
        break;
      case "Cuenta Corriente de Empresa":
        PanelComun.setVisible(true);
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

  private void btnBorrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarDatosActionPerformed
    borrarDatos();
  }//GEN-LAST:event_btnBorrarDatosActionPerformed

  private void txtComisionDescubiertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtComisionDescubiertoActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_txtComisionDescubiertoActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BotonCancelar;
  private javax.swing.JLabel EtiquetaErrores;
  private javax.swing.JPanel PanelComun;
  private javax.swing.JPanel PanelCuentaCorrienteEmpresa;
  private javax.swing.JPanel PanelCuentaCorrientePersonal;
  private javax.swing.JPanel PanelInteres;
  private javax.swing.JButton botonGrabar;
  private javax.swing.JButton btnBorrarDatos;
  private javax.swing.JButton btnEntidades;
  private javax.swing.JComboBox cmbTiposdeCuenta;
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
  private javax.swing.JPanel jPanel2;
  private javax.swing.JTextField txtApellidos;
  private javax.swing.JTextField txtComMantenimiento;
  private javax.swing.JTextField txtComisionDescubierto;
  private javax.swing.JTextField txtCuenta;
  private javax.swing.JTextField txtDescubiertoMaximo;
  private javax.swing.JTextField txtInteres;
  private javax.swing.JTextField txtInteresDescubierto;
  private com.toedter.calendar.JDateChooser txtNacimiento;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtSaldo;
  // End of variables declaration//GEN-END:variables

}
