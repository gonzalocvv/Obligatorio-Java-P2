//Gonzalo Cabrera, 310651
package Interfaz;

import Dominio.*;
import javax.swing.JOptionPane;


public class VentanaCerrar extends javax.swing.JFrame {

    
    public VentanaCerrar() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombreArch = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("Ingrese el nombre con el cual quiere guardar el archivo.");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("Si presiona cancelar se cerrara el programa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNombreArch, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardar)))
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtNombreArch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = Sistema.getInstance();
        String nombre = txtNombreArch.getText();
        
        if (!nombre.isEmpty() && nombre.endsWith(".txt")) {
            ArchivoGrabacion archivo = new ArchivoGrabacion(nombre);
            if (!sistema.getListaPostulantes().isEmpty()) {
                for (int i = 0; i < sistema.getListaPostulantes().size(); i++) {
                    Postulante postulante = sistema.getListaPostulantes().get(i);
                    String linea = "Postulante" + "@" + 
                                    postulante.getNombre() + "@" + 
                                    postulante.getCedula() + "@" + 
                                    postulante.getDireccion() + "@" + 
                                    postulante.getTelefono() + "@" + 
                                    postulante.getMail() + "@" + 
                                    postulante.getLinkedin() + "@" +
                                    postulante.getFormato();
                    for (int j = 0; j < postulante.getExperiencias().size(); j++) {
                        Experiencia experiencia = postulante.getExperiencias().get(j);
                        linea += "@Experiencia@" + experiencia.getTema().getNombre() + "@" + experiencia.getNivel();
                    }
                    archivo.grabarLinea(linea);
                }
                
            }
            if (!sistema.getListaTemas().isEmpty()){
                for (int i = 0; i < sistema.getListaTemas().size(); i++) {
                    Tema tema = sistema.getListaTemas().get(i);
                    String linea = "Tema@" + tema.getNombre() + "@" + tema.getDescripcion();
                    archivo.grabarLinea(linea);
                }
            }
            if (!sistema.getListaCedulas().isEmpty()){
                for (int i = 0; i < sistema.getListaCedulas().size(); i++) {
                    String cedula = sistema.getListaCedulas().get(i);
                    String linea = "Cedula@" + cedula;
                    archivo.grabarLinea(linea);
                }
            }
            if(!sistema.getListaEvaluadores().isEmpty()){
                for (int i = 0; i < sistema.getListaEvaluadores().size(); i++) {
                    Evaluador evaluador = sistema.getListaEvaluadores().get(i);
                    String linea = "Evaluador" + "@" +
                                    evaluador.getNombre() + "@" +
                                    evaluador.getCedula() + "@" + 
                                    evaluador.getDireccion() + "@" +
                                    evaluador.getAnIngreso();
                    archivo.grabarLinea(linea);
                }
            }
            if (!sistema.getListaPuestos().isEmpty()) {
                for (Puesto puesto : sistema.getListaPuestos()) {
                    String linea = "Puesto@" + puesto.getNombre() + "@" + puesto.getTipo();
                    for (Tema tema : puesto.getTemas()) {
                        linea += "@Tema@" + tema.getNombre();
                    }
                    archivo.grabarLinea(linea);
                }
            }
            if (!sistema.getListaEntrevistas().isEmpty()) {
                for (Entrevista entrevista : sistema.getListaEntrevistas()) {
                    String linea = "Entrevista@" + 
                           entrevista.getPostulante().getCedula() + "@" +
                           entrevista.getEvaluador().getCedula() + "@" +
                           entrevista.getPuntaje() + "@" +
                           entrevista.getComentarios() + "@" +
                           entrevista.getNumRegistro();
                    archivo.grabarLinea(linea);
                }
            }
            archivo.cerrar();
        }
        JOptionPane.showMessageDialog(this, "Se guardó con éxito.", "Guardado", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNombreArch;
    // End of variables declaration//GEN-END:variables
}
