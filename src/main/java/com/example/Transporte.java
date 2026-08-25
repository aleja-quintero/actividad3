package com.example;


public class Transporte {

    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    public Transporte(String idTransporte,double combustible,double capacidadCarga){
        this.capacidadCarga = capacidadCarga;
        this.combustible = combustible;
        this.idTransporte = idTransporte;
    }


    public String getIdTransporte() {
        return idTransporte;
    }

    public void setIdTransporte(String idTransporte) {
        this.idTransporte = idTransporte;
    }

    public double getCombustible(){
        return combustible;
    }

    public void setCombustible(double nivel) {
    
        if (nivel < 0 ){
            this.combustible = 0;
        }
        else if (nivel > 100) {
            this.combustible = 100;
            }
        else {
            this.combustible = nivel;
        }
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Error no tiene capacidad de carga");
        }
        else {
           this.capacidadCarga = carga; 
        }
    }

    public void viajar (int distancia){
        double consumoCombustible = distancia / 10;
        setCombustible(getCombustible()- consumoCombustible);
    }

}
