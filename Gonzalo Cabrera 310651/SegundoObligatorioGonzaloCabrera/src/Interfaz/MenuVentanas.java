// Gonzalo Cabrera, 310651
package Interfaz;
import Dominio.*;
import javax.swing.JOptionPane;

public class MenuVentanas extends javax.swing.JFrame {

    
    public MenuVentanas() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menRegistros = new javax.swing.JMenu();
        itmRegistrarTematica = new javax.swing.JMenuItem();
        itmRegistroEvaluador = new javax.swing.JMenuItem();
        itmAltaPostulante = new javax.swing.JMenuItem();
        itmRegistroPuesto = new javax.swing.JMenuItem();
        itmExit = new javax.swing.JMenuItem();
        menOtros = new javax.swing.JMenu();
        itmBajaPostulante = new javax.swing.JMenuItem();
        itmIngresoEntrevist = new javax.swing.JMenuItem();
        itmConsultaPuesto = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menRegistros.setMnemonic('f');
        menRegistros.setText("Registros");

        itmRegistrarTematica.setMnemonic('o');
        itmRegistrarTematica.setText("Registro tematica");
        itmRegistrarTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistrarTematicaActionPerformed(evt);
            }
        });
        menRegistros.add(itmRegistrarTematica);

        itmRegistroEvaluador.setMnemonic('a');
        itmRegistroEvaluador.setText("Registro evaluador");
        itmRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroEvaluadorActionPerformed(evt);
            }
        });
        menRegistros.add(itmRegistroEvaluador);

        itmAltaPostulante.setMnemonic('s');
        itmAltaPostulante.setText("Alta de postulante");
        itmAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAltaPostulanteActionPerformed(evt);
            }
        });
        menRegistros.add(itmAltaPostulante);

        itmRegistroPuesto.setText("Registro puesto");
        itmRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroPuestoActionPerformed(evt);
            }
        });
        menRegistros.add(itmRegistroPuesto);

        itmExit.setMnemonic('x');
        itmExit.setText("Exit");
        itmExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExitActionPerformed(evt);
            }
        });
        menRegistros.add(itmExit);

        menuBar.add(menRegistros);

        menOtros.setMnemonic('h');
        menOtros.setText("Otros");

        itmBajaPostulante.setMnemonic('c');
        itmBajaPostulante.setText("Baja de postulante");
        itmBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBajaPostulanteActionPerformed(evt);
            }
        });
        menOtros.add(itmBajaPostulante);

        itmIngresoEntrevist.setMnemonic('a');
        itmIngresoEntrevist.setText("Ingreso de entrevista");
        itmIngresoEntrevist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmIngresoEntrevistActionPerformed(evt);
            }
        });
        menOtros.add(itmIngresoEntrevist);

        itmConsultaPuesto.setText("Consulta de puesto");
        itmConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmConsultaPuestoActionPerformed(evt);
            }
        });
        menOtros.add(itmConsultaPuesto);

        jMenuItem1.setText("Consulta de tematica");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menOtros.add(jMenuItem1);

        menuBar.add(menOtros);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itmExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExitActionPerformed
        int guardar = JOptionPane.showConfirmDialog(this, "¿Desea guardar antes de salir?", "Salir", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (guardar == JOptionPane.YES_OPTION) {
            VentanaCerrar v = new VentanaCerrar();
            v.setVisible(true);
        }
        System.exit(0);
    }//GEN-LAST:event_itmExitActionPerformed

    private void itmRegistrarTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistrarTematicaActionPerformed
        // TODO add your handling code here
        VentanaRegistrarTema v = new VentanaRegistrarTema();
        v.setVisible(true);
    }//GEN-LAST:event_itmRegistrarTematicaActionPerformed

    private void itmRegistroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroEvaluadorActionPerformed
        // TODO add your handling code here:
        VentanaRegistroEvaluador v = new VentanaRegistroEvaluador();
        v.setVisible(true);
    }//GEN-LAST:event_itmRegistroEvaluadorActionPerformed

    private void itmRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroPuestoActionPerformed
        // TODO add your handling code here:
        VentanaRegistroPuesto v = new VentanaRegistroPuesto();
        v.setVisible(true);
    }//GEN-LAST:event_itmRegistroPuestoActionPerformed

    private void itmIngresoEntrevistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmIngresoEntrevistActionPerformed
        // TODO add your handling code here:
        VentanaIngresoEntrevista v = new VentanaIngresoEntrevista();
        v.setVisible(true);
    }//GEN-LAST:event_itmIngresoEntrevistActionPerformed

    private void itmConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmConsultaPuestoActionPerformed
        // TODO add your handling code here:
        VentanaConsultaPuesto v = new VentanaConsultaPuesto();
        v.setVisible(true);
    }//GEN-LAST:event_itmConsultaPuestoActionPerformed

    private void itmBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBajaPostulanteActionPerformed
        // TODO add your handling code here:
        VentanaBajaPostulante v = new VentanaBajaPostulante();
        v.setVisible(true);
    }//GEN-LAST:event_itmBajaPostulanteActionPerformed

    private void itmAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAltaPostulanteActionPerformed
        // TODO add your handling code here:
        VentanaAltaPostulante v = new VentanaAltaPostulante();
        v.setVisible(true);
    }//GEN-LAST:event_itmAltaPostulanteActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        VentanaConsultaTematica v = new VentanaConsultaTematica();
        v.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAltaPostulante;
    private javax.swing.JMenuItem itmBajaPostulante;
    private javax.swing.JMenuItem itmConsultaPuesto;
    private javax.swing.JMenuItem itmExit;
    private javax.swing.JMenuItem itmIngresoEntrevist;
    private javax.swing.JMenuItem itmRegistrarTematica;
    private javax.swing.JMenuItem itmRegistroEvaluador;
    private javax.swing.JMenuItem itmRegistroPuesto;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menOtros;
    private javax.swing.JMenu menRegistros;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
