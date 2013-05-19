package EntidadBancaria;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.table.DefaultTableModel;

public class PanelListadoCuentas extends javax.swing.JPanel {

  AplicacionCuentaBancaria padre;
  DefaultTableModel modelo;

  public PanelListadoCuentas(AplicacionCuentaBancaria pad) {
    initComponents();
    padre = pad;
    listarCuentas();
    modelo =  new DefaultTableModel();
//    TablaListado.setVisible(false);
  }

  public void listarCuentas() {
    // Modelo de de datos para el JTable
    //DefaultTableModel modelo =  new DefaultTableModel();
    //le asigno a la tabla el modelo de datos
    try {
      //cada vez que se actualiza el jtable se crear de nuevo el modelo
      modelo = new DefaultTableModel();
      TablaListado.setModel(modelo);
      // Creo las columnas
      modelo.addColumn("Nombre");
      modelo.addColumn("Fecha Nac.");
      modelo.addColumn("Tipo Cuenta");
      modelo.addColumn("Cuenta");
      modelo.addColumn("Saldo");
//      ListIterator iterador;
      try{
//        iterador = padre.listaCuentas.listIterator();
        String [] registro = new String[5];
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
//        while(iterador.hasNext()){
        for(CuentaBancaria cuenta : padre.listaCuentas){  
//        CuentaBancaria cuenta = (CuentaBancaria) iterador.next();
          registro[0] = cuenta.titular.getApellidos()+", "+cuenta.titular.getNombre();
          registro[1] = formatoFecha.format(cuenta.titular.getFechaNacim());
          if (cuenta instanceof CuentaAhorro){
            registro[2] = "Cuenta de Ahorro";
          }else if (cuenta instanceof CuentaCorrienteEmpresa){
            registro[2] = "Cuenta corriente de empresa";
          }else{
            registro[2] = "Cuenta corriente personal";
          }
          registro[3] = cuenta.getccc();
          registro[4] = cuenta.getSaldo().toString();
          // Añado el modelo a la tabla y sumo una fila
          modelo.addRow(registro);
        }
        padre.pack();
      }catch(Exception e){
        jLabel1.setText("Error con la lista de cuentas");
      }
    } catch (Exception e) {
    }
    repaint();
    //TablaListado.setAutoResizeMode(57);
  }
 
 @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    btnVolver = new javax.swing.JButton();
    btnListarCuentas = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    TablaListado = new javax.swing.JTable();
    lblMostrar = new javax.swing.JLabel();
    btnBorrar = new javax.swing.JButton();

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

    jLabel1.setText("Listado de todas las cuentas");

    TablaListado.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null},
        {null, null, null, null}
      },
      new String [] {
        "Title 1", "Title 2", "Title 3", "Title 4"
      }
    ));
    TablaListado.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    jScrollPane2.setViewportView(TablaListado);

    btnBorrar.setText("Borrar cuenta");
    btnBorrar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBorrarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addComponent(btnVolver)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnListarCuentas))
          .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(0, 0, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addComponent(lblMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(btnBorrar)))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(lblMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(btnVolver)
              .addComponent(btnListarCuentas)))
          .addGroup(layout.createSequentialGroup()
            .addComponent(btnBorrar)
            .addGap(0, 0, Short.MAX_VALUE)))
        .addContainerGap())
    );
  }// </editor-fold>//GEN-END:initComponents

  private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
    padre.setContentPane(padre.panelPorDefecto);
    padre.pack();
  }//GEN-LAST:event_btnVolverActionPerformed

  private void btnListarCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarCuentasActionPerformed
//    TablaListado.setVisible(true);
    listarCuentas();
  }//GEN-LAST:event_btnListarCuentasActionPerformed

  private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
//    try{
      // obtenemos la fila seleccionada
    int fila = TablaListado.getSelectedRow();
    // obtenemos el valor de la cuenta que está en la posición
    String nCuenta = TablaListado.getValueAt(fila, 3).toString();
    lblMostrar.setText(nCuenta);
    ListIterator it = padre.listaCuentas.listIterator();
    CuentaBancaria cuenta;
    while(it.hasNext()){
      cuenta = (CuentaBancaria) it.next();
      if (cuenta.getccc().equals(nCuenta)){
        it.remove();
        listarCuentas();
        break;
      }
    }
  /*  }catch(ArrayIndexOutOfBoundsException aiobe){
      lblMostrar.setText("No has seleccionado ninguna cuenta o no se han visualizado");
    }catch(NullPointerException npe){
      lblMostrar.setText("Error cn la tabla");
    }catch(Exception e){
      lblMostrar.setText("Error cn la tabla");
    }    */
    actualizarCombos();
  }//GEN-LAST:event_btnBorrarActionPerformed

  private void actualizarCombos() {
    padre.panelIngresarRetirar.actualizarCombo();
    padre.panelDatosCuenta.actualizarCombo();
  }
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTable TablaListado;
  private javax.swing.JButton btnBorrar;
  private javax.swing.JButton btnListarCuentas;
  private javax.swing.JButton btnVolver;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JLabel lblMostrar;
  // End of variables declaration//GEN-END:variables

}
