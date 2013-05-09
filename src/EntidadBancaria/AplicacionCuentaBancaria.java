package EntidadBancaria;

import java.util.ArrayList;
import java.util.ListIterator;

public class AplicacionCuentaBancaria extends javax.swing.JFrame {

  
  ArrayList listaDeObjetosPersona;
  PanelNuevaCuenta crearCuenta;
  public AplicacionCuentaBancaria() {
    initComponents();
    listaDeObjetosPersona = new ArrayList();
    crearCuenta = new PanelNuevaCuenta(this);
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    cajaTexto = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    openMenuItem = new javax.swing.JMenuItem();
    exitMenuItem = new javax.swing.JMenuItem();
    editMenu = new javax.swing.JMenu();
    cutMenuItem = new javax.swing.JMenuItem();
    copyMenuItem = new javax.swing.JMenuItem();
    pasteMenuItem = new javax.swing.JMenuItem();
    helpMenu = new javax.swing.JMenu();
    saveMenuItem = new javax.swing.JMenuItem();
    saveAsMenuItem = new javax.swing.JMenuItem();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jLabel1.setText("Selecciona una opción del menú");
    jLabel1.setToolTipText("");
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

    jButton1.setText("jButton1");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    fileMenu.setMnemonic('f');
    fileMenu.setText("Cuenta");

    openMenuItem.setMnemonic('o');
    openMenuItem.setText("Abrir una nueva cuenta");
    openMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        openMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(openMenuItem);

    exitMenuItem.setMnemonic('x');
    exitMenuItem.setText("Exit");
    exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitMenuItemActionPerformed(evt);
      }
    });
    fileMenu.add(exitMenuItem);

    menuBar.add(fileMenu);

    editMenu.setMnemonic('e');
    editMenu.setText("Movimientos");

    cutMenuItem.setMnemonic('t');
    cutMenuItem.setText("Realizar ingreso");
    editMenu.add(cutMenuItem);

    copyMenuItem.setMnemonic('y');
    copyMenuItem.setText("Retirada de efectivo");
    editMenu.add(copyMenuItem);

    pasteMenuItem.setMnemonic('p');
    pasteMenuItem.setText("Consulta de saldo");
    editMenu.add(pasteMenuItem);

    menuBar.add(editMenu);

    helpMenu.setMnemonic('h');
    helpMenu.setText("Ver");

    saveMenuItem.setMnemonic('s');
    saveMenuItem.setText("Ver listado de cuentas");
    helpMenu.add(saveMenuItem);

    saveAsMenuItem.setMnemonic('a');
    saveAsMenuItem.setText("Ver datos de una cuenta");
    helpMenu.add(saveAsMenuItem);

    menuBar.add(helpMenu);

    setJMenuBar(menuBar);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButton1)
            .addGap(31, 31, 31)
            .addComponent(jLabel1)
            .addGap(0, 160, Short.MAX_VALUE))
          .addComponent(cajaTexto, javax.swing.GroupLayout.Alignment.TRAILING))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(153, 153, 153)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jLabel1)
          .addComponent(jButton1))
        .addGap(18, 18, 18)
        .addComponent(cajaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

  private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
    
    setContentPane(crearCuenta);
    pack();
  }//GEN-LAST:event_openMenuItemActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    String texto = null;
    ListIterator iterador;
    iterador = listaDeObjetosPersona.listIterator();
    while(iterador.hasNext()){
      Persona persona = (Persona) iterador.next();
      texto = persona.getNombre()+" "+persona.getApellidos()+" "+persona.getFechaNacim();
    }
    cajaTexto.setText(texto);
    
    
  }//GEN-LAST:event_jButton1ActionPerformed

  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(AplicacionCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(AplicacionCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(AplicacionCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(AplicacionCuentaBancaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    ArrayList listaDeObjetosCuenta = new ArrayList();
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AplicacionCuentaBancaria().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JTextField cajaTexto;
  private javax.swing.JMenuItem copyMenuItem;
  private javax.swing.JMenuItem cutMenuItem;
  private javax.swing.JMenu editMenu;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JMenu helpMenu;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenuItem openMenuItem;
  private javax.swing.JMenuItem pasteMenuItem;
  private javax.swing.JMenuItem saveAsMenuItem;
  private javax.swing.JMenuItem saveMenuItem;
  // End of variables declaration//GEN-END:variables
}
