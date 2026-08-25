package com.example;

public class CamionDeReparto extends Transporte{

    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public void viajar(int distancia) {
        if (tieneRefrigeracion) {
            double consumoCombustible = (distancia / 10 )* 2;
            setCombustible (getCombustible() - consumoCombustible);
        }
        else {
             super.viajar(distancia);
        }

    }



}
