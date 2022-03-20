package JFrames;

import Clases.ManipularCSV;
import Clases.Hilo;
import Clases.HiloContador;
import Clases.Grafica;
import Clases.HIloTiempo;
import JFrames.TextPrompt;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.io.BufferedWriter;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Observer;
import java.util.Observable;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class pantallaPrincipal extends javax.swing.JFrame  implements Observer{

private static pantallaPrincipal instancia;

    public pantallaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        TextPrompt placeholder = new TextPrompt("Ingrese la ruta del archivo .csv", txt_examinar);
        TextPrompt placeholder2 = new TextPrompt("Ingrese el título para el gráfico de barras", txt_generar);
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

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        rbutton_ascendente = new javax.swing.JRadioButton();
        rbutton_descendente = new javax.swing.JRadioButton();
        rbutton_algoritmo = new javax.swing.JRadioButton();
        rbutton_algoritmo2 = new javax.swing.JRadioButton();
        btn_ordenar = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        btn_obtener = new javax.swing.JButton();
        panelCronometro = new java.awt.Panel();
        lbl_tiempo = new javax.swing.JLabel();
        panelPasos = new java.awt.Panel();
        etiqueta_pasos = new javax.swing.JLabel();
        btn_reporte = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        txt_examinar = new javax.swing.JTextField();
        txt_generar = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

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
        panel1.setEnabled(false);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_obtener.setBackground(new java.awt.Color(51, 51, 255));
        btn_obtener.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btn_obtener.setForeground(new java.awt.Color(255, 255, 255));
        btn_obtener.setText("Obtener Datos");
        btn_obtener.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_obtenerMouseEntered(evt);
            }
        });
        btn_obtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_obtenerActionPerformed(evt);
            }
        });

        panelCronometro.setBackground(new java.awt.Color(255, 255, 255));

        lbl_tiempo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lbl_tiempo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_tiempo.setText("00:00:00");

        javax.swing.GroupLayout panelCronometroLayout = new javax.swing.GroupLayout(panelCronometro);
        panelCronometro.setLayout(panelCronometroLayout);
        panelCronometroLayout.setHorizontalGroup(
            panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCronometroLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lbl_tiempo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelCronometroLayout.setVerticalGroup(
            panelCronometroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCronometroLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbl_tiempo)
                .addGap(14, 14, 14))
        );

        panelPasos.setBackground(new java.awt.Color(255, 255, 255));

        etiqueta_pasos.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        etiqueta_pasos.setForeground(new java.awt.Color(0, 0, 0));
        etiqueta_pasos.setText("0");

        javax.swing.GroupLayout panelPasosLayout = new javax.swing.GroupLayout(panelPasos);
        panelPasos.setLayout(panelPasosLayout);
        panelPasosLayout.setHorizontalGroup(
            panelPasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(panelPasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasosLayout.createSequentialGroup()
                    .addContainerGap(131, Short.MAX_VALUE)
                    .addComponent(etiqueta_pasos)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );
        panelPasosLayout.setVerticalGroup(
            panelPasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 84, Short.MAX_VALUE)
            .addGroup(panelPasosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPasosLayout.createSequentialGroup()
                    .addContainerGap(20, Short.MAX_VALUE)
                    .addComponent(etiqueta_pasos)
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        btn_reporte.setBackground(new java.awt.Color(51, 51, 255));
        btn_reporte.setForeground(new java.awt.Color(255, 255, 255));
        btn_reporte.setText("Generar Reporte");
        btn_reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reporteMouseEntered(evt);
            }
        });
        btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteActionPerformed(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(51, 51, 255));
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_limpiarMouseEntered(evt);
            }
        });
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        txt_examinar.setBackground(new java.awt.Color(255, 255, 255));
        txt_examinar.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N

        txt_generar.setBackground(new java.awt.Color(255, 255, 255));
        txt_generar.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        txt_generar.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_generar)
                            .addComponent(txt_examinar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPasos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(rbutton_ascendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbutton_descendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbutton_algoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbutton_algoritmo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ordenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_reporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_obtener, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_examinar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(txt_generar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelPasos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(rbutton_ascendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbutton_descendente)
                        .addGap(18, 18, 18)
                        .addComponent(rbutton_algoritmo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbutton_algoritmo2)
                        .addGap(14, 14, 14)
                        .addComponent(btn_ordenar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivo csv", "csv");
        seleccionarArchivo.setFileFilter(filtro);
        int seleccionar = seleccionarArchivo.showOpenDialog(this);
        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File archivo = seleccionarArchivo.getSelectedFile();
            ManipularCSV.getInstancia().leerCSVFile(archivo);
            JOptionPane.showMessageDialog(null, "Datos obtenidos ", "Datos obtenidos con éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Grafica.getInstancia().graficar(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, ManipularCSV.getInstancia().contador, ManipularCSV.getInstancia().tituloEjeX, ManipularCSV.getInstancia().tituloEjeY, pantallaPrincipal.getInstancia().txt_generar.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbutton_algoritmo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbutton_algoritmo2ActionPerformed
        rbutton_algoritmo.setSelected(false);
        rbutton_algoritmo2.setSelected(true);
    }//GEN-LAST:event_rbutton_algoritmo2ActionPerformed

    private void btn_ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ordenarActionPerformed
        HIloTiempo cronometro = new HIloTiempo(00, 00, 00);
        cronometro.setPausar(false);
        cronometro.addObserver(this);
        Thread t = new Thread(cronometro);
        Hilo hilo = new Hilo();
        HiloContador hiloContador = new HiloContador();
        t.start();
        hilo.start();
        hiloContador.start();
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

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setBackground(Color.WHITE);
        jButton1.setForeground(Color.BLUE);
        jButton2.setBackground(Color.BLUE);
        jButton2.setForeground(Color.WHITE);
        btn_ordenar.setBackground(Color.BLUE);
        btn_ordenar.setForeground(Color.WHITE);
        btn_obtener.setBackground(Color.BLUE);
        btn_obtener.setForeground(Color.WHITE);
        btn_reporte.setBackground(Color.BLUE);
        btn_reporte.setForeground(Color.WHITE);
        btn_limpiar.setBackground(Color.BLUE);
        btn_limpiar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton1.setBackground(Color.BLUE);
        jButton1.setForeground(Color.WHITE);
        jButton2.setBackground(Color.WHITE);
        jButton2.setForeground(Color.BLUE);
        btn_ordenar.setBackground(Color.BLUE);
        btn_ordenar.setForeground(Color.WHITE);
        btn_obtener.setBackground(Color.BLUE);
        btn_obtener.setForeground(Color.WHITE);
        btn_reporte.setBackground(Color.BLUE);
        btn_reporte.setForeground(Color.WHITE);
        btn_limpiar.setBackground(Color.BLUE);
        btn_limpiar.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton2MouseEntered

    private void btn_ordenarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ordenarMouseEntered
        jButton1.setBackground(Color.BLUE);
        jButton1.setForeground(Color.WHITE);
        jButton2.setBackground(Color.BLUE);
        jButton2.setForeground(Color.WHITE);
        btn_ordenar.setBackground(Color.WHITE);
        btn_ordenar.setForeground(Color.BLUE);
        btn_obtener.setBackground(Color.BLUE);
        btn_obtener.setForeground(Color.WHITE);
        btn_reporte.setBackground(Color.BLUE);
        btn_reporte.setForeground(Color.WHITE);
        btn_limpiar.setBackground(Color.BLUE);
        btn_limpiar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_ordenarMouseEntered

    private void btn_obtenerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_obtenerMouseEntered
        jButton1.setBackground(Color.BLUE);
        jButton1.setForeground(Color.WHITE);
        jButton2.setBackground(Color.BLUE);
        jButton2.setForeground(Color.WHITE);
        btn_ordenar.setBackground(Color.BLUE);
        btn_ordenar.setForeground(Color.WHITE);
        btn_obtener.setBackground(Color.WHITE);
        btn_obtener.setForeground(Color.BLUE);
        btn_reporte.setBackground(Color.BLUE);
        btn_reporte.setForeground(Color.WHITE);
        btn_limpiar.setBackground(Color.BLUE);
        btn_limpiar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_obtenerMouseEntered

    private void btn_obtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_obtenerActionPerformed
        if (ManipularCSV.getInstancia().xvalues[0] == null & ManipularCSV.getInstancia().yvalues[0] == null) {
            ManipularCSV.getInstancia().leerCSVString(pantallaPrincipal.getInstancia().obtenerRuta());
            JOptionPane.showMessageDialog(null, "Datos obtenidos ", "Datos obtenidos con éxito", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_obtenerActionPerformed

    private void btn_reporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reporteMouseEntered
        jButton1.setBackground(Color.BLUE);
        jButton1.setForeground(Color.WHITE);
        jButton2.setBackground(Color.BLUE);
        jButton2.setForeground(Color.WHITE);
        btn_ordenar.setBackground(Color.BLUE);
        btn_ordenar.setForeground(Color.WHITE);
        btn_obtener.setBackground(Color.BLUE);
        btn_obtener.setForeground(Color.WHITE);
        btn_reporte.setBackground(Color.WHITE);
        btn_reporte.setForeground(Color.BLUE);
        btn_limpiar.setBackground(Color.BLUE);
        btn_limpiar.setForeground(Color.WHITE);
    }//GEN-LAST:event_btn_reporteMouseEntered

    private void btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteActionPerformed
       String reporte = "<!DOCTYPE html>\n"
                + "<html lang=\"en\">\n"
                + "<head>\n"
                + "    <meta charset=\"UTF-8\">\n"
                + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    <title>Reporte de existencialibros</title>\n"
                + " <style>\n"
                + "        h1, h2{\n"
                + "        color: white;\n"
                + "        text-align: center;\n"
                + "        padding: 5px;\n"
                + "        margin: 5px;\n"
                + "    }\n"
                + "    body{\n"
                + "        background-color: #242a63;\n"
                + "        font-family: Arial;\n"
                + "    }\n"
                + "    \n"
                + "    #main-container{\n"
                + "        margin: 80px auto;\n"
                + "        width: 600px;\n"
                + "    }\n"
                + "    \n"
                + "    table{\n"
                + "        background-color: white;\n"
                + "        text-align: left;\n"
                + "        border-collapse: collapse;\n"
                + "        width: 100%;\n"
                + "    }\n"
                + "    \n"
                + "    th, td{\n"
                + "        padding: 20px;\n"
                + "    }\n"
                + "    \n"
                + "    thead{\n"
                + "        background-color: #246355;\n"
                + "        border-bottom: solid 5px #0F362D;\n"
                + "        color: white;\n"
                + "    }\n"
                + "    \n"
                + "    tr:nth-child(even){\n"
                + "        background-color: #ddd;\n"
                + "    }\n"
                + "    \n"
                + "    tr:hover td{\n"
                + "        background-color: #369681;\n"
                + "        color: white;\n"
                + "    }\n"
                + "    </style>"
                + "</head>\n"
                + "<body>\n"
                + "<h1>REPORTE DE DATOS CSV</h1\n>"
                + "<h2>Nombre estudiante: Aldo Saúl Vásquez Moreira</h2\n>"
                + "<h2>Carnet: 202109754</h2\n>";
        if (rbutton_algoritmo.isSelected() == true) {
            reporte += "<h2>Algoritmo utilizado: BubbleSort</h2>";
        };
        if (rbutton_algoritmo2.isSelected() == true) {
            reporte += "<h2>Algoritmo utilizado: QuickSort</h2>";
        };
        reporte += "<h2> Tiempo trascurrido:" + lbl_tiempo.getText() + "</h2\n>"
                + "<h2> Cantidad de pasos:" + etiqueta_pasos.getText() + "</h2\n>"
                + "    <div id=\"main-container\">\n"
                + "        <table>\n"
                + "            <tr>\n"
                + "                <th>" + ManipularCSV.getInstancia().tituloEjeX + "</th>\n"
                + "                <th>" + ManipularCSV.getInstancia().tituloEjeY + "</th>\n"
                + "            </tr>\n";
        reporte += "<h1>Datos no Ordenados</h1>";
        for (int i = 0; i < ManipularCSV.getInstancia().contador; i++) {
            reporte += "<tr>";
            reporte += "<td>" + ManipularCSV.getInstancia().xvalues_sin_ordenar[i] + "</td>";
            reporte += "<td>" + ManipularCSV.getInstancia().yvalues_contador_sin_ordenar[i] + "</td>";
            reporte += "</tr>";
        }
        reporte += "        </table>\n"
                + "        <table>\n"
                + "            <tr>\n"
                + "                <th>" + ManipularCSV.getInstancia().tituloEjeX + "</th>\n"
                + "                <th>" + ManipularCSV.getInstancia().tituloEjeY + "</th>\n"
                + "            </tr>\n";
        reporte += "<h1>Datos Ordenados</h1>";
        for (int i = 0; i < ManipularCSV.getInstancia().contador; i++) {
            reporte += "<tr>";
            reporte += "<td>" + ManipularCSV.getInstancia().xvalues[i] + "</td>";
            reporte += "<td>" + ManipularCSV.getInstancia().yvalues[i] + "</td>";
            reporte += "</tr>";
        }
        reporte += "        </table>\n"
                + "    </div>\n"
                + "</body>\n"
                + "</html>";
        String nombreGrafica=txt_generar.getText();
        File reportePrestamosUsuarios = new File(nombreGrafica+".html");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(reportePrestamosUsuarios));
            bw.write(reporte);
            bw.close();
            JOptionPane.showMessageDialog(null, "Reporte generado correctamente", "Reporte ", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_reporteActionPerformed

    private void btn_limpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_limpiarMouseEntered
        jButton1.setBackground(Color.BLUE);
        jButton1.setForeground(Color.WHITE);
        jButton2.setBackground(Color.BLUE);
        jButton2.setForeground(Color.WHITE);
        btn_ordenar.setBackground(Color.BLUE);
        btn_ordenar.setForeground(Color.WHITE);
        btn_obtener.setBackground(Color.BLUE);
        btn_obtener.setForeground(Color.WHITE);
        btn_reporte.setBackground(Color.BLUE);
        btn_reporte.setForeground(Color.WHITE);
        btn_limpiar.setBackground(Color.WHITE);
        btn_limpiar.setForeground(Color.BLUE);
    }//GEN-LAST:event_btn_limpiarMouseEntered

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_limpiarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                pantallaPrincipal.getInstancia().setVisible(true);
            }
        });
    }

@Override
public void update(Observable e, Object arg){
lbl_tiempo.setText((String)arg);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_obtener;
    private javax.swing.JButton btn_ordenar;
    private javax.swing.JButton btn_reporte;
    public javax.swing.JLabel etiqueta_pasos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    public javax.swing.JLabel lbl_tiempo;
    public java.awt.Panel panel1;
    public java.awt.Panel panelCronometro;
    public java.awt.Panel panelPasos;
    public javax.swing.JRadioButton rbutton_algoritmo;
    public javax.swing.JRadioButton rbutton_algoritmo2;
    public javax.swing.JRadioButton rbutton_ascendente;
    public javax.swing.JRadioButton rbutton_descendente;
    public javax.swing.JTextField txt_examinar;
    public javax.swing.JTextField txt_generar;
    // End of variables declaration//GEN-END:variables
}
