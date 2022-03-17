package Clases;

import JFrames.pantallaPrincipal;

public class HiloContador extends Thread {

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
            }
        }
        datos[a] = datos[j];
        datosX[a] = datosX[j];
        datos[j] = pivote;
        datosX[j] = pivoteX;
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
            }
        }
        datos[a] = datos[j];
        datosX[a] = datosX[j];
        datos[j] = pivote;
        datosX[j] = pivoteX;
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
            int contadorCambios = 0;
            for (int i = 1; i < ManipularCSV.getInstancia().contador; i++) {
                for (int j = 0; j < ManipularCSV.getInstancia().contador - 1; j++) {
                    if (ManipularCSV.getInstancia().yvalues[j] > ManipularCSV.getInstancia().yvalues[j + 1]) {
                        int temporal = ManipularCSV.getInstancia().yvalues[j];
                        String temporalX = ManipularCSV.getInstancia().xvalues[j];
                        ManipularCSV.getInstancia().yvalues[j] = ManipularCSV.getInstancia().yvalues[j + 1];
                        ManipularCSV.getInstancia().xvalues[j] = ManipularCSV.getInstancia().xvalues[j + 1];
                        ManipularCSV.getInstancia().yvalues[j + 1] = temporal;
                        ManipularCSV.getInstancia().xvalues[j + 1] = temporalX;
                        contadorCambios += 1;
                    }
                }
            }
            for (int i = 0; i < ManipularCSV.getInstancia().contador; i++) {
                System.out.println(ManipularCSV.getInstancia().yvalues[i] + " - " + ManipularCSV.getInstancia().xvalues[i]);
            }
        }
        if (pantallaPrincipal.getInstancia().rbutton_descendente.isSelected() == true & pantallaPrincipal.getInstancia().rbutton_algoritmo.isSelected() == true) {
            int contadorCambios = 0;
            for (int i = 1; i < ManipularCSV.getInstancia().contador; i++) {
                for (int j = 0; j < ManipularCSV.getInstancia().contador - 1; j++) {
                    if (ManipularCSV.getInstancia().yvalues[j] < ManipularCSV.getInstancia().yvalues[j + 1]) {
                        int temporal = ManipularCSV.getInstancia().yvalues[j];
                        String temporalX = ManipularCSV.getInstancia().xvalues[j];
                        ManipularCSV.getInstancia().yvalues[j] = ManipularCSV.getInstancia().yvalues[j + 1];
                        ManipularCSV.getInstancia().xvalues[j] = ManipularCSV.getInstancia().xvalues[j + 1];
                        ManipularCSV.getInstancia().yvalues[j + 1] = temporal;
                        ManipularCSV.getInstancia().xvalues[j + 1] = temporalX;
                        contadorCambios += 1;
                    }
                }
            }
            for (int i = 0; i < ManipularCSV.getInstancia().contador; i++) {
                System.out.println(ManipularCSV.getInstancia().yvalues[i] + " - " + ManipularCSV.getInstancia().xvalues[i]);
            }
        }

        if (pantallaPrincipal.getInstancia().rbutton_algoritmo2.isSelected() == true && pantallaPrincipal.getInstancia().rbutton_ascendente.isSelected() == true) {
            quickSortAscendente(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, 0, ManipularCSV.getInstancia().contador - 1);
            for (int i = 0; i < ManipularCSV.getInstancia().contador; i++) {
                System.out.println(ManipularCSV.getInstancia().yvalues[i] + " - " + ManipularCSV.getInstancia().xvalues[i]);
            }
        }

        if (pantallaPrincipal.getInstancia().rbutton_algoritmo2.isSelected() == true && pantallaPrincipal.getInstancia().rbutton_descendente.isSelected() == true) {
            quickSortDescendente(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, 0, ManipularCSV.getInstancia().contador - 1);
            for (int i = 0; i < ManipularCSV.getInstancia().contador; i++) {
                System.out.println(ManipularCSV.getInstancia().yvalues[i] + " - " + ManipularCSV.getInstancia().xvalues[i]);
            }
        }
    }
}
