package EntidadBancaria;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class PanelNuevaCuenta extends javax.swing.JPanel {
  AplicacionCuentaBancaria padre;
  public PanelNuevaCuenta(AplicacionCuentaBancaria pad) {
    this.padre = pad;
    initComponents();
    
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    BotonAceptar = new javax.swing.JButton();
    BotonCancelar = new javax.swing.JButton();
    jLabel2 = new javax.swing.JLabel();
    txtNombre = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtApellidos = new javax.swing.JTextField();
    jLabel10 = new javax.swing.JLabel();
    txtSaldo = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtNacimiento = new com.toedter.calendar.JDateChooser();

    BotonAceptar.setText("Aceptar");
    BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        BotonAceptarActionPerformed(evt);
      }
    });

    BotonCancelar.setText("Cancelar");
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

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(BotonCancelar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BotonAceptar))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel3)))
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel10))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(txtNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)))
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
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel4)
          .addComponent(jLabel10))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(BotonAceptar)
          .addComponent(BotonCancelar))
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    GregorianCalendar fechCal=new GregorianCalendar();
    Date fechaDate;
    fechCal.setGregorianChange(txtNacimiento.getDate());
    Persona personita = new Persona(txtNombre.getText(),txtApellidos.getText(),fechCal);
    this.padre.listaDeObjetosPersona.add(personita);
    this.setVisible(false);
    
  }//GEN-LAST:event_BotonAceptarActionPerformed

  private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
    this.setVisible(false);
    
  }//GEN-LAST:event_BotonCancelarActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton BotonAceptar;
  private javax.swing.JButton BotonCancelar;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField txtApellidos;
  private com.toedter.calendar.JDateChooser txtNacimiento;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtSaldo;
  // End of variables declaration//GEN-END:variables
}
