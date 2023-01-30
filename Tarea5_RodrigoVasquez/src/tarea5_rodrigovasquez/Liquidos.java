package tarea5_rodrigovasquez;

import java.util.Date;

public class Liquidos {
    private String categoria;
    private String empaque;
    private String size;
    private String nombre;
    private double precio;
    private Date fechaVencimiento;

    public Liquidos(String categoria, String empaque, String size, String nombre, double precio, Date fechaVencimiento) {
        this.categoria = categoria;
        this.empaque = empaque;
        this.size = size;
        this.nombre = nombre;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "[categoria -> " + categoria + "]" + "\n[Empaque -> " + empaque + "]" + "\n[Size -> " + size + "]" + 
                "\n[Nombre ->" + nombre + "]" + "\n[Precio -> " + precio + "]" + "\n[Fecha de Vencimiento -> " + fechaVencimiento + ']';
    }
    
    
    
}
