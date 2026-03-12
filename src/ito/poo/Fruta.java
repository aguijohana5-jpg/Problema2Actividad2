package ito.poo;

public class Fruta {

    String nombre;
    double hectareas;
    double costoProduccionTonelada;
    double precioVentaTonelada;

    public Fruta() {
    }
    public void setNombre(String n){
        nombre = n;
    }
    public void setHectareas(double h){
        hectareas = h;
    }
    public void setCostoProduccionTonelada(double c){
        costoProduccionTonelada = c;
    }
    public void setPrecioVentaTonelada(double p){
        precioVentaTonelada = p;
    }
    public double calcularGanancia(){
        double ganancia;
        ganancia = precioVentaTonelada - costoProduccionTonelada;
        return ganancia;
    }
    public String toString(){
        return "Fruta: " + nombre +
                "\nHectareas: " + hectareas +
                "\nCosto produccion: " + costoProduccionTonelada +
                "\nPrecio venta: " + precioVentaTonelada;
    }
}