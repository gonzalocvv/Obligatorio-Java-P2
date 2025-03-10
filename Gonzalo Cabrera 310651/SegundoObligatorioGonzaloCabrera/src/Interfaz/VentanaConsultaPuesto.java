// Gonzalo Cabrera, 310651
package Interfaz;
import Dominio.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class VentanaConsultaPuesto extends javax.swing.JFrame {
    private String nombrePuesto;
    
    public VentanaConsultaPuesto() {
        initComponents();
        actualizarListaPuestos();
        nombrePuesto = "";
    }
    private void actualizarListaPuestos(){
        Sistema sistema = Sistema.getInstance();
        DefaultListModel<String> modelo = new DefaultListModel<>();
        for (int i = 0; i < sistema.getListaPuestos().size(); i++) {
            modelo.addElement(sistema.getListaPuestos().get(i).getNombre());
        }
        lstPuestos.setModel(modelo);
    }
    private void actualizarListaPostulantes(String puesto, int nivel){
        Sistema sistema = Sistema.getInstance();
        DefaultListModel<String> modelo = new DefaultListModel<>();
        
        String formato = ""; 
        for (int i = 0; i < sistema.getListaPuestos().size(); i++) {
            if (sistema.getListaPuestos().get(i).getNombre().equals(puesto)) {
                formato = sistema.getListaPuestos().get(i).getTipo();
            }
        }
        ArrayList<Tema> temasReq = new ArrayList<>();
        for (int i = 0; i < sistema.getListaPuestos().size(); i++) {
            if (sistema.getListaPuestos().get(i).getNombre().equals(puesto)) {
                temasReq = sistema.getListaPuestos().get(i).getTemas();
                break;
            }
        }
        
        
        
        for (int i = 0; i < sistema.getListaPostulantes().size(); i++) {
            Postulante postulante = sistema.getListaPostulantes().get(i);
            boolean cumpleNivel = true;
        
            for (int j = 0; j < temasReq.size(); j++) {
                Tema tema = temasReq.get(j);
                boolean tieneTema = false;
                for (int k = 0; k < postulante.getExperiencias().size(); k++) {
                    Experiencia exp = postulante.getExperiencias().get(k);
                    if (exp.getTema().getNombre().equals(tema.getNombre()) && exp.getNivel() >= nivel) {
                        tieneTema = true;
                        break;
                    }
                }
                if (!tieneTema) {
                    cumpleNivel = false;
                    break;
                }
            }

            boolean tieneEntrevista = false;
            for (int l = 0; l < sistema.getListaEntrevistas().size(); l++) {
                Entrevista ent = sistema.getListaEntrevistas().get(l);
                if (ent.getPostulante().getCedula().equals(postulante.getCedula())) {
                    tieneEntrevista = true;
                    break;
                }
            }

            if (cumpleNivel && tieneEntrevista) {
                modelo.addElement(postulante.getNombre() + "-" + postulante.getCedula());
            }
        }
        lstPostulantes.setModel(modelo);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPuestos = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        spinnerNivel = new javax.swing.JSpinner();
        btnConsultar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPostulantes = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Consulta de puestos");

        jLabel2.setText("Puestos:");

        lstPuestos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstPuestos);

        jLabel3.setText("Nivel:");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        jLabel4.setText("Postulantes:");

        lstPostulantes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(lstPostulantes);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExportar))
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(114, 114, 114)
                                .addComponent(spinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addComponent(btnConsultar))
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1)
                            .addComponent(jScrollPane2))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(spinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExportar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        Sistema sistema = Sistema.getInstance();
        String puesto = (String) lstPuestos.getSelectedValue();
        nombrePuesto = puesto;
        int nivel = (Integer) spinnerNivel.getValue();
        
        if ((lstPuestos.getSelectedIndex() != -1) && (nivel<=10) && (nivel>=0)) {
            actualizarListaPostulantes(puesto, nivel);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un puesto, el nivel tiene que estar entre 0 y 10. Por favor ingrese los datos devuelta.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        // TODO add your handling code here:
        DefaultListModel<String> modelo = (DefaultListModel<String>) lstPostulantes.getModel();
    
       
        ArchivoGrabacion archivo = new ArchivoGrabacion("Consulta.txt");
        Sistema sistema = Sistema.getInstance();
        archivo.grabarLinea(nombrePuesto);
        for (int i = 0; i < modelo.getSize(); i++) {
            String post = modelo.getElementAt(i);
            String [] doble = post.split("-");
            String cedulaPost = doble[1];
            Postulante postulante = null;
            for (int j = 0; j < sistema.getListaPostulantes().size(); j++) {
                if (cedulaPost.equals(sistema.getListaPostulantes().get(i).getCedula())) {
                    postulante = sistema.getListaPostulantes().get(i);
                }
            }
            String linea = (postulante.getNombre() + "-" + postulante.getCedula() + "-" + postulante.getMail());
            archivo.grabarLinea(linea);
        }
        archivo.cerrar();
        JOptionPane.showMessageDialog(this, "Los datos han sido exportados exitosamente.", "Exportar Datos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnExportarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> lstPostulantes;
    private javax.swing.JList<String> lstPuestos;
    private javax.swing.JSpinner spinnerNivel;
    // End of variables declaration//GEN-END:variables
}
