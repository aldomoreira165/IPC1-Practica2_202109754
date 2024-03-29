package Clases;

import Clases.ManipularCSV;
import Clases.Grafica;
import Clases.HIloTiempo;
import JFrames.pantallaPrincipal;
import javax.swing.JRadioButton;

public class Hilo extends Thread {

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    public void quickSortAscendente(Integer datos[], String datosX[], int a, int b) {
        int pivote = datos[a];
        String pivoteX = datosX[a];
        int i = a;
        int j = b;
        int aux;
        String auxX;
        while (i < j) {
            while (datos[i] <= pivote && i < j) {
                i++;
            }
            while (datos[j] > pivote) {
                j--;
            }
            if (i < j) {
                aux = datos[i];
                auxX = datosX[i];
                datos[i] = datos[j];
                datosX[i] = datosX[j];
                datos[j] = aux;
                datosX[j] = auxX;
                esperarXsegundos(1);
                Grafica.getInstancia().graficar(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, ManipularCSV.getInstancia().contador, ManipularCSV.getInstancia().tituloEjeX, ManipularCSV.getInstancia().tituloEjeY, pantallaPrincipal.getInstancia().txt_generar.getText());
            }
        }
        datos[a] = datos[j];
        datosX[a] = datosX[j];
        datos[j] = pivote;
        datosX[j] = pivoteX;
        esperarXsegundos(1);
        Grafica.getInstancia().graficar(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, ManipularCSV.getInstancia().contador, ManipularCSV.getInstancia().tituloEjeX, ManipularCSV.getInstancia().tituloEjeY, pantallaPrincipal.getInstancia().txt_generar.getText());
        if (a < j - 1) {
            quickSortAscendente(datos, datosX, a, j - 1);
        }
        if (j + 1 < b) {
            quickSortAscendente(datos, datosX, j + 1, b);
        }

    }

    public void quickSortDescendente(Integer datos[], String datosX[], int a, int b) {
        int pivote = datos[a];
        String pivoteX = datosX[a];
        int i = a;
        int j = b;
        int aux;
        String auxX;
        while (i < j) {
            while (datos[i] >= pivote && i < j) {
                i++;
            }
            while (datos[j] < pivote) {
                j--;
            }
            if (i < j) {
                aux = datos[i];
                auxX = datosX[i];
                datos[i] = datos[j];
                datosX[i] = datosX[j];
                datos[j] = aux;
                datosX[j] = auxX;
                esperarXsegundos(1);
                Grafica.getInstancia().graficar(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, ManipularCSV.getInstancia().contador, ManipularCSV.getInstancia().tituloEjeX, ManipularCSV.getInstancia().tituloEjeY, pantallaPrincipal.getInstancia().txt_generar.getText());
            }
        }
        datos[a] = datos[j];
        datosX[a] = datosX[j];
        datos[j] = pivote;
        datosX[j] = pivoteX;
        esperarXsegundos(1);
        Grafica.getInstancia().graficar(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, ManipularCSV.getInstancia().contador, ManipularCSV.getInstancia().tituloEjeX, ManipularCSV.getInstancia().tituloEjeY, pantallaPrincipal.getInstancia().txt_generar.getText());
        if (a < j - 1) {
            quickSortDescendente(datos, datosX, a, j - 1);
        }
        if (j + 1 < b) {
            quickSortDescendente(datos, datosX, j + 1, b);
        }
    }

    @Override
    public void run() {
        if (pantallaPrincipal.getInstancia().rbutton_ascendente.isSelected() == true & pantallaPrincipal.getInstancia().rbutton_algoritmo.isSelected() == true) {
            for (int i = 1; i < ManipularCSV.getInstancia().contador; i++) {
                for (int j = 0; j < ManipularCSV.getInstancia().contador - 1; j++) {
                    if (ManipularCSV.getInstancia().yvalues[j] > ManipularCSV.getInstancia().yvalues[j + 1]) {
                        int temporal = ManipularCSV.getInstancia().yvalues[j];
                        String temporalX = ManipularCSV.getInstancia().xvalues[j];
                        ManipularCSV.getInstancia().yvalues[j] = ManipularCSV.getInstancia().yvalues[j + 1];
                        ManipularCSV.getInstancia().xvalues[j] = ManipularCSV.getInstancia().xvalues[j + 1];
                        ManipularCSV.getInstancia().yvalues[j + 1] = temporal;
                        ManipularCSV.getInstancia().xvalues[j + 1] = temporalX;
                        esperarXsegundos(1);
                        Grafica.getInstancia().graficar(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, ManipularCSV.getInstancia().contador, ManipularCSV.getInstancia().tituloEjeX, ManipularCSV.getInstancia().tituloEjeY, pantallaPrincipal.getInstancia().txt_generar.getText());
                    }
                }
            }
        }
        if (pantallaPrincipal.getInstancia().rbutton_descendente.isSelected() == true & pantallaPrincipal.getInstancia().rbutton_algoritmo.isSelected() == true) {
            for (int i = 1; i < ManipularCSV.getInstancia().contador; i++) {
                for (int j = 0; j < ManipularCSV.getInstancia().contador - 1; j++) {
                    if (ManipularCSV.getInstancia().yvalues[j] < ManipularCSV.getInstancia().yvalues[j + 1]) {
                        int temporal = ManipularCSV.getInstancia().yvalues[j];
                        String temporalX = ManipularCSV.getInstancia().xvalues[j];
                        ManipularCSV.getInstancia().yvalues[j] = ManipularCSV.getInstancia().yvalues[j + 1];
                        ManipularCSV.getInstancia().xvalues[j] = ManipularCSV.getInstancia().xvalues[j + 1];
                        ManipularCSV.getInstancia().yvalues[j + 1] = temporal;
                        ManipularCSV.getInstancia().xvalues[j + 1] = temporalX;
                        esperarXsegundos(1);
                        Grafica.getInstancia().graficar(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, ManipularCSV.getInstancia().contador, ManipularCSV.getInstancia().tituloEjeX, ManipularCSV.getInstancia().tituloEjeY, pantallaPrincipal.getInstancia().txt_generar.getText());
                    }
                }
            }
        }

        if (pantallaPrincipal.getInstancia().rbutton_algoritmo2.isSelected() == true && pantallaPrincipal.getInstancia().rbutton_ascendente.isSelected() == true) {
            quickSortAscendente(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, 0, ManipularCSV.getInstancia().contador - 1);
        }

        if (pantallaPrincipal.getInstancia().rbutton_algoritmo2.isSelected() == true && pantallaPrincipal.getInstancia().rbutton_descendente.isSelected() == true) {
            quickSortDescendente(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, 0, ManipularCSV.getInstancia().contador - 1);
        }
    }
}
