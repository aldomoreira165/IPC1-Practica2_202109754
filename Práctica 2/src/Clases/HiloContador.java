package Clases;

import JFrames.pantallaPrincipal;

public class HiloContador extends Thread {

    public int cantidadMovimientosGrafica = 0;

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

    public void quickSortAscendente(Integer datos[], String datosX[], int a, int b, int cantidadMovs) {
        cantidadMovimientosGrafica = cantidadMovs;
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
                cantidadMovimientosGrafica = cantidadMovimientosGrafica + 1;
                pantallaPrincipal.getInstancia().etiqueta_pasos.setText(String.valueOf(cantidadMovimientosGrafica));
            }
        }
        datos[a] = datos[j];
        datosX[a] = datosX[j];
        datos[j] = pivote;
        datosX[j] = pivoteX;
        esperarXsegundos(1);
        cantidadMovimientosGrafica = cantidadMovimientosGrafica + 1;
        pantallaPrincipal.getInstancia().etiqueta_pasos.setText(String.valueOf(cantidadMovimientosGrafica));
        if (a < j - 1) {
            quickSortAscendente(datos, datosX, a, j - 1, cantidadMovimientosGrafica);
        }
        if (j + 1 < b) {
            quickSortAscendente(datos, datosX, j + 1, b, cantidadMovimientosGrafica);
        }
    }

    public void quickSortDescendente(Integer datos[], String datosX[], int a, int b, int cantidadMovs) {
        cantidadMovimientosGrafica = cantidadMovs;
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
                cantidadMovimientosGrafica = cantidadMovimientosGrafica + 1;
                pantallaPrincipal.getInstancia().etiqueta_pasos.setText(String.valueOf(cantidadMovimientosGrafica));
            }
        }
        datos[a] = datos[j];
        datosX[a] = datosX[j];
        datos[j] = pivote;
        datosX[j] = pivoteX;
        esperarXsegundos(1);
        cantidadMovimientosGrafica = cantidadMovimientosGrafica + 1;
        pantallaPrincipal.getInstancia().etiqueta_pasos.setText(String.valueOf(cantidadMovimientosGrafica));
        if (a < j - 1) {
            quickSortDescendente(datos, datosX, a, j - 1, cantidadMovimientosGrafica);
        }
        if (j + 1 < b) {
            quickSortDescendente(datos, datosX, j + 1, b, cantidadMovimientosGrafica);
        }
    }

    @Override
    public void run() {
        if (pantallaPrincipal.getInstancia().rbutton_ascendente.isSelected() == true & pantallaPrincipal.getInstancia().rbutton_algoritmo.isSelected() == true) {
            cantidadMovimientosGrafica = 0;
            for (int i = 1; i < ManipularCSV.getInstancia().contador; i++) {
                for (int j = 0; j < ManipularCSV.getInstancia().contador - 1; j++) {
                    if (ManipularCSV.getInstancia().yvalues_contador[j] > ManipularCSV.getInstancia().yvalues_contador[j + 1]) {
                        int temporal = ManipularCSV.getInstancia().yvalues_contador[j];
                        String temporalX = ManipularCSV.getInstancia().xvalues_contador[j];
                        ManipularCSV.getInstancia().yvalues_contador[j] = ManipularCSV.getInstancia().yvalues_contador[j + 1];
                        ManipularCSV.getInstancia().xvalues_contador[j] = ManipularCSV.getInstancia().xvalues_contador[j + 1];
                        ManipularCSV.getInstancia().yvalues_contador[j + 1] = temporal;
                        ManipularCSV.getInstancia().xvalues_contador[j + 1] = temporalX;
                        esperarXsegundos(1);
                        cantidadMovimientosGrafica = cantidadMovimientosGrafica + 1;
                        pantallaPrincipal.getInstancia().etiqueta_pasos.setText(String.valueOf(cantidadMovimientosGrafica));
                    }
                }
            }
            HIloTiempo hIloTiempo = new HIloTiempo();
            hIloTiempo.setPausar(true);
        }
        if (pantallaPrincipal.getInstancia().rbutton_descendente.isSelected() == true & pantallaPrincipal.getInstancia().rbutton_algoritmo.isSelected() == true) {
            cantidadMovimientosGrafica = 0;
            for (int i = 1; i < ManipularCSV.getInstancia().contador; i++) {
                for (int j = 0; j < ManipularCSV.getInstancia().contador - 1; j++) {
                    if (ManipularCSV.getInstancia().yvalues_contador[j] < ManipularCSV.getInstancia().yvalues_contador[j + 1]) {
                        int temporal = ManipularCSV.getInstancia().yvalues_contador[j];
                        String temporalX = ManipularCSV.getInstancia().xvalues_contador[j];
                        ManipularCSV.getInstancia().yvalues_contador[j] = ManipularCSV.getInstancia().yvalues_contador[j + 1];
                        ManipularCSV.getInstancia().xvalues_contador[j] = ManipularCSV.getInstancia().xvalues_contador[j + 1];
                        ManipularCSV.getInstancia().yvalues_contador[j + 1] = temporal;
                        ManipularCSV.getInstancia().xvalues_contador[j + 1] = temporalX;
                        esperarXsegundos(1);
                        cantidadMovimientosGrafica = cantidadMovimientosGrafica + 1;
                        pantallaPrincipal.getInstancia().etiqueta_pasos.setText(String.valueOf(cantidadMovimientosGrafica));
                    }
                }
            }
            HIloTiempo hIloTiempo = new HIloTiempo();
            hIloTiempo.setPausar(true);
        }

        if (pantallaPrincipal.getInstancia().rbutton_algoritmo2.isSelected() == true && pantallaPrincipal.getInstancia().rbutton_ascendente.isSelected() == true) {
            quickSortAscendente(ManipularCSV.getInstancia().yvalues_contador, ManipularCSV.getInstancia().xvalues_contador, 0, ManipularCSV.getInstancia().contador - 1, 0);
            HIloTiempo hIloTiempo = new HIloTiempo();
            hIloTiempo.setPausar(true);
        }

        if (pantallaPrincipal.getInstancia().rbutton_algoritmo2.isSelected() == true && pantallaPrincipal.getInstancia().rbutton_descendente.isSelected() == true) {
            quickSortDescendente(ManipularCSV.getInstancia().yvalues_contador, ManipularCSV.getInstancia().xvalues_contador, 0, ManipularCSV.getInstancia().contador - 1, 0);
            HIloTiempo hIloTiempo = new HIloTiempo();
            hIloTiempo.setPausar(true);
        }
Grafica.getInstancia().graficar(ManipularCSV.getInstancia().yvalues, ManipularCSV.getInstancia().xvalues, ManipularCSV.getInstancia().contador, ManipularCSV.getInstancia().tituloEjeX, ManipularCSV.getInstancia().tituloEjeY, pantallaPrincipal.getInstancia().txt_generar.getText());
    }
}
