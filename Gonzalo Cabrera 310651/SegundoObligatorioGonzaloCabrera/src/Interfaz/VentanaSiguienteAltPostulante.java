// Gonzalo Cabrera, 310651
package Interfaz;
import Dominio.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author gonzalocabrera
 */
public class VentanaSiguienteAltPostulante extends javax.swing.JFrame {
    private String nombre;
    private String cedula;
    private String direccion;
    private String telefono;
    private String mail;
    private String linkedin;
    private String formato;
    private ArrayList<Experiencia> experiencias;
    
    public VentanaSiguienteAltPostulante(String unNombre, String unaCedula, String unaDireccion, String unTelefono, String unMail, String unLinkedin, String unFormato) {
        initComponents();
        actualizarSelectorTemas();
        
        this.nombre = unNombre;
        this.cedula = unaCedula;
        this.direccion = unaDireccion;
        this.telefono = unTelefono;
        this.mail = unMail;
        this.linkedin = unLinkedin;
        this.formato = unFormato;
        this.experiencias = new ArrayList<>();
    }
    private void actualizarSelectorTemas() {
        Sistema sistema = Sistema.getInstance();
        selectTema.setModel(new DefaultComboBoxModel<>());
        for (int i = 0; i < sistema.getListaTemas().size(); i++) {
            selectTema.addItem(sistema.getListaTemas().get(i).getNombre());
        }
    }
    private void actualizarListaExperiencias() {
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (int i = 0; i < experiencias.size(); i++) {
            modelo.addElement(experiencias.get(i).toString()); 
        }
        lstExperiencias.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTema = new javax.swing.JLabel();
        selectTema = new javax.swing.JComboBox<>();
        lblNivel = new javax.swing.JLabel();
        nivelTema = new javax.swing.JSpinner();
        btnAgregar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblExperiencia = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstExperiencias = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTema.setText("Tema:");

        selectTema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblNivel.setText("Nivel:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

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

        lblExperiencia.setText("Experiencia:");

        lstExperiencias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstExperiencias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNivel)
                            .addComponent(lblTema))
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nivelTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar))
                            .addComponent(selectTema, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addGap(160, 160, 160)
                                .addComponent(btnRegistrar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnEliminar)
                                        .addComponent(lblExperiencia))
                                    .addGap(57, 57, 57)
                                    .addComponent(jScrollPane1))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTema)
                    .addComponent(selectTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNivel)
                    .addComponent(nivelTema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblExperiencia)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnRegistrar)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = Sistema.getInstance();
        String temaSelec = (String) lstExperiencias.getSelectedValue();
        String [] palabras = temaSelec.split(" ");
        for (int i = 0; i < experiencias.size(); i++) {
            if(palabras[0].equals(experiencias.get(i).getTema().getNombre())){
                experiencias.remove(i);
            }
        }
        actualizarListaExperiencias();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = Sistema.getInstance();
        Postulante post = new Postulante (nombre, cedula, direccion, telefono, mail, linkedin, formato, experiencias);
        sistema.getListaPostulantes().add(post);
        sistema.getListaCedulas().add(cedula);
        JOptionPane.showMessageDialog(this, "El postulante se dio de alta con éxito.", "Alta", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = Sistema.getInstance();
        
        Object itemSelect = selectTema.getSelectedItem();
        String temaSelect = (String) itemSelect;
        boolean yaEsta = false;
        for (int i = 0; i < experiencias.size(); i++) {
            if (temaSelect.equals(experiencias.get(i).getTema().getNombre())) {
                yaEsta = true;
                break;
            }
        }
        if (!yaEsta) {
            Tema tema = null;
            for (int i = 0; i < sistema.getListaTemas().size(); i++) {
               if (temaSelect.equals(sistema.getListaTemas().get(i).getNombre())) {
                   tema = sistema.getListaTemas().get(i);
                }
            }
        
            int nivel = (Integer) nivelTema.getValue();
            Experiencia exp = new Experiencia(tema, nivel);
            experiencias.add(exp);
        
            actualizarListaExperiencias();
        }else if (yaEsta){
            JOptionPane.showMessageDialog(this, "Este tema ya se agregó. Ingrese otro.", "Tema", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    /* public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaSiguienteAltPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSiguienteAltPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSiguienteAltPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSiguienteAltPostulante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaSiguienteAltPostulante().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblExperiencia;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblTema;
    private javax.swing.JList<String> lstExperiencias;
    private javax.swing.JSpinner nivelTema;
    private javax.swing.JComboBox<String> selectTema;
    // End of variables declaration//GEN-END:variables
}
