// Gonzalo Cabrera, 310651
package Interfaz;
import Dominio.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class VentanaIngresoEntrevista extends javax.swing.JFrame {

    public VentanaIngresoEntrevista() {
        initComponents();
        actualizarEvaluadores();
        actualizarPostulantes();
    }
    private void actualizarEvaluadores(){
        Sistema sistema = Sistema.getInstance();
        selectEvaluador.setModel(new DefaultComboBoxModel<>());
        selectEvaluador.addItem("Seleccione un evaluador.");
        for (int i = 0; i < sistema.getListaEvaluadores().size(); i++) {
            selectEvaluador.addItem(sistema.getListaEvaluadores().get(i).getNombre());
        }
    }
    private void actualizarPostulantes(){
        Sistema sistema = Sistema.getInstance();
        selectPostulante.setModel(new DefaultComboBoxModel<>());
        selectPostulante.addItem("Seleccione un postulante.");
        for (int i = 0; i < sistema.getListaPostulantes().size(); i++) {
            selectPostulante.addItem(sistema.getListaPostulantes().get(i).getNombre());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        selectEvaluador = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        selectPostulante = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        spinnerPuntaje = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComentarios = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblTitulo.setText("Ingreso de entrevista");

        jLabel2.setText("Elige un evaluador:");

        selectEvaluador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Elige un postulante:");

        selectPostulante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Ingrese el puntaje:");

        txtComentarios.setColumns(20);
        txtComentarios.setRows(5);
        jScrollPane1.setViewportView(txtComentarios);

        jLabel4.setText("Comentarios de la entrevista:");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(lblTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIngresar)
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(selectEvaluador, 0, 118, Short.MAX_VALUE)
                                .addComponent(selectPostulante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spinnerPuntaje))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(selectEvaluador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(selectPostulante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(spinnerPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnCancelar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = Sistema.getInstance();
        int cantEntr = sistema.getListaEntrevistas().size();
        cantEntr++;
        
        Evaluador evaluador = null;
        Object evalSelec = selectEvaluador.getSelectedItem();
        String evalSeleccionado = (String) evalSelec;
        for (int i = 0; i < sistema.getListaEvaluadores().size(); i++) {
            if (evalSeleccionado.equals(sistema.getListaEvaluadores().get(i).getNombre())){
                evaluador = sistema.getListaEvaluadores().get(i);
                break;
            }
        }
        
        Postulante postulante = null;
        Object postSelec = selectPostulante.getSelectedItem();
        String postSeleccionado = (String) postSelec;
        for (int i = 0; i < sistema.getListaPostulantes().size(); i++) {
            if (postSeleccionado.equals(sistema.getListaPostulantes().get(i).getNombre())) {
                postulante = sistema.getListaPostulantes().get(i);
                break;
            }
        }
        
        int puntaje = (Integer) spinnerPuntaje.getValue();
        String comentarios = txtComentarios.getText();
        
        if (puntaje>=0 && puntaje <= 100 && !comentarios.isEmpty() && selectPostulante.getSelectedIndex()>0 && selectEvaluador.getSelectedIndex()>0) {
            Entrevista entre = new Entrevista (postulante, evaluador, puntaje, comentarios, cantEntr);
            sistema.getListaEntrevistas().add(entre);
            JOptionPane.showMessageDialog(this, "Se ingresó correctamente la entrevista.", "Ingreso", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Hubo un error al ingresar los datos. Por favor, ingrese nuevamente.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
            
        
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JComboBox<String> selectEvaluador;
    private javax.swing.JComboBox<String> selectPostulante;
    private javax.swing.JSpinner spinnerPuntaje;
    private javax.swing.JTextArea txtComentarios;
    // End of variables declaration//GEN-END:variables
}
