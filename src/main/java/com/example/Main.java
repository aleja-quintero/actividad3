package com.example;
import java.util.ArrayList;  

public class Main {
    public static void main(String[] args) {
        CamionDeReparto camion = new CamionDeReparto("900", 80, 300, true);
        BuqueCarga buque = new BuqueCarga("901",90,300,50);

        camion.setCombustible(-20);
        System.out.println( "el combustible es: " + camion.getCombustible());



        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);
        for( int i = 0; i < flota.size(); i++) {
            Transporte transporte = flota.get(i);
            transporte.viajar(100);
            System.out.println("Id del transporte: " + transporte.getIdTransporte() + " combustible restante: " + transporte.getCombustible());
        }
    }

}