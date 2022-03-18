package JFrames;

import Clases.ManipularCSV;
import Clases.Hilo;
import Clases.HiloGrafica;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileReader;
import javax.swing.BorderFactory;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class pantallaPrincipal extends javax.swing.JFrame {

    Hilo hilo = new Hilo();
    HiloGrafica hiloGrafica = new HiloGrafica();

    private static pantallaPrincipal instancia;

    public pantallaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public static pantallaPrincipal getInstancia() {
        if (instancia == null) {
            instancia = new pantallaPrincipal();
        }
        return instancia;
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
        btn_ordenar = new javax.swing.JButton();
        panel1 = new java.awt.Panel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txt_generar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txt_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_generarActionPerformed(evt);
            }
        });

        txt_examinar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        txt_examinar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_examinarMouseEntered(evt);
            }
        });
        txt_examinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_examinarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Examinar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Generar gráfica");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        rbutton_ascendente.setBackground(new java.awt.Color(51, 51, 255));
        rbutton_ascendente.setForeground(new java.awt.Color(255, 255, 255));
        rbutton_ascendente.setText("Ascendente");
        rbutton_ascendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_ascendenteActionPerformed(evt);
            }
        });

        rbutton_descendente.setBackground(new java.awt.Color(51, 51, 255));
        rbutton_descendente.setForeground(new java.awt.Color(255, 255, 255));
        rbutton_descendente.setText("Descendente");
        rbutton_descendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_descendenteActionPerformed(evt);
            }
        });

        rbutton_algoritmo.setBackground(new java.awt.Color(51, 51, 255));
        rbutton_algoritmo.setForeground(new java.awt.Color(255, 255, 255));
        rbutton_algoritmo.setText("Bubblesort");
        rbutton_algoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_algoritmoActionPerformed(evt);
            }
        });

        rbutton_algoritmo2.setBackground(new java.awt.Color(51, 51, 255));
        rbutton_algoritmo2.setForeground(new java.awt.Color(255, 255, 255));
        rbutton_algoritmo2.setText("Quicksort");
        rbutton_algoritmo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbutton_algoritmo2ActionPerformed(evt);
            }
        });

        btn_ordenar.setBackground(new java.awt.Color(51, 51, 255));
        btn_ordenar.setForeground(new java.awt.Color(255, 255, 255));
        btn_ordenar.setText("Ordenar");
        btn_ordenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ordenarMouseEntered(evt);
            }
        });
        btn_ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ordenarActionPerformed(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 426, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_generar, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addComponent(txt_examinar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_ordenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbutton_algoritmo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbutton_algoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbutton_descendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rbutton_ascendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(rbutton_ascendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbutton_descendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbutton_algoritmo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbutton_algoritmo2)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            ManipularCSV.getInstancia().leerCSVFile(archivo);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbutton_algoritmo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_algoritmo2ActionPerformed
        rbutton_algoritmo.setSelected(false);
        rbutton_algoritmo2.setSelected(true);
    }//GEN-LAST:event_rbutton_algoritmo2ActionPerformed

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed
        if (ManipularCSV.getInstancia().xvalues[0] == null & ManipularCSV.getInstancia().yvalues[0] == null) {
            ManipularCSV.getInstancia().leerCSVString(pantallaPrincipal.getInstancia().obtenerRuta());
        }
        hilo.start();
        hiloGrafica.start();
        txt_examinar.setText("");
    }//GEN-LAST:event_btn_ordenarActionPerformed

    private void rbutton_ascendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_ascendenteActionPerformed
        rbutton_descendente.setSelected(false);
    }//GEN-LAST:event_rbutton_ascendenteActionPerformed

    private void rbutton_descendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_descendenteActionPerformed
        rbutton_ascendente.setSelected(false);
    }//GEN-LAST:event_rbutton_descendenteActionPerformed

    private void rbutton_algoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_algoritmoActionPerformed
        rbutton_algoritmo2.setSelected(false);
        rbutton_algoritmo.setSelected(true);
    }//GEN-LAST:event_rbutton_algoritmoActionPerformed

    private void txt_examinarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_examinarMouseEntered
 
    }//GEN-LAST:event_txt_examinarMouseEntered

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.BLUE);
        jButton2.setBackground(Color.BLUE);
        jButton2.setForeground(Color.WHITE);
        btn_ordenar.setBackground(Color.BLUE);
        btn_ordenar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton1.setBackground(Color.BLUE);
        jButton1.setForeground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLUE);
        btn_ordenar.setBackground(Color.BLUE);
        btn_ordenar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton2MouseEntered

    private void btn_ordenarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ordenarMouseEntered
        jButton1.setBackground(Color.BLUE);
        jButton1.setForeground(Color.WHITE);
        jButton2.setBackground(Color.BLUE);
        jButton2.setForeground(Color.WHITE);
        btn_ordenar.setBackground(Color.WHITE);
        btn_ordenar.setForeground(Color.BLUE);
    }//GEN-LAST:event_btn_ordenarMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pantallaPrincipal.getInstancia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    public java.awt.Panel panel1;
    public javax.swing.JRadioButton rbutton_algoritmo;
    public javax.swing.JRadioButton rbutton_algoritmo2;
    public javax.swing.JRadioButton rbutton_ascendente;
    public javax.swing.JRadioButton rbutton_descendente;
    private java.awt.TextField txt_examinar;
    public java.awt.TextField txt_generar;
    // End of variables declaration//GEN-END:variables
}
