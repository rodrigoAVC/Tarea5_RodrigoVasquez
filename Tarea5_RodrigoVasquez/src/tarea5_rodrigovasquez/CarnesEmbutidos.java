package tarea5_rodrigovasquez;

public class CarnesEmbutidos {
    private String procedencia, tipo;
    private int cantidadInv;
    private double precio;

    public CarnesEmbutidos(String procedencia, String tipo, int cantidadInv, double precio) {
        this.procedencia = procedencia;
        this.tipo = tipo;
        this.cantidadInv = cantidadInv;
        this.precio = precio;
    }

    public String getProcedencia() {
        return procedencia;
    }

    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidadInv() {
        return cantidadInv;
    }

    public void setCantidadInv(int cantidadInv) {
        this.cantidadInv = cantidadInv;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "[Procedencia -> " + procedencia + ']' + "\n[Tipo -> " + tipo + ']' + "\n[Cantidad en Inventario -> " + cantidadInv + ']' + 
                "\n[Precio -> " + precio + ']';
    }
    
    
    
}
