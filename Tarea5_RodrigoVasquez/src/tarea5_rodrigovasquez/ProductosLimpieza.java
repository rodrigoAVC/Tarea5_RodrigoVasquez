package tarea5_rodrigovasquez;

public class ProductosLimpieza {
    private String tipo,marca,codigo,proveedor,nombre;
    private double precio;
    private int cantidadInv;

    public ProductosLimpieza(String tipo, String marca, String codigo, String proveedor, String nombre, double precio, int cantidadInv) {
        this.tipo = tipo;
        this.marca = marca;
        this.codigo = codigo;
        this.proveedor = proveedor;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadInv = cantidadInv;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadInv() {
        return cantidadInv;
    }

    public void setCantidadInv(int cantidadInv) {
        this.cantidadInv = cantidadInv;
    }

    @Override
    public String toString() {
        return "[Tipo -> " + tipo + ']' + "\nMarca -> " + marca + ']' + "n[Codigo -> " + codigo + ']'+ "\n[Proveedor -> " + proveedor + ']' +
                "\n[Nombre -> " + nombre + ']' + "\n[Precio -> " + precio + ']' + "\n[Cantidad en Inventario -> " + cantidadInv + ']';
    }
    
    
    
}
