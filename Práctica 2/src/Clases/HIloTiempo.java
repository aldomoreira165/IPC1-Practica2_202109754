package Clases;

import java.util.Observable;

public class HIloTiempo extends Observable implements Runnable {

Thread hilo;
public static boolean pausar=false;
private int horas, minutos, segundos;

    public HIloTiempo() {
    }

    public HIloTiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void setPausar(boolean pausar) {
        this.pausar = pausar;
    }

    @Override
    public void run() {
        String tiempo = "";
        try {
            while (pausar!=true) {
                tiempo = "";
                if (horas < 10) {
                    tiempo += "0" + horas;
                } else {
                    tiempo += horas;
                }
                tiempo += ":";
                if (minutos < 10) {
                    tiempo += "0" + minutos;
                } else {
                    tiempo += minutos;
                }
                tiempo += ":";
                if (segundos < 10) {
                    tiempo += "0" + segundos;
                } else {
                    tiempo += segundos;
                }

                this.setChanged();
                this.notifyObservers(tiempo);
                this.clearChanged();
                Thread.sleep(1000);

                segundos++;
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                    if (minutos == 60) {
                        minutos = 0;
                        horas++;
                        if (horas == 24) {
                            horas = 0;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
    }
}
