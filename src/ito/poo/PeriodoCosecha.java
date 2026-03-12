package ito.poo;

public class PeriodoCosecha {

    String nombrePeriodo;
    double cantidadEstimadaPorHectarea;
    Fruta fruta;

    public PeriodoCosecha(){
    }
    public void setNombrePeriodo(String n){
        nombrePeriodo = n;
    }
    public void setCantidadEstimadaPorHectarea(double c){
        cantidadEstimadaPorHectarea = c;
    }
    public void setFruta(Fruta f){
        fruta = f;
    }
    public double calcularCostoTotalPeriodo(){
        double costo;
        costo = fruta.costoProduccionTonelada * fruta.hectareas;
        return costo;
    }
    public double calcularGananciaEstimadaPeriodo(){
        double ganancia;
        ganancia = fruta.calcularGanancia() * fruta.hectareas;
        return ganancia;
    }
    public String toString(){
        return "Periodo: " + nombrePeriodo +
                "\nCantidad estimada: " + cantidadEstimadaPorHectarea;
    }
}