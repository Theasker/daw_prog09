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
  Hashtable <String, Double> hashLista;
  
  PanelNuevaCuenta panelCrearCuenta;
  PanelEntidades panelEntidades;
  PanelListadoCuentas panelListado;
  PanelIngresarRetirar panelIngresarRetirar;
  PanelDatosCuenta panelDatosCuenta;
  JPanel panelPorDefecto;
  
  
  
  public AplicacionCuentaBancaria() {
    initComponents();
    listaCuentas = new ArrayList<>();
    hashLista = new Hashtable<>();
    
    panelPorDefecto = (JPanel) getContentPane(); // Panel principal
    panelCrearCuenta = new PanelNuevaCuenta(this);
    panelEntidades = new PanelEntidades(this);
    panelListado = new PanelListadoCuentas(this);
    panelIngresarRetirar = new PanelIngresarRetirar(this);
    panelDatosCuenta = new PanelDatosCuenta(this);
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
            (15.13, hashtableTemporal, (new Persona("Rubén","CCPersonal",fecha)), 1005.27, "09011902113228128416"));
    listaCuentas.add(new CuentaCorrientePersonal
            (15.13, hashtableTemporal, (new Persona("Inés","CCPersonal",fecha)), 1005.27, "89741837273107421595"));
    jLabel1.setText("Se han cargado los datos de prueba");
    for(CuentaBancaria cuenta : listaCuentas){
      panelIngresarRetirar.actualizarCombo();
      panelDatosCuenta.actualizarCombo();
    }
  }
  
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    btnDatosPrueba = new javax.swing.JButton();
    menuBar = new javax.swing.JMenuBar();
    fileMenu = new javax.swing.JMenu();
    menuNuevaCuenta = new javax.swing.JMenuItem();
    menuExit = new javax.swing.JMenuItem();
    editMenu = new javax.swing.JMenu();
    menuIngreso = new javax.swing.JMenuItem();
    helpMenu = new javax.swing.JMenu();
    menuListadoCuentas = new javax.swing.JMenuItem();
    menuDatosCuenta = new javax.swing.JMenuItem();

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

    menuNuevaCuenta.setMnemonic('o');
    menuNuevaCuenta.setText("Abrir una nueva cuenta");
    menuNuevaCuenta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuNuevaCuentaActionPerformed(evt);
      }
    });
    fileMenu.add(menuNuevaCuenta);

    menuExit.setMnemonic('x');
    menuExit.setText("Exit");
    menuExit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuExitActionPerformed(evt);
      }
    });
    fileMenu.add(menuExit);

    menuBar.add(fileMenu);

    editMenu.setMnemonic('e');
    editMenu.setText("Movimientos");

    menuIngreso.setMnemonic('t');
    menuIngreso.setText("Ingresar / retirar / saldo");
    menuIngreso.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuIngresoActionPerformed(evt);
      }
    });
    editMenu.add(menuIngreso);

    menuBar.add(editMenu);

    helpMenu.setMnemonic('h');
    helpMenu.setText("Ver");

    menuListadoCuentas.setMnemonic('s');
    menuListadoCuentas.setText("Ver listado de cuentas");
    menuListadoCuentas.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuListadoCuentasActionPerformed(evt);
      }
    });
    helpMenu.add(menuListadoCuentas);

    menuDatosCuenta.setMnemonic('a');
    menuDatosCuenta.setText("Ver datos de una cuenta");
    menuDatosCuenta.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuDatosCuentaActionPerformed(evt);
      }
    });
    helpMenu.add(menuDatosCuenta);

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

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

  private void menuNuevaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNuevaCuentaActionPerformed
    setContentPane(panelCrearCuenta);
    pack();
  }//GEN-LAST:event_menuNuevaCuentaActionPerformed

  private void btnDatosPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosPruebaActionPerformed
    cargarDatosPrueba();
    btnDatosPrueba.setVisible(false);
  }//GEN-LAST:event_btnDatosPruebaActionPerformed

  private void menuListadoCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListadoCuentasActionPerformed
    setContentPane(panelListado);
    panelListado.listarCuentas();
    
    pack();
  }//GEN-LAST:event_menuListadoCuentasActionPerformed

  private void menuIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIngresoActionPerformed
    setContentPane(panelIngresarRetirar);
    pack();
  }//GEN-LAST:event_menuIngresoActionPerformed

  private void menuDatosCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDatosCuentaActionPerformed
    setContentPane(panelDatosCuenta);
    pack();
  }//GEN-LAST:event_menuDatosCuentaActionPerformed

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
    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new AplicacionCuentaBancaria().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnDatosPrueba;
  private javax.swing.JMenu editMenu;
  private javax.swing.JMenu fileMenu;
  private javax.swing.JMenu helpMenu;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JMenuBar menuBar;
  private javax.swing.JMenuItem menuDatosCuenta;
  private javax.swing.JMenuItem menuExit;
  private javax.swing.JMenuItem menuIngreso;
  private javax.swing.JMenuItem menuListadoCuentas;
  private javax.swing.JMenuItem menuNuevaCuenta;
  // End of variables declaration//GEN-END:variables
}
