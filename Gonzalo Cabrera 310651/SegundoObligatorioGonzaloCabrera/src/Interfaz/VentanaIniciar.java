//Gonzalo Cabrera, 310651
package Interfaz;

import Dominio.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class VentanaIniciar extends javax.swing.JFrame {

    
    public VentanaIniciar() {
        initComponents();
    }
    public void leerArchivo(String nombreArchivo) {
        ArchivoLectura archivo = new ArchivoLectura(nombreArchivo);
        Sistema sistema = Sistema.getInstance();

        while (archivo.hayMasLineas()) {
            String linea = archivo.ultimaLineaLeida();
            String[] datos = linea.split("@");

            if (datos.length > 0) {
                if ("Postulante".equals(datos[0])) {
                    ArrayList<Experiencia> experiencias = new ArrayList<>();
                    
                    for (int i = 8; i < datos.length; i += 3) {
                        if (datos[i].equals("Experiencia")) {
                            Tema tema = null;
                            
                            for (int j = 0; j < sistema.getListaTemas().size(); j++) {
                                if (datos[i + 1].equals(sistema.getListaTemas().get(j).getNombre())) {
                                    tema = sistema.getListaTemas().get(j);
                                }
                            }
                            
                            int nivel = Integer.parseInt(datos[i + 2]);
                            if (tema != null) {
                                Experiencia experiencia = new Experiencia(tema, nivel);
                                experiencias.add(experiencia);
                            }
                        }
                    }
                    Postulante postulante = new Postulante(datos[1], datos[2], datos[3], datos[4], datos[5], datos[6], datos[7], experiencias);
                    sistema.getListaPostulantes().add(postulante);
                } else if ("Tema".equals(datos[0])) {
                    Tema tema = new Tema (datos[1], datos[2]);
                    sistema.getListaTemas().add(tema);
                } else if ("Cedula".equals(datos[0])) {
                    sistema.getListaCedulas().add(datos[1]);
                } else if ("Evaluador".equals(datos[0])) {
                    Evaluador evaluador = new Evaluador(datos[1], datos[2], datos[3], datos[4]);
                    sistema.getListaEvaluadores().add(evaluador);
                } else if ("Puesto".equals(datos[0])) {
                    String nombrePuesto = datos[1];
                    String tipoPuesto = datos[2];
                    ArrayList<Tema> temasPuesto = new ArrayList<>();

                    for (int i = 4; i < datos.length; i+=2) {
                        for (Tema tema : sistema.getListaTemas()) {
                            if (tema.getNombre().equals(datos[i])) {
                                temasPuesto.add(tema);
                                break; 
                            }
                        }
                    }

                    // Crear nuevo puesto y agregarlo al sistema
                    Puesto puesto = new Puesto(nombrePuesto, tipoPuesto, temasPuesto);
                    sistema.getListaPuestos().add(puesto);
                    }
                } else if ("Entrevista".equals(datos[0])) {
                    if (datos.length >= 6 && "Entrevista".equals(datos[0])) {
                        String cedulaPostulante = datos[1];
                        String cedulaEvaluador = datos[2];
                        int puntaje = Integer.parseInt(datos[3]);
                        String comentarios = datos[4];
                        int numRegistro = Integer.parseInt(datos[5]);

                        Postulante postulanteEncontrado = null;
                        Evaluador evaluadorEncontrado = null;
                        
                        for (int i = 0; i < sistema.getListaPostulantes().size(); i++) {
                            Postulante postulante = sistema.getListaPostulantes().get(i);
                            if (postulante.getCedula().equals(cedulaPostulante)) {
                                postulanteEncontrado = postulante;
                                break;
                            }
                        }

                        for (int i = 0; i < sistema.getListaEvaluadores().size(); i++) {
                            Evaluador evaluador = sistema.getListaEvaluadores().get(i);
                            if (evaluador.getCedula().equals(cedulaEvaluador)) {
                                evaluadorEncontrado = evaluador;
                                break;
                            }
                        }

                        if (postulanteEncontrado != null && evaluadorEncontrado != null) {
                            Entrevista entrevista = new Entrevista(postulanteEncontrado, evaluadorEncontrado, puntaje, comentarios, numRegistro);
                            sistema.getListaEntrevistas().add(entrevista);
                        }
                    }
                }
            
        }
        archivo.cerrar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNuevo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnGuardado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel1.setText("Elija si quiere empezar desde un sistema nuevo o uno guardado");

        btnGuardado.setText("Guardado");
        btnGuardado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnGuardado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNuevo)
                        .addGap(59, 59, 59))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardado))
                .addContainerGap(127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        MenuVentanas v = new MenuVentanas();
        v.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardadoActionPerformed
        // TODO add your handling code here:
        String nombreArchivo = JOptionPane.showInputDialog(this, "Ingrese el nombre del archivo:", "Cargar sistema", JOptionPane.QUESTION_MESSAGE);
        if (nombreArchivo != null && !nombreArchivo.trim().isEmpty()) {
            if (!nombreArchivo.endsWith(".txt")) {
                nombreArchivo += ".txt";
            }
            leerArchivo(nombreArchivo);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "No se ingresó un nombre de archivo válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardadoActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIniciar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaIniciar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardado;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
