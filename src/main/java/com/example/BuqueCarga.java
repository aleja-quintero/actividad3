package com.example;

public class BuqueCarga extends Transporte{

    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }



    public void atracarPuerto(){

        System.out.println( "El ID del transporte es: " + getIdTransporte() + " Esta listo para ser descargado");
    }

    public void mostrarDatos() {

        double valorViaje = (this.cantidadContenedores * 120);

        System.out.println(" ID Transporte: " + getIdTransporte());
        System.out.println("Combustible: " + getCombustible());
        System.out.println("Capacidad de Carga: " + getCapacidadCarga());
        System.out.println("Cantidad de Contenedores: " + this.cantidadContenedores);
        System.out.println("Costo Estimado de Viaje: $" + valorViaje + " USD");
    }


}
