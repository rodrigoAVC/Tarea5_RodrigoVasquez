package tarea5_rodrigovasquez;

public class FrutasVerduras {
    private double precio;
    private int cantInv; 
    private String categoria;

    public FrutasVerduras(double precio, int cantInv, String categoria) {
        this.precio = precio;
        this.cantInv = cantInv;
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantInv() {
        return cantInv;
    }

    public void setCantInv(int cantInv) {
        this.cantInv = cantInv;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "[Precio -> " + precio + ']' + "\n[Cantidad en Inventario -> " + cantInv + ']' + 
                "\n[Categoria -> " + categoria + ']';
    }
    
    
    
}
