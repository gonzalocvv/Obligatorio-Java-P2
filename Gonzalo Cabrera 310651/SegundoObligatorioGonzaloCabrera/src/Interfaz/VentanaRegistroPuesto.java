// Gonzalo Cabrera, 310651
package Interfaz;
import Dominio.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaRegistroPuesto extends javax.swing.JFrame {
    private ArrayList<Tema> temas;
    
    public VentanaRegistroPuesto() {
        initComponents();
        actualizarSelectorTemas();
        this.temas = new ArrayList<>();
    }
    private void actualizarSelectorTemas() {
        Sistema sistema = Sistema.getInstance();
        selectTemaReq.setModel(new DefaultComboBoxModel<>());
        selectTemaReq.addItem("Seleccione un tema.");
        for (int i = 0; i < sistema.getListaTemas().size(); i++) {
            selectTemaReq.addItem(sistema.getListaTemas().get(i).getNombre());
        }
    }
    private void actualizarListaTemas(){
        DefaultListModel<String> modelo = new DefaultListModel<>();
        if(temas.size() >= 1){
            for (int i = 0; i < temas.size(); i++) {
                modelo.addElement(temas.get(i).getNombre()); 
            }
            lstTemasSelected.setModel(modelo);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        radioRemoto = new javax.swing.JRadioButton();
        radioPresencial = new javax.swing.JRadioButton();
        radioMixto = new javax.swing.JRadioButton();
        lblSelectTemas = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        selectTemaReq = new javax.swing.JComboBox<>();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTemasSelected = new javax.swing.JList<>();
        btnEliminar = new javax.swing.JButton();
        lblListaTemas = new javax.swing.JLabel();

        lblTitulo.setText("Registro de puesto");

        lblNombre.setText("Nombre del puesto:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        lblTipo.setText("Tipo:");

        buttonGroup1.add(radioRemoto);
        radioRemoto.setText("Remoto");
        radioRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioRemotoActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioPresencial);
        radioPresencial.setText("Presencial");

        buttonGroup1.add(radioMixto);
        radioMixto.setText("Mixto");

        lblSelectTemas.setText("Temas a seleccionar:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        selectTemaReq.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lstTemasSelected.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstTemasSelected);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lblListaTemas.setText("Lista temas seleccionados:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(56, 56, 56)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrar))
                                .addComponent(btnAgregar)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSelectTemas)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblTipo)
                                            .addGap(52, 52, 52)
                                            .addComponent(radioRemoto))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnEliminar)
                                            .addComponent(lblListaTemas)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(radioPresencial)
                                            .addGap(18, 18, 18)
                                            .addComponent(radioMixto)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(selectTemaReq, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1)))))))
                .addGap(28, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipo)
                    .addComponent(radioRemoto)
                    .addComponent(radioPresencial)
                    .addComponent(radioMixto))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectTemas)
                    .addComponent(selectTemaReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblListaTemas)
                        .addGap(47, 47, 47)
                        .addComponent(btnEliminar)))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnRegistrar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void radioRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioRemotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioRemotoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        String tema = (String) lstTemasSelected.getSelectedValue();
        if (lstTemasSelected.getSelectedIndex() != -1) {
            for (int i = 0; i < temas.size(); i++) {
                if (tema.equals(temas.get(i).getNombre())) {
                    temas.remove(i);
                    break;
                }
            }
            actualizarListaTemas();
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tema a eliminar.", "Eliminar tema", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = Sistema.getInstance();
        String tema = (String) selectTemaReq.getSelectedItem();
        boolean yaEsta = false;
        for (int i = 0; i < temas.size(); i++) {
            if (tema.equals(temas.get(i).getNombre())) {
                yaEsta = true;
                break;
            }
        }
        if (selectTemaReq.getSelectedIndex() > 0 && !yaEsta) {            
            for (int i = 0; i < sistema.getListaTemas().size(); i++) {
                if (sistema.getListaTemas().get(i).getNombre().equals(tema)) {
                    temas.add(sistema.getListaTemas().get(i));
                    break;
                }
            }
            actualizarListaTemas();
        } else {
            JOptionPane.showMessageDialog(this, "Debe elegir un tema que no se haya elegido.", "Tema", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = Sistema.getInstance();
        String nombre = txtNombre.getText();
        String formato = "";
        if (radioRemoto.isSelected()) {
            formato = "Remoto";
        } else if (radioPresencial.isSelected()) {
            formato = "Presencial";
        } else if (radioMixto.isSelected()) {
            formato = "Mixto";
        }
        boolean yaEsta = sistema.nombrePuestoExiste(nombre);
        if (!yaEsta && !nombre.isEmpty() && !formato.equals("") && !temas.isEmpty()) {
            Puesto puesto = new Puesto (nombre, formato, temas);
            sistema.getListaPuestos().add(puesto);
            JOptionPane.showMessageDialog(this, "El puesto se registró con éxito.", "Registrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Hubo un error, por favor ingrese datos válidos.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaTemas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSelectTemas;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList<String> lstTemasSelected;
    private javax.swing.JRadioButton radioMixto;
    private javax.swing.JRadioButton radioPresencial;
    private javax.swing.JRadioButton radioRemoto;
    private javax.swing.JComboBox<String> selectTemaReq;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
