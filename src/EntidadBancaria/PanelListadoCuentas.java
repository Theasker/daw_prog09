package EntidadBancaria;

import java.util.ListIterator;

public class PanelListadoCuentas extends javax.swing.JPanel {

  AplicacionCuentaBancaria padre;

  public PanelListadoCuentas(AplicacionCuentaBancaria pad) {
    initComponents();
    padre = pad;
    labelListado.setText("");
    listarCuentas();
  }

  private void listarCuentas() {
    ListIterator iterador;
    try{
      iterador = padre.listaCuentas.listIterator();
      int cont=0;
      while(iterador.hasNext()){
        cont++;
        CuentaBancaria cuenta = (CuentaBancaria) iterador.next();
        nuevaLinea(cont+".-"+cuenta.titular.toString());
      }
      padre.pack();
    }catch(Exception e){
      labelListado.setText("Error con la lista de cuentas");
    }
  }

  private void nuevaLinea(String linea) {
    labelListado.setText(labelListado.getText()+linea+"\n");
  }
  
 @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    labelListado = new javax.swing.JLabel();
    btnVolver = new javax.swing.JButton();
    btnListarCuentas = new javax.swing.JButton();

    labelListado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Listado de todas las cuentas"));

    btnVolver.setText("Volver");
    btnVolver.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnVolverActionPerformed(evt);
      }
    });

    btnListarCuentas.setText("Listar cuentas");
    btnListarCuentas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnListarCuentasActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(labelListado, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnVolver)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListarCuentas)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(labelListado, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnVolver)
          .addComponent(btnListarCuentas))
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    labelListado.setText("");
    padre.setContentPane(padre.panelPorDefecto);
    padre.pack();
  }//GEN-LAST:event_btnVolverActionPerformed

  private void btnListarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCuentasActionPerformed
    listarCuentas();
  }//GEN-LAST:event_btnListarCuentasActionPerformed

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnListarCuentas;
  private javax.swing.JButton btnVolver;
  private javax.swing.JLabel labelListado;
  // End of variables declaration//GEN-END:variables
}
