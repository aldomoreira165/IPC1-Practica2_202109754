package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
import java.io.File;

public class ManipularCSV {

    private static ManipularCSV instancia;
    public BufferedReader lector;
    public String linea;
    public String partesTexto[];
    public String tituloEjeX;
    public String tituloEjeY;
    public String saltosTexto[];
    public int contador = -1;
    public String[] xvalues = new String[50];
    public Integer[] yvalues = new Integer[50];
    public String[] xvalues_contador = new String[50];
    public Integer[] yvalues_contador = new Integer[50];
    public String[] xvalues_sin_ordenar = new String[50];
    public Integer[] yvalues_contador_sin_ordenar = new Integer[50];
    public int contadorX = -1;
    public int contadorX2 = -1;
    public int contadorY = -1;
    public int contadorY2 = -1;

    public static ManipularCSV getInstancia() {
        if (instancia == null) {
            instancia = new ManipularCSV();
        }
        return instancia;
    }

    public void leerCSVString(String nombreArchivo) {
        try {
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while ((linea = lector.readLine()) != null) {
                partesTexto = linea.split(",");
                contador++;
                for (int i = 0; i < partesTexto.length; i++) {
                    if (i == 1) {
                        contadorY += 1;
                        if (contadorY == 0) {
                            tituloEjeY = partesTexto[1];
                        }
                        if (contadorY > 0) {
                            contadorY2 += 1;
                            yvalues[contadorY2] = Integer.parseInt(partesTexto[i]);
                            yvalues_contador[contadorY2] = Integer.parseInt(partesTexto[i]);
                            yvalues_contador_sin_ordenar[contadorY2] = Integer.parseInt(partesTexto[i]);
                        }
                    }
                    if (i == 0) {
                        contadorX += 1;
                        if (contadorX == 0) {
                            tituloEjeX = partesTexto[0];
                        }
                        if (contadorX > 0) {
                            contadorX2 += 1;
                            xvalues[contadorX2] = partesTexto[i];
                            xvalues_contador[contadorX2] = partesTexto[i];
                            xvalues_sin_ordenar[contadorX2] = partesTexto[i];
                        }
                    }
                }
            }
            lector.close();
            linea = null;
            partesTexto = null;
            saltosTexto = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void leerCSVFile(File archivo) {
        try {
            lector = new BufferedReader(new FileReader(archivo));
            while ((linea = lector.readLine()) != null) {
                partesTexto = linea.split(",");
                contador++;
                for (int i = 0; i < partesTexto.length; i++) {
                    if (i == 1) {
                        contadorY += 1;
                        if (contadorY == 0) {
                            tituloEjeY = partesTexto[1];
                        }
                        if (contadorY > 0) {
                            contadorY2 += 1;
                            yvalues[contadorY2] = Integer.parseInt(partesTexto[i]);
                            yvalues_contador[contadorY2] = Integer.parseInt(partesTexto[i]);
                            yvalues_contador_sin_ordenar[contadorY2] = Integer.parseInt(partesTexto[i]);
                        }
                    }
                    if (i == 0) {
                        contadorX += 1;
                        if (contadorX == 0) {
                            tituloEjeX = partesTexto[0];
                        }
                        if (contadorX > 0) {
                            contadorX2 += 1;
                            xvalues[contadorX2] = partesTexto[i];
                            xvalues_contador[contadorX2] = partesTexto[i];
                            xvalues_sin_ordenar[contadorX2] = partesTexto[i];
                        }
                    }
                }
            }
            lector.close();
            linea = null;
            partesTexto = null;
            saltosTexto = null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
