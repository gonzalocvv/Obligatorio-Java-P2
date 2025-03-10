// Gonzalo Cabrera, 310651
package Interfaz;
import Dominio.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class VentanaBajaPostulante extends javax.swing.JFrame {
    
    public VentanaBajaPostulante() {
        initComponents();
        actualizarSelectorPostulantes();
    }
    private void actualizarSelectorPostulantes() {
        Sistema sistema = Sistema.getInstance();
        selectPostulantes.setModel(new DefaultComboBoxModel<>());
        for (int i = 0; i < sistema.getListaPostulantes().size(); i++) {
            selectPostulantes.addItem(sistema.getListaPostulantes().get(i).getNombre() + "-" + sistema.getListaPostulantes().get(i).getCedula());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitutlo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        selectPostulantes = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        lblTitutlo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblTitutlo.setText("Baja de postulante");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        selectPostulantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Elige el postulante a eliminar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lblTitutlo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(selectPostulantes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblTitutlo)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectPostulantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminar))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = Sistema.getInstance();
        Object seleccionado = selectPostulantes.getSelectedItem();
        String nombrePost = (String) seleccionado;
        String [] nombreCedula = nombrePost.split("-");
        String cedula = nombreCedula[1];
        
        for (int i = 0; i < sistema.getListaPostulantes().size(); i++) {
            if(cedula.equals(sistema.getListaPostulantes().get(i).getCedula())){
                sistema.getListaPostulantes().remove(i);
                for (int j = 0; j < sistema.getListaPostulantes().size(); j++) {
                    if (cedula.equals(sistema.getListaEntrevistas().get(i).getPostulante().getCedula())) {
                        sistema.getListaEntrevistas().remove(j);
                    }
                }
                for (int j = 0; j < sistema.getListaCedulas().size(); j++) {
                    if (cedula.equals(sistema.getListaCedulas().get(i))) {
                        sistema.getListaCedulas().remove(j);
                    }
                }
                break;
            }
        }
        JOptionPane.showMessageDialog(this, "Se eliminó con éxito.", "Eliminado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitutlo;
    private javax.swing.JComboBox<String> selectPostulantes;
    // End of variables declaration//GEN-END:variables
}
