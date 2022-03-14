package JFrames;

import Clases.ManipularCSV;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileReader;

public class pantallaPrincipal extends javax.swing.JFrame {

ManipularCSV manipularCSV = new ManipularCSV();

    public pantallaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public String obtenerRuta() {
        String rutaArchivo;
        rutaArchivo = txt_examinar.getText();
        return rutaArchivo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_generar = new java.awt.TextField();
        txt_examinar = new java.awt.TextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rbutton_ascendente = new javax.swing.JRadioButton();
        rbutton_descendente = new javax.swing.JRadioButton();
        rbutton_algoritmo = new javax.swing.JRadioButton();
        rbutton_algoritmo2 = new javax.swing.JRadioButton();
        rbutton_algoritmo3 = new javax.swing.JRadioButton();
        btn_ordenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txt_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_generarActionPerformed(evt);
            }
        });

        txt_examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_examinarActionPerformed(evt);
            }
        });

        jButton1.setText("Examinar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Generar gráfica");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        rbutton_ascendente.setText("Ascendente");
        rbutton_ascendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_ascendenteActionPerformed(evt);
            }
        });

        rbutton_descendente.setText("Descendente");
        rbutton_descendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_descendenteActionPerformed(evt);
            }
        });

        rbutton_algoritmo.setText("Bubblesort");
        rbutton_algoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_algoritmoActionPerformed(evt);
            }
        });

        rbutton_algoritmo2.setText("Quicksort");
        rbutton_algoritmo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_algoritmo2ActionPerformed(evt);
            }
        });

        rbutton_algoritmo3.setText("Algoritmo 3");
        rbutton_algoritmo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_algoritmo3ActionPerformed(evt);
            }
        });

        btn_ordenar.setText("Ordenar");
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ordenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbutton_algoritmo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbutton_algoritmo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbutton_algoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbutton_descendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbutton_ascendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_generar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addComponent(rbutton_ascendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbutton_descendente)
                .addGap(48, 48, 48)
                .addComponent(rbutton_algoritmo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbutton_algoritmo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbutton_algoritmo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_generarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_generarActionPerformed

    private void txt_examinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_examinarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_examinarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo csv", "csv");
        seleccionarArchivo.setFileFilter(filtro);
        int seleccionar = seleccionarArchivo.showOpenDialog(this);
        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionarArchivo.getSelectedFile();
            manipularCSV.leerCSVFile(archivo);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbutton_algoritmo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_algoritmo2ActionPerformed
        rbutton_algoritmo.setSelected(false);
        rbutton_algoritmo3.setSelected(false);
    }//GEN-LAST:event_rbutton_algoritmo2ActionPerformed

    private void rbutton_algoritmo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_algoritmo3ActionPerformed
        rbutton_algoritmo.setSelected(false);
        rbutton_algoritmo2.setSelected(false);
    }//GEN-LAST:event_rbutton_algoritmo3ActionPerformed

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed
        if (manipularCSV.xvalues[0] == null & manipularCSV.yvalues[0] == null) {
            manipularCSV.leerCSVString(obtenerRuta());
        }

        if (rbutton_ascendente.isSelected() == true & rbutton_algoritmo.isSelected() == true) {
            for (int i = 1; i < manipularCSV.contador; i++) {
                for (int j = 0; j < manipularCSV.contador-1; j++) {
                    if (manipularCSV.yvalues[j] > manipularCSV.yvalues[j + 1]) {
                        int temporal = manipularCSV.yvalues[j];
                        manipularCSV.yvalues[j] = manipularCSV.yvalues[j + 1];
                        manipularCSV.yvalues[j + 1] = temporal;
                    }
                }
            }
            for (int i = 0; i < manipularCSV.contador; i++) {
                System.out.println(manipularCSV.yvalues[i]);
            }
        }
        if (rbutton_descendente.isSelected() == true & rbutton_algoritmo.isSelected() == true) {
            for (int i = 1; i < manipularCSV.contador; i++) {
                for (int j = 0; j < manipularCSV.contador-1; j++) {
                    if (manipularCSV.yvalues[j] < manipularCSV.yvalues[j + 1]) {
                        int temporal = manipularCSV.yvalues[j];
                        manipularCSV.yvalues[j] = manipularCSV.yvalues[j + 1];
                        manipularCSV.yvalues[j + 1] = temporal;
                    }
                }
            }
            for (int i = 0; i < manipularCSV.contador; i++) {
                System.out.println(manipularCSV.yvalues[i]);
            }
        }
//        if (rbutton_ascendente.isSelected() == true && rbutton_algoritmo2.isSelected() == true) {
//            int i = 0;
//            int j = 5;
//            int pivote = manipularCSV.yvalues[i];
//            int aux;
//            while (i < j) {
//                while (manipularCSV.yvalues[i] <= pivote && i < j) {
//                    i++;
//                    while (manipularCSV.yvalues[i]>pivote) {                        
//                        j--;
//                        if (i < j) {
//                            aux = manipularCSV.yvalues[i];
//                            manipularCSV.yvalues[i] = manipularCSV.yvalues[j];
//                            manipularCSV.yvalues[j] = aux;
//                        }
//                    }
//                }
//            }
//        }

    }//GEN-LAST:event_btn_ordenarActionPerformed

    private void rbutton_ascendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_ascendenteActionPerformed
        rbutton_descendente.setSelected(false);
    }//GEN-LAST:event_rbutton_ascendenteActionPerformed

    private void rbutton_descendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_descendenteActionPerformed
        rbutton_ascendente.setSelected(false);
    }//GEN-LAST:event_rbutton_descendenteActionPerformed

    private void rbutton_algoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_algoritmoActionPerformed
        rbutton_algoritmo2.setSelected(false);
        rbutton_algoritmo3.setSelected(false);
    }//GEN-LAST:event_rbutton_algoritmoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbutton_algoritmo;
    private javax.swing.JRadioButton rbutton_algoritmo2;
    private javax.swing.JRadioButton rbutton_algoritmo3;
    private javax.swing.JRadioButton rbutton_ascendente;
    private javax.swing.JRadioButton rbutton_descendente;
    private java.awt.TextField txt_examinar;
    private java.awt.TextField txt_generar;
    // End of variables declaration//GEN-END:variables
}
