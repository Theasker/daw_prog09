package EntidadBancaria;

//import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;
import java.util.Hashtable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

public class AplicacionCuentaBancaria extends javax.swing.JFrame {

  
  ArrayList <CuentaBancaria> listaCuentas;
  PanelNuevaCuenta panelCrearCuenta;
  PanelEntidades panelEntidades;
  JPanel panelPorDefecto;
  Hashtable <String, Double> hashLista;
  public AplicacionCuentaBancaria() {
    initComponents();
    listaCuentas = new ArrayList<>();
    hashLista = new Hashtable<>();
    panelCrearCuenta = new PanelNuevaCuenta(this);
    panelEntidades = new PanelEntidades(this);
    panelPorDefecto = (JPanel) getContentPane(); // Panel principal
  }

  private void cargarDatosPrueba() {
    SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
    Date fecha=null;
    try {
      fecha = formatoFecha.parse("19-10-1972");
      System.out.println(fecha);
    } catch (ParseException ex) {
      Logger.getLogger(AplicacionCuentaBancaria.class.getName()).log(Level.SEVERE, null, ex);
    }
    // Cargo el Hashtable con datos
    Hashtable <String, Double> hashtableTemporal = new Hashtable<>();
    hashtableTemporal.put("BBVA", 105.31);
    hashtableTemporal.put("Ibercaja", 105.31);
    hashtableTemporal.put("CAI", 105.31);
    listaCuentas.add(new CuentaAhorro(7.3, (new Persona("Mauri","Segura Sánchez",fecha)), 1000.11,"39705410312020676809" ));
    listaCuentas.add(new CuentaAhorro(7.3, (new Persona("Rubén","Segura Sánchez",fecha)), 1001.11,"49789718110029800325" ));
    listaCuentas.add(new CuentaAhorro(7.3, (new Persona("Inés","Segura Sánchez",fecha)), 1002.11,"45513574040596226753" ));
    listaCuentas.add(new CuentaCorrienteEmpresa
            (1000.20, 15.50, 20.40, (new Persona("Mauri","CuentaCorrienteEmpresa",fecha)), 1003.11, "05242356790934628392"));
    listaCuentas.add(new CuentaCorrienteEmpresa
            (1000.20, 15.50, 20.40, (new Persona("Rubén","CuentaCorrienteEmpresa",fecha)), 1004.11, "11175141812021992903"));
    listaCuentas.add(new CuentaCorrienteEmpresa
            (1000.20, 15.50, 20.40, (new Persona("Inés","CuentaCorrienteEmpresa",fecha)), 1005.11, "60700812282804797966"));
    listaCuentas.add(new CuentaCorrientePersonal
            (15.13, hashtableTemporal, (new Persona("Mauri","CCPersonal",fecha)), 1005.27, "01769247196617238484"));
    listaCuentas.add(new CuentaCorrientePersonal
            (15.13, hashtableTemporal, (new Persona("Rubén","CCPersonal",fecha)), 1005.27, "01769247196617238484"));
    listaCuentas.add(new CuentaCorrientePersonal
            (15.13, hashtableTemporal, (new Persona("Inés","CCPersonal",fecha)), 1005.27, "01769247196617238484"));
    jLabel1.setText("Se han cargado los datos de prueba");
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btnDatosPrueba = new javax.swing.JButton();
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

    btnDatosPrueba.setText("Cargar datos de prueba");
    btnDatosPrueba.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnDatosPruebaActionPerformed(evt);
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
        .addGap(161, 161, 161)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(btnDatosPrueba))
          .addComponent(jLabel1))
        .addContainerGap(152, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap(166, Short.MAX_VALUE)
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnDatosPrueba)
        .addGap(184, 184, 184))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
      System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

  private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
    setContentPane(panelCrearCuenta);
    pack();
  }//GEN-LAST:event_openMenuItemActionPerformed

  private void btnDatosPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosPruebaActionPerformed
    cargarDatosPrueba();
  }//GEN-LAST:event_btnDatosPruebaActionPerformed

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
  private javax.swing.JButton btnDatosPrueba;
  private javax.swing.JMenuItem copyMenuItem;
  private javax.swing.JMenuItem cutMenuItem;
  private javax.swing.JMenu editMenu;
  private javax.swing.JMenuItem exitMenuItem;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JMenu helpMenu;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenuItem openMenuItem;
  private javax.swing.JMenuItem pasteMenuItem;
  private javax.swing.JMenuItem saveAsMenuItem;
  private javax.swing.JMenuItem saveMenuItem;
  // End of variables declaration//GEN-END:variables
}
